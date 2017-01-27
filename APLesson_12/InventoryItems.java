import java.lang.Math.*;

public class InventoryItems
{
	private String ItemManufacturer, ItemName, ItemCategory;
	private int UPC;
	private double ItemPrice;
	
	public InventoryItems (String Manufacturer, String Name)
	{
		ItemManufacturer = Manufacturer;
		ItemName = Name;
		UPC = (int)(Math.random() * 100000000) + 1;
	}
	
	public InventoryItems (String Manufacturer, String Name, String Category, double Price)
	{
		ItemManufacturer = Manufacturer;
		ItemName = Name;
		ItemCategory = Category;
		ItemPrice = Price;
		UPC = (int)(Math.random() * 100000000) + 1;
	}
		
	
	
	
	public String toString()
	{
	   return "Inventory Items ...	\nManufacturer: " + ItemManufacturer +
									"\nName: " + ItemName +
									"\nCategory: " + ItemCategory +
									"\nUPC#: " + UPC +
									"\nPrice: " + ItemPrice;
	}
	
	
	
}
	
	
	
