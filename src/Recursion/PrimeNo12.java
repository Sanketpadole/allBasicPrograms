package Recursion;

class PrimeNo12 {
	public static void main(String[] args) {
		int[] a = { 6, 48, 47, 7, 98, 51, 87, 99, 2, 0, 1, 191, 157 };
		for (int i = 0; i < a.length; i++) {
			boolean isPrime = true;
			if (a[i] == 1) {
				isPrime = false;

			} else {
				for (int j = 2; j <= a[i] / 2; j++) {
					if (a[i] % j == 0) {
						isPrime = false;
						break;
					}
				}
			}
			if (isPrime) {
				System.out.println(a[i]);
			}
		}
	}

}

//public static void main(String[] args) {
//	int[] array = { 6, 48, 47, 7, 98, 51, 87, 99, 2, 0, 1, 191, 157 };
//	for (int i = 0; i < array.length; i++) {
//		boolean isPrime = true;
//		if (array[i] == 1) {
//			isPrime = false;
//		} else {
//			for (int j = 2; j < array[i] / 2; j++) {
//				if (array[i] % j == 0) {
//					isPrime = false;
//					break;
//				}
//
//			}
//		}
//		if (isPrime) {
//			System.out.println(array[i]);
//		}
//	}
//
//}
