/*
 * INTERVIEW QUESTIONS - Variables and Data Types:
 *
 * Q1: What are primitive data types in Java?
 * A: byte, short, int, long, float, double, char, boolean (8 types)
 *
 * Q2: What is the default value of int in Java?
 * A: 0 (for instance variables), local variables must be initialized
 *
 * Q3: What is the difference between print() and println()?
 * A: print() stays on same line, println() moves cursor to next line
 *
 * Q4: What is the size of int in Java?
 * A: 4 bytes (32 bits), range: -2^31 to 2^31-1
 *
 * Q5: Can we use escape sequences in Java strings?
 * A: Yes, like \n (newline), \t (tab), \\ (backslash)
 */
class variables{
    public static void main(String[] args) {
        // Q: What does \n do? A: It's an escape sequence for newline
        System.out.print("hello world in java\n");
        System.out.println("hello world in java");
        System.out.print("hello world in java \n from prateek");

        // Q: What is variable declaration vs initialization?
        // A: Declaration: int a; Initialization: a = 20; Both: int a = 20;
        int a=20;
        int b=60;

        // Q: What are arithmetic operators in Java?
        // A: +, -, *, /, % (modulus)
        int sum=a+b;
        System.out.println(sum);

        int mul=a*b;
        System.out.println(mul);

        int diff=a-b;  // Q: What happens when smaller - larger? A: Result is negative
        System.out.println(diff);

    }

}
