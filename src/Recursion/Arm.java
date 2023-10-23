package Recursion;

public class Arm {
	public static void main(String[] args) {
		int a = 1534;
		int rem = 0;
		int c = 0;
		int originalNum = 0;
		originalNum = a;
		while (a != 0) {
			rem = a % 10;
			c = c + (int) Math.pow(rem, 3);
			a = a / 10;

		}
		if (c == originalNum) {
			System.out.println("armstrong");
		} else {
			System.out.println("not armstrong");
		}
	}

//	public static void main(String[] args) {
//
//		int number = 371, originalNumber, remainder, result = 0;
//
//		originalNumber = number;
//
//		while (originalNumber != 0) {
//			remainder = originalNumber % 10;
//			result += Math.pow(remainder, 3);
//			originalNumber /= 10;
//		}
//
//		if (result == number)
//			System.out.println(number + " is an Armstrong number.");
//		else
//			System.out.println(number + " is not an Armstrong number.");
//	}

}
