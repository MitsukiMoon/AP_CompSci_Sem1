import java.util.Scanner;
public class EX_01
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println ("Hi, my name is Rude AI. What is your name?");
		
		String name = keyboard.next();
		
		System.out.println (name +"? Who would name their child that?");
		
		System.out.println ("How old are you, Scrub?");
		int age = keyboard.nextInt();
		
		System.out.println ("Don't do drugs. So? What do you waste your life with?");
		String activity = keyboard.next();
		
		System.out.println ("What do waste your life listening to?");
		String music = keyboard.next();
		
		System.out.println ("How many siblings do you have?");
		String siblings = keyboard.next();
		
		System.out.println ("Your parents never loved you. What do you want to be?");
		String job = keyboard.next();
		
	}
}