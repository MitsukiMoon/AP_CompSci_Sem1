import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
public class EX_01
{
	
	public static void main(String[]args)
	{
		int [][] nums = new int [4][4];
		Random rand = new Random();
		for (int i = 0; i < nums.length; i++)
		{
			for (int j = 0; j < nums[i].length; j++)
			{
				nums[i][j] = (int) rand.nextInt(50) + 1;
			}
		}

		
		for (int i = 0; i < nums.length; i++)
		{
			for (int j = 0; j < nums[i].length; j++)
			{
					System.out.print(nums[i][j] + "\t");
					
				
			}
			System.out.println(" ");
			
		}
		

	}
	
	
	
}	
	
	
	
	
