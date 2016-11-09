import java.util.Scanner;
public class EX_04
{
	public static void main(String[]args)
	{ 
		Scanner keyboard = new Scanner(System.in);
		EX_04 calculate = new EX_04();
		
		System.out.println ("Enter rate:");
		double radius = keyboard.nextFloat();
		
		String place1 = keyboard.nextLine();
		

		
		
		double compound = calculate.calcinterest(r, n, P, t);
		
		System.out.printf("The total compounded interest is $ %.2f\n", compound);
		
	}
	
	public double calcinterest (double r, double n, double P, double t)
	{
		return (P * Math.pow((1 + (r/n)), (n * t)));
	
		
	}
}