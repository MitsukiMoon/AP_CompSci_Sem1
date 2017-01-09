import java.util.Scanner;
public class EX_02Runner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.ln ("Please enter the coordinates:");
		int xOne = kb.nextInt();
		int yOne = kb.nextInt();
		int xTwo = kb.nextInt();
		int yTwo = kb.nextInt();
		

		
		Distance object = new Distance(xOne, yOne, xTwo, yTwo);
		
		
		System.out.println("distance = " + object.getDistance());
		

		object.setCoordinate1 (kb.nextInt(), kb.nextInt());
		object.setCoordinate2 (kb.nextInt(), kb.nextInt());
		
		System.out.println("distance = " + object.getDistance());
		
		
		
	}

	
	
	
}
	
	
	
