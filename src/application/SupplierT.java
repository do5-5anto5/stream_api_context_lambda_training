package application;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

/*
 * It Represents an operation that don't accept any argument, but it returns
 * result<T>
 * Normally used to create or to supply new objects of certain type
 */

public class SupplierT {

	public static void main(String[] args) {


		Supplier<String> greetings = () -> "Greetings!";

		List<String> greetingsList = Stream.generate(() -> "Greetings!")
				.limit(5)
				.toList();

		greetingsList.forEach(System.out::println);
	}

}
