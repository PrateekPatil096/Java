import java.util.*;
public class q28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first string");
        String s1=sc.nextLine();
        System.out.println("enter the second string ");
        String s2=sc.nextLine();

        if(s1.length()!=s2.length()){
            System.out.println("not anagrams");
            return;
        }
        int []count=new int[26];

        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)-'a']++;
            count[s2.charAt(i)-'a']--;

        }
        boolean anagram=true;

        for(int i=0;i<26;i++){
            if(count[i]!=0){
                anagram=false;
                break;
            }
        }
        if(anagram)
            System.out.println("anagrams");
        else
            System.out.println("not anagrams");

    }
    
}
