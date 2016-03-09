package DiceGameJava;
import java.util.Scanner;

public class Menu {
	public Menu(){
		//greeting();
	}
	public void greeting(){
		String name;
		
		System.out.println("Please kindly state your name.");
		Scanner input = new Scanner(System.in);
		
		name = input.nextLine();
		System.out.println("Greetings " + name + "!! Welcome to Build A Character!");
		
	
	}

}


