import java.util.*;

public class AssignCookies {
    public static void main(String[] args) {
        int[] g = {1, 2, 3};  // greed factor
        int[] s = {1, 1};     // cookie sizes
        
        int result = findContentChildren(g, s);
        System.out.println("Content children: " + result);
    }
    
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        
        int child = 0;
        int cookie = 0;
        
        while (child < g.length && cookie < s.length) {
            if (s[cookie] >= g[child]) {
                child++;
            }
            cookie++;
        }
        
        return child;
    }
}
