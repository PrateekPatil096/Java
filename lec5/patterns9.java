/*
 * INTERVIEW QUESTIONS - Binary Triangle (0-1 Pattern):
 *
 * Q1: How to alternate between 0 and 1?
 * A: Check if sum of indices is even or odd using modulus operator
 *
 * Q2: What does (i+j)%2 tell us?
 * A: Whether the sum of row and column is even (0) or odd (1)
 *
 * Q3: What is the modulus operator used for?
 * A: To get remainder; commonly used for even/odd checks and cycling
 *
 * Q4: Pattern in this triangle?
 * A: Alternating 1s and 0s in checkerboard style
 *
 * Q5: How would you reverse the pattern (start with 0)?
 * A: Swap the conditions or change to (i+j)%2!=0 for 0
 */
import java.util.*;
public class patterns9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for( int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int sum=i+j;
                // Q: What does sum%2==0 mean?
                // A: Sum is even - we print 1; otherwise print 0
                if(sum%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

}
