import java.util.*;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        
        int single = singleNumber(nums);
        System.out.println("Single number: " + single);
    }
    
    // XOR all elements - duplicates cancel out
    public static int singleNumber(int[] nums) {
        int result = 0;
        
        for (int num : nums) {
            result ^= num;
        }
        
        return result;
    }
}
