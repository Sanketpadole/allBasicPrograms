package src.Java_Programs;

public class SecondlargestElement {
	public static void main(String[] args) {
		int[] arr = { 12, 4, 5, 6, 9, 23 };
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}
			System.out.println(arr[i]);

		}
		System.out.println(arr[2]);

	}

}
