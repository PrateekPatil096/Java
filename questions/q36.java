import java.util.*;
public class q36 {

    static int fun(int n){
        if(n==0)
            return 0;
        
        else
            fun(n-1);
        System.out.print(n+" ");
        return n;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int x=sc.nextInt();

        fun(x);
    }
    
}
