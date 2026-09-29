import java.util.*;
public class q46 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int sum=0;

        int [] arr=new int[size];
        System.out.println("enter the array elements: ");

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
    
}
