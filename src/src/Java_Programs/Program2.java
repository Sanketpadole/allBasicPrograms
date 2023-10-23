package src.Java_Programs;

public class Program2 {

	public static void main(String[] args) {
		String str = "prapait";
		char[] carray = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (carray[i] == carray[j]) {
					System.out.println(carray[i]);

				}
			}
		}

	}

}
