public class recursion2_5 {
    
    public static void MoveALLX(String str,int idx,int count,String newString){
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(idx);
        if(currChar=='x'){
            count++;
            MoveALLX(str,idx+1,count,newString);
        }else{
            newString+=currChar;
            MoveALLX(str,idx+1,count,newString);
        }
    }
    public static void main(String[] args) {
        String str="axbcxxd";
        MoveALLX(str,0,0,"");
    }
}
