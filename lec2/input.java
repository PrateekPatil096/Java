import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);   
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();          
        
        System.out.println("Your name is: " + name);   
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println(sum);
        
    }
}
