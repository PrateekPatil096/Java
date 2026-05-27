/*
 * INTERVIEW QUESTIONS - Time Complexity O(n+m):
 *
 * Q1: What is O(n+m) complexity?
 * A: Linear time dependent on two variables - loops run sequentially
 *
 * Q2: Difference between O(n+m) and O(n*m)?
 * A: O(n+m): loops are sequential (added); O(n*m): loops are nested (multiplied)
 *
 * Q3: Which is better: O(n+m) or O(n*m)?
 * A: O(n+m) is better - linear vs quadratic growth
 *
 * Q4: When to use sequential vs nested loops?
 * A: Sequential when operations are independent; nested when dependent
 *
 * Q5: If n=m, what is O(n+m)?
 * A: O(2n) = O(n) - constants are dropped in Big-O
 */
import java.util.*;

public class timecc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        // Q: These loops are sequential, not nested
        // First loop: O(n)
        for(int i=0;i<n;i++){
            System.out.println("naruto");
        }
        // Second loop: O(m)
        for(int j=0;j<m;j++){
            System.out.println("hinata");
        }
        // Q: Total time complexity? A: O(n) + O(m) = O(n+m)
    }
}
