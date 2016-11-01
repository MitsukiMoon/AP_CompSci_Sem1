import java.util.Scanner;
public class EX_02
{
	static int number;
	static double average = 0.0;
	static int digits = 0;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		EX_02 calculate = new EX_02();
		
		System.out.println ("Please enter a number");
		
		number = keyboard.nextInt();
		
		avDigits();
	
		System.out.println ("The average of the digits in " + number + " is " + average);
		
		
	}
	
	public static void avDigits()
	{
		int num = number;
		while(num > 0)
		{
			digits += 1;
			average = average + num % 10;
			num /= 10;
		}
		
		average = (average/digits);
		
		
	}
	
	
}
	
	
	
	
