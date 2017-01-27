import java.lang.Math.*;

public class InventoryItems
{
	private String ItemManufacturer, ItemName, ItemCategory;
	private int UserID;
	private float ItemPrice;
	
	public InventoryItems (ItemManufacturer, ItemName)
	{
		ItemManufacturer = "";
		ItemName = "";
		UPC = (int)(Math.random() * 100000000) + 1;
	}
	
	public InventoryItems (ItemManufacturer, ItemName, ItemCategory, ItemPrice)
	{
		ItemManufacturer = "";
		ItemName = "";
		ItemCategory = "";
		ItemPrice = 0.00;
		UPC = (int)(Math.random() * 100000000) + 1;
	}
		
	
	
	
	public String toString()
	{
	   return "Inventory Items ...	\nManufacturer: " + ItemManufacturer +
									"\Name: " + ItemName +
									"\nCategory: " + ItemCategory +
									"\nUPC#: " + UPC +
									"\nPrice: " + ItemPrice;
	}
	
	
	
}
	
	
	
