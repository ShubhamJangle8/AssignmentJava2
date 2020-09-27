public class SnakeLadderGame {
	public static void main(String[] args) {
		//constants
		final int no_play = 0;
		final int snake = 1;
		final int ladder = 2;
		final int max_position = 100;
		final int min_position = 0;
		 
		//variables
		int player1_position = 0;
		
		while(player1_position != max_position) {
			
			int dice_num = (int)Math.floor(Math.random() * 10) % 6 + 1 ;
			System.out.println("Number on dice : "+dice_num);
			
			int option_check = (int)Math.floor(Math.random() * 10) % 3;
			
			switch(option_check) {
			case 1:
				System.out.println("Move behind by "+dice_num+" positions");
				player1_position -= dice_num;
				break;
			case 2:
				System.out.println("Move ahead by "+dice_num+" positions");
				player1_position += dice_num;
				break;
			default:
				System.out.println("On a same position");
				break;
			}
		
			if(player1_position < min_position) {
				player1_position = min_position;
			}
			System.out.println("Your position is "+player1_position);
		}
	}
}