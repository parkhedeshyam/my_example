package mypacakage;

public class While_Example_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1; //inilization of variable 
		int sum=0;
		while (i <10) //conditions  2 4 6 8 
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
			i=i+1; //Increments /decrements 
		}
		System.out.print("sum is  "+sum);
	}
}
