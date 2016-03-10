package DiceGameJava;
import java.util.*;
public class DiceEvaluation{
	DiceRoll InitiateDiceRoll = new DiceRoll();
	BodyContainers player1Body = new BodyContainers();
	public boolean makeHead = false;
	public boolean makeEyes = false;
	public boolean makeEars = false;
	public boolean makeBody = false;
	public boolean makeArms = false;
	public boolean makeLegs = false;
	
	public void EvaluateDice1(){
		InitiateDiceRoll.getDie1();
		if (InitiateDiceRoll.die1 >= 3){
			System.out.println("you rolled" + " " + InitiateDiceRoll.die1);
			System.out.println("head has been added to the character");
			makeHead = true;
			player1Body.addPartToList("Head");
			
		}else{
			System.out.println(InitiateDiceRoll.die1 + " " + "wasn't high enough to add head to your bank");
			System.out.println("try again..");
		}
	}
	public void EvaluateDice2(){
		InitiateDiceRoll.getDie2();
		if (InitiateDiceRoll.die2 >= 4){
			System.out.println("you rolled" + " " + InitiateDiceRoll.die2);
			System.out.println("eyes has been added to the character");
			makeEyes = true;
			player1Body.addPartToList("Eyes");
		}else{
			System.out.println(InitiateDiceRoll.die2 + " " + "wasn't high enough to add eyes to your bank");
			System.out.println("try again..");
		}
	}
	
	public void EvaluateDice3(){
		InitiateDiceRoll.getDie3();
		if (InitiateDiceRoll.die3 >= 6){
			System.out.println("you rolled" + " " + InitiateDiceRoll.die3);
			System.out.println("ears has been added to the character");
			makeEars = true;
			player1Body.addPartToList("Ears");
		}else{
			System.out.println(InitiateDiceRoll.die3 + " " + "wasn't high enough to add ears to your bank");
			System.out.println("try again..");
		}
	}
	
	public void EvaluateDice4(){
		InitiateDiceRoll.getDie4();
		if (InitiateDiceRoll.die4 >= 8){
			System.out.println("you rolled" + " " + InitiateDiceRoll.die4);
			System.out.println("body has been added to the character");
			makeBody = true;
			player1Body.addPartToList("Body");
		}else{
			System.out.println(InitiateDiceRoll.die4 + " " + "wasn't high enough to add body to your bank");
			System.out.println("try again..");
		}
	}
	
	public void EvaluateDice5(){
		InitiateDiceRoll.getDie5();
		if (InitiateDiceRoll.die5 >= 9){
			System.out.println("you rolled" + " " + InitiateDiceRoll.die5);
			System.out.println("arms has been added to the character");
			makeArms = true;
			player1Body.addPartToList("Arms");
		}else{
			System.out.println(InitiateDiceRoll.die5 + " " + "wasn't high enough to add arms to your bank");
			System.out.println("try again..");
		}
	}
	
	public void EvaluateDice6(){
		InitiateDiceRoll.getDie6();
		if (InitiateDiceRoll.die6>= 15){
			System.out.println("you rolled" + " " + InitiateDiceRoll.die6);
			System.out.println("legs has been added to the character");
			makeLegs = true;
			player1Body.addPartToList("Legs");
		}else{
			System.out.println(InitiateDiceRoll.die6 + " " + "wasn't high enough to add legs to your bank");
			System.out.println("try again..");
		}
	}
}
