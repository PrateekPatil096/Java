/*
 * INTERVIEW QUESTIONS - Array of Objects:
 *
 * Q1: Can arrays store objects in Java?
 * A: Yes, arrays can store references to objects
 *
 * Q2: What is an array of objects?
 * A: Array where each element is a reference to an object
 *
 * Q3: When we create array of objects, what is stored?
 * A: References (null initially); objects created separately with 'new'
 *
 * Q4: What is parameterized constructor?
 * A: Constructor that takes parameters to initialize object
 *
 * Q5: What does 'this' keyword do in constructor?
 * A: Refers to current object; distinguishes instance variables from parameters
 *
 * Q6: How to iterate through array of objects?
 * A: Use loop and call methods on each object
 */
class st {
    // Q: What are these? A: Instance variables (attributes of each student)
    String usn;
    String name;
    String branch;
    String phone;
    double percentage;

    // Q: What type of constructor is this? A: Parameterized constructor
    st(String usn, String name, String branch, String phone, double percentage) {
        // Q: Why use 'this'? A: To distinguish instance vars from parameters
        this.usn = usn;
        this.name = name;
        this.branch = branch;
        this.phone = phone;
        this.percentage = percentage;
    }

    // Display method
    void display() {
        System.out.println(usn + "\t" + name + "\t" + branch + "\t" + phone + "\t" + percentage);
    }
}

public class StudentMain {
    public static void main(String[] args) {

        int n = 3; // number of students

        // Q: What does this create? A: Array of 3 null references
        st students[] = new st[n];

        // Q: What does 'new st(...)' do? A: Creates actual object and assigns to array
        students[0] = new st("1BM21CS001", "Ravi", "CSE", "9876543210", 85);
        students[1] = new st("1BM21CS002", "Anu", "ECE", "9123456780", 90);
        students[2] = new st("1BM21CS003", "Kiran", "ME", "9988776655", 78);

        // Heading
        System.out.println("USN\tName\tBranch\tPhone\t\tPercentage");

        // Q: How to iterate array of objects? A: Loop through and call methods
        for (int i = 0; i < n; i++) {
            students[i].display();
        }
    }
}
