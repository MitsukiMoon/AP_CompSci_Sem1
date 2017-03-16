import java.lang.Math.*;
import java.util.Arrays;
public class GMC extends Car
{
	private double x;
	private double y;
	private int ID;
	
	public GMC()
	{
		x = 0;
		y = 0;
	}
	
	public GMC(double xCoordinate, double yCoordinate)
	{
		x = xCoordinate;
		y = yCoordinate;
	}
	
	public int getID()
	{
		return super.getID();
	}
	
	public void move(double xCoordinate, double yCoordinate)
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