package Problems.Graphs;

import java.util.ArrayList;

public class GraphDFS {
    ArrayList<Integer> dfsList = new ArrayList<>();
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        dfs(0, adj, new boolean[adj.size()]);
        return dfsList;
    }

    public void dfs(int startNode, ArrayList<ArrayList<Integer>> adj, boolean[] isVisited) {
        dfsList.add(startNode);
        isVisited[startNode] = true;
        for(int i=0;i<adj.get(startNode).size();i++) {
            int neib = adj.get(startNode).get(i);
            if(!isVisited[neib]) {
                dfs(neib, adj, isVisited);
            }
        }
    }
}
