import java.util.*;
public class q14 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int fibo=0;
        int b=1;
        int c;
        for(int i=0;i<=n;i++){
            System.out.print(fibo+" ");

            c=fibo+b;
            fibo=b;
            b=c;

        }


    }
}
