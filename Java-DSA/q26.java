import java.util.*;
public class q26 {
    public static void main(String[] args) {
        int n=4;

        for(int i=0;i<n;i++){
            char ch= (char)('A' + i);
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    
}
