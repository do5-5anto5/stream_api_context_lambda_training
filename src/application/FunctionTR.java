package application;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/*It represents a funcion that accept an argument from type <T> and
 *  returns a result from type <R>.
 * 
 * Normally used to transform or to map elements from Stream to other values or types.*/

public class FunctionTR {
    public static void main(String[] args) {

        
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        Function<Integer, Integer> doubleIt = number -> number * 2;
        //declaring Function

        List<Integer> doubleThem = numbers.stream()
            .map(n -> n * 2)    // this line does like Function doubleIt do
            .toList();          // it means collect(Collectors.toList());
            // using lamda

        doubleThem.forEach(System.out::println);
    }

}