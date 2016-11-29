import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
public class EX_01
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		EX_01 calculate = new EX_01();
		
		
		
		int numbers = {2, 6, 8, 9, 10, 12, 13, 15, 17, 24, 55, 66, 78, 77, 79};
		ArrayList<Integer> numbers = new ArrayList<> (Arrays.asList(numbers));
		
		
		
		gFactor(n);
		
		
		
	}
	
	public static void gFactor(n){
		Scanner kb = new Scanner(System.in);
		for (int i = 2; i <= n; i++)
		{
			if (  %  == 0){
				return 1;
			}
			
			else {
				return 0;	
			}
			
				
		}
		
		
	}
	

	
	public static void removeComposites(nums){
		String zs = "";
		
		for (int i =0; i <= nums.length; i++ )
		{
			if (gFactor(nums[i]) == 0 ){
				n.splice(i, 1);
				
			}

		}
		
		return zs;
		
	}
	

	

}
	
	
	
	
