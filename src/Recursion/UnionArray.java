package Recursion;

import java.util.ArrayList;

public class UnionArray {
	public static void main(String[] args) {
		int arr[] = { 12, 3, 4, 5, 67 };
		int arr1[] = { 2, 68, 9, 1, 2 };
		ArrayList<Integer> list = new ArrayList();
		for (int i = 0; i < arr.length && i < arr1.length; i++) {
			list.add(arr[i]);
			list.add(arr1[i]);

		}
		System.out.println(list);

	}

}

//
//for same size of array