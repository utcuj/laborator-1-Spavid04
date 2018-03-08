import java.util.ArrayList;

public class Harbour
{
	public ArrayList<Ship> Vapoare = new ArrayList<Ship>();
	
	public void PrintAll()
	{
		Vapoare.stream().sorted((a,b) -> a.Compare() - b.Compare())
						.map(x -> String.format("ora %2d:%2d - %s - %d pasageri", x.OraPlecarii.getHours(), x.OraPlecarii.getMinutes(), x.Nume, x.NumarLocuri))
						.forEach(x -> System.out.println(x));
	}
}
