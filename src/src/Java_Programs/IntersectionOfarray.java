package src.Java_Programs;

import java.util.LinkedHashSet;

public class IntersectionOfarray {
	public static void main(String[] args) {
		String[] s1 = { "ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR" };

		String[] s2 = { "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR" };
		String a = s1.toString();
		String b = s2.toString();
		String ab;
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {

				if (s1[i].equals(s2[j])) {
					set.add(s1[i]);

				}

			}

		}
		System.out.println(set);

	}

}
