import java.util.Scanner;
public class EX_03
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		EX_03 calculate = new EX_03();
		
		int[] numbers = new int [10];
		System.out.println ("Please enter number(s)");
		
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = kb.nextInt();

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
	
	
	
	
