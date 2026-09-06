import java.util.*;

public class q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("enter the array elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<size;i++){
            System.out.println(+arr[i]);
        }

        String str1 = "prateek"; 
        System.out.println(str1);


    }
    
}
