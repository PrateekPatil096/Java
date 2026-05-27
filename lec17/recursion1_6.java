/*
 * INTERVIEW QUESTIONS - Power Function - Binary Exponentiation:
 *
 * Q1: What is binary exponentiation?
 * A: Computing x^n using the property: x^n = (x^(n/2))^2
 *
 * Q2: Time complexity?
 * A: O(log n) - divides problem by 2 each step
 *
 * Q3: Why is this faster than linear approach?
 * A: log n calls instead of n calls (e.g., 10 calls vs 1000 for n=1000)
 *
 * Q4: Formula for even n?
 * A: x^n = x^(n/2) * x^(n/2)
 *
 * Q5: Formula for odd n?
 * A: x^n = x^(n/2) * x^(n/2) * x
 *
 * Q6: Can this be optimized further?
 * A: Yes, store x^(n/2) in variable to avoid computing twice (O(log n) to truly O(log n))
 */
public class recursion1_6 {
    public static int calcPower(int x, int n) {
        // Base case: x^0 = 1
        if (n == 0) {
            return 1;
        }
        // Base case: 0^n = 0
        if (x == 0) {
            return 0;
        }
        // Q: Why check if n is even or odd? A: Different formulas for each case
        if (n % 2 == 0) {
            // Even: x^n = x^(n/2) * x^(n/2)
            // Q: How can we optimize this? A: Calculate x^(n/2) once, then square
            return calcPower(x, n / 2) * calcPower(x, n / 2);
        } else {
            // Odd: x^n = x^(n/2) * x^(n/2) * x
            return calcPower(x, n / 2) * calcPower(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = calcPower(x, n);  // 2^5 = 32
        System.out.println(ans);
    }

}
