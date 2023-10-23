package src.Java_Programs;

public class PerfectNumber {
	public static void main(String[] args) {

		int n = 28, sum = 0;

		for (int i = 1; i < n; i++) {
			if (n % i == 0)
				sum = sum + i;
		}

		if (sum == n)
			System.out.println(n + " Is a perfect number");
		else
			System.out.println(n + " Is not a perfect number");

	}

}

//Check Whether or Not the Number is a Perfect Number in Java
//Given an integer input as the number, the objective is to check whether or not the number can be represented as the sum of its factors except the number itself. Therefore, we write a code to Check Whether or Not a Number is a Perfect Number in Java Language.
//
//Example
//Input : 6
//Output : Yes, it's a Perfect Number
//Since, 6 = 1 + 2 + 3 (which are its divisors)
