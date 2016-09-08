import java.util.Scanner;
public class EX_03
{
	public static void main(String[]args)
	{
		

		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println ("Enter the how fat the object is?");
		int m = keyboard.nextInt();
		
		System.out.println ("Enter how fast that fat object accelerates to the ground");
		int a = keyboard.nextInt();
		
		int Force = m*a;
		
		System.out.println ("Your Force is: " + Force);
		
		
		
	}
}