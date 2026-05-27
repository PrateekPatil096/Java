/*
 * INTERVIEW QUESTIONS - Prime Number Check:
 *
 * Q1: What is a prime number?
 * A: Number greater than 1 with exactly 2 factors: 1 and itself
 *
 * Q2: How to check if a number is prime?
 * A: Count divisors; if exactly 2, it's prime
 *
 * Q3: Time complexity of this approach?
 * A: O(n) - checking all numbers from 1 to n
 *
 * Q4: Can we optimize?
 * A: Yes, check only up to sqrt(n); O(sqrt(n))
 *
 * Q5: Why is 1 not prime?
 * A: By definition, primes have exactly 2 distinct factors; 1 has only 1
 *
 * Q6: What are the first few primes?
 * A: 2, 3, 5, 7, 11, 13, 17, 19, 23...
 *
 * Q7: What is the only even prime?
 * A: 2 (all other even numbers divisible by 2)
 */
import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int x=0;  // Q: What is x? A: Counter for number of divisors

        // Q: What does this loop count? A: All divisors of n
       for(int i=1;i<=n;i++){
        // Q: What does n%i==0 check? A: If i divides n evenly
        if(n%i==0){
            x++;  // Found a divisor
        }
    }

    // Q: Why check x==2?
    // A: Prime numbers have exactly 2 divisors (1 and itself)
    if(x==2){
        System.out.println("prime");
    }
    else{
        System.out.println("not prime");
    }

    }
}
