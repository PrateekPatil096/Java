import java.util.*;
public class q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();

        int array[]=new int[size];

        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }

        reversearray(array, size);
        
    }

    public static void reversearray(int array[],int size){
        for(int i=size-1;i>=0;i--){
            System.out.println(array[i]);
        }
        return ;
    }
    
}
