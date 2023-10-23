package src.Java_Programs;

public class Prajit22 {
	public static void main(String[] args) {
		String str = "NaKUL is good Boy";
		char[] carray = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(carray[i])) {
				System.out.println(carray[i]);
			}
		}
	}

}
