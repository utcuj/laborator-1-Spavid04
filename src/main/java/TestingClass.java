
public class TestingClass
{
	public static void main(String[] args)
	{
		Harbour h1 = new Harbour();
		
		h1.Vapoare.add(new Ship(10, 3, 0, "Vapor1"));
		h1.Vapoare.add(new Ship(14, 16, 30, "Vapor2"));
		h1.Vapoare.add(new Ship(420, 22, 10, "Vapor3"));
		h1.Vapoare.add(new Ship(3, 9, 15, "Vapor4"));
		h1.Vapoare.add(new Ship(160, 12, 50, "Vapor5"));
		
		h1.PrintAll();
		
		UI u = new UI(h1);
	}
}
