package Recursion;

public class Seclarge {
	public static void main(String[] args) {
		int arr[] = { 12, 3, 4, 5, 67, 7 };
		int temp;
		for (int i = 0; i <= arr.length; i++) {
			for (int j = i + 1; j <= arr.length - 1; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}

		}
		System.out.println(arr[1]);

	}

}
