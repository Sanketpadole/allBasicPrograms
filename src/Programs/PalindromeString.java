package Programs;

public class PalindromeString {

	public static void main(String[] args) {
		String str = "radar", nstr = "";
		int strlen = str.length();
		for (int i = (strlen - 1); i >= 0; i--) {
			nstr = nstr + str.charAt(i);
		}
		if (str.equals(nstr)) {
			System.out.println(str + " is a Palindrome String.");
		} else {
			System.out.println(str + " is not a Palindrome String.");
		}

	}

}
