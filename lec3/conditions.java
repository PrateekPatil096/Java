/*
 * INTERVIEW QUESTIONS - If-Else Statements:
 *
 * Q1: What is the difference between if and if-else?
 * A: if executes only when true; if-else provides alternative for false case
 *
 * Q2: Can we use any data type in if condition?
 * A: No, only boolean or expression that evaluates to boolean
 *
 * Q3: What is a conditional/relational operator?
 * A: Operators like >, <, >=, <=, ==, != that return boolean
 *
 * Q4: What is short-circuit evaluation?
 * A: In && and ||, second operand isn't evaluated if result is determined
 *
 * Q5: Difference between = and ==?
 * A: = is assignment operator, == is comparison operator
 */
import java.util.*;
public class conditions{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();

        // Q: What type of expression is (age>18)?
        // A: Boolean expression - evaluates to true or false
        if(age>18){
            System.out.println("adult");
        }
        else{
            System.out.println("not adult");
        }
    }


}
