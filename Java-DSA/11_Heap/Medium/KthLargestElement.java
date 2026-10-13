import java.util.*;

public class KthLargestElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        
        int result = findKthLargest(nums, k);
        System.out.println(k + "th largest element: " + result);
    }
    
    public static int findKthLargest(int[] nums, int k) {
        // Use min heap of size k
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for (int num : nums) {
            minHeap.offer(num);
            
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        
        return minHeap.peek();
    }
}
