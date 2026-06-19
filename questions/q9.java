import java.util.*;
public class q9 {
    public static void main(String args[]){
    Scanner sc=new Scanner (System.in);

        System.out.println("enter the number");
        int n=sc.nextInt();
       int m=1;
        for(int i=1;i<=10;i++){

            m=n*i;
           System.out.println(n + " x " + i + " = "+ m);
        }
    }

}
