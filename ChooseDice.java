package DiceGameJava;
import java.util.Scanner;
public class ChooseDice extends DiceRoll{

		public ChooseDice(){

		}
		
		public void DiceSelect(){
			Scanner selectDice = new Scanner(System.in);
			DiceRoll letsRoll = new DiceRoll();
			
		switch(selectDice.nextInt()){
			
			case 1:
				letsRoll.getDie1();
				System.out.println("you've rolled:" + " " + getDie1());
				break;
			case 2:
				letsRoll.getDie2();
				System.out.println("you've rolled:" + " " + getDie2());
				break;
			case 3:
				letsRoll.getDie3();
				System.out.println("you've rolled:" + " " + getDie3());
				break;
			case 4:
				letsRoll.getDie4();
				System.out.println("you've rolled:" + " " + getDie4());
				break;
			case 5:
				letsRoll.getDie5();
				System.out.println("you've rolled:" + " " + getDie5());
				break;
			case 6:
				letsRoll.getDie6();
				System.out.println("you've rolled:" + " " + getDie6());
				break;
			default:
				
			}
		selectDice.close();
		}
}