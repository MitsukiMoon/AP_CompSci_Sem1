import java.util.Scanner;
public class EX_04
{
	static String word;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		EX_04 calculate = new EX_01();

		System.out.println ("Please enter word");
		
		word = keyboard.nextLine();
		replace(sentence);
		
		
		
		
	}
	
	public static void replace(String sentence)
	{
		
		if (sentence.indexOf(' ') == -1)
		{
			System.out.println(sentence);
		}
		
		else 
		{
			if (sentence.indexOf(' ') == -1)
			{
				System.out.println(sentence);
			}

			else 
			{
				
				sentence = sentence.substring(0, sentence.indexOf(" ")) + "_" + sentence.substring(sentence.indexOf(" ") + 1);
				replace(sentence);
				
			
			}
	
		
		}
	

	}
}
	
	
	
	
