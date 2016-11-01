import java.util.Scanner;
public class EX_03
{
	static String Science, Math, History, CompSci, Spanish, English, Psychology;
	static double gPoints, gpa;

	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		EX_03 calculate = new EX_03();
		
		System.out.println ("Please enter grade for Science, Math, History, CompSci, Spanish, English, Psychology respectively:");
		
		Science = keyboard.next();
		Math = keyboard.next();
		History = keyboard.next();
		CompSci = keyboard.next();
		Spanish = keyboard.next();
		English = keyboard.next();
		Psychology = keyboard.next();
		
		gPoints = calcGrade(Science) + calcGrade(Math) + calcGrade(History) + calcGrade(CompSci) + calcGrade(Spanish) + calcGrade(English) + calcGrade(Psychology);
		
		gpa = gPoints/7;
		 
		System.out.println("You GPA is " + gpa);
		
		
	}
	
	public static double calcGrade(String grade)
	{
		if (grade.equals("A")){
			return 4.0;
		}
	
		
		if (grade.equals("B")){
			return 3.0;
		}
		
		if (grade.equals("C")){
			return 2.0;
		}
		
		if (grade.equals("D")){
			return 1.0;
		}
		
		if (grade.equals("F")){
			return 0.0;
		}
		else {
			return 0.0;
		}
		

		
	}
	
	
}
	
	
	
	
