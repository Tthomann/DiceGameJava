package DiceGameJava;
import java.util.*;

public class MainDice {

	public static void main(String[] args) {


		Rules startMenu = new Rules();
		BodyContainers bodyArray = new BodyContainers();
		ChooseDice userSelectDiceToRoll = new ChooseDice();
		ContinueGame loopTheGame = new ContinueGame();
		startMenu.getRules();
		userSelectDiceToRoll.DiceSelect();
		
		
		loopTheGame.LoopDice();
		bodyArray.addPartToList("");
		
	}
}


