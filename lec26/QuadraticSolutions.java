/*
 * INTERVIEW QUESTIONS - Quadratic Equation Solver:
 *
 * Q1: What is the quadratic formula?
 * A: x = (-b ± √(b²-4ac)) / 2a for equation ax² + bx + c = 0
 *
 * Q2: What is the discriminant?
 * A: D = b² - 4ac; determines nature of roots
 *
 * Q3: What if discriminant > 0?
 * A: Two distinct real roots
 *
 * Q4: What if discriminant = 0?
 * A: Two equal real roots (one repeated root)
 *
 * Q5: What if discriminant < 0?
 * A: Complex/imaginary roots (no real solutions)
 *
 * Q6: What does Math.sqrt() do?
 * A: Returns square root of a number
 *
 * Q7: Why use double instead of int?
 * A: Roots can be decimal values; int would lose precision
 */
import java.util.Scanner;

public class QuadraticSolutions{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Q: What are a, b, c in ax² + bx + c = 0? A: Coefficients
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        // Q: What is discriminant formula? A: D = b² - 4ac
        double d = (b * b) - (4 * a * c);

        // Q: What does discriminant tell us? A: Nature and number of roots
        if (d > 0) {
            // Two distinct real roots
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("Two Real and Different Roots:");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);

        } else if (d == 0) {
            // One repeated root
            double root = (-b) / (2 * a);

            System.out.println("Two Real and Equal Roots:");
            System.out.println("Root = " + root);

        } else {
            // Q: Why imaginary for d < 0? A: Cannot take sqrt of negative number in real numbers
            System.out.println("Roots are Imaginary");
        }

        sc.close();  // Q: Why close Scanner? A: Prevents resource leak
    }
}
