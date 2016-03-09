package DiceGameJava;
public class MainDice {

	public static void main(String[] args) {
		Rules startMenu = new Rules();
		BodyContainers bodyArray = new BodyContainers();
		ChooseDice diceSelection = new ChooseDice();
		startMenu.getRules();
		diceSelection.DiceSelect();
		bodyArray.addPartToList("");

	}

}
