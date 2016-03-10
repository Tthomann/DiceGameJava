package DiceGameJava;
import java.util.*;
import java.util.ArrayList;
public class ContinueGame extends DiceEvaluation{
	ChooseDice optionRepeat = new ChooseDice();
	DiceEvaluation diceEvaluation = new DiceEvaluation();
	BodyContainers bodyContainers = new BodyContainers();
	boolean endGame = false;
	public ContinueGame(){
		
	}
	public void LoopDice(){

	while(endGame == false){
		int stringCount = bodyContainers.Player1BodyContainer.size();
		if (stringCount < 6)
		optionRepeat.DiceSelect();
		else{
			System.out.println("you win");
			break;
		}
		}
	}
	}


