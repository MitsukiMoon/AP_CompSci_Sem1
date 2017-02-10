
public class ToyRunner
{
	public static void main(String[]args)
	{
		
		String systems = "Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF";
		
		ToyStore toy = new ToyStore(toys);

		System.out.println(toy);
		System.out.println("Most Frequent Toy: " + toy.getMostFrequentToy());
		System.out.println("Most Frequent Type: " + toy.getMostFrequentType());
		
		

	}

	
	
	
}
	
	
	
