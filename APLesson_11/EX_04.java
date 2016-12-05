import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
public class EX_04
{
	
	public static void main(String[]args)
	{
		int [][] nums = new int [4][4];
		Scanner kb = new Scanner (System.in);
		Random rand = new Random();
		for (int i = 0; i < nums.length; i++)
		{
			for (int j = 0; j < nums[i].length; j++)
			{
				nums[i][j] = (int) rand.nextInt(100) + 1;
				System.out.print(nums[i][j] + "\t");
				
			}
			System.out.println(" ");
		}

		System.out.println("Please enter a number:");
		
		int divisor = kb.nextInt();
		
		int count = 0;
		for (int i = 0; i < nums.length; i ++)
		{
			for (int j = 0; j < nums[i].length; j++)
			{
				if (nums[i][j] % divisor == 0)
				{
					count++;
				}					

			}
		}
		
		System.out.println ("There are " + count + " numbers divisivble by " + divisor + " in the Array.");
		

		

	}
	
	
	
}	
	
	
	
	
