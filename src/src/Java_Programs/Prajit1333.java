package src.Java_Programs;

public class Prajit1333 {
	public static void main(String[] args) {
		int num = 15;
		boolean flag = false;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println(num + " is a prime number.");
		} else {
			System.out.println(num + " is not a prime number.");
		}

//		most imp check for loop kuthe suru hote ani kuthe band hote ..args.method kuthe bnd hote
//		debugg the code
//		reverse string krtana adhi ch+"nstr";

	}

}
