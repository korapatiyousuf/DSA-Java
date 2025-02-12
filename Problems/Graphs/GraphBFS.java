package Problems.Graphs;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

//gfg - Easy - BFS of graph

public class GraphBFS {
    ArrayList<Integer> bfsList = new ArrayList<>();
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        bfs(0, adj, new boolean[V]);
        return bfsList;
    }

    public void bfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] isVisited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        while(!queue.isEmpty()) {
            int curr = queue.poll();
            if(!isVisited[curr]) {
                bfsList.add(curr);
                isVisited[curr] = true;
                for(int i=0;i<adj.get(curr).size();i++) {
                    int neighbour = adj.get(curr).get(i);
                    if(!isVisited[neighbour] && !queue.contains(neighbour)){
                        queue.offer(adj.get(curr).get(i));
                    }
                }
            }
        }
    }
}
