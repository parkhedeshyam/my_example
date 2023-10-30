package mypacakage;

public class Swap {

	public static void main(String[] args) {

		int a = 5;
		int b = 6;
		int t;
//System.out.println("Before Swap"+" a="+a+" "+" b= "+b );
		System.out.println("Before Swap " + a + " " + b);
		t = a; // t=5
		a = b;// a=6
		b = t;// b=5
		System.out.println("After Swap" + " a=" + a + " " + " b= " + b);

	}

}
