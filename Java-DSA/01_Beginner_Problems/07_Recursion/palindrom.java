import java.util.Scanner;

public class palindrom {
    public boolean palindromeCheck(String s) {
        //your code goes here
        return check(s,0,s.length()-1);
    }
    public boolean check(String s,int i,int j){
        if(i>=j){
            return true;
        }
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
        return check(s,i+1,j-1);
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the string");
       String s=sc.nextLine();
        palindrom obj = new palindrom();

        boolean ans = obj.palindromeCheck(s);

        System.out.println(ans);
    }
    
}
