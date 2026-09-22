import java.util.*;
public class q37 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number ");
        int n=sc.nextInt();
        int max=0;

        while(n>0){
            int digit=n%10;

            if(digit>max){
                max=digit;
            }
            n=n/10;
        }
        System.out.println(max);
    }
    
}
