import java.util.Scanner;
public class EX_02
{
	public static void main(String[]args)
	{
		

		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println ("How fat are you?");
		int weight = keyboard.nextInt();
		
		System.out.println ("How tall are you?");
		int height = keyboard.nextInt();
		
		int BMI = (703 * weight)/(height*height);
		
		System.out.println ("You are this fat: " + BMI);
		
		
		
	}
}