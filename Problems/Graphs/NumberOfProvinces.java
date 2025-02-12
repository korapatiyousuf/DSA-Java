package Problems.Graphs;

//Leetcode 547. Number of Provinces

public class NumberOfProvinces {
    int provinces = 0;
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] isVisited = new boolean[n];
        for(int i=0;i<n;i++) {
            if(!isVisited[i]) {
                provinces++;
                dfs(isConnected, i, isVisited);
            }
        }
        return provinces;
    }

    public void dfs(int[][] graph, int startNode, boolean[] isVisited) {
        isVisited[startNode] = true;
        for(int i=0;i<graph.length;i++) {
            if(graph[startNode][i] == 1 && !isVisited[i]) {
                dfs(graph, i, isVisited);
            }
        }
    }
}
