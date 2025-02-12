package Impl.Graph.GraphImpl.GraphWithWeights;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import Impl.Graph.GraphImpl.Edge;

public class GraphPractiseWithWeights {
    ArrayList<Edge>[] graph;
    int idxPtr=0;

    public GraphPractiseWithWeights(int vertex) {
        graph = new ArrayList[vertex];
    }

    public  void createGraph(HashMap<Integer, Edge[]> graphEdgesMap) {
        for(int i = idxPtr; i< graphEdgesMap.size(); i++) {
            graph[i] = new ArrayList<Edge>();
        }
        for(Map.Entry<Integer, Edge[]> mapEntry: graphEdgesMap.entrySet()) {
            for(Edge edge: mapEntry.getValue()) {
                graph[idxPtr].add(new Edge(edge.getSrc(), edge.getDes(), edge.getWgt()));
            }
            idxPtr++;
        }
    }


    public void printNeighbours(int src) {
        for(int i=0;i< graph.length;i++) {
            if(graph[i].getFirst().getSrc() == src) {
                System.out.println("Neighbours of " +src +" are: ");
                for(Edge edge: graph[i]) {
                    System.out.println("Des: " +edge.getDes() +", Weight: " +edge.getWgt());
                }
                System.out.println();
                return;
            }
        }
        System.out.println("Source vertex is not available in graph");
    }
}
