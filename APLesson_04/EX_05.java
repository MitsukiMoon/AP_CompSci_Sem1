import java.util.Scanner;
public class EX_05
{
	public static void main(String[]args)
	{ 
		Scanner keyboard = new Scanner(System.in);
		EX_05 calculate = new EX_05();
		
		System.out.println ("Enter height:");
		double h = keyboard.nextDouble();;
		System.out.println ("Enter length:");
		double l = keyboard.nextDouble();;
		System.out.println ("Enter width:");
		double w = keyboard.nextDouble();;

		
		
		double volume = calculate.calcV(h,l,w);
		
		double calcVolume = volume * 0.00057870;
		
		System.out.printf("The total volume is %10.2f\n", calcVolume);
		
	}
	
	public double calcV(double h, double l, double w)
	{
			return (h * l * w);
		
	}
}

