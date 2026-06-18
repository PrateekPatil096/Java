import java.util.*;

public class q8 {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
         
        System.out.println("enetr the number ");
        int n=sc.nextInt();
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        System.out.println("factorial of number. "+f);
    }
}
