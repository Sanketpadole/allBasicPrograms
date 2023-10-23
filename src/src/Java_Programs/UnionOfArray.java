package src.Java_Programs;

import java.util.Arrays;

public class UnionOfArray {
	public static void main(String[] args) {
		int[] arr1 = { 2, 3, 4, 7, 1 };
		int[] arr2 = { 4, 1, 3, 5 };
		int a[] = new int[arr1.length + arr2.length];

		int i;
		for (i = 0; i < arr1.length; i++) {
			a[i] = arr1[i];
		}

		int x = arr1.length;
		for (i = 0; i < arr2.length; i++) {
			a[x] = arr2[i];
			x++;
		}
		System.out.println(Arrays.toString(a));
	}

}
