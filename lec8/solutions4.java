import java.util.*;
public class solutions4 {
    public static int power(int x,int n){
        int result=1;
        for(int i=1;i<=n;i++){
            result=result*x;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x");
        int x=sc.nextInt();
        System.out.println("enter n");
        int n=sc.nextInt();
        int ans=power(x, n);
        System.out.println("result="+ans);
    }
}
