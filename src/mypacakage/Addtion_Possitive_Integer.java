package mypacakage;

import java.util.Scanner;

public class Addtion_Possitive_Integer {
// Java program to find the sum of 
//positive numbers using do-while loop

	public static void main(String[] args) {
		// Take input from the user
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num = 0;

		// do...while loop continues
		// until entered number is positive
		do {
			// add only positive numbers
			sum = sum + num;
			System.out.println("Enter a number");
			num = sc.nextInt();
		} while (num >= 0);

		System.out.println("The sum of entered positive numbers is " + sum);
		sc.close();
	}
}
