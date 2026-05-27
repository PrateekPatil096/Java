/*
 * INTERVIEW QUESTIONS - Sum of Odd Numbers:
 *
 * Q1: How to check if a number is odd?
 * A: n % 2 != 0 (remainder when divided by 2 is not zero)
 *
 * Q2: What is the modulus operator?
 * A: % returns remainder of division
 *
 * Q3: Time complexity?
 * A: O(n) - iterates through all numbers from 0 to n
 *
 * Q4: Can we optimize this?
 * A: Yes! Sum of first k odd numbers = k^2; count odd numbers up to n
 *
 * Q5: What is the pattern of odd numbers?
 * A: 1, 3, 5, 7, 9... (differ by 2)
 *
 * Q6: How to iterate only odd numbers?
 * A: Start from 1, increment by 2: for(i=1; i<=n; i+=2)
 */
import java.util.*;

public class soultions1 {
    public static void printSum(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            // Q: What does i%2!=0 check? A: If i is odd
            if(i%2!=0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printSum(n);
    }
}
