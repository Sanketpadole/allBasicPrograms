package src.Java_Programs;

public class Prajit111 {
	public static void main(String[] args) {

		String str = "Sdjfgh ssjkvfdUJJJJNN Mugwg";
		char[] carray = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(carray[i])) {
				System.out.println(carray[i]);
			}
		}

	}

}
