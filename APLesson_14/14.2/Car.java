import java.lang.Math.*;
import java.util.Arrays;
public abstract class Car implements Location
{
	private int x;
	private int y;
	private int ID;
	
	public Car()
	{
		ID = (int)(Math.random() * 9000000) + 1000000;
	}
	
	public Car(int xCoordinate, int yCoordinate)
	{
		ID = (int)(Math.random() * 9000000) + 1000000;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public abstract void move(double xCoordinate, double yCoordinate);
	
	public double[] getLoc()
	{
		return loc;
	}
	
	
}