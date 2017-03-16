import java.lang.Math.*;
import java.util.Arrays;
public class Honda extends Car
{
	private double[] location;
	private int ID;
	
	public Honda()
	{
		location = new double[2];
		ID = (int)(Math.random() * 9000000) + 1000000;;
	}
	
	public Honda(double[] Coordinate)
	{
		ID = (int)(Math.random() * 9000000) + 1000000;
		location  = Coordinate;
	}
	

	
}