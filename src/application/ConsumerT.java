package application;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*It represents an operation that accept args type T and dont return result
 * Normally used to do actions, or collateral effects on elements from Stream
 * without modify*/

public class ConsumerT {

	public static void main(String[] args) {
		

		
		List<Integer>numbers = Arrays.asList(1,2,3,4,5,6,7);
		
		for (Integer number : numbers) {
			if (number % 2 == 0) {
				System.out.println(number);
			}
		}	
		System.out.println("for loop.\n");
		
		
		// declaring Consumer
		Consumer<Integer> printPairs = number ->{
			if (number % 2 == 0) {
				System.out.println(number);
			}			
		};
		
		// just need lambda for it
		numbers.stream()
			.filter(number -> number % 2 == 0)
			.forEach(System.out::println);
		System.out.println("Using Consumer<T>");
		
		
	}

}
