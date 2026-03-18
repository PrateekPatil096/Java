import java.util.*;

public class multi {
    public static int calculateProudct(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("product of two numbersis="+calculateProudct(a, b));
    }
}
