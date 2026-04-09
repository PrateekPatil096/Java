class st {
    String usn;
    String name;
    String branch;
    String phone;
    double percentage;

    // Constructor
    st(String usn, String name, String branch, String phone, double percentage) {
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

        st students[] = new st[n];

        // Creating objects manually
        students[0] = new st("1BM21CS001", "Ravi", "CSE", "9876543210", 85);
        students[1] = new st("1BM21CS002", "Anu", "ECE", "9123456780", 90);
        students[2] = new st("1BM21CS003", "Kiran", "ME", "9988776655", 78);

        // Heading
        System.out.println("USN\tName\tBranch\tPhone\t\tPercentage");

        // Display all students
        for (int i = 0; i < n; i++) {
            students[i].display();
        }
    }
}