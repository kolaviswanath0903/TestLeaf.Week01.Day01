package week1.day1;

public class HomeAssesmentFibbinocciSeries {

	public static void main(String[] args) {
		int i = 1;
		int Fnum = 0, Snum = 1, Fibnum = 0;
		
		for (i=1; i<=11; i++)
		{
			
			Fibnum = Fnum + Snum;
			System.out.println("Fibbinocci Series of " + Fnum + " + " + Snum + " = " + Fibnum);
			Fnum = Snum;
			Snum = Fibnum;
		}

	}

}
