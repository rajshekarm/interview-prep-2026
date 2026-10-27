package examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;


// 1. Find the second-highest distinct number in a list

public class SecondHighest {
    
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 20, 30, 40, 40, 50);
        
        
        Optional<Integer> res = nums.stream()
        .distinct()
        .sorted(Comparator.reverseOrder())
        .skip(1)
        .findFirst();

        System.out.println(res.get());

    }
}
