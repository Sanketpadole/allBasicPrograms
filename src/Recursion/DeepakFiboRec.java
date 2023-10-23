package Recursion;

public class DeepakFiboRec {
//	static int a = 0, b = 1, c;
//
//	void printFib(int i) {
//		if (i >= 1) {
//			c = a + b;
//			System.out.println("" + c);
//			a = b;
//			b = c;
//			printFib(i - 1);
//		}
//
//	}
//
//	public static void main(String[] args) {
//		System.out.println(a + " " + b);
//		DeepakFiboRec ob = new DeepakFiboRec();
//		ob.printFib(10);
//	}

	static int a = 0, b = 1, c;

	void printFib(int i) {
		if (i >= 1) {
			c = a + b;
			System.out.println("" + c);
			a = b;
			b = c;
			printFib(i - 1);

		}

	}

	public static void main(String[] args) {
		System.out.println(a + " " + b);
		DeepakFiboRec fibo = new DeepakFiboRec();
		fibo.printFib(10);
	}
}
