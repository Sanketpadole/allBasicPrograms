package Recursion;

public class OddAtOddEvenAtEven {
	public static void main(String[] args) {
		int[] arr = { 11, 1, 2, 3, 5, 5, 6, 7, 12, 9 };
		for (int i = 1; i <= arr.length; i++) {
			if (arr[i] % i == 0) {
				System.out.println("even at even" + arr[i]);

//			} else if (arr[i] % 2 != 0) {
//				System.out.println("odd at odd" + arr[i]);
//
//			}
			}
		}
	}

}
