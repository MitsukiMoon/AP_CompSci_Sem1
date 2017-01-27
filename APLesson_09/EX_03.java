import java.util.Scanner;
import java.util.Random;

public class EX_03
{
	
	public static void main(String[]args)
	{
		
		EX_03 calculate = new EX_03();
		
		Random rand = new Random();
		
		int[] numbers = new int [10];
		System.out.println ("Please enter number(s)");
		
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = rand.nextInt((100 - 1) + 1) + 1;

		}
		
		System.out.println("Numbers...");
		
		for (int number: numbers)
		{
			System.out.printf(number + " ");
		}
		
		System.out.println(" ");
		
		System.out.println ("The average of the above numbers is ... " + average(numbers));
		
		
		
		
		
	}
	
	public static double average(int[] nums)
	{
		double average = 0;
		int sum = 0;
		for (int num : nums)
		{
			sum += num;
		}
		average = (sum/(nums.length));
		return average;
		
		
		
	}
	

}
	
	
	
	
