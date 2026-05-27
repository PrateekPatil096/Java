/*
 * INTERVIEW QUESTIONS - Scanner and User Input:
 *
 * Q1: What is Scanner class used for in Java?
 * A: To read input from various sources like keyboard (System.in), files, strings
 *
 * Q2: Which package contains Scanner class?
 * A: java.util package
 *
 * Q3: What is the difference between next() and nextLine()?
 * A: next() reads until whitespace, nextLine() reads entire line including spaces
 *
 * Q4: Why do we create Scanner object with System.in?
 * A: System.in represents the standard input stream (keyboard)
 *
 * Q5: What happens if we enter string when nextInt() expects integer?
 * A: InputMismatchException is thrown
 *
 * Q6: Should Scanner be closed after use? Why?
 * A: Yes, to prevent resource leaks. Use sc.close() or try-with-resources
 */
import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        // Q: What is System.in? A: Standard input stream connected to keyboard
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        // Q: Why use nextLine() for name? A: Names can have spaces
        String name = sc.nextLine();

        System.out.println("Your name is: " + name);

        // Q: What is string concatenation? A: Joining strings using + operator
        int a=sc.nextInt();  // Reads integer, leaves newline in buffer
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println(sum);

    }
}
