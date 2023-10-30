package mypacakage;

public class Sum_digit {

	public static void main(String[] args) {
		
		int no = 1223; 
		int sum=0;
		int rem=0;
		while (no!=0)  
		{
			rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
		System.out.println("The sum od dogit  "+sum);
	}
}
