package src.Java_Programs;

public class Prajit21 {

	public static void main(String[] args) {
		String str = "sdkjdbwfvwu erhgq   terhtuerktb ererhu";
		// String str = str1.trim();
		// char[] carray=str.toCharArray();

		str = str.replaceAll("\\s", "");
		int count = 1;
		for (int i = 1; i < str.length(); i++) {

//			System.out.println(count);
			count++;
		}
		System.out.println(count);

	}

}
