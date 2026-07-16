import java.util.*;

public class q48 {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>();

        tree.add(5);
        tree.add(3);
        tree.add(7);
        tree.add(2);
        tree.add(4);

        if (tree.contains(4)) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
        if (tree.contains(6)) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
    }

}
