package MarshmallowController;

import marshmellow.model.MarshmallowMonster;
import Marshmallows.view.MonsterDisplay;
import java.util.Scanner;

public class MarshmallowController
{
	
	private MarshmallowMonster emilyMonster; //Declares emilyMonster.
	private MarshmallowMonster userMonster;
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
		createUserMonster();
		myDisplay.displayInfo("Thanks my updated info is " + userMonster.toString());
	}
	
	private void askQuestion()
	{
		System.out.println("I want to name a new monsters type one please");
		String newMonsterName = monsterScanner.next();
		
		System.out.println("Now we need to know about the number of eyes ");
		int newEyes = monsterScanner.nextInt();
		
		System.out.println("Now I think he needs some ears how many ears does he have ");
		int newEars = monsterScanner.nextInt();
		
		System.out.println("Next we need his legs, and hes always growing new ones ");
		double newLegs = monsterScanner.nextDouble();
		
		System.out.println("Almost done now we just need the hair, ever single one on his head *sigh* ");
		double newHair = monsterScanner.nextDouble();
		
		System.out.println("finally I need to know if he has an antena, in true or false form ");
		boolean newAntena = monsterScanner.nextBoolean();
		
		emilyMonster.setMonsterAntena(newAntena);
		emilyMonster.setMonsterHair(newHair);
		emilyMonster.setMonsterLegs(newLegs);
		emilyMonster.setMonsterEars(newEars);
		emilyMonster.setMonsterEyes(newEyes);
		emilyMonster.setMonsterName(newMonsterName);
		
		
	}
	
	/**
	 *  Creates a MarshmallwMonster instance from user input.
	 */
	private void createUserMonster()
	{
		// Step one: Gather user information.
		
		System.out.println("What would you like to name your Monster? ");
		String userName;
		userName = monsterScanner.nextLine();
		System.out.println("How many Legs should your monster have? This is a decimal value ");
		double userLegs = monsterScanner.nextDouble();
		System.out.println("How many hairs does your monster have ");
		double userHair = monsterScanner.nextDouble();
		System.out.println("Does your monster have and Antena (write as a true false)");
		boolean userAntena = monsterScanner.nextBoolean();
		System.out.println("How many eyes ");
		int userEyes = monsterScanner.nextInt();
		System.out.println("Finally how many ears does he have ");
		int userEars = monsterScanner.nextInt();
		
		// Step two: Build the monster using the Constructor
		
		userMonster = new MarshmallowMonster(userName, userEyes, userEars, userLegs, userHair, userAntena);
	}
}


