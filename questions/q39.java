import java.util.*;
public class q39 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the rows");
        int n=sc.nextInt();
        System.out.println("enter the col");
        int m=sc.nextInt();

        int arr[][]=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("matrix printing");


        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    
}
