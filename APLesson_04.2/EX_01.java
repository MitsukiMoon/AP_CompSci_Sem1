import java.util.Scanner;
public class EX_01
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		EX_01 calculate = new EX_01();

		System.out.println ("Please enter length:");
		
		double length = keyboard.nextFloat();
		
		String place1 = keyboard.nextLine();
		
		System.out.println ("Please enter width:");
		
		double width = keyboard.nextFloat();
		
		String place2 = keyboard.nextLine();
		


		
		double perimeter = calculate.calcP(length, width);
		
		System.out.printf("Your rectangle is %10.5f sq ft around. \n", perimeter);
		
	}
	
	public double calcP (double length, double width)
	{
		return (2*length + 2* width);
	
		
	}
}
	
	
	
	
