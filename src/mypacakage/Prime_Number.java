package mypacakage;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int no = sc.nextInt();
		int cnt=0;
		for(int i =2;i<=5;i++)
		{
			if(no%i==0)
			{
				cnt=cnt+1;
				 break;
			}
		}
		if(cnt==1)
		{
			System.out.println("Number is not Prime");	
		}
		else
		{
			System.out.println("Number is Prime");	
		}
	}

}
