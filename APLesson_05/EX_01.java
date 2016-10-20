import java.util.Random;
public class EX_01
{
	static int PlayerRoll;
	static int ComputerRoll;
	static String winner;
	
	
	public static void main(String[]args)
	{
		EX_01 calculate = new EX_01();
		Random rand = new Random();
		PlayerRoll = rand.nextInt(6) + 1;
		ComputerRoll = rand.nextInt(6) + 1;
		
		winner = calculate. rollDice();
		System.out.println ("You rolled a " + PlayerRoll);
		System.out.println ("Computer rolled a " + ComputerRoll);
		System.out.println("The winner is " + winner);
		
		
	}
	
	public static String rollDice()
	{
		if (PlayerRoll > ComputerRoll){
			return "Player";
		}
	
		
		if (ComputerRoll > PlayerRoll){
			return "Computer";
		}
		
		else {
			return "Tie";
		}	
		
	}
	
	
}
	
	
	
	
