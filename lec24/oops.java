/*
 * INTERVIEW QUESTIONS - OOP Basics (Classes and Objects):
 *
 * Q1: What is a class in Java?
 * A: Blueprint/template for creating objects; defines properties and behaviors
 *
 * Q2: What is an object?
 * A: Instance of a class; has state (fields) and behavior (methods)
 *
 * Q3: What is 'this' keyword?
 * A: Reference to current object; used to access instance variables
 *
 * Q4: What is a constructor?
 * A: Special method called when object is created; initializes object
 *
 * Q5: What is default constructor?
 * A: Constructor with no parameters; provided by Java if none defined
 *
 * Q6: Can we have multiple objects of same class?
 * A: Yes, each has its own copy of instance variables
 *
 * Q7: Difference between class and object?
 * A: Class is blueprint; Object is instance created from blueprint
 */
class Pen{
    String color;  // Q: What are these? A: Instance variables/fields
    String type;

    // Q: What is this? A: Method - defines behavior
    public void write(){
        System.out.println("writing something");
    }

    // Q: Why use 'this.color'? A: To refer to instance variable, not local
    public void printcolor(){
        System.out.println(this.color);
    }
}

class Stundent{
    String name;  // Instance variable
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Q: What is this? A: Constructor - same name as class, no return type
    // Q: When is it called? A: When 'new' keyword creates object
    Stundent(){
        System.out.println("constutor called");
    }
}

public class oops {
    public static void main(String[] args) {
        // Q: What does 'new' do? A: Allocates memory and calls constructor
        Pen pen1=new Pen();
        pen1.color="blue";   // Setting instance variable
        pen1.type="gel";
        pen1.write();        // Calling method

        // Q: Do pen1 and pen2 share variables? A: No, each has own copy
        Pen pen2=new Pen();
        pen2.color="black";
        pen2.type="ballpoint";

        pen1.printcolor();  // blue
        pen2.printcolor();  // black

        Stundent s1=new Stundent();  // Constructor called here
        s1.name="toji";
        s1.age=25;
        s1.printInfo();
    }


}
