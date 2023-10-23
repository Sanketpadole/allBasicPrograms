package src.Java_Programs;

public class Count12 {
	public static void main(String[] args) {
		int[] arr = { 12, 3, 4, 5, 6, 12, 5, 8 };
		int a = 12;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == a) {

				count++;
			}

		}
		System.out.println(count);

	}

}
