import java.util.Scanner;
public class EX_04
{
	
	static double r,n,P,year,t,compound;
	public static void main(String[]args)
	{ 
		Scanner keyboard = new Scanner(System.in);
		EX_04 calculate = new EX_04();
		
		System.out.println ("Enter rate:");
		r = keyboard.nextDouble();;
		System.out.println ("Enter number of times:");
		n = keyboard.nextDouble();;
		System.out.println ("Enter your Initial Amount:");
		P = keyboard.nextDouble();;
		System.out.println ("Enter time:");
		year = keyboard.nextDouble();;
		
		t = year/12;
		
		
		
		calcinterest();
		print();
		
		
	}
	
	public static void calcinterest ()
	{
		compound =  (P * Math.pow((1 + (r/n)), (n * t)));
		
	}
	
	public static void print ()
	{
		System.out.printf("The total compounded interest is $ %.2f\n", compound);
	}
}