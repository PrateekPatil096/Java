/*
 * INTERVIEW QUESTIONS - Type Casting in Java:
 *
 * Q1: What is type casting?
 * A: Converting a value from one data type to another
 *
 * Q2: What are the two types of casting?
 * A: Implicit (automatic/widening) and Explicit (manual/narrowing)
 *
 * Q3: What is widening casting?
 * A: Converting smaller type to larger (int to double) - automatic
 *
 * Q4: What is narrowing casting?
 * A: Converting larger type to smaller (double to int) - requires explicit cast
 *
 * Q5: What happens to decimal part when casting double to int?
 * A: It's truncated (removed), not rounded. 9.78 becomes 9
 *
 * Q6: What is the syntax for explicit casting?
 * A: (targetType) value, e.g., (int) 3.14
 */
class TypeCastingExample {
    public static void main(String args[]) {
        double a = 9.78;
        int b;

        // Q: What type of casting is this? A: Explicit/Narrowing casting
        // Q: What value will b have? A: 9 (truncated, not rounded)
        b = (int) a;   // casting double to int

        System.out.println("Double value: " + a);  // 9.78
        System.out.println("Int value: " + b);     // 9
    }
}
