package Recursion;

import java.util.ArrayList;

public class UbionArray11 {
	public static void main(String[] args) {
		int arr[] = { 12, 3, 4, 5, 67, 7 };
		int arr1[] = { 2, 68, 9, 1, 2 };
		int a = 0;
		ArrayList<Integer> list = new ArrayList();
		for (int i = 0; i <= arr.length + arr1.length - 1; i++) {
			if (i < arr.length) {
				// System.out.println("hhhhq");
				list.add(arr[i]);
			} else if (i >= arr.length) {

				list.add(arr1[a]);
				a++;

			}

		}
		System.out.println(list);

	}

//	public static void main(String[] args) {
//		int[] arr1 = { 2, 3, 4, 7, 1 };
//		int[] arr2 = { 4, 1, 3, 5 };
//		int x = 0;
//		ArrayList<Integer> list = new ArrayList();
//		for (int i = 0; i < arr1.length + arr2.length; i++) {
//
//			if (i < arr1.length) {
//				list.add(arr1[i]);
//
//			}
//
//			else if (i >= arr1.length) {
//				System.err.println("hhhhh");
//
//				list.add(arr2[x]);
//				x++;
//				System.out.println(list);
//			}
//
//		}

}
