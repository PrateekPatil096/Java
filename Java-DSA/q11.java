import java.util.*;
public class q11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();

        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int j=0;
         for(int i=0;i<size;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
         }
         System.out.println("print array");
         for(int i=0;i<size;i++){
            System.out.println(arr[i]+" ");
         }
    }
    
}
