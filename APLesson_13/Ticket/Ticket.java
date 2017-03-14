public abstract class Ticket
{
	private int serialNo;
	public Ticket()
	{
		serialNo = (int)(Math.random() * 9000000) + 1000000;
	}
	
	public int getSerialNo()
	{
		return serialNo;
	}
	
	public abstract double getPrice();
	
	public String toString ()
	{
		return "Ticket Info..." + 	"\n Serial #: " + getSerialNo() +
									"\n Price: " + getPrice();
		
	}
	
	
	
	
	
	
	
}