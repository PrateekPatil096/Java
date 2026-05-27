/*
 * INTERVIEW QUESTIONS - Recursion (Print 1 to N):
 *
 * Q1: How to print numbers in ascending order using recursion?
 * A: Print before recursive call, or use increasing parameter
 *
 * Q2: What is the difference between this and printing N to 1?
 * A: Here we increment n, stop when reaching target; there we decrement
 *
 * Q3: Can we print 1 to N by printing after recursive call?
 * A: Yes! Call printnumber(n-1) first, then print n
 *
 * Q4: What is head recursion vs tail recursion?
 * A: Head: recursive call before processing; Tail: call after processing
 *
 * Q5: Time complexity?
 * A: O(n) - n recursive calls
 */
public class recursion1_1 {
     public static void printnumber(int n){
        // Q: Base case - stop when n reaches 6
        if(n==6){
            return;
        }
        System.out.println(n);  // Print first, then recurse
        printnumber(n+1);  // Increment to print ascending order
    }

    public static void main(String[] args) {
        int n=1;  // Start from 1
        printnumber(n);  // Prints: 1, 2, 3, 4, 5
    }

}
