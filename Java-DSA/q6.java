import java.util.*;


public class q6 {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the low value");
        int low=sc.nextInt();
        System.out.println("enter the high value");
        int high=sc.nextInt();

        for(int i=low;i<=high;i++){
               sum=sum+i;
        }

        System.out.println("value of low to high: "+sum);
    }
}
