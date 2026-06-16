import java.util.*;


public class q1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int a=sc.nextInt();
        System.out.println("enter the second number");
        int b=sc.nextInt();
        System.out.println("before swapping");
        System.out.println(a);
        System.out.println(b);

        int temp=a;
        a=b;
        b=temp;

        System.out.println("after swapping");
        System.out.println(a);
        System.out.println(b);

    }
}
