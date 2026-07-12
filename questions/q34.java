import java.util.*;

public class q34 {
    static int sum(int n) {
        if(n<=0){
            return 0;
        }else{
            return n+sum(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int x=sc.nextInt();

        if(x<0){
            System.out.println("negative numbers cant");
        }else{
            System.out.println(sum(x));
        }
    }

}
