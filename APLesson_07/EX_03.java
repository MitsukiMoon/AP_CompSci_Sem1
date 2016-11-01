import java.util.Scanner;
public class EX_03
{
	static int number;
	static int rev = 0;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		EX_03 calculate = new EX_03();
		
		System.out.println ("Please enter a number");
		
		number = keyboard.nextInt();
		
		getReverse();
	
		System.out.println ("The sum of the digits in " + number + " is " + rev);
		
		
	}
	
	public static void getReverse()
	{
		int num = number;
		while(num > 0)
		{
			rev = rev * 10;
			rev = rev + num % 10;
			num /= 10;
		}
		
	}
	
	
}
	
	
	
	
