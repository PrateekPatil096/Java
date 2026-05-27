/*
 * INTERVIEW QUESTIONS - Functions/Methods in Java:
 *
 * Q1: What is a method/function in Java?
 * A: A block of code that performs a specific task and can be reused
 *
 * Q2: What is the difference between void and return type methods?
 * A: void doesn't return value; return type methods return a specific data type
 *
 * Q3: What is method signature?
 * A: Method name + parameter list (not return type)
 *
 * Q4: What is the purpose of 'return' statement?
 * A: To exit method and optionally return a value to caller
 *
 * Q5: Why are methods declared as static in this case?
 * A: To call them from static main() without creating object
 *
 * Q6: What is a method call/invocation?
 * A: Executing a method by using its name with arguments
 */
import java.util.*;

public class functionss {
    // Q: What does void mean? A: Method doesn't return any value
    public static void printMyName(String name){
        System.out.println(name);
        return;  // Q: Is return necessary in void method? A: No, it's optional
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();  // Q: Why next() not nextLine()? A: next() reads single word
        printMyName(name);  // Q: What is this called? A: Method call/invocation

    }

}
