package mypacakage;

import java.util.Scanner;

public class Switch_Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("***Choose an Operation***\n "
				+ "+ Addtion \n - Subtraction \n "
				+ "/ Division \n * Multiplication");
		//char op = sc.next().charAt(0);
		String op = sc.nextLine();
		System.out.println("Enter 2 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//System.out.println("operator "+op);
		switch (op) 
		{
		case "+":
			System.out.println("Sum is " + (a + b));
			break;

		case "-":
			System.out.println("Sub is " + (a - b));
			break;

		case "/":
			System.out.println("Div is " + (a / b));
			break;

		case "*":
			System.out.println("Mul is " + (a * b));
			break;

		default:
			System.out.println("Invalid opration selected");
		}
	}
}
