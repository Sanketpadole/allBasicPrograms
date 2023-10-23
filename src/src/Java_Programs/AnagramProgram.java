package src.Java_Programs;

public class AnagramProgram {
	public static void main(String[] args) {
		String str = "Race";
		String str1 = "Cagge";
		boolean aa = false;
		str = str.toLowerCase();
		str1 = str1.toLowerCase();
		char[] carray = str.toCharArray();
		char[] hello = str1.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str1.length(); j++) {
				if (carray[i] == hello[j]) {
					// System.out.println(carray[i]);
					// System.out.println(hello[j]);
					aa = false;
					break;

				}
			}
		}
		if (aa) {
			System.out.println("not anagram");
		} else {
			System.out.println("anagram");
		}

	}

}
