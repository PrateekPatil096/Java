import java.util.*;
public class Pattern17_ReverseAlphabet {
    public static void main(String[] args) {
        int n=4;

        for(int i=0;i<n;i++){
            for(char ch=(char)('E'-i);ch<='E';ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    
}
