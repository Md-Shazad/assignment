package assignment5;


import java.util.stream.Collectors;
import java.util.List;

public class Q9 {

	public static void main(String[] args) {
		
		List.of(1,2,3,4)
		.stream()
		.collect(Collectors.toUnmodifiableList())
		.forEach(System.out::println);
	}

}
