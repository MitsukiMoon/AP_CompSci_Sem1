import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class EX_07
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		EX_07 calculate = new EX_07();
		
		
		String[] words = new String [5];
		
		
		
		
		fillArray(words);
		System.out.println("For the following numbers...");
		printArray (words);
		System.out.println("Only" + hasZs(words) + " contain(s) the letter z.");

		
		
		
	}
	
	public static void fillArray(String[] array){
		Scanner kb = new Scanner(System.in);
		for (int i = 0; i <= 4; i++)
		{
			array[i] = kb.nextLine();
		}
		
		
	}
	
	public static void printArray(String[] array) {
		
		System.out.println(Arrays.toString(array));

		
		
		
	}
	
	public static String hasZs(String[] words){
		String zs = "";
		
		for (String word: words)
		{
			if (word.indexOf("z") >= 0 ){
				zs += " ";
				zs += word;
				
			}

		}
		
		return zs;
		
	}
	

	

}
	
	
	
	
