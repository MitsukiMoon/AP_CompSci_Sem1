import java.lang.Math.*;
import java.util.Arrays;
public class Toyota extends Car
{
	private double[] location;
	private int ID;
	
	public Toyota()
	{
		ID = (int)(Math.random() * 9000000) + 1000000;
		location = new double[2];
	}
	
	public Toyota(String c)
	{
		ID = (int)(Math.random() * 9000000) + 1000000;
		location = new double[2];
		String[] Coordinate = c.split(", ");
		location[0] = Double.parseDouble(Coordinate[0]);
		location[1] = Double.parseDouble(Coordinate[1]);

	}
	
	public int getID()
	{
		return super.getID();
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