/*
 * INTERVIEW QUESTIONS - String Permutations (Backtracking):
 *
 * Q1: What is a permutation?
 * A: All possible arrangements of elements; n! permutations for n elements
 *
 * Q2: What is backtracking?
 * A: Algorithmic technique that tries solutions incrementally and abandons invalid ones
 *
 * Q3: How many permutations for string of length n?
 * A: n! (factorial of n); "abc" has 3! = 6 permutations
 *
 * Q4: Time complexity of generating permutations?
 * A: O(n * n!) - n! permutations, each takes O(n) to generate
 *
 * Q5: What does substring do here?
 * A: Creates new string excluding character at index i
 *
 * Q6: How is this different from combinations?
 * A: Permutations consider order (abc != bac); combinations don't
 */
public class recadv {
    public static void printPrem(String str,String permutation){
        // Q: Base case - when no characters left to arrange
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        // Q: Why loop through each character? A: Each can be next in permutation
        for(int i=0;i<str.length();i++){
            char curchar=str.charAt(i);  // Pick current character
            // Q: What does this create? A: String without character at index i
            String newStr=str.substring(0,i)+str.substring(i+1);
            // Q: What is backtracking here? A: Exploring all choices by recursion
            printPrem(newStr, permutation+curchar);
        }
    }

    public static void main(String[] args) {
        String str ="abc";
        printPrem(str, "");  // Prints: abc, acb, bac, bca, cab, cba
    }
}
