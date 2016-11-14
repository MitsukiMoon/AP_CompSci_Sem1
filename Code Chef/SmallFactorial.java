
import java.util.*;
import java.lang.*;
import java.io.*;
class SmallFactorial
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n = 1;
		int t;
		int output = 1;
		Scanner keyboard=new Scanner(System.in);
		t = keyboard.nextInt();
		while (t> 0){
			for (int i = 0; i < t; i++)
			{
				output = n * i;
			}
			
			System.out.println (output);
			
		t --;
		}

	}
}