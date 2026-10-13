import java.util.*;

public class DetectCycleDirected {
    public static void main(String[] args) {
        int V = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        
        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(3).add(1); // Creates a cycle
        
        boolean hasCycle = detectCycle(adj, V);
        System.out.println("Graph has cycle: " + hasCycle);
    }
    
    static boolean detectCycle(ArrayList<ArrayList<Integer>> adj, int V) {
        boolean[] visited = new boolean[V];
        boolean[] inStack = new boolean[V];
        
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (dfs(i, adj, visited, inStack)) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    static boolean dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited, boolean[] inStack) {
        visited[node] = true;
        inStack[node] = true;
        
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                if (dfs(neighbor, adj, visited, inStack)) {
                    return true;
                }
            } else if (inStack[neighbor]) {
                return true;
            }
        }
        
        inStack[node] = false;
        return false;
    }
}
