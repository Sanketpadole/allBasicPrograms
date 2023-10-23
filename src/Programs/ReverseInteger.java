package Programs;

public class ReverseInteger {

	public static void main(String[] args) {

		int a = 45567;
		int rev = 0;
		int rem = 0;
		while (a != 0) {
			rem = a % 10;

			rev = rem + rev * 10;
			a = a / 10;

		}
		System.out.println("Reverser" + rev);

	}
}

//public static void main(String[] args) {
//	int num=12345;
//	int reversed=0;
//	while(num!=0) {
//		int digit=num%10;
//		reversed=reversed*10+digit;
//		num=num/10;
//
//	}
//	System.out.println("Reversed Number: " + reversed);
//}
//}
