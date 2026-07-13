import java.util.*;
import java.util.Scanner;
public class q38 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number");
        int n=sc.nextInt();
        int count=0;

        while(n>0){
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        System.out.println("number of sets bits is "+ count);
    }
    
}
