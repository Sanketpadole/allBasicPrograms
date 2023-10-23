package src.Java_Programs;

public class Prajit210 {
	public static void main(String[] args) {
		String str = "sfff fhfhe ghgh gfd";
		int count = 0;
		char[] carray = str.toCharArray();
		String aa = str.replaceAll("\\s", "");
		for (int i = 0; i < aa.length(); i++) {

			count++;

		}
		System.out.println(count);
	}

}
