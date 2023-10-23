package SplitFunction;

public class SplitScene3 {
	public static void main(String[] args) {
		String str = "scare";
		String[] splits = str.split("e");
		// This regEx splits the String on ‘e’
		for (int i = 0; i < splits.length; i++) {
			System.out.print(splits[i]);
		}

	}

}
