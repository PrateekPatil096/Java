public class strings2 {
    public static void main(String[] args) {
        //concatenation 
        String firstName="toji";
        String lastName="zenin";
        String fullName=firstName+" "+lastName;
        System.out.println(fullName);
        System.out.println(fullName.length());
        
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }
    }
    
}
