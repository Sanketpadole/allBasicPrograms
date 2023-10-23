package src.Java_Programs;

public class Prajit66 {
	public static void main(String[] args) {
		String str = "dsfsdgfddd";
		char[] carray = str.toCharArray();
		char ch = 'd';
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (carray[i] == ch) {
				// System.out.println(carray[i]);
				System.out.println(count);

				count++;
			}

		}

	}

}
