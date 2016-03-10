package DiceGameJava;
import java.util.Scanner;
import java.util.*;
public class ChooseDice{
	DiceEvaluation CheckTheDice = new DiceEvaluation();
	
		public ChooseDice(){

		}
		
		public void DiceSelect(){
		
			
			Scanner selectDice = new Scanner(System.in);
			
		switch(selectDice.nextInt()){
			
			case 1:
				CheckTheDice.EvaluateDice1();
				break;
			case 2:
				CheckTheDice.EvaluateDice2();
				break;
			case 3:
				CheckTheDice.EvaluateDice3();
				break;
			case 4:
				CheckTheDice.EvaluateDice4();
				break;
			case 5:
				CheckTheDice.EvaluateDice5();
				break;
			case 6:
				CheckTheDice.EvaluateDice6();
				break;
			default:
				break;
			}
	
		}
}