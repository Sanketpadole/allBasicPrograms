package Recursion;

public class fibonacier {

	static int a = 0;
	static int b = 1;
	static int c;

	void printfibo(int i) {
		if (i >= 1) {

			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
			printfibo(i - 1);

		}
	}

	public static void main(String[] args) {
		System.out.println(a + " " + b);

		fibonacciSeriesReccccc1 sss = new fibonacciSeriesReccccc1();
		sss.printfibo(10);
	}

}


}
