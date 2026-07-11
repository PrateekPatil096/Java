import java.util.*;
public class q23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elments of array");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.println(arr[i]);
            }
        }
    }
    
}
