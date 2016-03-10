package DiceGameJava;
import java.util.*;
import java.util.ArrayList;
public class MainDice {

	public static void main(String[] args) {


		Rules startMenu = new Rules();
		BodyContainers bodyArray = new BodyContainers();
		ContinueGame loopTheGame = new ContinueGame();
		startMenu.getRules();
		loopTheGame.LoopDice();
		bodyArray.addPartToList("");
		
	}
}


