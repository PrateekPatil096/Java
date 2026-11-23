

public class countzeros {
    public static void main(String[] args) {
       System.out.println(countzero(101050));
    }

    public static int countzero(int n){
        return helper(n,0);
    }

    private static int helper(int n,int c){
        if(n==0){
            return c;
        }
        int digit=n%10;
        if(digit==0){
            return helper(n/10,c+1);
        }
        return helper(n/10, c);
    }
    
}
