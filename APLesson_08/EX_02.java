import java.util.Scanner;
public class EX_02
{
	static String word1, word2, word3;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		EX_02 calculate = new EX_02();

		System.out.println ("Please enter word 1");
		
		word1 = keyboard.nextLine();
		
		System.out.println ("Please enter word 2");
		word2 = keyboard.nextLine();
		
		System.out.println ("Please enter word 3");
		word3 = keyboard.nextLine();
		
		makeCenter (word1);
		makeCenter (word2);
		makeCenter (word3);
		
		
		
		
	}
	
	public static void makeCenter(String word)
	{
		
		if (word.length() > 20)
		{
			System.out.println(word);
		}
		
		else 
		{
		
			word = " " + word + " ";
			makeCenter (word);
	
		
		}
	

	}
}
	
	
	
	
