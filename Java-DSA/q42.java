import java.util.*;
public class q42 {
    public static void main(String []args){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int count=0;

        for(int i=2;i<=n;i++){
          int factors=0;

          for(int j=1;j<=i;j++){
            if(i%j==0){
                factors++;
            }
          }
          if(factors==2){
            count++;
          }
        }

        System.out.println(count);


    }
    
}
