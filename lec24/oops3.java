/*
 * INTERVIEW QUESTIONS - Inheritance:
 *
 * Q1: What is inheritance?
 * A: Mechanism where child class acquires properties/methods of parent class
 *
 * Q2: What keyword is used for inheritance?
 * A: 'extends' keyword in Java
 *
 * Q3: Types of inheritance in Java?
 * A: Single, Multilevel, Hierarchical (Multiple inheritance via interfaces only)
 *
 * Q4: What is method overloading?
 * A: Same method name with different parameters in same class
 *
 * Q5: Difference between overloading and overriding?
 * A: Overloading: same class, different params; Overriding: subclass, same signature
 *
 * Q6: What does child class inherit from parent?
 * A: All non-private members (fields, methods)
 *
 * Q7: Why use inheritance?
 * A: Code reusability, establishes IS-A relationship
 */
class Shape{
    // Q: What can subclasses do with this? A: Override or overload it
    public void area(){
        System.out.println("display area");
    }
}

// Q: What relationship is this? A: Triangle IS-A Shape
class Triangle extends Shape{
    // Q: What is this? A: Method OVERLOADING (different parameters)
    public void area(int l,int h){
        System.out.println(1/2*l*h);  // Note: 1/2 gives 0 in integer division!
    }
}

class Circle extends Shape{
    // Q: Is this overloading or overriding? A: Overloading (different params)
    public void area(int r){
        System.out.println((3.14*r*r));

    }
}
public class oops3 {
    public static void main(String[] args) {

    }

}
