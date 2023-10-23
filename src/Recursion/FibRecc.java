package Recursion;

public class FibRecc {

	static int a = 0;
	static int b = 1;
	static int c;

	void printFib(int i) {
		if (i >= 1) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
			printFib(i - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println(a + " " + b);
		FibRecc fib = new FibRecc();
		fib.printFib(10);
	}

}
