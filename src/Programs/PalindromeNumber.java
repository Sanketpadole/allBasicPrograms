package Programs;

public class PalindromeNumber {
	public static void main(String[] args) {

		int num = 3555;
		int rev = 0;
		int rem;
		int OriginalNum = num;
		while (num != 0) {
			rem = num % 10;
			rev = rem + rev * 10;
			num = num / 10;

		}

		if (OriginalNum == rev) {
			System.out.println("Palindrome ");
		} else {
			System.out.println("Not Palindrome");
		}
	}
}

//public static void main(String[] args) {
//	// Take input from the user
//	// Create instance of the Scanner class
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter the number: ");
//	String reverse = "";
//	String num = sc.nextLine();
//	int length = num.length();
//	for (int i = length - 1; i >= 0; i--)
//		reverse = reverse + num.charAt(i);
//	if (num.equals(reverse))
//		System.out.println("The entered string " + num + " is a palindrome.");
//	else
//		System.out.println("The entered string " + num + "  isn't a palindrome.");
//}
