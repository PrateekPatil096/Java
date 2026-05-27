/*
 * INTERVIEW QUESTIONS - Linear Search:
 *
 * Q1: What is linear search?
 * A: Searching by checking each element sequentially from start to end
 *
 * Q2: Time complexity of linear search?
 * A: O(n) - worst case checks all elements
 *
 * Q3: When is linear search useful?
 * A: Small arrays, unsorted data, or when data is accessed once
 *
 * Q4: What is array.length?
 * A: Property that returns number of elements in array
 *
 * Q5: How is linear search different from binary search?
 * A: Linear is O(n) for any array; Binary is O(log n) but requires sorted array
 *
 * Q6: What if element is not found?
 * A: Usually return -1 or print "not found" message
 */
import java.util.*;
public class arrays3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]=new int[size];

        // Input array elements
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();

        }
        int x=sc.nextInt();  // Element to search

        // Q: What is this algorithm? A: Linear Search
        // Q: What is the time complexity? A: O(n)
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==x){
                System.out.println("x found at index"+i);
                // Q: Should we break here? A: Yes, if we only need first occurrence
            }
        }
    }
}
