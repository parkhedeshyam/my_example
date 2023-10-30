package mypacakage;

public class Division {

	public static void main(String[] args)
	{
		float a=8;  //a =2, b=3 
		float b=2;
		float cnt=0;
		System.out.println("DDivision");
		//while(a!=0)
		while(a>=b)
		{
			a=a-b;
			cnt=cnt+1;			 
		}
		System.out.println("division is "+cnt);
	}

}
