import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class EX_05
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		EX_05 calculate = new EX_05();
		
		
		int[] array = new int [10];
		
		
		
		
		fillArray(array);
		System.out.println("For the following numbers...");
		printArray (array);
		System.out.println("The" + getOdds(array) + " are odd numbers");

		
		
		
	}
	
	public static void fillArray(int[] array){
		Random rand = new Random();
		for (int i = 0; i <= 9; i++)
		{
			array[i] = rand.nextInt(100) + 1;
		}
		
		
	}
	
	public static void printArray(int[] array) {
		
		System.out.println(Arrays.toString(array));

		
		
		
	}
	
	public static String getOdds(int[] numbers){
		String odds = "";
		String evens = "";
		for (int num: numbers)
		{
			if (num % 2 != 0){
				odds += " ";
				odds += num;
				
			}
			
			else {
				evens += num;
			}
		}
		
		return odds;
		
	}
	

	

}
	
	
	
	
