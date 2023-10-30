package mypacakage;

public class Swap_Without_3rd_variable {

	public static void main(String[] args) {
		int a = 6;
		int b = 5;
		System.out.println("After Swap" + " a=" + a + " " + " b= " + b);
		//a = a + b;
	//	b = a - b;
	//	a = a - b;
		
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("After Swap" + " a=" + a + " " + " b= " + b);
	}

}
