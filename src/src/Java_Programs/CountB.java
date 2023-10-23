package src.Java_Programs;

public class CountB {
	public static void main(String[] args) {
		String arr = "gghhhkkkrrraa";
		char ch = 'a';
		int count = 0;
		char[] carray = arr.toCharArray();
		// char[] carray1 = ch.toCharArray();
		for (int i = 0; i < arr.length(); i++) {
			if (carray[i] == 'a') {

				count++;
			}

		}
		System.out.println(count);
	}

}
