/*
 * INTERVIEW QUESTIONS - Majority Element:
 *
 * Q1: What is Majority Element?
 * A: Element appearing more than n/k times (here n/3)
 *
 * Q2: How to find using HashMap?
 * A: Count frequency of each element, then check condition
 *
 * Q3: Time complexity?
 * A: O(n) - single pass to count, single pass to check
 *
 * Q4: Space complexity?
 * A: O(n) - HashMap can store up to n unique elements
 *
 * Q5: Can we do better for n/2 majority?
 * A: Yes, Boyer-Moore voting algorithm uses O(1) space
 *
 * Q6: How many elements can appear more than n/3 times?
 * A: At most 2 elements
 */
import java.util.*;

public class classroom {
    public static void majorityEelement(int nums[]){
        // Q: What does HashMap store? A: Element -> Count
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=nums.length;

        // Q: First pass - count frequency of each element
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                // Q: If exists, increment count
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                // Q: If new, add with count 1
                map.put(nums[i], 1);
            }
        }

        // Q: Second pass - find elements with count > n/3
        for(int key:map.keySet()){
            if(map.get(key)>n/3){
                System.out.println(key);
            }
        }
    }

    public static void main(String[] args) {
        int nums[]={1,3,2,5,1,3,1,5,1};
        majorityEelement(nums);  // Output: 1 (appears 4 times > 9/3=3)
    }


}
