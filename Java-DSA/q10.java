import java.util.*;
public class q10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];

        int start=0;
        int end=size-1;

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }

        System.out.println("reversed array:");

        for(int i=0;i<size;i++){
            System.out.println(arr[i]+" ");
        }

    }
}
