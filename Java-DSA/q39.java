import java.util.*;
public class q39 {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int original=n;
        int digit;
        int sum=0;

        while(n>0){
            digit=n%10;
            n=n/10;
            sum=sum + digit * digit * digit;
        }
        if(original==sum){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
    
}
