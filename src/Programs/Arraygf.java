package Programs;

public class Arraygf {
	public static void main(String[] args) {
		// List<Integer> hh = new ArrayList();
		int a[] = { 12, 4, 5, 67, 8 };
		// System.out.println(a.length);
		int b[] = { 14, 12, 8, 6, 9 };
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {

				if (a[i] == b[j]) {
					System.out.println(a[i]);

				}

			}
		}
	}
}
