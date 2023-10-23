package src.Java_Programs;

public class Prajit4 {
	public static void main(String[] args) {
		String str = "sanket is my name";
		char carray[] = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {

			String qq = str.toUpperCase();

			char upper = Character.toUpperCase(carray[0]);
			System.out.println(upper);

		}

	}

}

//upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";