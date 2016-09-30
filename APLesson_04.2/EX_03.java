import java.util.Scanner;
public class EX_03
{
	
	static double side, surfaceArea;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		EX_03 calculate = new EX_03();

		System.out.println ("Please enter side");
		
		side = keyboard.nextFloat();
		
		String place1 = keyboard.nextLine();
		

	
		
		
		Area();
		
		print();
		
	}
	
	public static void Area ()
	{
		surfaceArea = ((6 * side * side));
	
	}
	
	public static void print()
	{
		
		System.out.printf("The Surface Area of a cube with length %10.5f is %10.5f \n", side, surfaceArea);
	}
}
	
	
	
	
