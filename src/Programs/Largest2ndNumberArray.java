package Programs;

public class Largest2ndNumberArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		int temp;
		for (int i = 0; i <= a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}
		}
		System.out.println(a[1]);

	}

}
//
//public static void main(String[] args) {
//	int [] a= {45,6,7,834,55,67};
//	int temp;
//	for(int i=0;i<a.length;i++) {
//		for(int j=i+1;j<a.length;j++) {
//			if(a[i]<a[j]) {
//				temp=a[i];
//				a[i]=a[j];
//				a[j]=temp;
//			}
//
//	}
//	}
//	System.out.println("second largest element is"+a[1]);
//
