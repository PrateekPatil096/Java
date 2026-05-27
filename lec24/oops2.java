/*
 * INTERVIEW QUESTIONS - Copy Constructor:
 *
 * Q1: What is a copy constructor?
 * A: Constructor that creates new object by copying another object's values
 *
 * Q2: Does Java provide default copy constructor?
 * A: No, unlike C++; we must define it explicitly
 *
 * Q3: What is shallow copy vs deep copy?
 * A: Shallow copies references; Deep copies the actual objects
 *
 * Q4: What does this(s2) call do?
 * A: Copies s2's values to the new object being created
 *
 * Q5: Why have constructor overloading?
 * A: To provide multiple ways to create objects (default, parameterized, copy)
 *
 * Q6: What is constructor chaining?
 * A: Calling one constructor from another using this() or super()
 */
class Stundent{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Q: What type of constructor is this? A: Copy constructor
    // Q: What does it do? A: Creates new object with same values as s2
    Stundent(Stundent s2){
        this.name=s2.name;  // Copy name from s2
        this.age=s2.age;    // Copy age from s2
    }

    // Q: What is this? A: Default constructor (no parameters)
    Stundent(){

    }
}
public class oops2 {
    public static void main(String[] args) {
        Stundent s1=new Stundent();  // Uses default constructor
        s1.name="toji";
        s1.age=22;

        // Q: What happens here? A: Copy constructor creates s2 with s1's values
        Stundent s2=new Stundent(s1);
        s2.printInfo();  // Prints: toji, 22
    }
}
