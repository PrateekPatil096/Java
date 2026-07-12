import java.util.*;
public class q32 {
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
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;


        }
        System.out.println("sorted array");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
    
}
