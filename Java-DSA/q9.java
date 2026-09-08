import java.util.*;
public class q9 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int a=10;
        change(a);

        System.out.println(a);

        System.out.println("enter the number");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            System.out.println(i);
            i++;
        }

    }

    static void change(int x){
        x=100;
        System.out.println(x);
    }
    
}
