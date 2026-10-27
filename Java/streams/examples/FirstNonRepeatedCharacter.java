package examples;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {

    // Input: "swiss"
    // Expected output: w 
    public static void main(String[] args) {
    
    String input = "swiss";
    for(int i=0;i<input.length();i++){
        if(input.lastIndexOf(input.charAt(i))==i)
        {
            System.out.println(input.charAt(i)); 
            break;
        }
    }

    Character res = input.chars()
    .mapToObj(c -> (char)(c))
    .collect(Collectors.groupingBy((c)->c, LinkedHashMap::new, Collectors.counting()))
    .entrySet()
    .stream()
    .filter((entry)->entry.getValue()==1)
    .map((entry) -> entry.getKey())
    .findFirst()
    .orElse(null);


    }

// 4. Why LinkedHashMap matters
// LinkedHashMap::new preserves the order in which characters first appear. 
// That ensures findFirst() returns the first non-repeating character in the original string, rather than an arbitrary one.

// Interview tip: Remember the distinction between map() and mapToObj() when working with IntStream. 
// Use mapToObj() when you want to convert primitive int values into objects such as Character.
    
}
