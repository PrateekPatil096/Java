import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class graphh2 {

    // Edge class represents a connection between two vertices, with a weight
    static class Edge {
        int src;    // Source vertex
        int dest;   // Destination vertex
        int wt;     // Weight of edge

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    // Create graph as adjacency list
    public static void createGraph(ArrayList<Edge> graph[]) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        // use weight = 1 (or any value) just to fill wt
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));
    }

    // BFS traversal from source 0
    public static void bfs(ArrayList<Edge> graph[], int V,boolean vis[],int start) {

        Queue<Integer> q = new LinkedList<>();
       

        // start BFS from vertex 0
        q.add(start);
        vis[0] = true;  // mark as visited when enqueuing

        while (!q.isEmpty()) {

            int curr = q.remove();
            System.out.print(curr + " ");

            // traverse neighbors of curr
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                if (!vis[e.dest]) {
                    vis[e.dest] = true; // mark visited
                    q.add(e.dest);      // enqueue neighbor
                }
            }
        }
    }

    public static void main(String args[]) {

        int V = 7;

        /*
            1 --- 3
           /      | \
          0       |  5 -- 6
           \      | /
            2 --- 4
        */

        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
         boolean vis[] = new boolean[V];
         for(int i=0;i<V;i++){
            if(vis[i]==false)
                bfs(graph, V,vis,i);
         }
        
         
        System.out.println();
    }
}