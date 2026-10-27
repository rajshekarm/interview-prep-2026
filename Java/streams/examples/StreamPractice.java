package examples;
import static examples.DataStore.*;
import java.util.*;


public class StreamPractice {
    public static void main(String[] args) {
        
        //1. Find Even Number from given Number List using Stream
        List <Integer> evenNums = DataStore.NUMBERS
        .stream()
        .filter((num) -> num%2==0)
        .toList();

        System.out.println(evenNums);


        //2. Find duplicates in a list
        Set<String> seen = new HashSet<>(DataStore.WORDS);
        DataStore.WORDS.stream()
        .filter()
        .

    }
}
