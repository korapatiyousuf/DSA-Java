package Impl.Graph.GraphImpl.Graph;

import java.util.HashMap;

public class GraphPractiseMain {
    public static void main(String[] args) {
        HashMap<Integer, int[]> graphSrcDes = new HashMap<>();

        graphSrcDes.put(0, new int[]{2});
        graphSrcDes.put(1, new int[]{2,3});
        graphSrcDes.put(2, new int[]{0,1,3});
        graphSrcDes.put(3, new int[]{1,2});

        graphSrcDes.put(4, new int[]{5});
        graphSrcDes.put(5, new int[]{4,6});
        graphSrcDes.put(6, new int[]{5});
        GraphPractise graph = new GraphPractise(graphSrcDes.size());

        graph.createGraph(graphSrcDes);

        graph.printNeighbours(0);
        boolean[] isVisited = new boolean[graphSrcDes.size()];

        graph.bfs(0, isVisited);

        isVisited = new boolean[graphSrcDes.size()];
        System.out.println("DFS");
        graph.dfs(0, isVisited);

        for(int i=0;i< graphSrcDes.size();i++) {
            if(!isVisited[i]) {
                graph.dfs(i, isVisited);
            }
        }

        graph.printVerticesAndEdges();

    }
}
