import java.util.*;

public class solutions2 {
    public static int greater(int a, int b) {
        if (a > b) {
            System.out.println("a is greater thean b" + a);
        } else {
            System.out.println("b is greater than a " + b);

        }
        return 1;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        greater(a, b);
    }
}
