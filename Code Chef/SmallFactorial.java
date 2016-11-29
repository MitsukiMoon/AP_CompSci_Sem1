
import java.util.*;
import java.lang.*;
import java.io.*;
class SmallFactorial
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner keyboard = new Scanner(System.in);
		int t = keyboard.nextInt();
		
		while (t > 0)
		{
			int output = 1;
			int n = keyboard.nextInt();
				for (int i = 1; i < (n+1); i++)
				{
					output = output * i;
				}
				
			System.out.println (output);
			t --;
		}

	}
}