package src.Java_Programs;

public class RepetativeNumber {
	public static void main(String[] args) {

		int[] arr = { 12, 3, 4, 5, 12, 7, 5 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
	}

}
