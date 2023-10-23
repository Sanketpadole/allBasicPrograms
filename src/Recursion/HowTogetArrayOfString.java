package Recursion;

public class HowTogetArrayOfString {
	public static void main(String[] args) {

		String sentence = "Hello World Java";
		String[] words = sentence.split(" ");
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
	}

}

//String[] sentence = "Hello World Java".split(" ");
//
//for (int i = 0; i < sentence.length; i++) {
//	System.out.println(sentence[i]);
//}
//}
