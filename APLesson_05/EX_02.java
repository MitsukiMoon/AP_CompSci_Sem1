import java.util.Scanner;
public class EX_02
{
	static String item1;
	static String item2;
	static String item3;
	static String item4;
	
	static double price1;
	static double price2;
	static double price3;
	static double price4;
	
	static double discount;
	static double subtotal;
	static double tax;
	
	static double total;
	
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		EX_02 calculate = new EX_02();


		System.out.println ("Please enter item 1:");
		item1 = keyboard.nextLine();
		System.out.println ("Please enter price 1:");
		price1 = keyboard.nextFloat();
		
		String place2 = keyboard.nextLine();
		
		System.out.println ("Please enter item 2:");
		item2 = keyboard.nextLine();
		System.out.println ("Please enter price 2:");
		price2 = keyboard.nextFloat();
		
		String place3 = keyboard.nextLine();

		System.out.println ("Please enter item 3:");
		item3 = keyboard.nextLine();
		System.out.println ("Please enter price 3:");
		price3 = keyboard.nextFloat();

		String place14 = keyboard.nextLine();
		
		System.out.println ("Please enter item 4:");
		item4 = keyboard.nextLine();
		System.out.println ("Please enter price 4:");
		price4 = keyboard.nextFloat();		
		
		
		subtotal = price1 + price2 + price3 + price4;
		
		tax = subtotal * 0.075;
		
		discount = calculate.discount();
		
		total = subtotal - discount + tax;
		
		System.out.printf ("<<<<<<<<<<< Receipt >>>>>>>>>>>>>>");
		calculate.format(item1, price1);
		calculate.format(item2, price2);
		calculate.format(item3, price3);
		calculate.format(item4, price4);
		calculate.format("Subtotal", subtotal);
		calculate.format("Discount", discount);
		calculate.format("Tax", tax);
		calculate.format("Total", total);
		
		System.out.println ("\n ______________________________________________________");
		System.out.println("Thank you.");
		
		
	}
	
	public static double discount()
	{
		if (subtotal >= 2000)
		{
			return (subtotal * 0.15);
		}
		
		else 
		{
			return 0;
		}
		
	}
	
	public void format (String word, double number)
	{
		
		System.out.printf ("\n* %20s ....... %.2f", word, number);

	}
	
	
}
	
	
	
	
