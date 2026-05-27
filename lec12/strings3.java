/*
 * INTERVIEW QUESTIONS - String Comparison and Substring:
 *
 * Q1: What does compareTo() return?
 * A: 0 if equal, negative if s1 < s2, positive if s1 > s2 (lexicographically)
 *
 * Q2: Difference between compareTo() and equals()?
 * A: compareTo() returns int for ordering; equals() returns boolean for equality
 *
 * Q3: What is substring()?
 * A: Returns portion of string from startIndex to endIndex-1
 *
 * Q4: Is endIndex inclusive in substring()?
 * A: No, it's exclusive. substring(3,8) gets chars at index 3,4,5,6,7
 *
 * Q5: What if you call substring with invalid indices?
 * A: StringIndexOutOfBoundsException
 *
 * Q6: Time complexity of substring()?
 * A: O(n) - creates new string in Java 7+
 */
public class strings3 {
    public static void main(String[] args) {
        String name1="toji";
        String name2="zenin";

        // Q: What does compareTo return? A: Difference of first differing characters
        // Q: Why not use == ? A: == compares references, not content
        if(name1.compareTo(name2)==0){
            System.out.println("strings are equal");
        }else{
            System.out.println("strings are not equal");
        }

        String sentence="my name is toji";
        // Q: What indices are included? A: 3, 4, 5, 6, 7 (endIndex exclusive)
        String name=sentence.substring(3,8);  // "name "
        System.out.println(name);
    }

}
