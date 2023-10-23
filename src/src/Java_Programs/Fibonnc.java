package src.Java_Programs;

public class Fibonnc {
	public static void main(String[] args) {
		int fnum = 0;
		int i = 1;
		int n = 10;
		int sNum = 1;

		int temp = 0;

		while (i <= 10) {
			System.out.println(fnum);
			int nxtNum = fnum + sNum;
			fnum = sNum;
			sNum = nxtNum;

			i++;
		}
		System.out.println(n);

	}

}
