import java.util.*;
public class q45 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+",");
            }
        }
    }
    
}
