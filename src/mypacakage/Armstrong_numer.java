package mypacakage;

public class Armstrong_numer {

	public static void main(String[] args) {
		int no= 153; int revno=0;int sum =0 ; int rem;
		int orino=no;
		System.out.println("Original number is "+no);
		while(no!=0)
		{
			rem=no%10;
			sum=sum+rem*rem*rem;
			no=no/10;
		}
		System.out.println("sum of cube is number is "+sum+" "+no);		
		if(orino==revno)
		{
			System.out.println("Number is Armstrong ");	
		}
		else
		{
			System.out.println("Number is notArmstrong");	
		}
	}

}
