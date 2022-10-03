package assignment5;

interface privateMethods{
	private static int get() {
		return 8;
	}
	
	static void example() {
		System.out.println(get());
	}
}
public class Q1 {

	public static void main(String[] args) {
		privateMethods.example();
		
	}

}
