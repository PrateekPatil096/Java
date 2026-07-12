import java.util.*;

public class q35 {
    static int fibo(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        else 
            return fibo(n-1)+fibo(n-2);
            
         }
         public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.println("enter the number");
            int x=sc.nextInt();

            for(int i=0;i<x;i++){
                System.out.print(fibo(i)+" ");
            }
         }

}
