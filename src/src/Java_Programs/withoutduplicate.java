package src.Java_Programs;

import java.util.LinkedHashSet;

public class withoutduplicate {
	public static void main(String[] args) {
		int arr[] = { 12, 9, 7, 22, 5, 22 };
		int temp;

		LinkedHashSet<Integer> set = new LinkedHashSet();
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					set.add(temp);

				}
				// System.out.println(set);

			}
			System.out.println(set);

		}
	}

}
