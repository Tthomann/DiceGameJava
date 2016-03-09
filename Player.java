package DiceGameJava;
import java.util.Scanner;


public class Player{
	ChooseDice chooseDice = new ChooseDice();
	Scanner input = new Scanner(System.in);
	
	public Player(){
	
	}
	public void getChooseDice(){
		chooseDice.DiceSelect();
	}
	
	

}
//player choice
//player name