package week1.day1;

public class FactorialAsend 
{

	public static void main(String[] args) 
	{
		int AscFact=1, cAscFact=1;
		int i;
		
		for (i=1; i<=5; i++)
		{
			cAscFact = AscFact;
			
			AscFact=AscFact*i;
			
			System.out.println(cAscFact + " * " + i + " = " + AscFact);
			
		}
		
		System.out.println("Factorial of number 5 is " + AscFact);
	}

}
