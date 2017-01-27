import java.util.Scanner;
public class EX_04Runner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println ("Please list the characteristics: ");
		String hair = kb.next();
		String eyes = kb.next();
		String skin = kb.next();
		
		Human object = new Human(hair, eyes, skin);
		
		System.out.println("My info...");
		System.out.println("Hair: " + object.getHair() + "| Eyes:  " + object.getEyes() + "| Skin: " + object.getSkin());
		

		object.setHair(kb.next());
		object.setEyes (kb.next());
		object.setSkin (kb.next());
		
		System.out.println("Friend's info...");
		System.out.println("Hair: " + object.getHair() + "| Eyes:  " + object.getEyes() + "| Skin: " + object.getSkin());
		
		
		
	}

	
	
	
}
	
	
	
