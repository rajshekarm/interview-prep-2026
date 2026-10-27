package examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Flatten {
    public static void main(String[] args) {
    List<List<Integer>> nested = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(3, 4),
            Arrays.asList(4, 5, 6)
        );

    // To Do
    // map() transforms each element into another element. 
    // flatMap() transforms each element into a stream and combines those streams into one.
      
    List<Integer> res = nested.stream()
                        .flatMap(Collections::stream)
                        .distinct()
                        .collect(Collectors.toList());

        }
}
