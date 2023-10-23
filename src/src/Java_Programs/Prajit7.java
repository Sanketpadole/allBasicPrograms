package src.Java_Programs;

public class Prajit7 {

	public static void main(String[] args) {
		// create a string
		String str = "this is java code";
		String words[] = str.split("\\s");
		System.out.println(words);
		String capitalizeStr = "";

		for (String word : words) {

			String firstLetter = word.substring(0, 1);

			String remainingLetters = word.substring(1);
			capitalizeStr += firstLetter.toUpperCase() + remainingLetters + " ";
		}
		System.out.println(capitalizeStr);
	}

}
