package mypacakage;

public class Do_While_sum_ODD_Number {

	public static void main(String[] args) {
		int i = 1;
		int sum=0;
		do 
		{
			if(i%2==1)
			{
				System.out.println("ODD is "+i);
				sum=sum+i;
			}
			i++;
		} while (i < 5); // 
		System.out.print("sum of ODD is "+sum);
	}
}
