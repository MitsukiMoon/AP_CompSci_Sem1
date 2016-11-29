import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class EX_06
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		EX_06 calculate = new EX_06();
		
		
		int[] array = new int [10];
		
		
		
		
		fillArray(array);
		System.out.println("For the following numbers...");
		printArray (array);
		System.out.println("The biggest number is " + getBiggest(array));

		
		
		
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
	
	public static int getBiggest(int[] numbers){
		int max = 0;
		for (int num: numbers)
		{
			if (num > max){
				max = num;
				
			}

		}
		
		return max;
		
	}
	

	

}
	
	
	
	
