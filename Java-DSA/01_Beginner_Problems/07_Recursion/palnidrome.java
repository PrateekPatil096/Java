import java.util.*;

public class palnidrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        System.out.println(pal(num, 0, num));
      
    }
    public static boolean pal(int n,int rev,int org){
        if(n==0){
            return rev==org;
        }
        rev=rev*10+n%10;
        return pal(n/10,rev,org);
    }
    
}
