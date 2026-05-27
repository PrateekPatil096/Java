/*
 * INTERVIEW QUESTIONS - String Operations:
 *
 * Q1: What is String concatenation?
 * A: Joining two or more strings using + operator or concat() method
 *
 * Q2: What does length() method return?
 * A: Number of characters in the string (not index of last char)
 *
 * Q3: What does charAt(i) return?
 * A: Character at index i (0-based indexing)
 *
 * Q4: What happens if charAt() index is out of bounds?
 * A: StringIndexOutOfBoundsException
 *
 * Q5: Time complexity of length()?
 * A: O(1) - length is stored as a field
 *
 * Q6: How to traverse a string character by character?
 * A: Use for loop with charAt() or convert to char array
 */
public class strings2 {
    public static void main(String[] args) {
        // Q: Where are these strings stored? A: String Pool (literals)
        String firstName="toji";
        String lastName="zenin";

        // Q: What creates the space between names? A: " " string in concatenation
        String fullName=firstName+" "+lastName;
        System.out.println(fullName);

        // Q: What will length() return for "toji zenin"? A: 10 (including space)
        System.out.println(fullName.length());

        // Q: How to iterate through each character? A: Loop with charAt()
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }
    }

}
