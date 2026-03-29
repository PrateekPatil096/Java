import java.lang.module.FindException;
import java.util.*;
public class recadv5 {
    public static void printsubset(ArrayList<Integer>subset){
        for(int i=-0;i<subset.size();i++){
            System.out.println(subset.get(i)+"");
        }
         System.out.println();
    }
       
        public static void findsubset(int n,ArrayList<Integer>subset){
            if(n==0){
                printsubset(subset);
                return;
            }
            subset.add(n);
            findsubset(n-1, subset);
            subset.remove(subset.size()-1);
            findsubset(n-1, subset);

        }
        public static void main(String[] args) {
            int n=3;
            ArrayList<Integer>subset=new ArrayList<>();
            findsubset(n, subset);
        }
    
}
