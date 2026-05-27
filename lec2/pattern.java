/*
 * INTERVIEW QUESTIONS - Basic Pattern Printing:
 *
 * Q1: How do you print multiple lines in Java?
 * A: Using multiple println() statements or using \n in print()
 *
 * Q2: What is the time complexity of printing n lines?
 * A: O(n) - linear time complexity
 *
 * Q3: How would you optimize printing the same character multiple times?
 * A: Use loops instead of hardcoding each line
 *
 * Q4: What is the difference between hardcoding and dynamic approach?
 * A: Hardcoding fixes the output, dynamic uses variables for flexibility
 */
class pattern {

    public static void main(String[] args) {
        // Q: Why is this approach not scalable?
        // A: For n=100, you'd need 100 println statements
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");

    }
}
