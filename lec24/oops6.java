/*
 * INTERVIEW QUESTIONS - Static Keyword:
 *
 * Q1: What is static in Java?
 * A: Belongs to class, not instances; shared among all objects
 *
 * Q2: What is a static variable?
 * A: Variable shared by all objects of the class; only one copy exists
 *
 * Q3: What is a static method?
 * A: Method that belongs to class; can be called without creating object
 *
 * Q4: Can static method access non-static members?
 * A: No, static methods can only access static members directly
 *
 * Q5: When is static variable initialized?
 * A: When class is loaded by JVM (before any object is created)
 *
 * Q6: What is static block?
 * A: Block of code that runs once when class is loaded
 *
 * Q7: Why is main() method static?
 * A: So JVM can call it without creating an object
 */
class Stundent{
    String name;  // Instance variable - each object has its own copy

    // Q: What is static variable? A: Shared among all objects; class-level
    static String School;  // Only ONE copy for all students

    // Q: Can we access School in this method? A: Yes, it's static
    // Q: Can we access 'name' here? A: No, static can't access non-static directly
    public static void changeSchool(){
        School="newschool";
        // name="test"; // ERROR: Cannot access non-static from static context
    }
}
public class oops6 {
    public static void main(String[] args) {
        // Q: Can we access static variable without object? A: Yes, using ClassName.variable
        Stundent.School="dsatm";

        Stundent student1=new Stundent();
        student1.name="tony";

        // Q: What will this print? A: "dsatm" - the shared static value
        System.out.println(student1.School);

        // Q: If we change School now, will it affect all students? A: Yes!
    }

}
