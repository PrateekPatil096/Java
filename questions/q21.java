import java.util.*;
public class q21 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();


        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the number to find");
        int key=sc.nextInt();

        for(int i=0;i<n;i++){
            if(arr[i]==key){
                System.out.println(key+"key found at index"+i);
                return;
            }
            
                }
                System.out.println("key is not found");

    }
    
}
