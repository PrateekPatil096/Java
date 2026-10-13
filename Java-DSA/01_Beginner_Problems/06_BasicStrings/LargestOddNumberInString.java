import java.util.*;

public class LargestOddNumberInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string ");
        String s1 = sc.nextLine();

        for (int i = s1.length() - 1; i >= 0; i--) {
            if ((s1.charAt(i) - '0') % 2 != 0) {
                String s2 = s1.substring(0, i + 1);

                while (s2.startsWith("0")) {
                    s2 = s2.substring(1);

                }
                System.out.println(s2);
                break;

            }

        }
    }

}
