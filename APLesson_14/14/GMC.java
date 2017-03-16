import java.lang.Math.*;
import java.util.Arrays;
public class GMC implements Location
{
	private int x;
	private int y;
	private int ID;
	
	public GMC()
	{
		x = 0;
		y = 0;
		ID = (int)(Math.random() * 9000000) + 1000000;
	}
	
	public GMC(int xCoordinate, int yCoordinate)
	{
		x = xCoordinate;
		y = yCoordinate;
		ID = (int)(Math.random() * 9000000) + 1000000;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public void move(int xCoordinate, int yCoordinate)
	{
		x = x + xCoordinate; 
		y = y + yCoordinate;
	}
	public double[] getLoc()
	{
		double[] location = new double[2];
		location[0] = x;
		location[1] = y;
		
		return location;
		
	}
	
}