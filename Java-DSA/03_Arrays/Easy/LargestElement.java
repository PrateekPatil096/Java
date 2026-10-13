import java.util.*;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 15};
        
        int largest = findLargest(arr);
        System.out.println("Largest element: " + largest);
    }
    
    public static int findLargest(int[] arr) {
        int max = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        return max;
    }
}
