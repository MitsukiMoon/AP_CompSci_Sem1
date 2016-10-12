import java.util.Scanner;
public class Question1  {
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the cost of the first item:");
		double item1 = kb.nextDouble();
		System.out.println ("Please enter the cost of the second item:");
		double item2 = kb.nextDouble();
		format(item1, item2);
		
		
		
	}
	
	public static void format(double one, double two)
	
	{
		double total = one + two;
		System.out.println("The total clost of your order is $"+ total );
		
	}
	
	
	
	
	
	
	
}