/*
 * INTERVIEW QUESTIONS - Union and Intersection using HashSet:
 *
 * Q1: What is Union of two arrays?
 * A: All unique elements from both arrays
 *
 * Q2: What is Intersection of two arrays?
 * A: Elements common to both arrays
 *
 * Q3: How does HashSet help?
 * A: Automatically handles duplicates; O(1) contains check
 *
 * Q4: Time complexity of union?
 * A: O(n + m) - add all from both arrays
 *
 * Q5: Time complexity of intersection?
 * A: O(n + m) - add first, check second
 *
 * Q6: Why remove() in intersection?
 * A: To handle duplicates in arr2; count each common element once
 */
import java.util.*;

public class classroom2 {
    // Q: What is union? A: All unique elements from both arrays
    public static int union(int arr1[],int arr2[]){
        HashSet<Integer> set=new HashSet<>();

        // Q: Add all from arr1 - duplicates automatically handled
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        // Q: Add all from arr2 - only new elements added
        for(int j=0;j<arr2.length;j++){
            set.add(arr2[j]);
        }
        return set.size();  // Total unique elements
    }

    // Q: What is intersection? A: Common elements in both
    public static int intersection(int arr1[],int arr2[]){
        HashSet<Integer> set=new HashSet<>();
        int count=0;

        // Add all elements from arr1 to set
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }

        // Q: For each element in arr2, check if it's in set
        for(int j=0;j<arr2.length;j++){
            if(set.contains(arr2[j])){
                count++;
                // Q: Why remove? A: Don't count same element twice
                set.remove(arr2[j]);

            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        // Q: Output? A: 2 (common elements: 3 and 9)
        System.out.println(intersection(arr1, arr2));
    }

}
