import java.util.*;
public class q24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("eneter the elemnts of array");
        for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
        }

        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }
        while(j<n){
            arr[j]=0;
            j++;
        }
        System.out.println("array after moving all zeros");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
    
}
