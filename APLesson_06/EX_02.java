import java.util.Scanner;
public class EX_02
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);


		System.out.println ("Please enter number: ");
		
		int user = keyboard.nextInt();
		int factorial = 1;

		for (int i = 1; i <= user; i++)
		{
			factorial = i * factorial;
		}
		
		System.out.println("Your factorial is " + factorial);
		
	}
	

	
	
}
	
	
	
	
