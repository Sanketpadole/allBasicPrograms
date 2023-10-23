
package src.Java_Programs;

public class IntersectionInarray {
	public static void main(String[] args) {
		int[] arr = { 12, 3, 4, 8, 5, 7 };
		int[] arr1 = { 1, 12, 4, 8, 99 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr[i] == arr1[j]) {
					System.out.println(arr1[j]);

				}

			}

		}

	}

}
