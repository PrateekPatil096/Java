/*
 * INTERVIEW QUESTIONS - Polymorphism (Method Overloading):
 *
 * Q1: What is polymorphism?
 * A: "Many forms" - same method name behaves differently based on context
 *
 * Q2: What are the two types of polymorphism?
 * A: Compile-time (overloading) and Runtime (overriding)
 *
 * Q3: What is method overloading?
 * A: Same method name with different parameter lists in same class
 *
 * Q4: How does compiler differentiate overloaded methods?
 * A: By number, type, or order of parameters (method signature)
 *
 * Q5: Can we overload based on return type alone?
 * A: No, return type is not part of method signature
 *
 * Q6: What is compile-time polymorphism?
 * A: Method binding happens at compile time (method overloading)
 *
 * Q7: What is runtime polymorphism?
 * A: Method binding happens at runtime (method overriding with inheritance)
 */
class Stundent{
    String name;
    int age;

    // Q: What is method overloading? A: Same name, different parameters
    // Overloaded version 1: takes String
    public void printInfo(String name){
        System.out.println(name);
    }

    // Overloaded version 2: takes int
    public void printInfo(int age){
        System.out.println(age);
    }

    // Overloaded version 3: takes String and int
    public void printInfo(String name,int age){
        System.out.println(name+" "+age);
    }

    // Q: Can we have printInfo(int age, String name)? A: Yes! Different order = different signature
}
public class oops_poly {
    public static void main(String[] args) {
        Stundent s1=new Stundent();
        s1.name="toji";
        s1.age=22;

        // Q: How does Java know which printInfo to call?
        // A: Compiler matches based on argument types - this calls version 3
        s1.printInfo(s1.name,s1.age);

    }
}
