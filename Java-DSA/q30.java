import java.util.*;

public class q30 {
    public static void main(String[] args) {
        int n = 4;
        int space = 2 * (n - 1);

        for (int i = 1; i <= n; i++) {

            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // space
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            space = space - 2;
            System.out.println();
        }
        space=0;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            space=space+2;
            System.out.println();

        }
    }

}
