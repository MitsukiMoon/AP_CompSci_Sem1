import java.util.Scanner;
public class EX_06Runner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
			
		
		System.out.println ("What's your item information?");
		String ItemManufacturer = kb.next();
		String ItemName = kb.next();
		
		
		System.out.println("Will you be entering category and price information?");
		
		String Item = kb.next();
		

		if (Item.equals("n")) {
			InventoryItems item1 = new InventoryItems(ItemManufacturer, ItemName);
			System.out.println (item1);
		}
		
		if (Item.equals("y")) {
			System.out.println ("What is your Price and Category?");
			double ItemPrice = kb.nextFloat();
			String ItemCategory = kb.next();
			InventoryItems item1 = new InventoryItems(ItemManufacturer, ItemName, ItemCategory, ItemPrice);
			System.out.println (item1);
			
		}
		
	
		
		

		
		
		
	}

	
	
	
}
	
	
	
