import java.util.*;
public class q19 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int size=sc.nextInt();
        int arr[]=new int[size];

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int largest=arr[0];
        int secondlargest=arr[0];

        for(int i=1;i<size;i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }
            else if (arr[i]>secondlargest &&arr[i]!=largest) {
                secondlargest=arr[i];
                
            }
        }
        System.out.println("second largest  " + secondlargest);

    }
    
}
