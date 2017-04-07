import java.lang.Math.*;
import java.util.Arrays;
public abstract class Car implements Location
{
	private int x;
	private int y;
	private int ID;
	private double[] location;
	
	public Car()
	{
		ID = (int)(Math.random() * 9000000) + 1000000;
		location = new double [2];
	}
	
	public Car(int xCoordinate, int yCoordinate)
	{
		ID = (int)(Math.random() * 9000000) + 1000000;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public void move(double xCoordinate, double yCoordinate)
	{
		location [0] += xCoordinate;
		location [1] += yCoordinate;
	}
	
	public double[] getLoc()
	{
		return location;
	}
	
	
}