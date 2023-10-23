package src.Java_Programs;

public class Prajit5 {
	public static void main(String[] args) {
		String str = "aaabbbbccddddddd";
		int count = 0;
		char[] carray = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (carray[i] == carray[j]) {
					System.out.println(carray[i]);
					count++;

				}
				// System.out.println(carray[i]);
			}
		}
	}

}
