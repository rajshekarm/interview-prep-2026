package examples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindDuplicatesAndFrequency {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 3, 3);

        Map<Integer, Integer> counter = new HashMap<>();
        for(Integer num:nums)
            counter.put(num, counter.getOrDefault(num,0)+1);

        // or

        Map<Integer, Long> duplicates = nums.stream()
        .collect(Collectors.groupingBy((num)->num, Collectors.counting()))
        .entrySet()
        .stream()
        .filter((pair) -> pair.getValue()>1)
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        for(var entry:duplicates.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue()); 
    }
}
