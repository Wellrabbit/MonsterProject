package marshmellow.model;

public class MarshmallowMonster
{
	private String MonsterName;
	private int MonsterEyes;
	private int MonsterEars;
	private double MonsterLegs;
	private double MonsterHair;
	private boolean MonsterAntena;
	
	private MarshmallowMonster()
	{
		
	}
	
	public MarshmallowMonster(String MonsterName, int MonsterEyes, int MonsterEars, double MonsterLegs, double MonsterHair, boolean MonsterAntena)
	{
		this.MonsterName = MonsterName;
		this.MonsterEyes = MonsterEyes;
		this.MonsterEars = MonsterEars;
		this. MonsterLegs = MonsterLegs;
		this. MonsterHair = MonsterHair;
		this.MonsterAntena = MonsterAntena;
		
	}
	
	public String toString()
	{
		String monsterInfo = "My monster Has "+  MonsterLegs  + " eyes and its name is " +  MonsterName + " he has " + MonsterHair + " Hair and "+ MonsterEars 
				+ " Ears and dont forget about his " + MonsterAntena + " Antena";
		return monsterInfo;
	}
}
