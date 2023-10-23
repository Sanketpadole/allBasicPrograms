package Recursion;

import java.util.LinkedHashSet;

public class IntersectionArray {
	public static void main(String[] args) {
		int arr[] = { 12, 3, 4, 5, 67, 7 };
		int arr1[] = { 2, 67, 9, 1, 2 };
		LinkedHashSet<Integer> set = new LinkedHashSet();
		for (int i = 0; i <= arr.length + arr1.length; i++) {
			set.add(arr[i]);
			set.add(arr1[i]);
			System.out.println(set);

		}
	}

}
