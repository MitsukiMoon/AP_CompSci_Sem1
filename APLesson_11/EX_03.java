import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
public class EX_03
{
	
	public static void main(String[]args)
	{
		String [][] xAndO = new String [4][4];
		Random rand = new Random();
		for (int i = 0; i < xAndO.length; i++)
		{
			for (int j = 0; j < xAndO[i].length; j++)
			{
				int pick = (int) rand.nextInt(2) + 1;
				if (pick == 1)
				{
					xAndO[i][j] = "x";
				}
				
				if (pick == 2)
				{
					xAndO[i][j] = "o";
				}
				
			}
		}

		
		for (int i = 0; i < xAndO.length; i++)
		{
			for (int j = 0; j < xAndO[i].length; j++)
			{
					System.out.print(xAndO[i][j] + "\t");
					
				
			}
			System.out.println(" ");
			
		}
		

	}
	
	
	
}	
	
	
	
	
