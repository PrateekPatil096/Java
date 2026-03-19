public class strings3 {
    public static void main(String[] args) {
        String name1="toji";
        String name2="zenin";
        if(name1.compareTo(name2)==0){
            System.out.println("strings are equal");
        }else{
            System.out.println("strings are not equal");
        }
        String sentence="my name is toji";
        String name=sentence.substring(3,8);
        System.out.println(name);
    }
    
}
