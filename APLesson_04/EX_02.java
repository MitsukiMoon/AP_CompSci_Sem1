import java.util.Scanner;
public class EX_02
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		String Subtotal = "Subtotal:";
		String Tax = "Tax:";
		String Total = "Total:";
	

		
		EX_02 form = new EX_02();
		
		System.out.println ("Enter your first name:");
		String fN = keyboard.nextLine();
		System.out.println ("Enter your last name");
		String lN = keyboard.nextLine();
	

		
		System.out.println ("Enter your title:");
		String title = keyboard.nextLine();		
		
		System.out.println ("Enter the school site:");
		String school = keyboard.nextLine();
		
		
		
		
		System.out.println ("Enter the School Year:");
		String sYear = keyboard.nextLine();	

		System.out.println ("What is your subject?");
		String subject = keyboard.nextLine();			
	
		
		
		System.out.println ("***********************************");
		form.format (school, sYear);
		form.format (fN, lN);
		form.format (title, subject);
		System.out.println ("\n***********************************");


		
		
	}
	public void format (String word, String word1)
	{
		System.out.printf ("\n* %15s ....... %20s *", word, word1);
	}
	
	
	
	
}