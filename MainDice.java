
package DiceGameJava;


public class MainDice {

	public static void main(String[] args) {
		
		//ChooseDice instanceDice = new ChooseDice();
		//instanceDice.DiceSelect();
		Menu menu = new Menu();
		Rules rules = new Rules();
		Player player1 = new Player();
		



	    menu.greeting();
	    rules.getRules();
	    player1.getChooseDice();
	   // menu.getPlayerSelection();
	   

		}


	}


