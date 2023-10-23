package src.Java_Programs;

public class Prajit10 {

	public static void main(String[] args) {
		int a = 0;
		int fnum = 0;
		int snum = 1;
		int nxtNum;
		System.out.println(fnum);
		while (a <= 10) {
			nxtNum = fnum + snum;
			fnum = snum;
			snum = nxtNum;

			System.out.println(nxtNum);
			a++;

		}

	}

}
