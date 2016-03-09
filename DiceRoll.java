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

public int getDie1(){
	die1 = (int)(Math.random() * 4) + 1;
	return die1;
}
public int getDie2(){
	die2 = (int)(Math.random() * 6) + 1;
	return die2;
}
public int getDie3(){
	die3 = (int)(Math.random() * 8) + 1;
	return die3;
}
public int getDie4(){
	die4 = (int)(Math.random() * 10) + 1;
	return die4;
}
public int getDie5(){
	die5 = (int)(Math.random() * 12) + 1;
	return die5;
}
public int getDie6(){
	die6 = (int)(Math.random() * 20) + 1;
	return die6;
}
	

}


