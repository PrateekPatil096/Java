/*
 * INTERVIEW QUESTIONS - StringBuilder in Java:
 *
 * Q1: What is StringBuilder?
 * A: Mutable sequence of characters; allows modification without creating new objects
 *
 * Q2: Why use StringBuilder over String?
 * A: More efficient for frequent modifications (no new object creation each time)
 *
 * Q3: What is the difference between StringBuilder and StringBuffer?
 * A: StringBuilder is not thread-safe (faster); StringBuffer is synchronized (thread-safe)
 *
 * Q4: What does setCharAt() do?
 * A: Replaces character at given index with new character
 *
 * Q5: What does insert() do?
 * A: Inserts characters/string at specified position, shifting existing content
 *
 * Q6: What does delete(start, end) do?
 * A: Removes characters from startIndex to endIndex-1
 */
import java.util.*;

public class stringb {
    public static void main(String[] args) {

        // Q: Is StringBuilder mutable? A: Yes, unlike String
        StringBuilder sb = new StringBuilder("toji");
        System.out.println(sb);  // toji

        // Q: What does charAt return? A: Character at index 0 = 't'
        System.out.println(sb.charAt(0));

        // Q: Can we modify StringBuilder in place? A: Yes!
        sb.setCharAt(0,'o');  // Changes 't' to 'o'
        System.out.println(sb);  // oji

        // Q: Where does insert add the character? A: At index 0 (beginning)
        sb.insert(0,'s');  // Adds 's' at start
        System.out.println(sb);  // soji

        // Q: What does delete(2,3) remove? A: Character at index 2
        sb.delete(2,3);  // Removes character at index 2
        System.out.println(sb);
    }

}
