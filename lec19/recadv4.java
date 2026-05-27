/*
 * INTERVIEW QUESTIONS - Friends Pairing Problem:
 *
 * Q1: What is the Friends Pairing problem?
 * A: Count ways n friends can remain single or pair up
 *
 * Q2: What are the choices for each person?
 * A: Stay single OR pair with any of (n-1) other people
 *
 * Q3: What is the recurrence relation?
 * A: f(n) = f(n-1) + (n-1) * f(n-2)
 *
 * Q4: Why multiply by (n-1)?
 * A: Current person can pair with any of (n-1) others
 *
 * Q5: Time complexity?
 * A: O(2^n) naive; O(n) with memoization
 *
 * Q6: Similar to which problem?
 * A: Fibonacci-like; also related to derangements
 */
public class recadv4 {
    public static int callguest(int n){
        // Q: Base case - 0 or 1 person
        if(n<=1){
            return 1;  // Only one way (stay single)
        }
        // Q: Choice 1: Current person stays single
        int way1=callguest(n-1);

        // Q: Choice 2: Current person pairs with one of (n-1) others
        // (n-1) ways to choose partner * ways to arrange remaining (n-2)
        int way2=(n-1)*callguest(n-2);

        return way1+way2;
    }

    public static void main(String[] args) {
        int n=4;  // 4 friends
        System.out.println(callguest(n));  // Output: 10
    }

}
