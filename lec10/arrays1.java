/*
 * INTERVIEW QUESTIONS - Arrays in Java:
 *
 * Q1: What is an array?
 * A: Collection of elements of same type stored in contiguous memory
 *
 * Q2: How to declare and initialize array in Java?
 * A: int[] arr = new int[size]; or int[] arr = {1, 2, 3};
 *
 * Q3: What is the default value of int array elements?
 * A: 0 (for numeric types), null for objects, false for boolean
 *
 * Q4: How to access array element?
 * A: Using index: arr[0], arr[1], etc. Index starts from 0
 *
 * Q5: What happens if we access invalid index?
 * A: ArrayIndexOutOfBoundsException at runtime
 *
 * Q6: Is array size fixed in Java?
 * A: Yes, once created, array size cannot be changed
 */

public class arrays1 {
    public static void main(String[] args) {
        // Q: What does 'new int[3]' do? A: Creates array of 3 integers in heap memory
        int [] marks=new int[3];

        // Q: What is array indexing? A: Accessing elements using position (0-based)
        marks[0]=90;
        marks[1]=98;
        marks[2]=96;

        // Individual access
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        // Q: What is array traversal? A: Visiting each element using loop
        for(int i=0;i<3;i++){
            System.out.println(marks[i]);
          }

    }

}
