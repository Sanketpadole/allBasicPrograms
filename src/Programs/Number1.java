package Programs;

public class Number1 {

	public static void main(String[] args) {

		for (int i = 4; i >= 1; i--) {
			for (int j = 4; j >= i; j--) {
				System.out.print(j * 2);
			}
			System.out.println();
		}
	}

}
