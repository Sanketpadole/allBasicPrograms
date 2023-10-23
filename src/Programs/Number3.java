package Programs;

public class Number3 {

	public static void main(String[] args) {

		for (int i = 0; i <= 4; i++) {
			int p = 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(p);
				p = p + 2;
			}
			System.out.println();
		}

	}

}

//	public static void main(String[] args) {
//
//		for (int i = 1; i <= 4; i++) {
//			int p = 1;
//			for (int j = 1; j <= i; j++) {
//				System.out.print(p);
//				p = p + 2;
//			}
//			System.out.println();
//		}
//	}
//
//}

//1
//13
//135
//1357
