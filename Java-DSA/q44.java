import java.util.*;
public class q44 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number 1");
        int n1=sc.nextInt();
        System.out.println("enter the number n2");
        int n2=sc.nextInt();
        int lcm=(n1>n2) ? n1:n2;

        while(true){
            if(lcm % n1==0 && lcm % n2==0){
                System.out.println("LCM of entered number is: "+ lcm);
                break;
            }
            ++lcm;
        }

        
    }
    
}
