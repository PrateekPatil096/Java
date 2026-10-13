import java.util.*;
public class IsomorphicStrings {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the first string ");
        String s1=sc.nextLine();
        System.out.println("enetr the second string");
        String s2=sc.nextLine();

        if(s1.length()!=s2.length()){
                System.out.println("false");
                return;
            }

            int []a=new int [256];
            int []b=new int [256];

            for(int i=0;i<s1.length();i++){
                if(a[s1.charAt(i)]!=b[s2.charAt(i)]){
                    System.out.println("false");
                    return ;

                }
                a[s1.charAt(i)]=i+1;
                b[s2.charAt(i)]=i+1;
            }
            System.out.println("true");

    }
    
}
