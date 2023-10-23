package src.Java_Programs;

public class Armstrongggg {

	public static void main(String[] args) {
		int num = 153;
		int remainder;
		double res;
		int result = 0;
		int OriginalNum = 0;
		num = OriginalNum;
		while (num != 0) {
			remainder = num % 10;
			res = Math.pow(remainder, 3);
			// System.out.println(res);
			result = (int) (result + res);
//			System.out.println(result);
			num = num / 10;
			System.out.println(result);
		}

		if (result == OriginalNum) {
			System.out.println("armstrong");
		} else {
			System.out.println("not armstrong");
		}
	}

}
