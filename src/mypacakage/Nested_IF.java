package mypacakage;

import java.util.Scanner;

public class Nested_IF {

	public static void main(String[] args)
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a ");
		a = sc.nextInt();
		System.out.println("Enter the value of b ");
		b = sc.nextInt();
		System.out.println("Enter the value of c ");
		c = sc.nextInt();
		
		System.out.println("value of a ="+a);
		System.out.println("value of b ="+b);
		System.out.println("value of a ="+c);
		//3 2 1
		
		if(a>b && a>c)
		{
			System.out.println("Max number is a "+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("Max number is b "+b);
		}
		else
		{
			System.out.println("Max number is c "+c);
		}
	}

}
