import java.util.*;

public class stringb {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("toji");
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        sb.setCharAt(0,'o');
        System.out.println(sb);

        sb.insert(0,'s');
        System.out.println(sb);

        sb.delete(2,3);
        System.out.println(sb);
    }

}
