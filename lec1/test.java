/*
 * INTERVIEW QUESTIONS - Hello World Program:
 *
 * Q1: What is the entry point of a Java program?
 * A: The main() method with signature: public static void main(String args[])
 *
 * Q2: Why is main() method declared as static?
 * A: So JVM can call it without creating an object of the class
 *
 * Q3: What is the difference between print() and println()?
 * A: println() adds a newline after output, print() does not
 *
 * Q4: Can we have multiple main methods in a Java program?
 * A: Yes, but only one per class. JVM calls the main of the class being executed
 *
 * Q5: What happens if main() is not declared as public?
 * A: JVM will not be able to access it, resulting in runtime error
 */
class test {
    public static void main (String args[]){
        System.out.println("hello world");  // Q: What class does println belong to? A: PrintStream (System.out is PrintStream object)
    }
}
