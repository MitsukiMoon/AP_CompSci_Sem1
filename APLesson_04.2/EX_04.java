import java.util.Scanner;
public class EX_04
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		EX_04 calculate = new EX_04();

		System.out.println ("Please enter radius");
		
		double radius = keyboard.nextFloat();
		
		String place1 = keyboard.nextLine();
		

		
		double Area = calculate.Area(radius);
		
		System.out.printf("The Area of a circle with a radius of %10.5f is %10.5f \n", radius, Area);
		
	}
	
	public double Area (double radius)
	{
		return ((Math.PI * radius * radius));
	
		
	}
}
	
	
	
	
