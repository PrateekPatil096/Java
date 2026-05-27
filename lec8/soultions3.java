/*
 * INTERVIEW QUESTIONS - Count Positive, Negative, Zero Numbers:
 *
 * Q1: What is a counter variable?
 * A: Variable that tracks count of occurrences (p, ne, z here)
 *
 * Q2: What is user-controlled loop?
 * A: Loop that continues based on user input (y/n to continue)
 *
 * Q3: What does charAt(0) do?
 * A: Gets first character from a string
 *
 * Q4: Why use while loop here?
 * A: Unknown number of iterations, depends on user choice
 *
 * Q5: What is the difference between next() and nextLine()?
 * A: next() reads one word, nextLine() reads entire line
 *
 * Q6: How to handle both uppercase and lowercase y/n?
 * A: Use ch=='y' || ch=='Y' or Character.toLowerCase(ch)
 */
import java.util.*;
public class soultions3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        int p=0,ne=0,z=0;  // Q: What are these? A: Counters for positive, negative, zero
        char ch='y';

        // Q: What type of loop is this? A: User-controlled while loop
        while(ch=='y'){
            System.out.print("enter the number");
            n=sc.nextInt();
            // Q: What are the three cases for any integer?
            // A: Positive (>0), Negative (<0), or Zero (==0)
            if(n>0)
                p++;  // Increment positive counter
            else if(n<0)
                ne++;  // Increment negative counter
            else
                z++;  // Increment zero counter
            System.out.println("contiune y/n");
            ch=sc.next().charAt(0);  // Q: Why charAt(0)? A: Get single character from string

        }
        System.out.println(p);
        System.out.println(ne);
        System.out.println(z);
    }
}
