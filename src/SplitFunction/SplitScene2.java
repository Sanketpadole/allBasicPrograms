package SplitFunction;

public class SplitScene2 {
	public static void main(String[] args) {
		String str = "SoftwareEngineerTestingEngineerHelp";
		String[] splits = str.split("Engineer");

		for (String splits2 : splits) {
			System.out.println(splits2);
		}

	}

}
