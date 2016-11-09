import java.util.Scanner;
public class EX_04
{
	static double radius, Area;
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		EX_04 calculate = new EX_04();

		System.out.println ("Please enter radius");
		
		radius = keyboard.nextFloat();
		
		String place1 = keyboard.nextLine();
		

		
		Area = calculate.Area(radius);
		
		print();
		
	}
	
	public double Area (double radius)
	{
		return ((Math.PI * radius * radius));
	
		
	}
	
	public static void print ()
	{
		System.out.printf("The area of a circle with a radius of %.5f is %.5f \n", radius, Area);
	}
}
	
	
	
	
