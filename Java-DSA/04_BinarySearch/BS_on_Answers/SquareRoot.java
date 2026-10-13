import java.util.*;

public class SquareRoot {
    public static void main(String[] args) {
        int n = 36;
        int result = sqrt(n);
        System.out.println("Square root of " + n + " is: " + result);
    }
    
    public static int sqrt(int n) {
        if (n == 0 || n == 1) return n;
        
        int left = 1, right = n, ans = 0;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if ((long) mid * mid == n) {
                return mid;
            } else if ((long) mid * mid < n) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return ans;
    }
}
