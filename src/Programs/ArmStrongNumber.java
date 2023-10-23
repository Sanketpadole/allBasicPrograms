package Programs;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int num = 152;
		int rem;
		double res = 0;
		int OriginalNum = num;
		while (num != 0) {
			rem = num % 10;

			res = res + Math.pow(rem, 3);
			num = num / 10;

		}
		if (res == OriginalNum)
			System.out.println("no is armstrong number");
		else {
			System.out.println("not armstrong number");

		}
	}
}
