import java.util.Scanner;

public class q5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("enter a number: ");
        int n = sc.nextInt();
        int sign;

        if (n > 0)
            sign = 1;

        else if (n < 0)
            sign = -1;

        else
            sign = 0;

        switch (sign){
            case 1:
                System.out.println("positive number");
                break;

            case -1:
                System.out.println("negative number");
                break;

            case 0:
                System.out.println("zero");
                break;
        }

       
    }
}