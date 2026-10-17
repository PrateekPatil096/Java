import java.util.*;
public class validAnagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first string");
        String s=sc.nextLine();

        System.out.println("enter the second string");
        String t=sc.nextLine();

        if(s.length()!=t.length()){
            System.out.println("false");
            return;
        }

        char a[]=s.toCharArray();
        char b[]=t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println(Arrays.equals(a, b));

    }
    
}
