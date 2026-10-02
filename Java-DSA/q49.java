import java.util.*;
public class q49 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
       
        System.out.println("enter the elments of array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
       System.out.println("reversed array");

       for(int i=arr.length-1;i>=0;i--){
        System.out.println(arr[i]);
       }


    }
    
}
