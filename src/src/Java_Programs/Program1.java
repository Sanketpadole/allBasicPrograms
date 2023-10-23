package src.Java_Programs;

public class Program1 {
	public static void main(String[] args) {

		String str = "sadsmja";
		char charray[] = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			// ch=str.charAt(i);
			for (int j = i + 1; j < str.length(); j++) {
				if (charray[i] == charray[j]) {
					System.out.print(charray[j] + " ");
				}
			}

		}

	}

}
