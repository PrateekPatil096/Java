import java.util.*;
public class q40 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
         System.out.println("enter the rows");
        int n=sc.nextInt();
        System.out.println("enter the col");
        int m=sc.nextInt();
        int sum=0;

        int arr[][]=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum=sum+arr[i][j];
            }
        }
        System.out.println(sum);
    }
    
}
