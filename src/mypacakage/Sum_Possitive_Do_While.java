package mypacakage;

import java.util.Scanner;

public class Sum_Possitive_Do_While {
	public static void main(String[] args) {
		int no = 0 ;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		do 
		{	
		System.out.println("Enter the number  for sum " );
		sum=sum+no;
		no=sc.nextInt();
		} while(no>0); // 
		System.out.print("sum of number is "+sum);
	}
	
	///2*3 = 2 +2+ 2
	
	
}
