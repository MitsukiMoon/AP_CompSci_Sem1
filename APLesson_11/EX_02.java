import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
public class EX_02
{
	
	public static void main(String[]args)
	{
		String [][] words = new String [4][4];
		Scanner kb = new Scanner (System.in);
		for (int i = 0; i < words.length; i++)
		{
			for (int j = 0; j < words[i].length; j++)
			{
				System.out.println("Please enter a word:");
				words[i][j] = kb.nextLine();
			}
		}

		
		for (int i = 0; i < words.length; i++)
		{
			for (int j = 0; j < words[i].length; j++)
			{
					System.out.printf("%10s \t", words[i][j]);
					
				
			}
			System.out.println(" ");
			
		}
		

	}
	
	
	
}	
	
	
	
	
