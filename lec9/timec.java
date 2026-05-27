/*
 * INTERVIEW QUESTIONS - Time Complexity O(n*m):
 *
 * Q1: What is time complexity?
 * A: Measure of how running time grows with input size
 *
 * Q2: What is O(n*m)?
 * A: When we have two nested loops with different limits n and m
 *
 * Q3: When is O(n*m) == O(n^2)?
 * A: When n equals m (both loops have same iteration count)
 *
 * Q4: How to calculate nested loop complexity?
 * A: Multiply the iterations: outer loop × inner loop
 *
 * Q5: What is Big-O notation?
 * A: Describes upper bound/worst case of algorithm performance
 */
import java.util.*;

public class timec {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        // Q: What is the time complexity? A: O(n*m)
        // Q: How many times does println execute? A: n * m times
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println("toji");
            }
        }
    }

}
