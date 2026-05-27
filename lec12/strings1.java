/*
 * INTERVIEW QUESTIONS - Strings in Java:
 *
 * Q1: What is a String in Java?
 * A: Immutable sequence of characters; String is a class, not primitive
 *
 * Q2: Where are Strings stored in Java?
 * A: In String Pool (for literals) or Heap (for new String())
 *
 * Q3: What is String Pool?
 * A: Special memory area for storing unique string literals for reuse
 *
 * Q4: Why are Strings immutable?
 * A: For security, thread safety, and caching in String Pool
 *
 * Q5: Difference between == and .equals() for Strings?
 * A: == compares references; .equals() compares content
 *
 * Q6: Difference between next() and nextLine()?
 * A: next() reads word (stops at space); nextLine() reads entire line
 */
import java.util.*;

public class strings1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Q: Why nextLine() here? A: To read full name with spaces
        String name=sc.nextLine();
        // Q: What is + doing here? A: String concatenation
        System.out.println("your name is "+ name);


    }

}
