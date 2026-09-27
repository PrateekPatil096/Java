import java.util.*;
public class q43 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number 1");
        int n1=sc.nextInt();
        System.out.println("enter the number 2");
        int n2=sc.nextInt();
        int gcd=1;
        for(int i=1;i<=n1 && i<=n2;i++){
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
        }
        System.out.println(gcd);
        
      

    }
    
}
