package Recursion;

public class PrimeNoArray {
	public static void main(String[] args) {
		int[] array = { 6, 48, 47, 7, 98, 51, 87, 99, 2, 0, 1, 191, 157 };
		for (int i = 0; i < array.length; i++) {
			boolean isPrime = true;
			if (array[i] == 1) {
				isPrime = false;
			} else {
				for (int j = 2; j < array[i] / 2; j++) {
					if (array[i] % j == 0) {
						isPrime = false;
						break;
					}

				}
			}
			if (isPrime) {
				System.out.println(array[i]);
			}
		}

	}

}

//public static void main(String[] args) {
//	int[] array = { 6, 48, 47, 7, 98, 51, 87, 99, 2, 0, 1, 191, 157 };
//
//	// loop through the numbers one by one
//	for (int i = 0; i < array.length; i++) {
//		boolean isPrime = true;
//		if (array[i] == 1)
//			isPrime = false;
//		else {
//			// check to see if the numbers are prime
//			for (int j = 2; j <= array[i] / 2; j++) {
//				if (array[i] % j == 0) {
//					isPrime = false;
//					break;
//				}
//			}
//		}
//
//		// print the number
//		if (isPrime) {
//
//			System.out.print(array[i] + " , ");
//
//		}
//	}
//	System.out.println(" Are the prime number in the array ");
//}
