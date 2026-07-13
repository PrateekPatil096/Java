import java.util.*;
public class q37 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();

        if((n&1)==0){
            System.out.println("even");
        } else{
            System.out.println("odd");
        }
    }
    
}
