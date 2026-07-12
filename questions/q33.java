import java.util.*;
public class q33 {
    static long fact(int n){
        if(n==0||n==1){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number ");
        int num=sc.nextInt();

        if(num<0){
            System.out.println("negative numbers factorial cannot be found");
        } else{
            System.out.println("factorial of number "+num+" is " +fact(num));
        }
    }
    
}
