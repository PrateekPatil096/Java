/*
 * INTERVIEW QUESTIONS - Graph Representation:
 *
 * Q1: What is a Graph?
 * A: Collection of vertices (nodes) connected by edges
 *
 * Q2: What are the two main ways to represent graphs?
 * A: Adjacency Matrix and Adjacency List
 *
 * Q3: When to use Adjacency List?
 * A: For sparse graphs (few edges); saves space O(V + E)
 *
 * Q4: When to use Adjacency Matrix?
 * A: For dense graphs; faster edge lookup O(1) but O(V^2) space
 *
 * Q5: What is a weighted graph?
 * A: Graph where edges have associated weights/costs
 *
 * Q6: What is the Edge class storing?
 * A: Source vertex, destination vertex, and weight
 *
 * Q7: Difference between directed and undirected graph?
 * A: Directed has one-way edges; undirected has two-way edges
 */
import java.util.ArrayList;

public class graphh {

    // Q: What does Edge class represent? A: A connection between two vertices
    static class Edge {
        int src;    // Source vertex
        int dest;   // Destination vertex
        int wt;     // Weight of edge

        public Edge(int s, int d,int w) {
            this.src = s;
            this.dest = d;
            this.wt=w;
        }
    }

    // Q: What is Adjacency List?
    // A: Array of ArrayLists; graph[i] contains all edges from vertex i
    public static void createGraph(ArrayList<Edge> graph[]) {

        // Q: Why initialize each index? A: Array elements are null by default
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        // Q: How to add edge from 0 to 2 with weight 2?
        // A: Add Edge object to graph[0]'s list
        graph[0].add(new Edge(0, 2,2));

        // Vertex 1 edges
        graph[1].add(new Edge(1, 2, 10));
        graph[1].add(new Edge(1, 3, 0));

        // Q: This is directed graph - for undirected, add reverse edges too
        // Vertex 2 edges
        graph[2].add(new Edge(2, 0,2));
        graph[2].add(new Edge(2, 1,10));
        graph[2].add(new Edge(2, 3,-1));  // Q: Can weights be negative? A: Yes, in some algorithms

        // Vertex 3 edges
        graph[3].add(new Edge(3, 1,0));
        graph[3].add(new Edge(3, 2,-1));
    }

    public static void main(String args[]) {

        int V = 4;  // Q: What is V? A: Number of vertices

        // Q: What is this creating? A: Array of ArrayLists (adjacency list)
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        // Q: How to get all neighbors of vertex 2?
        // A: Iterate through graph[2]
        for(int i=0;i<graph[2].size();i++){
            Edge e=graph[2].get(i);
            System.out.println(e.dest+" "+e.wt);
        }


    }
}
