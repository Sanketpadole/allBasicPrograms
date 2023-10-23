package Recursion;

public class SwapCharOfString {
	public static void main(String[] args) {

		String originalString = "abcde";
		char[] c = originalString.toCharArray();
		char temp;
		for (int i = 0; i < originalString.length(); i++) {
			for (int j = i + 1; j < originalString.length(); j++) {

				temp = c[i];
				c[i] = c[j];
				c[j] = temp;
				// System.out.println(c[1]);
				// String swapped = new String(c);

			}
			System.out.print(c[i]);

		}

	}
}

//public static void main(String[] args) {
//
//	String originalString = "abcde";
//
//	char[] c = originalString.toCharArray();
//
//	// Replace with a "swap" function, if desired:
//	char temp = c[0];
//	c[0] = c[1];
//	c[1] = temp;
//
//	String swappedString = new String(c);
//
//	System.out.println(originalString);
//	System.out.println(swappedString);
//}
