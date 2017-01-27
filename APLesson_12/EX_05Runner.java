import java.util.Scanner;
public class EX_05Runner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println ("What's your name?");
		String fName = kb.next();
		String lName = kb.next();

		System.out.println ("Would you like a public avatar?");
		String Avatar = kb.next();

		
		
		if (Avatar.equals("n")) {
			UserClass user1 = new UserClass(fName, lName, "Undefined");
			System.out.println (user1);
		}
		
		if (Avatar.equals("y")) {
			System.out.println ("What is your username?");
			String publicAvatar = kb.next();
			UserClass user2 = new UserClass (fName, lName, publicAvatar);
			System.out.println (user2);
			
		}
		
	
		
		

		
		
		
	}

	
	
	
}
	
	
	
