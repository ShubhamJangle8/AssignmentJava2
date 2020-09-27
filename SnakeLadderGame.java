public class SnakeLadderGame {
	public static void main(String[] args) {
		//constants
		final int no_play = 0;
		final int snake = 1;
		final int ladder = 2;
		 
		//variables
		int player1_position = 0;
		
		//throwing a dice
		int dice_num = (int)Math.floor(Math.random() * 10) % 6 + 1 ;

		System.out.println("Number on dice : "+dice_num);

		int option_check = (int)Math.floor(Math.random() * 10) % 3;

		if(option_check == no_play)
			System.out.println("On a same position");
		else if(option_check == ladder)
			System.out.println("Move ahead by "+dice_num+" positions");
		else
			System.out.println("Move behind by "+dice_num+" positions");
	}
}