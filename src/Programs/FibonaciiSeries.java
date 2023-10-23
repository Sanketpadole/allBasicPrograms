package Programs;

public class FibonaciiSeries {

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

//public static void main(String[] args) {
//	int i=1,n=10,firstTerm=0,secondTerm=1;
//	System.out.println("fibonacii series" + n );
//
//
//	while(i <= n) {
//		System.out.print(firstTerm+",");
//
//
//		int nextTerm=firstTerm+secondTerm;
//
//		firstTerm=secondTerm;
//		secondTerm=nextTerm;
//
//		i++;
//
//	}
