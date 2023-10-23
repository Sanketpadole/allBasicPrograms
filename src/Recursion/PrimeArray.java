package Recursion;

public class PrimeArray {
	public static void main(String[] args) {
		int[] a = { 6, 48, 47, 7, 98, 51, 87, 99, 2, 0, 1, 191, 157 };
		int num;

		String primeNumbers = "";
		for (int i = 0; i <= a.length; i++) {
			int counter = 0;
			for (num = i; num >= 1; num--) {
				if (a[i] % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				primeNumbers = primeNumbers + a[i] + " ";
			}
		}
		System.out.println(" " + primeNumbers);

	}

}

//public static void main(String[] arg) {
//	int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // int n=0 or n=values
//	int num = 0;
//	String primeNumbers = "";
//	for (int i = 0; i <= a.length; i++) /* change a.length to n */
//	{
//		int counter = 0;
//		for (num = i; num >= 1; num--) {
//			if (i % num == 0) {
//				counter = counter + 1;
//
//			}
//		}
//		if (counter == 2) {
//			// Appended the Prime number to the String
//			primeNumbers = primeNumbers + i + " ";
//
//		}
//	}
//	System.out.println("Prime numbers from given array :");
//	System.out.println(primeNumbers);
//}
