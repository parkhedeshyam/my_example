package mypacakage;

import java.util.Scanner;

public class Voting_IF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age ");
		age = sc.nextInt();
		if (age >= 18) {
			System.out.println("Eligible for voting ");
		} else {
			System.out.println("Not Eligible for voting ");
		}

	}

}
