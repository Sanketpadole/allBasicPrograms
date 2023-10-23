package src.Java_Programs;

public class ArmStrongNumber {
	public static void main(String[] args) {
		int number = 154;
		int remainder;
		int originalNumber;

		double result = 0;

		originalNumber = number;
		while (originalNumber != 0) {
			remainder = originalNumber % 10;
			result = result + Math.pow(remainder, 3);
			originalNumber = originalNumber / 10;
		}
		if (result == number)
			System.out.println("no is armstrong number");
		else {
			System.out.println("not armstrong number");

		}
	}

//	 public static void main(String[] args) {
//
//	        int number = 153, originalNumber, remainder, result = 0;
//
//	        originalNumber = number;
//
//	        while (originalNumber != 0)
//	        {
//	            remainder = originalNumber % 10;
//	            result += Math.pow(remainder, 3);
//	            originalNumber /= 10;
//	        }
//
//	        if(result == number)
//	            System.out.println(number + " is an Armstrong number.");
//	        else
//	            System.out.println(number + " is not an Armstrong number.");
//	    }

}
