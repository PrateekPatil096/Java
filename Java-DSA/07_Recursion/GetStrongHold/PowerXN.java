import java.util.*;

public class PowerXN {
    public static void main(String[] args) {
        double x = 2.0;
        int n = 10;
        
        double result = myPow(x, n);
        System.out.println(x + "^" + n + " = " + result);
    }
    
    public static double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        return power(x, n);
    }
    
    private static double power(double x, int n) {
        if (n == 0) return 1;
        
        double half = power(x, n / 2);
        
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}
