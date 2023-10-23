package Java_Programs;

public class ReverseNumber {
	public static void main(String[] args) {
		int num=123456,reversed=0;
		while(num!=0) {
			int digit=num%10;
			
			reversed=reversed*10+digit;
//			num/=10;
			num=num/10;
			System.out.println("reverse no"+reversed);
		}
	}


}
