import java.util.Scanner;
public class EX_04
{
	
	static int userInt;
	static int userTable;
	static int multiply;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);


		System.out.println ("Please enter integer");
		
		userInt = keyboard.nextInt();
		
		System.out.println ("Please enter Table");
		userTable = keyboard.nextInt();

		for (int i = 1; i <= userTable; i++)
		{
			multiply = i * userInt;
			System.out.printf(i + "|" + multiply + "\n");

		}
		
		
	}
	

	
	
}
	
	
	
	
