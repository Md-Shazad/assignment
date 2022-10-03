package assignment5;

import java.util.stream.IntStream;

public class Q6 {

	public static void main(String[] args) {
		IntStream
		.range(110, 3333)
		.filter(e->e>3233)
		.findFirst()//returns Optional stream
		.stream()
		.forEach(System.out::println);;
	}

}
