package assignment5;

import java.util.stream.IntStream;

public class Q3 {

	public static void main(String[] args) {
		IntStream
		.rangeClosed(10,20)
		.forEach(System.out::println);
	}

}
