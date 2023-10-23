package src.Java_Programs;

import java.util.function.BinaryOperator;

public class lambdaexpression {
	public static void main(String[] args) {
		BinaryOperator<Integer> sum = (a, b) -> a + b;
		int result = sum.apply(10, 20);
		System.out.println(result);
	}

}
