import java.util.*;


public class q12 {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);

        System.out.println("enter the number");
        int n=sc.nextInt();
        
        int original=n;
        int reverse=0;

        while(n!=0){
        
            int digit=n%10;
            reverse=reverse*10+digit;
            n=n/10;
        }
        if(original==reverse){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palnidrome");
        }
    }
    
}
