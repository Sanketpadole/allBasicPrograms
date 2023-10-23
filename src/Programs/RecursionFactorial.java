package Programs;

public class RecursionFactorial {

	int factorial = 1;
	int fact2 = 0;

	void fact(int n) {
		if (n >= 1) {
			factorial = factorial * n;

			fact(n - 1);
		} else {
			System.out.println("jhhh");
		}

	}

	public static void main(String[] args) {
		RecursionFactorial fact1 = new RecursionFactorial();
		fact1.fact(10);

	}

}
