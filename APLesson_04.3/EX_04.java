import java.util.Scanner;
public class EX_04
{
	public static void main(String[]args)
	{ 
		Scanner keyboard = new Scanner(System.in);
		EX_04 calculate = new EX_04();
		
		System.out.println ("Enter rate:");
		double r = keyboard.nextDouble();;
		System.out.println ("Enter number of times:");
		double n = keyboard.nextDouble();;
		System.out.println ("Enter your Initial Amount:");
		double P = keyboard.nextDouble();;
		System.out.println ("Enter time:");
		double year = keyboard.nextDouble();;
		
		double t = year/12;
		
		
		
		
		double compound = calculate.calcinterest(r, n, P, t);
		
		System.out.printf("The total compounded interest is $ %.2f\n", compound);
		
	}
	
	public double calcinterest (double r, double n, double P, double t)
	{
		return (P * Math.pow((1 + (r/n)), (n * t)));
	
		
	}
}