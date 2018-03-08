import java.util.Date;

public class Ship
{
	public int NumarLocuri;
	public Date OraPlecarii;
	public String Nume;

	public Ship(int nr, int ora, int minut, String nume)
	{
		NumarLocuri = nr;
		OraPlecarii = new Date(0, 0, 0, ora, minut);
		Nume = nume;
	}

	public int Compare()
	{
		return OraPlecarii.getMinutes() + OraPlecarii.getHours() * 60;
	}
}
