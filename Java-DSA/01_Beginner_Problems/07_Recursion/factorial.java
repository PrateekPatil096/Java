import java.util.*;

public class factorial {
    public static  long fact(int N){
        if(N==0||N==1){
            return 1;
        }
        return N *fact(N-1);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        System.out.println(fact(n));
        
    }
    
}
