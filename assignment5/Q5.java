package assignment5;

import  java.util.stream.IntStream;

public class Q5 {

	public static void main(String[] args) {
		
		
		//ifPresentOrElse
		
		IntStream
		.range(10, 20)
		.filter(val -> val<9)
		.findFirst()
		.ifPresentOrElse((val)->System.out.println(val), ()->System.out.println("it's not here"));
	
		//orElse
		IntStream
		.range(10,20)
		.filter(value->value<7)
		.findFirst()
		.orElseThrow();
	}

}
