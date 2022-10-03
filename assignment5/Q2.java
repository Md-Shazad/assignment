package assignment5;
import java.util.stream.IntStream;

public class Q2 {

	public static void main(String[] args) {
				
		//take while num is <  30 from the range 10 to 47
				IntStream	
				.range(10,48)
				.takeWhile(num->num<30)
				.forEach(System.out::println);
	}

}
