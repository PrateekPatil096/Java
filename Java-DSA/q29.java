public class q29 {
    public static void main(String[] args) {

        int n = 4;
        int space = 0;

        // Upper half
        for(int i = 0; i < n; i++) {

            for(int j = 0; j < n-i; j++) {
                System.out.print("*");
            }

            for(int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            for(int j = 0; j < n-i; j++) {
                System.out.print("*");
            }

            space = space + 2;
            System.out.println();
        }

        // Lower half
        space = 2 * (n-1);

        for(int i = 0; i < n; i++) {

            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            for(int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            space = space - 2;
            System.out.println();
        }
    }
}