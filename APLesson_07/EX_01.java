import java.util.Scanner;
public class EX_01
{
	static int number;
	static int sum = 0;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		EX_01 calculate = new EX_01();
		
		System.out.println ("Please enter a number");
		
		number = keyboard.nextInt();
		
		sumDigits();
	
		System.out.println ("The sum of the digits in " + number + " is " + sum);
		
		
	}
	
	public static void sumDigits()
	{
		int num = number;
		while(num > 0)
			
		{
			sum = sum + num % 10;
			num /= 10;
		}
		
	}
	
	
}
	
	
	
	
