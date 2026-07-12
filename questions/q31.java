import java.util.*;
public class q31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int temp=0;

        System.out.println("enter the elemnts of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("after sorting ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    
}
