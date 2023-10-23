package src.Java_Programs;

import java.util.ArrayList;
import java.util.List;

public class Unionofarray11 {
	public static void main(String[] args) {
		int[] arr1 = { 2, 3, 4, 7, 1 };
		int[] arr2 = { 4, 1, 3, 5 };
		List<Integer> list = new ArrayList();
		int x = 0;
		// System.out.println(arr1.length + arr2.length);
		for (int i = 0; i < arr1.length + arr2.length; i++) {
			if (i < arr1.length) {
				list.add(arr1[i]);
			} else if (i >= arr1.length) {
				list.add(arr2[x]);
				x++;
			}
		}
		System.out.println(list);

	}
}
