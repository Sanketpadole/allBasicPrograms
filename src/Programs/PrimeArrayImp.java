package Programs;

import java.util.ArrayList;

public class PrimeArrayImp {
	public static void main(String[] args) {
		int[] numbers = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 }; // Replace with your
																								// array
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();

		for (int number : numbers) {
			boolean isPrime = true;

			if (number <= 1) {
				isPrime = false;
			} else {
				for (int i = 2; i <= Math.sqrt(number); i++) {
					if (number % i == 0) {
						isPrime = false;
						break;
					}
				}
			}

			if (isPrime) {
				primeNumbers.add(number);
			}
		}

		System.out.println("Prime numbers in the array: " + primeNumbers);
	}
}
