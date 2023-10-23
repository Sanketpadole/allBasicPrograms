package Programs;

public class Program6 {
	public static void main(String[] args) {
//                    0  1  2  3  4  5  6  7  8
		int a[] = { 1, 3, 4, 6, 5, 8, 9, 7, 8 };
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0 && a[i] % 2 == 0) {

				System.out.println("even:: " + a[i]);

			}
			if (i % 2 != 0 && a[i] % 2 != 0) {
				System.out.println("odd:: " + a[i]);
			}
		}
	}

}
