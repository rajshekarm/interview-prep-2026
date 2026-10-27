package examples;

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

    }
    
    
}
