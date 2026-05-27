/*
 * INTERVIEW QUESTIONS - Interface:
 *
 * Q1: What is an interface?
 * A: Contract that defines methods a class must implement; 100% abstraction
 *
 * Q2: How is interface different from abstract class?
 * A: Interface has only abstract methods (until Java 8); no instance variables
 *
 * Q3: What keyword is used to implement interface?
 * A: 'implements' keyword
 *
 * Q4: Can a class implement multiple interfaces?
 * A: Yes, this is how Java achieves multiple inheritance
 *
 * Q5: What are default methods in interface (Java 8+)?
 * A: Methods with implementation in interface using 'default' keyword
 *
 * Q6: Can interface have variables?
 * A: Yes, but they are implicitly public, static, and final (constants)
 *
 * Q7: When to use interface vs abstract class?
 * A: Interface for "CAN-DO" relationship; Abstract class for "IS-A" with some implementation
 */
// Q: What is this defining? A: A contract - any class implementing must have walk()
interface Animal{
    // Q: Are methods in interface abstract by default? A: Yes (before Java 8)
    public void walk();
}

// Q: What keyword connects class to interface? A: 'implements'
class Horse implements Animal{
    // Q: What happens if we don't implement walk()? A: Compilation error
    public void walk (){
        System.out.println("walk in 4 legs");
    }
}

public class oops5 {
    public static void main(String[] args) {
        Horse horse=new Horse();
        horse.walk();

        // Q: Can we write: Animal a = new Horse()? A: Yes! Interface reference, object of implementing class
    }
}
