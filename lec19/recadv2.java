public class recadv2 {
    public static int countPaths(int i,int j,int n,int m){
        if(i==n||j==m){
            return 0;
        }
        if(i==n-1&&j==m-1){
            return 1;
        }
        int downpaths=countPaths(i+1, j, n, m);
        int rightpaths=countPaths(i, j+1, n, m);
        return downpaths+rightpaths;


    }
    public static void main(String[] args) {
        int n=3,m=4;
        int totalpaths=countPaths(0, 0, n, m);
        System.out.println(totalpaths);
    }
    
}
