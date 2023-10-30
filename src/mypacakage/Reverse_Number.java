package mypacakage;

public class Reverse_Number {

	public static void main(String[] args)
	{
		//no =123, revno =321
		int no= 123; int revno=0;int sum =0 ; int rem;
		System.out.println("Original number is "+no);
		while(no!=0)
		{
			rem=no%10;
			revno=revno*10+rem;
			//revno=revno+rem;
			no=no/10;
		}
		System.out.println("reverser number is "+revno+" "+no);
	}

}
