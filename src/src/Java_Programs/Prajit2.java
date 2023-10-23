package src.Java_Programs;

public class Prajit2 {
	public static void main(String[] args) {
		String str = " Nakul Is a gooD boy";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {

				System.out.println(str.charAt(i));
			}
		}
	}

}

//upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";