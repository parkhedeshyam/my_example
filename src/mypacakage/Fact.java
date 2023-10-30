package mypacakage;

import java.util.Scanner;

public class Fact {
	public static void main(String[] args) {
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		no = sc.nextInt();
		int fact = 1;
		while (no != 0)   //no=5;
		{
			fact = fact * no; //5*4*3*2*1
			no = no - 1;
		}
		System.out.println("fact =" + fact);
	}

}
