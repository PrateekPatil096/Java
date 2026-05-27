/*
 * INTERVIEW QUESTIONS - Sum of First N Natural Numbers:
 *
 * Q1: What is the formula for sum of first n natural numbers?
 * A: n*(n+1)/2 - This is O(1) time complexity
 *
 * Q2: What is the time complexity of loop approach?
 * A: O(n) - linear time
 *
 * Q3: Why initialize sum to 0?
 * A: Starting point for accumulation; ensures correct result
 *
 * Q4: What is an accumulator variable?
 * A: A variable that collects/accumulates values through iterations (like sum)
 *
 * Q5: How would you optimize this for very large n?
 * A: Use mathematical formula instead of loop: n*(n+1)/2
 */
import java.util.*;
public class sumofnum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;  // Q: Why 0 and not 1? A: 0 is identity for addition

        // Q: What is this pattern called? A: Running sum or accumulator pattern
        for(int i=0;i<=n;i++){
            sum=sum+i;  // Q: Can we write sum+=i? A: Yes, it's equivalent

        }
        System.out.println(sum);
    }

}
