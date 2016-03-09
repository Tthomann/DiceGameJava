package DiceGameJava;

public class DiceRoll {
	private int die1;
	private int die2;
	private int die3;
	private int die4;
	private int die5;
	private int die6;

public DiceRoll(){
	roll();
}
public void roll(){
	die1 = (int)(Math.random() * 4) + 1;
	die2 = (int)(Math.random() * 6) + 1;
	die3 = (int)(Math.random() * 8) + 1;
	die4 = (int)(Math.random() * 10) + 1;
	die5 = (int)(Math.random() * 12) + 1;
	die6 = (int)(Math.random() * 20) + 1;
}
public int getDie1(){
	return die1;
}
public int getDie2(){
	return die2;
}
public int getDie3(){
	return die3;
}
public int getDie4(){
	return die4;
}
public int getDie5(){
	return die5;
}
public int getDie6(){
	return die6;
}
	

}


