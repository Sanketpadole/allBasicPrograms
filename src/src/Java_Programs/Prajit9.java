package src.Java_Programs;

public class Prajit9 {

	public static void main(String[] args) {
		String str = "aaaaabbbccd";
		char ch = 'a';
		int count = 0;
		int total = count;
		int c[] = new int[str.length()];

		for (int i = 0; i < str.length(); i++) {
			count = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
					c[j] = -1;
				}

			}
			if (c[i] != -1) {
				c[i] = count;
				System.out.println(str.charAt(i) + " = " + c[i]);
			}

		}

	}

}
