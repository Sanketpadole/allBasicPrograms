package Programs;

public class DuplicateElement {

	public static void main(String[] args) {

		int[] a = { 0, 1, 2, 3, 3, 2, 5, 6, 7 };

		for (int i = 0; i < a.length; i++)
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println("duplicates are" + a[j]);

				}

			}
	}

}

//	public static void main(String[] args) {
//		int arr[] = { 3, 4, 5, 9, 8, 5, 3 };
//
//		for (int i = 0; i < arr.length; i++)
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] == arr[j]) {
//					System.out.println("duplicates are" + arr[j]);
//				}
//			}
//	}
//}