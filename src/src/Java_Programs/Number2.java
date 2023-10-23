package src.Java_Programs;

public class Number2 {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				if (j % 2 == 0) {
					System.out.print("2");
				} else {
					System.out.print("1");
				}
			}
			System.out.println();

		}
	}
}

//		for (int i = 1; i <= 4; i++) {
//			for (int j = 1; j <= i; j++) {
//				if (j % 2 == 0) {
//					System.out.print("2");
//
//				} else {
//					System.out.print("1");
//
//				}
//			}
//			System.out.println();
//		}
//	}
//}

//
//1
//12
//121
//1212