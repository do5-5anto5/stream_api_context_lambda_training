package application;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*It represents a function tha receives an argument <T> and returns a boolean value
 * 
 * Normally used to filter elements from Stream based in a condition
 */

public class PredicateT {

    public static void main(String[] args) {
        

        List<String> names = Arrays.asList("Maria", "Joana", "Luciana", "Gretta");

        Predicate<String> nameLeght = name -> name.length() > 5;
        // declaring Predicate

        List<String> filteredNames = names.stream()
            .filter(x -> x.length() > 5)
            .toList();
            // using lambda

        filteredNames.forEach(System.out::println);
    }
    
}
