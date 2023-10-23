package src.Java_Programs;

import java.util.ArrayList;

public class Unionarray {
	public static void main(String[] args) {
		int[] arr1 = { 2, 3, 4, 7, 1 };
		int[] arr2 = { 4, 1, 3, 5 };
		int x = 0;
		ArrayList<Integer> list = new ArrayList();
		for (int i = 0; i < arr1.length + arr2.length; i++) {

			if (i < arr1.length) {
				list.add(arr1[i]);

			}

			else if (i >= arr1.length) {
				System.err.println("hhhhh");

				list.add(arr2[x]);
				x++;
				System.out.println(list);
			}

		}

	}

}
