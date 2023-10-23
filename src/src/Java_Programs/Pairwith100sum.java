package src.Java_Programs;

public class Pairwith100sum {
	public static void main(String[] args) {
		int[] arr = { 23, 40, 25, 67, 60 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == 100) {
					System.out.println("first" + arr[i] + "second" + arr[j]);
				}
			}
		}
	}

}
