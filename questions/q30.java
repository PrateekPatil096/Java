import java.util.*;
public class q30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the string");
        String str=sc.nextLine();

        String result="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' '){
                result=result+ch;
            }

        }
        System.out.println("string without spaces  "+ result);
    }
    
}
