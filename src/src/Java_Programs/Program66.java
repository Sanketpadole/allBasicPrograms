package src.Java_Programs;

public class Program66 {
	public static void main(String[] args) {
		int a[] = { 1, 3, 4, 6, 5, 8, 9, 7, 8 };
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0 && a[i] % 2 == 0) {
				System.out.println("even number at even position" + i);
			} else if (i % 2 != 0 && a[i] % 2 != 0) {
				System.out.println("odd number at odd position" + i);
			}
		}
	}

}
