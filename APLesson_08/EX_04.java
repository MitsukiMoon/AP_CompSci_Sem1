import java.util.Scanner;
public class EX_04
{
	static String word;
	static int stop, start;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		EX_04 calculate = new EX_04();

		System.out.println ("Please enter word");
		
		word = keyboard.nextLine();
		start = 0;
		
		stop = word.length();
		tree(word, start, stop);
		
		
		
		
	}
	
	public static void tree(String word, int start, int stop)
	{
		
		if (start <= stop)
		{
			System.out.printf( "%30s \n" , word.substring(0, start));
			start +=1;
			tree (word, start, stop);
		}
		
		else 
		{
			
			System.out.println("");
			
		}
	

	}
}
	
	
	
	
