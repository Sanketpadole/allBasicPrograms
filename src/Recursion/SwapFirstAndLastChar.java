package Recursion;

public class SwapFirstAndLastChar {
	public static void main(String[] args) {

		String originalString = "abcde";
		char[] c = originalString.toCharArray();
		char temp = 48;
		for (int i = 0; i < originalString.length(); i++) {
			if (i == 0) {
				temp = c[i];
				c[i] = c[originalString.length() - 1];
			}

			else if (i == originalString.length() - 1)
				c[i] = temp;

		}
		String s = new String(c);
		System.out.println(s);

	}
}
