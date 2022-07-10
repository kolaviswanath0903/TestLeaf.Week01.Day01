package week1.day1;

public class OddOrEven {

	public static void main(String[] args) {
		int Num=10, Numtype=0;
		Numtype = Num%2;
		if (Numtype == 0)
				{
			System.out.println("The given number " + Num + " is Even");
				}
		else if (Numtype == 1)
				{
			System.out.println("The given number " + Num + " is Odd");
				}
		else
				{
			System.out.println("Not a Valid Input" + Num);
				}
	}

}
