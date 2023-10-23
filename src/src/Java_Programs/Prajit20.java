package src.Java_Programs;

public class Prajit20 {
	public static void main(String[] args) {
		String str1 = "bhushan";
		String str2 = "roshan";
		char[] carray1 = str1.toCharArray();
		char[] carray2 = str2.toCharArray();
		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < str2.length(); j++) {
				if (carray1[i] == carray2[j]) {
					System.out.println(carray1[i]);
				}
			}
		}

	}

}
