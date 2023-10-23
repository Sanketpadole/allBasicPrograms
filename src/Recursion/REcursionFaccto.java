package Recursion;

import Programs.String;

public class REcursionFaccto {

	static int factorial = 1;

	static void fact(int n) {
		if (n >= 1) {
			factorial = factorial * n;
			System.out.println(factorial);

			fact(n - 1);
		}
	}

	public static void main(String[] args) {
		REcursionFaccto fact1 = new REcursionFaccto();
		fact1.fact(10);

	}

//	static int a = 0;
//	static int b = 1;
//	static int c;
//
//	void printfibo(int i) {
//		if (i >= 1) {
//
//			c = a + b;
//			System.out.println(c);
//			a = b;
//			b = c;
//			printfibo(i - 1);
//
//		}
//	}
//
//	public static void main(String[] args) {
//		System.out.println(a + " " + b);
//
//		fibonacciSeriesReccccc1 sss = new fibonacciSeriesReccccc1();
//		sss.printfibo(10);
//	}
//
//}

}
