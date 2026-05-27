/*
 * INTERVIEW QUESTIONS - Subarray Sum Equals K (HashMap):
 *
 * Q1: What is the problem?
 * A: Count subarrays whose sum equals target k
 *
 * Q2: What is the prefix sum approach?
 * A: If prefixSum[j] - prefixSum[i] = k, subarray(i+1, j) sums to k
 *
 * Q3: Why store prefix sum in HashMap?
 * A: To find in O(1) if (currentSum - k) exists as previous prefix sum
 *
 * Q4: Time complexity?
 * A: O(n) - single pass with O(1) HashMap operations
 *
 * Q5: Space complexity?
 * A: O(n) - HashMap stores at most n prefix sums
 *
 * Q6: Why initialize map.put(0, 1)?
 * A: To count subarrays starting from index 0
 */
import java.util.*;
public class classroom4 {
    public static void main(String[] args) {
        int arr[]={10,2,-2,-20,10};
        int k=-10;

        // Q: What does HashMap store? A: prefixSum -> count of occurrences
        HashMap<Integer,Integer> map=new HashMap<>();

        // Q: Why put(0, 1)? A: If prefixSum itself equals k, we found a subarray
        map.put(0,1);
        int ans=0;
        int sum=0;

        for(int j=0;j<arr.length;j++){
            sum=sum+arr[j];  // Calculate running prefix sum

            // Q: Key insight: if (sum - k) was a prefix sum before,
            // then elements between make a subarray summing to k
            if(map.containsKey(sum-k)){
                ans=ans+map.get(sum-k);  // Add count of such prefix sums

            }

            // Q: Update HashMap with current prefix sum
            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);  // Increment count
            }else{
                map.put(sum,1);  // First occurrence
            }
        }
        System.out.println(ans);  // Number of subarrays with sum = k
    }

}
