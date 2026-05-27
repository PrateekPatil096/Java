/*
 * INTERVIEW QUESTIONS - Abstract Class:
 *
 * Q1: What is an abstract class?
 * A: Class that cannot be instantiated; may contain abstract methods
 *
 * Q2: What is an abstract method?
 * A: Method declared without implementation; subclass MUST implement it
 *
 * Q3: Can abstract class have concrete methods?
 * A: Yes, it can have both abstract and regular methods
 *
 * Q4: Can we create object of abstract class?
 * A: No, abstract classes cannot be instantiated
 *
 * Q5: When to use abstract class vs interface?
 * A: Abstract class for partial implementation; Interface for pure contract
 *
 * Q6: Can abstract class have constructor?
 * A: Yes, called when subclass object is created
 *
 * Q7: What happens if subclass doesn't implement abstract method?
 * A: Subclass must also be declared abstract
 */
// Q: What does 'abstract' mean? A: Class cannot be instantiated
abstract class Animal{
    // Q: What is abstract method? A: Method with no body; MUST be implemented by subclass
    abstract void walk();

    // Q: Can abstract class have regular methods? A: Yes!
    public void eat(){
        System.out.println("animal eats");
    }

}

// Q: What must Horse class do? A: Implement all abstract methods from Animal
class Horse extends Animal{
    // Q: What is this? A: Implementation of abstract method (mandatory)
    public void walk(){
        System.out.println("walk on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("walk on 2 legs");
    }
}
public class oops4 {
    public static void main(String[] args) {
        // Q: Can we write Animal a = new Animal()? A: No, abstract class
        Horse horse=new Horse();
        horse.walk();  // From Horse class (abstract method implemented)
        horse.eat();   // From Animal class (inherited regular method)
    }

}
