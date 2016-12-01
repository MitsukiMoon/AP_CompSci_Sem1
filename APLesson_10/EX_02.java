import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
public class EX_02
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		EX_02 calculate = new EX_02();
		System.out.printf("Please enter your equation: ");
		
		String expression = kb.nextLine();
		
		ArrayList<String>equation = new ArrayList<>(Arrays.asList(expression.split(" ")));

		doEquation(equation);

	}
	
	public static void doEquation(ArrayList<String> equation){
		int i = 0;
		while (i < equation.size())
		{
			if (equation.get(i).equals("*") || equation.get(i).equals("/"))
			{
				if (equation.get(i).equals("*"))
				{
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) * Integer.parseInt(equation.get(i+1))));
					equation.remove(i-1);
					equation.remove(i);
				}
				
				else 
				{
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) / Integer.parseInt(equation.get(i+1))));
					equation.remove(i-1);
					equation.remove(i);
				}
				
			}
			else 
			{
				i++;
			}
		}
		
		i = 0;
		while (i < equation.size())
		{
			if (equation.get(i).equals("+") || equation.get(i).equals("-"))
			{
				if (equation.get(i).equals("+"))
				{
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) + Integer.parseInt(equation.get(i+1))));
					equation.remove(i-1);
					equation.remove(i);
				}
				
				else
				{
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) - Integer.parseInt(equation.get(i+1))));
					equation.remove(i-1);
					equation.remove(i);
				}
				
			}
			
			else
			{
				i++;
			}				
				
		}
		
		System.out.println(equation);
		
		
	}
	
}	
	
	
	
	
