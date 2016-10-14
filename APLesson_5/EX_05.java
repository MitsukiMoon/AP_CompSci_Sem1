import java.util.Scanner;
public class EX_05
{
	static String choice;

	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);

		
		System.out.println ("Do you go left(h) or right?(b)");
		choice = keyboard.nextLine();
			if ("h".equalsIgnoreCase(choice)){
				System.out.println ("Correct. There's a river in your path. Do you swim (p) or find something else (e)");
				choice = keyboard.next();
				
				if ("e".equalsIgnoreCase(choice)){
					System.out.println ("Correct. There's a monster in your path. Do you run(e) or fight (y)");
					choice = keyboard.next();
				
					if ("y".equalsIgnoreCase(choice)){
						System.out.println ("You win!");
					}
					
					else {
						System.out.println("You died!");
					}

				
				}
				
				else {
					System.out.println("You died. Try again.");
				}
				
				
			}
			
			else {
				System.out.println ("You died. Try again.");
			}
		
		
		
	}
	


	
	
}
	
	
	
	
