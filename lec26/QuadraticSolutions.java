import java.util.Scanner;

public class QuadraticSolutions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read coefficients
        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        // Check if it's a quadratic equation
        if (a == 0) {
            System.out.println("Not a quadratic equation (a cannot be 0).");
            return;
        }

        // Calculate discriminant
        double D = b * b - 4 * a * c;

        // Check nature of roots
        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Two real and distinct solutions:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (D == 0) {
            double x = -b / (2 * a);
            System.out.println("One real repeated solution:");
            System.out.println("x = " + x);
        } else {
            System.out.println("No real solutions (roots are complex).");
        }

        sc.close();
    }
}