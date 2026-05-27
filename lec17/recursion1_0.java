/*
 * INTERVIEW QUESTIONS - Recursion Basics (Print N to 1):
 *
 * Q1: What is recursion?
 * A: A function that calls itself to solve smaller subproblems
 *
 * Q2: What are the two essential parts of recursion?
 * A: Base case (termination) and recursive case (function calling itself)
 *
 * Q3: What is a base case?
 * A: Condition that stops recursion; without it, infinite loop occurs
 *
 * Q4: What is stack overflow?
 * A: Error when call stack exceeds memory limit (usually from missing base case)
 *
 * Q5: Time complexity of this function?
 * A: O(n) - makes n recursive calls
 *
 * Q6: Space complexity?
 * A: O(n) - n function calls on call stack
 */
public class recursion1_0 {
    public static void printnumber(int n){
        // Q: What is this? A: Base case - stops recursion when n reaches 0
        if(n==0){
            return;
        }
        System.out.println(n);  // Print current number
        printnumber(n-1);  // Q: What type of recursion? A: Tail recursion (call at end)
    }

    public static void main(String[] args) {
        int n=5;
        printnumber(n);  // Prints: 5, 4, 3, 2, 1
    }

}
