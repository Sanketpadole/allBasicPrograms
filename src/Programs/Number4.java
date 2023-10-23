package Programs;

public class Number4 {

	public static void main(String[] args) {
		for (int i = 4; i >= 1; i--) {
			for (int j = 4; j >= i; j--) {
				System.out.print(j * 2 + " ");
			}
			System.out.println();
		}
	}

//		for (int i = 1; i <= 4; i++) {
//			int p = 2;
//			for (int j = 1; j <= i; j++) {
//				System.out.print(p);
//				p = p + 2;
//			}
//			System.out.println();
//		}
//	}

}

//2
//24
//246
//2468