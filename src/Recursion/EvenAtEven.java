package Recursion;

public class EvenAtEven {
	public static void main(String[] args) {
		int a[] = { 1, 3, 4, 6, 5, 8, 9, 7, 8 };
		for (int i = 0; i <= a.length; i++) {
			if (i % 2 == 0 && a[i] % 2 == 0) {
				System.out.println("Even at even" + a[i]);
			} else if (i % 2 != 0 && a[i] % 2 != 0) {
				System.out.println("Odd at odd" + a[i]);
			}
		}
	}

}
