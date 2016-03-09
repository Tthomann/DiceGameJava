package DiceGameJava;

	public class DiceRoll {
		int die1;
		int die2;
		int die3;
		int die4;
		int die5;
		int die6;
		public DiceRoll(){
		}
		
		public void getDie1(){
			die1 = (int)(Math.random() * 4) + 1;
		}
		public void getDie2(){
			die2 = (int)(Math.random() * 6) + 1;
		}
		public void getDie3(){
			die3 = (int)(Math.random() * 8) + 1;
		}
		public void getDie4(){
			die4 = (int)(Math.random() * 10) + 1;
		}
		public void getDie5(){
			die5 = (int)(Math.random() * 12) + 1;
		}
		public void getDie6(){
			die6 = (int)(Math.random() * 20) + 1;
		}
			
		
		}
