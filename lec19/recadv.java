public class recadv {
    public static void printPrem(String str,String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curchar=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            printPrem(newStr, permutation+curchar);
        }
    }
    public static void main(String[] args) {
        String str ="abc";
        printPrem(str, "");
    }
}
