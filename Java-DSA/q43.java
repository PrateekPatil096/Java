import java.util.*;
public class q43 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number 1");
        int n1=sc.nextInt();
        System.out.println("enter the number 2");
        int n2=sc.nextInt();
        
       while (n2!=0) {
        int temp=n2;
        n2=n1%n2;
        n1=temp;
       }
       System.out.println("GCD:"+ n1);

    }
    
}
