package Programs;

public class SumOfArray {

//	public static void main(String[] args) {
//
//		int a[] = { 2, 3, 46, 78, 9 };
//		int sum = 0;
//		for (int i = 0; i < a.length; i++) {
//
//			sum = sum + a[i];
//
//		}
//		System.out.println("sum" + sum);
//	}
//
//}

	public static void main(String[] args) {
		int a[] = { 2, 3, 46, 78, 9 };

		int mul = 1;
		for (int i = 1; i < a.length; i++) {
			mul = mul * a[i];
		}
		System.out.println("mult" + mul);
	}

}
