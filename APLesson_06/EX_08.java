public class EX_08
{
	public static void main(String[]args)
	{
		

		sing ("Na", 4);
		sing ("Na", 4);
		sing ("Hey", 3);
		sing ("Goodbye!", 1);



	}
	
	public static void sing(String word, int times) {

	for (int i = 1; i <= times; i++)
		{
			System.out.printf(word + "\t");
		}
		
		System.out.printf("\n");
		
	}

	
	
}
	
	
	
	
