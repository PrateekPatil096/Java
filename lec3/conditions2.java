/*
 * INTERVIEW QUESTIONS - If-Else-If Ladder:
 *
 * Q1: What is an if-else-if ladder?
 * A: Multiple conditions checked sequentially until one is true
 *
 * Q2: What is the order of condition checking?
 * A: Top to bottom; first true condition executes, rest are skipped
 *
 * Q3: What happens if no condition is true and no else?
 * A: Nothing executes; program continues after the if-else block
 *
 * Q4: Can we have multiple else-if without final else?
 * A: Yes, final else is optional but recommended
 *
 * Q5: How to compare three numbers for largest?
 * A: Use nested if-else or if-else-if ladder
 */
import java.util.*;
public class conditions2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        // Q: Why check equality first?
        // A: Handles the edge case before comparing which is greater
        if(a==b){
            System.out.println("equal");
        }else if(a>b){
                System.out.println("a is greater");
            }
            else{
                System.out.println("a is lesser");
            }
        }
    }

