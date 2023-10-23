package SplitFunction;

public class SplitScene1 {
//	public static void main(String[] args) {
//		String str = "This is an example";
//		String[] splits = str.split("\\s");
//		// This regEx splits the String on the WhiteSpaces
//		for (String i : splits) {
//			System.out.println(i);
//		}
//
//	}

	public static void main(String[] args) {
		String str = "This is an example";
		String[] splits = str.split("\\s");
		// This regEx splits the String on the WhiteSpaces
		for (int i = 0; i <= splits.length - 1; i++) {
			System.out.println(splits[i]);
		}

	}

}
