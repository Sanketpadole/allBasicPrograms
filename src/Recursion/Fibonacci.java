package Recursion;

public class Fibonacci {
	public static void main(String[] args) {
		int fNum = 0;
		int sNum = 1;
		int nxtNum = 0;
		int n = 0;

		while (n <= 10) {
			System.out.println(fNum);

			nxtNum = fNum + sNum;
			fNum = sNum;
			sNum = nxtNum;

			n++;

		}
		System.out.println(nxtNum);

	}

}
