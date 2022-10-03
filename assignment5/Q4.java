package assignment5;

import java.util.stream.IntStream;

public class Q4 {

	public static void main(String[] args) {
		IntStream
		.iterate(10, i->i>-1, i->--i)//WHY i-- send it to infinite loop
		.forEach(System.out::println);
	}

}
