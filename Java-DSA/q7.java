import java.util.*;
public class q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the last digit");
        int d=sc.nextInt();
         int sum = 0;
        int count = 0;
        int num = 1;
        
        while (count < 50) {
            if (num % 10 == d) {
                sum = sum + num;
                count = count + 1;
            }
            num = num + 1;
        }
        
        System.out.println(sum);

        
        
    }
    
}
