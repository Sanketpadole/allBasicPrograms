package src.Java_Programs;

public class Prajit1 {

	public static void main(String[] args) {
		String str = "Sanket, Padole!! ,Warud?";
		// char[] carray=str.toCharArray();
		// System.out.println(carray[0]);
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				System.out.println(str.charAt(i));
			}
		}
	}

}
