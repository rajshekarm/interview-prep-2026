import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


// Problem : Sort trading symbol by their size
public class Simple1 {
    public static void main(String[] args) {
        
        List<String> symbols  = new ArrayList<>(List.of("apple", "msft", "nvidea", "tesla"));

        symbols.sort((a,b) -> Integer.compare(a.length(),b.length()));
                
        symbols.sort(Comparator.comparing((s)->s.length()));

        
        for(var s:symbols) System.out.println(s);


    }
}
