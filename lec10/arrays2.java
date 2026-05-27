/*
 * INTERVIEW QUESTIONS - Dynamic Array Input:
 *
 * Q1: Can we create array with size from user input?
 * A: Yes, new int[variable] works - size determined at runtime
 *
 * Q2: How to take array input from user?
 * A: Use loop to read each element using Scanner
 *
 * Q3: What is the difference between compile-time and runtime array size?
 * A: Compile-time: size known before running; Runtime: size determined during execution
 *
 * Q4: How to find length of array?
 * A: Use array.length property (not method, no parentheses)
 *
 * Q5: Can we resize an array after creation?
 * A: No, create new array and copy elements (or use ArrayList)
 */
import java.util.*;
public class arrays2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();  // Q: Runtime size determination

        // Q: Is size known at compile time? A: No, it's determined at runtime
        int number[]=new int[size];

        // Q: What is this pattern called? A: Array input pattern
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();  // Store input at index i
        }

        // Q: Array output/traversal pattern
        for(int i=0;i<size;i++){
            System.out.println(number[i]);
        }
    }
}
