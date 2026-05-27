/*
 * INTERVIEW QUESTIONS - Encapsulation (Access Modifiers):
 *
 * Q1: What is encapsulation?
 * A: Wrapping data and code together; hiding internal details from outside
 *
 * Q2: What are access modifiers in Java?
 * A: public, protected, default (package-private), private
 *
 * Q3: What is 'public' access modifier?
 * A: Accessible from anywhere
 *
 * Q4: What is 'protected' access modifier?
 * A: Accessible within package and by subclasses in other packages
 *
 * Q5: What is 'private' access modifier?
 * A: Accessible only within the same class
 *
 * Q6: What are getters and setters?
 * A: Methods to access (get) and modify (set) private variables
 *
 * Q7: Why use private with getters/setters?
 * A: Data hiding - control how data is accessed/modified; add validation
 *
 * Q8: What is the benefit of encapsulation?
 * A: Security, maintainability, flexibility to change implementation
 */

class Account{
    // Q: What is 'public'? A: Accessible from anywhere
    public String name;

    // Q: What is 'protected'? A: Accessible in package + subclasses
    protected String email;

    // Q: What is 'private'? A: Accessible only within this class
    private String password;

    // Q: What is a getter? A: Method to access private variable
    public String getPassword(){
        return this.password;
    }

    // Q: What is a setter? A: Method to modify private variable
    // Q: What validation could we add? A: Check password strength, length, etc.
    public void setPassword(String pass){
        this.password=pass;
    }
}

public class bank {
    public static void main(String[] args) {
        Account acc1=new Account();
        acc1.name="toji";       // OK: public - accessible anywhere
        acc1.email="toji@gmail.com";  // OK: protected - same package

        // acc1.password = "abc";  // ERROR: private - not accessible directly!

        // Q: How to access private variable? A: Through public getter/setter
        acc1.setPassword("abc");
        System.out.println(acc1.getPassword());
    }
}
