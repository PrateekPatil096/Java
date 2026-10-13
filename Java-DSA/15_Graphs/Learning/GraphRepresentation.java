import java.util.*;

public class GraphRepresentation {
    public static void main(String[] args) {
        int V = 5;
        
        // Adjacency List
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
        
        // Add edges (undirected)
        addEdge(adjList, 0, 1);
        addEdge(adjList, 0, 4);
        addEdge(adjList, 1, 2);
        addEdge(adjList, 1, 3);
        addEdge(adjList, 1, 4);
        addEdge(adjList, 2, 3);
        addEdge(adjList, 3, 4);
        
        System.out.println("Adjacency List:");
        printGraph(adjList);
        
        // Adjacency Matrix
        int[][] adjMatrix = new int[V][V];
        adjMatrix[0][1] = adjMatrix[1][0] = 1;
        adjMatrix[0][4] = adjMatrix[4][0] = 1;
        adjMatrix[1][2] = adjMatrix[2][1] = 1;
        adjMatrix[1][3] = adjMatrix[3][1] = 1;
        adjMatrix[1][4] = adjMatrix[4][1] = 1;
        adjMatrix[2][3] = adjMatrix[3][2] = 1;
        adjMatrix[3][4] = adjMatrix[4][3] = 1;
        
        System.out.println("\nAdjacency Matrix:");
        printMatrix(adjMatrix);
    }
    
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    
    static void printGraph(ArrayList<ArrayList<Integer>> adj) {
        for (int i = 0; i < adj.size(); i++) {
            System.out.print(i + " -> ");
            for (int node : adj.get(i)) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }
    
    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
