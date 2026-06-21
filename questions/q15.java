import java.util.*;
public class q15 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the first number");
        int a=sc.nextInt();
        System.out.println("enter the secomd number");
        int b=sc.nextInt();

        while(b !=0) {
            int r=a%b;
            a=b;
            b=r;
        }
        System.out.println("GDC  "+ a);
    }
}
