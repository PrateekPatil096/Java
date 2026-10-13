import java.util.*;

public class Dijkstra {
    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        
        // Weighted edges: {destination, weight}
        adj.get(0).add(new int[]{1, 2});
        adj.get(0).add(new int[]{4, 1});
        adj.get(1).add(new int[]{2, 3});
        adj.get(4).add(new int[]{1, 2});
        adj.get(4).add(new int[]{2, 3});
        adj.get(2).add(new int[]{3, 6});
        
        int[] dist = dijkstra(adj, 0, V);
        
        System.out.println("Shortest distances from source 0:");
        for (int i = 0; i < V; i++) {
            System.out.println("To " + i + ": " + dist[i]);
        }
    }
    
    static int[] dijkstra(ArrayList<ArrayList<int[]>> adj, int src, int V) {
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        
        // Min-heap: {distance, node}
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.offer(new int[]{0, src});
        
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int d = curr[0];
            int node = curr[1];
            
            if (d > dist[node]) continue;
            
            for (int[] edge : adj.get(node)) {
                int neighbor = edge[0];
                int weight = edge[1];
                
                if (dist[node] + weight < dist[neighbor]) {
                    dist[neighbor] = dist[node] + weight;
                    pq.offer(new int[]{dist[neighbor], neighbor});
                }
            }
        }
        
        return dist;
    }
}
