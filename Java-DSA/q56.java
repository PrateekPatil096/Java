import java.util.*;

public class q56 {
    public static void main(String[] args) {

        String[] str = {"lady", "lazy"};

        String prefix = str[0];

        for (int i = 1; i < str.length; i++) {

            while (!str[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    System.out.println("");
                    return;
                }
            }
        }

        System.out.println(prefix);
    }
}