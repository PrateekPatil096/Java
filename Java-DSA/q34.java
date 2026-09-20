import java.util.*;
public class q34 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int x=0;

        while(n>0){
            int digit=n%10;
            x=x*10+digit;
            n=n/10;
        }
        System.out.println(x);
    }
    
}
