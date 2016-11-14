import java.util.Scanner;
public class EX_01
{
	static String i1, i2, i3, i4, i5;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		EX_01 calculate = new EX_01();
		
		String[] words = new String [5];
		System.out.println ("Please enter word(s)");
		
		for (int i = 0; i < words.length; i++)
		{
			words[i] = kb.nextLine();

		}
		
		System.out.println("In order...");
		
		for (String word : words)
			System.out.println(word);		
		
		System.out.println("");
		System.out.println("Reversed...");
		reverse(words);
			
		
		
	}
	
	public static void reverse(String[] word)
	{
		for (int i = (word.length - 1); i > -1; i--)
		{
			System.out.println(word[i]);
			
		}
		
		
		
		
	}
	

}
	
	
	
	
