package MarshmallowController;

import marshmellow.model.MarshmallowMonster;

public class MarshmallowController
{
	
	private MarshmallowMonster emilyMonster;
	
	public MarshmallowController()
	{
		String name = "Alfred";
		int eyes = 4;
		int ears = 2;
		double legs = 2.5;
		double hair = 3.0;
		boolean hasbellybutton = false; 
		
		emilyMonster = new MarshmallowMonster(name, eyes, ears, legs, hair, hasbellybutton);

	}
	
	public void start()
	{
		
	}
}


