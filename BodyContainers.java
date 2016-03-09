package DiceGameJava;
import java.util.ArrayList;

public class BodyContainers {
	
	ArrayList<String> Player1BodyContainer = new ArrayList<String>();
	
	public BodyContainers(){
			
		}
	public void addPartToList(String part){
		Player1BodyContainer.add(part);
		System.out.println(Player1BodyContainer);
	}
	
}
