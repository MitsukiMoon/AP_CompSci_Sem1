import java.util.Scanner;
public class EX_02
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		EX_02 calculate = new EX_02();
		
		String[] words = new String [5];
		System.out.println ("Please enter word(s)");
		
		for (int i = 0; i < words.length; i++)
		{
			words[i] = kb.nextLine();

		}
		
		first(words);
			
		
		
	}
	
	public static void first(String[] w)
	{
		for (String word : w)
		{
			System.out.println(word.substring(0, 1));
			
		}
		
		
		
		
	}
	

}
	
	
	
	
