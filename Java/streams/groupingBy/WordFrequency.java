package groupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class WordFrequency {

    // Using Java Streams and Collectors.groupingBy(), how would you count the frequency of each word?
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
            "apple", "banana", "apple",
            "orange", "banana", "apple"
        );

        Map<String, Long> freq = words.stream()
                                        .collect(Collectors.groupingBy(str->str, TreeMap::new, Collectors.counting()));

        for(Map.Entry<String, Long> entry:freq.entrySet())
            System.out.println(entry.getKey() + ": " + entry.getValue());


    }
}
