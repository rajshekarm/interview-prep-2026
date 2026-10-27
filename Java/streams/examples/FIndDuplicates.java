package examples;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FIndDuplicates {
    public static void main(String[] args) {
            List<Integer> list = List.of(1, 2, 3, 1, 2, 4, 5);
            Set<Integer> seen = new HashSet<>();
            List<Integer> duplicates = list.stream()
                                        .filter((num) -> {
                                                    if(seen.contains(num)) return false;
                                                    else { 
                                                        seen.add(num);
                                                        return true;
                                                    }
                                                        
                                                })
                                        .toList();

            duplicates.stream().forEach(System.out::println);
            
      


    }
}
