package Impl.Graph.GraphInterface;

import java.util.HashMap;

public interface GraphInterface {

    //create a graph
    void createGraph(HashMap<Integer, int[]> graphSrcDes);

    //breadth first search
    void bfs(int startVertex, boolean[] isVisited);

    //depth first search
    void dfs(int startVertex, boolean[] isVisited);

    //print neighbours of source vertex
    void printNeighbours(int src);

    //print all vertices of graph
    void printVerticesAndEdges();
}
