package Programs;

public class ArmSTrong {
	public static void main(String[] args) {

		int num = 153;
		int rev;
		int rem;
		double res = 0;
		int OriginalNum = num;
		while (num != 0) {
			rem = num % 10;
			res = res + Math.pow(rem, 3);
			System.out.println("ghhsj" + res);
			num = num / 10;
		}
		if (OriginalNum == res) {
			System.out.println("armstrongnum");
		} else {
			System.out.println("notArmstrongNum");
		}

	}
}
