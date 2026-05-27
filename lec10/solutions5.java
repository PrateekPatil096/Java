/*
 * INTERVIEW QUESTIONS - Find Maximum and Minimum:
 *
 * Q1: What is Integer.MIN_VALUE?
 * A: Smallest possible int value: -2^31 (-2147483648)
 *
 * Q2: What is Integer.MAX_VALUE?
 * A: Largest possible int value: 2^31 - 1 (2147483647)
 *
 * Q3: Why initialize max to MIN_VALUE?
 * A: Any array element will be >= MIN_VALUE, so it gets updated correctly
 *
 * Q4: Can we find both max and min in single pass?
 * A: Yes, as shown here - O(n) with two comparisons per element
 *
 * Q5: Time complexity?
 * A: O(n) - single pass through array
 *
 * Q6: Space complexity?
 * A: O(1) - only using two extra variables
 */
import java.util.*;
public class solutions5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
         int numbers[]=new int[size];

         for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
         }

         // Q: Why these initial values? A: Guarantees first element updates them
         int max=Integer.MIN_VALUE;  // Smallest possible, any number is larger
         int min=Integer.MAX_VALUE;  // Largest possible, any number is smaller

         // Q: Can we find max and min in one loop? A: Yes, as shown here
         for(int i=0;i<numbers.length;i++){
            if(numbers[i]<min){
                min=numbers[i];  // Update minimum
            }
            if(numbers[i]>max){
                max=numbers[i];  // Update maximum
            }

         }
         System.out.println("largest number is ="+max);
         System.out.println("smallest number is ="+min);

    }
}
