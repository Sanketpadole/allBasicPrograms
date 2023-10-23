package Collection;

public class Prajit {

	public static void main(String[] args) {

		int arr[] = { 11, 12, 13, 11, 15 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}

	}

}
