package mypacakage;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;int b=1,i,c;
		int t=10 ;
		System.out.println("Fibonacci series");
		System.out.print(a+" "+b+" ");
		for(i=2;i<=t;i++)
		{
			c=a+b;
			System.out.print(+c+" ");
			a=b;
			b=c;
		}
		
	}
}
