import java.util.*;
public class q11 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number");
        int n=sc.nextInt();

        int r=0;

        while(n!=0){
            int digit=n%10;// get last digit
            r=r*10+digit;//add digit to reverse
            n=n/10;//remove last digit
        }
        System.out.println(r);
    }    
}
