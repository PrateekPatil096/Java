import java.util.*;
public class q45 {
    public static boolean isvalid(String s){
        Stack<Character> stack=new Stack<>();

        for(char c:s.toCharArray()){
            if(c=='(')
                stack.push(')');

            else if(c=='{')
                stack.push('}');

            else if(c=='[')
                stack.push(']');

            else if(stack.isEmpty()|| stack.pop()!=c)
                return false;
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("enter the expression");
        String s=sc.nextLine();

        if(isvalid(s))
            System.out.println("balanced");
        else
            System.out.println("not balanced");
    }
    
}
