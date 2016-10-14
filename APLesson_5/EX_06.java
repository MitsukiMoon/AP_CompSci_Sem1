import java.util.Scanner;
public class EX_06
{
	static String usernameg, passwordg, username, password;

	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		EX_06 calculate = new EX_06();
		username = "jodie";
		password = "1234";	
		passCheck();
	}
	
	public static void passCheck()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your username?");
		usernameg = keyboard.next();
		System.out.println("What is your password?");
		passwordg = keyboard.next();	
		
		if (usernameg.equals(username)  &&  passwordg.equals(password)) 
		{
			System.out.println("You are granted access");
		}
		else 
		{
			if(usernameg.equals(username))
			{
				System.out.println("Your password is incorrect");
				passCheck();
			}
			else if (passwordg.equals(password)) 
			{
				System.out.println("Your username is incorrect");
				passCheck();
			}
			else 
			{
				System.out.println("Your username and password are incorrect!");
				passCheck();
			}
		}
	}
}
	
	
	
	
