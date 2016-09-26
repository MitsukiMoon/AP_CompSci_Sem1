import java.util.Scanner;
public class EX_02
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		EX_02 calculate = new EX_02();

		System.out.println ("Please enter num1:");
		
		double num1 = keyboard.nextFloat();
		
		String place1 = keyboard.nextLine();
		
		System.out.println ("Please enter num2:");
		
		double num2 = keyboard.nextFloat();
		
		String place2 = keyboard.nextLine();
		
		System.out.println ("Please enter num3:");
		
		double num3 = keyboard.nextFloat();
		

		
		double average = calculate.average(num1, num2, num3);
		
		System.out.printf("The average of %10.5f,%10.5f,%10.5f is %10.5f \n", num1, num2, num3, average);
		
	}
	
	public double average (double num1, double num2, double num3)
	{
		return ((num1+ num2 + num3) /3);
	
		
	}
}
	
	
	
	
