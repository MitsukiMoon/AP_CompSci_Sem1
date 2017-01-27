import java.util.Scanner;
public class EX_06Runner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		InventoryItems item1;
		
		
		
		
		
		
		System.out.println ("What's your item information?");
		String ItemManufacturer = kb.next();
		String ItemName = kb.next();
		
		
		System.out.println("WIll you be entering category and price information?")
		

		if (Avatar.equals("n")) {
			InventoryItems item1 = new InventoryItems(ItemManufacturer, ItemName);
			System.out.println (item1);
		}
		
		if (Avatar.equals("y")) {
			System.out.println ("What is your username?");
			double ItemPrice = kb.nextFloat();
			String ItemCategory = kb.next();
			InventoryItems item1 = new InventoryItems(ItemManufacturer, ItemName, ItemCategory, ItemPrice);
			System.out.println (item1);
			
		}
		
	
		
		

		
		
		
	}

	
	
	
}
	
	
	
