import java.util.Scanner;
public class EX_03Runner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println ("Please enter the properties:");
		String paint = kb.next();
		String interior = kb.next();
		String engine = kb.next();
		String tires = kb.next();
		

		
		Car object = new Car(paint, interior, engine, tires);
		
		
		System.out.println ("Your vehicle is ready.....");
		
		System.out.println("Paint: \t" + object.getPaint());
		System.out.println("Interior: \t" + object.getInterior());
		System.out.println("Engine: \t" + object.getEngine());
		System.out.println("Tires: \t" + object.getTires());
		
		System.out.println ("Please enter the properties:");
		object.setPaint(kb.next());
		object.setInterior(kb.next());
		object.setEngine(kb.next());
		object.setTires(kb.next());
		
		System.out.println ("Your vehicle is ready.....");
		
		System.out.println("Paint: \t" + object.getPaint());
		System.out.println("Interior: \t" + object.getInterior());
		System.out.println("Engine: \t" + object.getEngine());
		System.out.println("Tires: \t" + object.getTires());		
		
		
		
		
	}

	
	
	
}
	
	
	
