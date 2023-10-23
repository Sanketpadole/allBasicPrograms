package Recursion;

public class PrimeNoArray111 {
	public static void main(String[] args) {
		int[] arr = { 6, 48, 47, 7, 98, 51, 87, 99, 2, 0, 1, 191, 157 };
		int i, j;
		for (i = 0; i < arr.length; i++) {
			for (j = 2; j <= arr[i]; j++) {
				if (arr[i] % j == 0) {
					break;
				}
			}
			if (arr[i] == j) {
				System.out.println(arr[i]);
			}
		}

	}

//	public static void main(String[] args) {
//		int[] arr = { 6, 48, 47, 7, 98, 51, 87, 99, 2, 0, 1, 191, 157 };
//		int i, j;
//		for (i = 0; i < arr.length; i++) {
//
//			for (j = 2; j <= arr[i]; j++) {
//				if (arr[i] % j == 0) {
//					break;
//				}
//
//			}
//			if (arr[i] == j) {
//				System.out.print(arr[i] + ", ");
//			}
//		}
//	}

}
