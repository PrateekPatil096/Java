import java.util.*;
public class q47 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int count=0;

        int arr[]=new int[size];

        System.out.println("enter the elements of array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<size;i++){
            if(arr[i]%2!=0){
                count++;
            }

        }
        System.out.println(count);



    }
    
}
