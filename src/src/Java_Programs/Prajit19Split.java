package src.Java_Programs;

public class Prajit19Split {

	public static void main(String[] args) {
		String letters = "alpha, beta, gama, delta, sigma";

		// splitting the letters string using comma delimiter.
		String result[] = letters.split(",", 3);

		// using java loop to print elements of string array
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

}
