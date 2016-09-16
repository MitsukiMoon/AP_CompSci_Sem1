import java.util.Scanner;
public class EX_01
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		String Subtotal = "Subtotal:";
		String Tax = "Tax:";
		String Total = "Total:";
	

		
		EX_01 form = new EX_01();
		
		System.out.println ("Please enter item 1:");
		String item1 = keyboard.nextLine();
		System.out.println ("Please enter price:");
		double price1 = keyboard.nextFloat();
	
		
		String place1 = keyboard.nextLine();

		
		
		System.out.println ("Please enter item 2:");
		String item2 = keyboard.nextLine();		
		
		System.out.println ("Please enter price:");
		double price2 = keyboard.nextFloat();
		
		
		String place2 = keyboard.nextLine();
		
		
		
		System.out.println ("Please enter item 3:");
		String item3 = keyboard.nextLine();	

		System.out.println ("Please enter price:");
		double price3 = keyboard.nextFloat();		
		
		
		
		double st = price1 + price2 + price3;
		double tx = 1.2;
		double tot = st + tx;
		
		
		System.out.println ("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		form.format (item1, price1);
		form.format (item2, price2);
		form.format (item3, price3);
		form.format ("Subtotal", st);
		form.format ("Tax", tx);
		form.format ("Total:", tot);
		
		/*System.out.printf ("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		System.out.printf ("\n* %20s ....... %10.2f", item1, price1);
		System.out.printf ("\n* %20s ....... %10.2f", item2, price2);
		System.out.printf ("\n* %20s ....... %10.2f", item3, price3);
		System.out.printf ("\n");
		System.out.printf ("\n* %20s ....... %10.2f", "Subtotal:", st );
		System.out.printf ("\n* %20s ....... %10.2f", "Tax:", tx );
		System.out.printf ("\n* %20s ....... %10.2f", "Total:", tot); */

		
		
	}
	public void format (String word, double number)
	{
		System.out.printf ("\n* %20s ....... %10.2f", word, number);
	}
	
	
	
	
}