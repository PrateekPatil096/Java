public class recursion2_6 {
    public static boolean[]map=new boolean[26];
    public static void removeDuplicates(String str,int idx,String newstring){
        if(idx==str.length()){
            System.out.println(newstring);
            return;
        }
        char currChar=str.charAt(idx);
        if(map[currChar-'a']){
            removeDuplicates(str, idx+1, newstring);
        }
        else{
            newstring+=currChar;
            map[currChar-'a']=true;
            removeDuplicates(str, idx+1, newstring);
        }
    }
    public static void main(String[] args) {
        String str="abbccda";
        removeDuplicates(str, 0, " ");
    }
    
}
