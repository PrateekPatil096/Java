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

        linearSearch(arr,size);


    }

    public static void linearSearch(int arr[],int size){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the target to search");
        int target=sc.nextInt();
        int index=-1;
        for(int i=0;i<size;i++){
            if(arr[i]==target){
                index=i;
                break;
            }
        }
        if(index!=-1){
            System.out.println("found and index:" +index);

        }else{
            System.out.println("element not found");
        }
       
       
    }
}
