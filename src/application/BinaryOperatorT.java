package application;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/* It represents an operation that combines two arguments and returns a result from same type <T>
 * Normally used reduce pairs of elements, like sum or combine objects
*/
public class BinaryOperatorT {

    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        //declaring Binary Operator
        BinaryOperator<Integer> sum = (number1, number2) -> number1 + number2;
        int rslt = numbers.stream().reduce(0, sum);



        // using lambda
        int result = numbers.stream()
        .reduce(0, Integer::sum);   
        //using reduce method from class BinaryOperator and sum method from class Integer
    
       System.out.println(result);
        
    }

}
