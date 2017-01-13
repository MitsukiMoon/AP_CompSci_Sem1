import java.util.Scanner;
public class EX_01Runner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		int distance = kb.nextInt();
		int hours = kb.nextInt();
		int minutes = kb.nextInt();
		
		MilesPerHour object = new MilesPerHour(distance, hours, minutes);
		
		
		System.out.println(object.getDistance() + " miles in " + object.getHours() + " hours = " + object.getMph() + " mph ");
		

		object.setDistance(kb.nextInt());
		object.setHours (kb.nextInt());
		object.setMinutes (kb.nextInt());
		
		System.out.println(object.getDistance() + " miles in " + object.getHours() + " hours = " + object.getMph() + " mph ");
		
		
		
	}

	
	
	
}
	
	
	
