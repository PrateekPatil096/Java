import java.util.*;
public class soultions3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        int p=0,ne=0,z=0;
        char ch='y';
        while(ch=='y'){
            System.out.print("enter the number");
            n=sc.nextInt();
            if(n>0)
                p++;
            else if(n<0)
                ne++;
            else
                z++;
            System.out.println("contiune y/n");
            ch=sc.next().charAt(0);

        }
        System.out.println(p);
        System.out.println(ne);
        System.out.println(z);
    }
}
