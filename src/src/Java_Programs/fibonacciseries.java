package src.Java_Programs;

public class fibonacciseries {
	public static void main(String[] args) {
		int fNum = 0;
		int sNum = 1;
		int nxtNum;
		int num = 1;
		System.out.println(fNum);
		while (num != 10) {
			nxtNum = fNum + sNum;
			fNum = sNum;
			sNum = nxtNum;
			System.out.println(nxtNum);
			num++;

		}

	}

}
