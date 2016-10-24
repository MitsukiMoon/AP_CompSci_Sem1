import java.util.Scanner;
public class EX_05
{
	
	static int userInt, userSkip, multiply;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);


		System.out.println ("Please enter number");
		
		userInt = keyboard.nextInt();
		
		System.out.println ("Please enter increment");
		userSkip = keyboard.nextInt();

		for (int i = 1; i <= (userInt/userSkip); i++)
		{
			multiply = i * userSkip;
			System.out.printf(multiply + "\t");

		}
		
		
	}
	

	
	
}
	
	
	
	
