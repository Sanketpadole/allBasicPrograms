package src.Java_Programs;

public class ReverseString11 {

	public static void main(String[] args) {

		int num = 12321;
		int reverseNum = 0;
		int number;

		int Originalnum;
		// Originalstr==str;
		Originalnum = reverseNum;

		while (num != 0) {
			number = num % 10;
			reverseNum = reverseNum + number;
			num = num / 10;

		}
		if (num == Originalnum) {
			System.out.println(" palindrome");

		} else {
			System.out.println("not palindrome");
		}
	}

}
