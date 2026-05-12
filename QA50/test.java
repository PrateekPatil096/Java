// import java.util.*;

// public class test {
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         int n=sc.nextInt();
//         int x=0;

//        for(int i=1;i<=n;i++){
//         if(n%i==0){
//             x++;
//         }
//     }
//     if(x==2){
//         System.out.println("prime");
//     }
//     else{
//         System.out.println("not prime");
//     }
        
       

       
//     }
// }


import java.util.*;

// Class name
public class Test {

    // Main method - execution starts from here
    public static void main(String[] args) {

        // Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Read number from user
        int n = sc.nextInt();

        // Assume number is prime initially
        boolean isPrime = true;

        // Numbers less than or equal to 1 are not prime
        if (n <= 1) {
            isPrime = false;
        } 
        else {

            // Loop from 2 to square root of n
            // We check divisibility only till sqrt(n)
            for (int i = 2; i <= Math.sqrt(n); i++) {

                // If n is divisible by i
                // then n is not prime
                if (n % i == 0) {

                    isPrime = false;

                    // Stop loop immediately
                    break;
                }
            }
        }

        // Print result
        if (isPrime) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }


        /*
        =========================
              DRY RUN EXAMPLE
        =========================

        Example Input:
        7

        Step 1:
        n = 7

        Step 2:
        isPrime = true

        Step 3:
        Check if n <= 1

        7 <= 1 → false

        So program enters else block.


        Step 4:
        Loop starts

        for(int i = 2; i <= Math.sqrt(7); i++)

        Math.sqrt(7) ≈ 2.64

        So loop runs only for:
        i = 2


        Step 5:
        Check divisibility

        7 % 2 == 0

        Result:
        1 == 0 → false

        So 7 is not divisible by 2.


        Step 6:
        Loop ends

        isPrime is still true


        Step 7:
        Output:

        prime


        =========================
           ANOTHER EXAMPLE
        =========================

        Input:
        8

        Loop:
        i = 2

        8 % 2 == 0 → true

        So:
        isPrime = false

        break statement stops loop.


        Output:
        not prime


        =========================
            IMPORTANT POINT
        =========================

        Prime Number:
        A number having exactly 2 factors:
        1 and itself.

        Examples:
        Prime → 2, 3, 5, 7, 11
        Not Prime → 4, 6, 8, 9

        */
    }
}
