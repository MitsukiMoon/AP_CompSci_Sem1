import java.util.Scanner;
public class EX_03
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		EX_03 calculate = new EX_03();

		System.out.println ("Please enter side");
		
		double side = keyboard.nextFloat();
		
		String place1 = keyboard.nextLine();
		

		
		double surfaceArea = calculate.Area(side);
		
		System.out.printf("The Surface Area of a cube with length %10.5f is %10.5f \n", side, surfaceArea);
		
	}
	
	public double Area (double side)
	{
		return ((6 * side * side));
	
		
	}
	
}
	
	
	
	
