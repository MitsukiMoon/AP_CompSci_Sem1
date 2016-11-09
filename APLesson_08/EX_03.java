import java.util.Scanner;
public class EX_03
{
	static int number;
	static int i = 0;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		EX_03 calculate = new EX_03();

		System.out.println ("Please enter number");
		
		int number = keyboard.nextInt();

		
		luck(number);
		
		
		
		
	}
	
	public static void luck(int number)
	{
		if (number > 0)
		{
			if (number % 10 == 7)
			{
				i += 1; 
				luck(number/10);
				
			}
			
			
			else 
			{
				i += 0 ;
				luck(number/10);
			}
			
		}
		
		else 
		{
			System.out.println (i);
			
		}
	

	}
}
	
	
	
	

	
	
	
