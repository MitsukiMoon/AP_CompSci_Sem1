import java.util.Scanner;
public class EX_04
{
	static double height, weight, BMI;

	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		EX_04 calculate = new EX_04();
		
		System.out.println ("How fat are you?");
		weight = keyboard.nextDouble();
		
		System.out.println ("How tall are you?");
		height = keyboard.nextDouble();
		
		BMI = (703 * weight)/(height*height);
		
		System.out.println ("Your BMI is " + BMI + "\n Thus, you are " + condition(BMI));
		
		
		
	}
	
	public static String condition(double BMI)
	{
		if (BMI < 18.5){
			return "Underweight";
		}
	
		else if ((18.5 <= BMI) & (BMI <= 24.9) ){
			return "Normal";
		}
		
		else if ((25 <= BMI) & (BMI <= 29.9)){
			return "Overweight";
		}
		
		else if ((30 <= BMI) & (BMI <= 34.9)){
			return "Obese";
		}
		
		else if ((35 <= BMI) & (BMI <= 39.9)){
			return "Very Obese";
		}
		
		else if (39.9 < BMI){
			return "Morbidly Obese";
		}

		else {
			return "";
		}
		

		
	}
	
	
}
	
	
	
	
