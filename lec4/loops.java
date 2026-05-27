/*
 * INTERVIEW QUESTIONS - Types of Loops in Java:
 *
 * Q1: What are the three types of loops in Java?
 * A: for loop, while loop, do-while loop
 *
 * Q2: What is the difference between while and do-while?
 * A: while checks condition first (entry-controlled), do-while executes at least once (exit-controlled)
 *
 * Q3: When to use which loop?
 * A: for - known iterations, while - unknown iterations, do-while - execute at least once
 *
 * Q4: What is i++ vs ++i?
 * A: Post-increment returns then increments; pre-increment increments then returns
 *
 * Q5: Can a loop run infinitely?
 * A: Yes, if condition never becomes false (e.g., while(true))
 *
 * Q6: What is the difference between i=i+1 and i++?
 * A: Functionally same, but i++ is more concise and commonly used
 */
public class loops {
    public static void main(String args[]){
        // FOR LOOP - best when number of iterations is known
        // Q: What is i=i+1 equivalent to? A: i++ (post-increment)
        for(int i=0;i<11;i=i+1){
            System.out.println("toji");
        }

        // Q: What's the difference between these two for loops?
        // A: Second uses i++ shorthand instead of i=i+1
        for(int j=0;j<11;j++){
            System.out.println(j+" ");

        }

        // WHILE LOOP - entry-controlled, checks condition before executing
        // Q: What if k was never incremented? A: Infinite loop
        int k=0;
        while(k<11){
            System.out.println(k);
            k++;  // Q: What happens if we forget this? A: Infinite loop
         }

         // DO-WHILE LOOP - exit-controlled, executes at least once
         // Q: Will this execute if h starts at 100? A: Yes, at least once
         int h=0;
         do{
            System.out.println(h);
            h++;
         }while(h<11);  // Note: semicolon required after while

    }

}
