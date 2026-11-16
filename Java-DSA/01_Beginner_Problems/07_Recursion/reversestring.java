import java.util.*;

class Main {

    static void reverse(ArrayList<Character> list, int i) {

        if (i < 0) {
            return;
        }

        System.out.print(list.get(i));

        reverse(list, i - 1);
    }

    public static void reversestring(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String s = sc.nextLine();

        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }

        reverse(list, list.size() - 1);
    }
}