public class recursion2_7 {
    public static void seq(String str,int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(idx);
        seq(str, idx+1, newString+currChar);

        seq(str, idx+1, newString);
    }
    public static void main(String[] args) {
        String str="abc";
        seq(str, 0, " ");
    }
    
}
