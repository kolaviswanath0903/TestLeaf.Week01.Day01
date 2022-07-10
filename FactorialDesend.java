package week1.day1;

public class FactorialDesend {

	public static void main(String[] args) {
		int i, fact=1, cfact=1;
		
		for (i=5; i>0; i--)
		{
			cfact = fact;
			
			fact=fact*i;
			
			//System.out.println("The Current value of i is: " + i);
				
			
			System.out.println("The Current factorial value of " + cfact + " * " + i + " = " + fact);
		}
		System.out.println("The Factorial of given 5 number series is: " + fact);
	}

}
