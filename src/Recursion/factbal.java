package Recursion;

public class factbal {
	static int factorial = 1;

	int fact(int n) {
		if (n >= 1) {
			factorial = factorial * n;

			fact(n - 1);
		}
		return factorial;
	}

	public static void main(String[] args) {
		factbal fact1 = new factbal();
		fact1.fact(10);
		System.out.println(factorial);
	}

}
