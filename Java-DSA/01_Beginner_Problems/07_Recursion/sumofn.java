import java.util.*;

public class sumofn {

    public static int numbersum(int N){
        if(N==0){
            return 0;
        }
        return N+ numbersum(N-1);


    }
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(numbersum(n));
    }
    
}
