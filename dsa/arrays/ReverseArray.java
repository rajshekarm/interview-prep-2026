package dsa.arrays;
import java.util.Arrays;



// Reverse the array in recursion
public class ReverseArray {

    static void reverse(int[] nums, int start, int end)
    {
        if(start>end)
        {
            return;
        }
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        reverse(nums, start+1, end-1);
        return;
    }

    public static void main(String[] args) {
            
        int[] numbers = new int[]{6,7,1,3,5,2,8,4,9};
        reverse(numbers,0, numbers.length-1);
        Arrays.stream(numbers)
        .forEach(System.out::println);
    } 
}
