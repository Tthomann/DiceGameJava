package DiceGameJava;

public class DiceEvaluation{
	DiceRoll dice = new DiceRoll();
	public DiceEvaluation(){
	}
	
	public void EvaluateDice1(){
		dice.getDie1();
		if (dice.die1 >= 3){
			System.out.println("you rolled" + " " + dice.die1);
			System.out.println("head");
		}else{
			System.out.println(dice.die1 + " " + "wasn't high enough to add head to your bank");
			System.out.println("try again..");
		}
	}
	
	public void EvaluateDice2(){
		dice.getDie2();
		if (dice.die2 >= 4){
			System.out.println("you rolled" + " " + dice.die2);
			System.out.println("eyes");
		}else{
			System.out.println(dice.die2 + " " + "wasn't high enough to add eyes to your bank");
			System.out.println("try again..");
		}
	}
	
	public void EvaluateDice3(){
		dice.getDie3();
		if (dice.die3 >= 6){
			System.out.println("you rolled" + " " + dice.die3);
			System.out.println("ears");
		}else{
			System.out.println(dice.die3 + " " + "wasn't high enough to add ears to your bank");
			System.out.println("try again..");
		}
	}
	
	public void EvaluateDice4(){
		dice.getDie4();
		if (dice.die4 >= 8){
			System.out.println("you rolled" + " " + dice.die4);
			System.out.println("body");
		}else{
			System.out.println(dice.die4 + " " + "wasn't high enough to add body to your bank");
			System.out.println("try again..");
		}
	}
	
	public void EvaluateDice5(){
		dice.getDie5();
		if (dice.die5 >= 9){
			System.out.println("you rolled" + " " + dice.die5);
			System.out.println("arms");
		}else{
			System.out.println(dice.die5 + " " + "wasn't high enough to add arms to your bank");
			System.out.println("try again..");
		}
	}
	
	public void EvaluateDice6(){
		dice.getDie6();
		if (dice.die6>= 15){
			System.out.println("you rolled" + " " + dice.die6);
			System.out.println("legs");
		}else{
			System.out.println(dice.die6 + " " + "wasn't high enough to add legs to your bank");
			System.out.println("try again..");
		}
	}
}
