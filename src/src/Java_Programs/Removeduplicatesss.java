package src.Java_Programs;

import java.util.LinkedHashSet;

public class Removeduplicatesss {
	public static void main(String[] args) {
		int[] arr1 = { 2, 3, 4, 7, 1 };
		int[] arr2 = { 4, 1, 3, 5 };
		LinkedHashSet<Integer> set = new LinkedHashSet();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				set.add(arr1[i]);
				set.add(arr2[j]);

			}

		}
		System.out.println(set);

	}

}
