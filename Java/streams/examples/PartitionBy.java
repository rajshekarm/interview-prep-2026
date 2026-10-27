package examples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionBy {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        Map<Boolean, List<Integer>> result = nums.stream()
        .collect(Collectors.partitioningBy(n->n%2==0));

        // partitioningBy() always produces two Boolean groups, even when one is empty. 
        // groupingBy() supports arbitrary grouping keys and does not create groups for keys that never occur.
    }
}
