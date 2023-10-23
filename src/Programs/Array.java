package Programs;

public class Array {
	public static void main(String[] args) {

		String name = "sanket padole";
		/// output ---padole saanket
		String nstr = "";
		char ch;
		for (int i = 0; i < name.length(); i++) {
			ch = name.charAt(i);
			nstr = ch + nstr;
		}
		System.out.println("reversed" + nstr);

	}
}
