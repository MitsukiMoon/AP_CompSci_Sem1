import java.util.Scanner;
public class EX_02
{
	static double num1, num2, num3, average;
	
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		EX_02 calculate = new EX_02();

		System.out.println ("Please enter num1:");
		
		num1 = keyboard.nextFloat();
		
		String place1 = keyboard.nextLine();
		
		System.out.println ("Please enter num2:");
		
		num2 = keyboard.nextFloat();
		
		String place2 = keyboard.nextLine();
		
		System.out.println ("Please enter num3:");
		
		num3 = keyboard.nextFloat();
		

		
		average();
		print();
		
		
	}
	
	public static void average ()
	{
		average =  ((num1+ num2 + num3) /3);
	
	}
	
	
	public static void print ()
	{
		System.out.printf("The average of %10.5f,%10.5f,%10.5f is %10.5f \n", num1, num2, num3, average);
	}
	
}
	
	
	
	
