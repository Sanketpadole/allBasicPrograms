package src.Java_Programs;

public class Commomstring {
	public static void main(String[] args) {

		String a = "sanket";
		String b = "aniket";
		String nstr = "";
		char carray[] = a.toCharArray();
		char carrays[] = b.toCharArray();

		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j < b.length(); j++) {
				if (carray[i] == carrays[j]) {
					System.out.print(carrays[j]);
				}

			}

		}

	}

}
