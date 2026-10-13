import java.util.*;

public class KruskalMST {
    
    static int[] parent, rank;
    
    public static void main(String[] args) {
        int V = 4;
        int[][] edges = {
            {0, 1, 10},
            {0, 2, 6},
            {0, 3, 5},
            {1, 3, 15},
            {2, 3, 4}
        };
        
        int mstWeight = kruskal(V, edges);
        System.out.println("MST total weight: " + mstWeight);
    }
    
    static int kruskal(int V, int[][] edges) {
        parent = new int[V];
        rank = new int[V];
        
        for (int i = 0; i < V; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
        
        // Sort edges by weight
        Arrays.sort(edges, (a, b) -> a[2] - b[2]);
        
        int mstWeight = 0;
        int edgeCount = 0;
        
        System.out.println("Edges in MST:");
        
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int weight = edge[2];
            
            if (find(u) != find(v)) {
                union(u, v);
                mstWeight += weight;
                edgeCount++;
                System.out.println(u + " -- " + v + " : " + weight);
                
                if (edgeCount == V - 1) break;
            }
        }
        
        return mstWeight;
    }
    
    static int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }
    
    static void union(int x, int y) {
        int px = find(x);
        int py = find(y);
        
        if (rank[px] < rank[py]) {
            parent[px] = py;
        } else if (rank[px] > rank[py]) {
            parent[py] = px;
        } else {
            parent[py] = px;
            rank[px]++;
        }
    }
}
