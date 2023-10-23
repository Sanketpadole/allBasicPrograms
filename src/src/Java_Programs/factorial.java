package Java_Programs;

public class factorial {
//	public static void main(String[] args) {
//
//
//	int n=10;
//	int factorial=1;
//	for(int i=1;i<n;i++) {
//		factorial=factorial*i;
//
//
//	}
//	System.out.println("factorial of 10"+factorial);
//
//
//
//	}
//}
//	

	public static void main(String[] args) {
		int i = 1;
		int n = 10;
		int factorial = 1;
		while (i < n) {

			factorial = factorial * i;

			i++;
		}
		System.out.println("factorial of 10" + factorial);
	}
}
