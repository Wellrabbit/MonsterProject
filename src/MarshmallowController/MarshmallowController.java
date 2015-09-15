package MarshmallowController;

import marshmellow.model.MarshmallowMonster;
import Marshmallows.view.MonsterDisplay;
import java.util.Scanner;

public class MarshmallowController
{
	
	private MarshmallowMonster emilyMonster;
	private MonsterDisplay myDisplay;
	private Scanner monsterScanner;
	public MarshmallowController()
	{
		String name = "Alfred";
		int eyes = 4;
		int ears = 2;
		double legs = 2.5;
		double hair = 3.0;
		boolean hasbellybutton = false; 
		
		monsterScanner = new Scanner(System.in);
		myDisplay = new MonsterDisplay();
		emilyMonster = new MarshmallowMonster(name, eyes, ears, legs, hair, hasbellybutton);

	}
	
	public void start()
	{
		myDisplay.displayInfo(emilyMonster.toString());
		askQuestion();
		myDisplay.displayInfo("Thanks my updated info is " + emilyMonster.toString());
	}
	
	private void askQuestion()
	{
		System.out.println("I want to name a new monsters type one please");
		String newMonsterName = monsterScanner.next();
		emilyMonster.setMonsterName(newMonsterName);
		System.out.println("Now we need to know about the number of eyes ");
		int newEyes = monsterScanner.nextInt();
		emilyMonster.setMonsterEyes(newEyes);
		System.out.println("Now I think he needs some ears how many ears does he have ");
		int newEars = monsterScanner.nextInt();
		emilyMonster.setMonsterEars(newEars);
		System.out.println("Next we need his legs, and hes always growing new ones ");
		double newLegs = monsterScanner.nextDouble();
		emilyMonster.setMonsterLegs(newLegs);
		System.out.println("Almost done now we just need the hair, ever single one on his head *sigh* ");
		double newHair = monsterScanner.nextDouble();
		emilyMonster.setMonsterHair(newHair);
		System.out.println("finally I need to know if he has an antena, in true or false form ");
		boolean newAntena = monsterScanner.nextBoolean();
		emilyMonster.setMonsterAntena(newAntena);
	}
}


