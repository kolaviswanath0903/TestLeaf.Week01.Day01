package week1.day1;

public class HomeAssesmentPrimeNumber 
{

	public static void main(String[] args) 
	{
	int Gnum = 29, i=2, Cnum;
	boolean Pnum;
	for (i=2; i<Gnum; i++)
		{
		  Cnum = Gnum%i;
		  if (Cnum == 0)
			{
			 // System.out.println("The given " + Gnum + " is not a prime number and it is divisible by" + i);
			  Pnum = false;
			  break;
			}
		  else
		  	{
			  Pnum = true;
			 // System.out.println("The given " + Gnum + " is prime number");
		  	}
		 }
		if (Pnum = true)
			{
			  System.out.println(Pnum + " The given " + Gnum + " is prime number");
			}
		else
			{
			 System.out.println(Pnum + " The given " + Gnum + " is not a prime number");
			}
	}

}
