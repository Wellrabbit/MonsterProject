package MarshmallowController;

import marshmellow.model.MarshmallowMonster;
import Marshmallows.view.MonsterDisplay;

public class MarshmallowController
{
	
	private MarshmallowMonster emilyMonster;
	private MonsterDisplay myDisplay;
	public MarshmallowController()
	{
		String name = "Alfred";
		int eyes = 4;
		int ears = 2;
		double legs = 2.5;
		double hair = 3.0;
		boolean hasbellybutton = false; 
		
		myDisplay = new MonsterDisplay();
		emilyMonster = new MarshmallowMonster(name, eyes, ears, legs, hair, hasbellybutton);

	}
	
	public void start()
	{
		myDisplay.displayInfo(emilyMonster.toString());
	}
}


