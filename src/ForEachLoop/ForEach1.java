package ForEachLoop;

public class ForEach1 {
	public static void main(String[] args) {
		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		for (String i : cars) {
			System.out.println(i);
		}
	}

}
//public static void main(String[] args) {
//	String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
//	for (int i = 0; i <= cars.length; i++) {
//		System.out.println(cars[i]);
//	}
//}