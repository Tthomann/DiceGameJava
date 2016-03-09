package DiceGameJava;

public class TurnTracker {
	ChooseDice playerRun = new ChooseDice();
	boolean PlayerNext = true;
	
		public TurnTracker(){
			
		}
		
		public void goPlayer1(){
			if (PlayerNext){
				playerRun.DiceSelect();
				PlayerNext = false;
			}
		}
		
		public void goPlayer2(){
			if (PlayerNext){
				playerRun.DiceSelect();
				PlayerNext = false;
			}
		}
		
		public void TurnOrder(){
		while(PlayerNext)
				goPlayer1();
		}
		
}
