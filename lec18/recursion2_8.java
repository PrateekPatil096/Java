import java.util.HashSet;
public class recursion2_8 {
    
public static void seq(String str,int idx,String newString,HashSet<String>set){
        if(idx==str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
            
        }
        char currChar=str.charAt(idx);
        seq(str, idx+1, newString+currChar,set);

        seq(str, idx+1, newString,set);
    }
    public static void main(String[] args) {
        String str="aaa";
        HashSet<String> set=new HashSet<>();
        seq(str, 0, " ",set);
    }
    
}
