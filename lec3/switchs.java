/*
 * INTERVIEW QUESTIONS - Switch Statement:
 *
 * Q1: What data types can be used in switch expression?
 * A: byte, short, int, char, String (Java 7+), enum
 *
 * Q2: Why is break statement important in switch?
 * A: Without break, execution "falls through" to next cases
 *
 * Q3: What is the purpose of default case?
 * A: Executes when no case matches, like else in if-else
 *
 * Q4: Can switch work with long or double?
 * A: No, only int or smaller integer types, char, String, and enum
 *
 * Q5: What is fall-through in switch?
 * A: When break is missing, code continues executing next cases
 *
 * Q6: Switch vs if-else: When to use which?
 * A: Switch for discrete values, if-else for ranges/conditions
 */
import java.util.*;
public class switchs {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int button=sc.nextInt();

        // Q: What happens if we remove all break statements?
        // A: All cases after matching case will execute (fall-through)
        switch(button){
            case 1: System.out.println("hello");
            break;  // Q: What if break is missing? A: Falls through to case 2

            case 2: System.out.println("namaste");
            break;

            case 3: System.out.println("bonjour");
            break;

            default: System.out.println("invalid button");
            // Q: Is break needed for default? A: No, it's the last case
        }

    }

}
