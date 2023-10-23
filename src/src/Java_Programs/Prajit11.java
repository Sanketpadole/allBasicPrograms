package src.Java_Programs;

public class Prajit11 {

	public static void main(String[] args) {

		int firstNum = 0;
		int secNum = 1;

		int nxtNum;

		int num = 10;
		int i = 0;
		System.out.println("fibonacii series" + num);
		while (i <= num) {
			System.out.println(firstNum);
			nxtNum = firstNum + secNum;
			firstNum = secNum;
			secNum = nxtNum;
			i++;

		}
	}

}
