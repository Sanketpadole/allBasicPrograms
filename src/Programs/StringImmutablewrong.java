package Programs;

public class StringImmutablewrong {
	public static void main(String args[]) {
		String s = "Sachin";
		s = s.concat(" Tendulkar");
		System.out.println(s);
	}

}

//In such a case, s points to the "Sachin Tendulkar". Please notice that still Sachin object is not modified.