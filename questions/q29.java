import java.util.*;
public class q29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr the string");
        String str=sc.nextLine();
         
        int count;
        for(int i=0;i<str.length();i++){
            count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count ==1){
                System.out.println("first non-repeating "+str.charAt(i));
                return;
            }
        }
        System.out.println("non-repeating ");
    }
    
}
