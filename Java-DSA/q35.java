import java.util.*;
public class q35 {
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int count=0;
        
        while(n>0){
            int digit=n%10;
            if(digit % 2 !=0){
                count++;
            }
            else{
                break;
            }
            n=n/10;
            
        }
        System.out.println(count);
    }
    
}
