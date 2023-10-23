package Recursion;

public class ReversedWord {
	public static void main(String args[]) {
		String s[] = "Sanket Padole".split(" ");

		String ans = "";
		int temp;
		for (int i = s.length - 1; i >= 0; i--) {
			// System.err.println(s[i]);
			// ans += s[i] + " ";
			ans = ans + s[i] + " ";
			for(int j=0;j<ans.length();j++) {
				for(int z=0;z<ans.length();z++) {
				temp=ans[j];
				ans[j]=ans[z];
				ans[z]=temp;

			}
		}
		//System.out.println(ans);

	}

}
