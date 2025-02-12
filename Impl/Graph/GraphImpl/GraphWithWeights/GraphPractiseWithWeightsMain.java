package Impl.Graph.GraphImpl.GraphWithWeights;

import Impl.Graph.GraphImpl.Edge;

import java.util.HashMap;

public class GraphPractiseWithWeightsMain {
    public static void main(String[] args) {
        GraphPractiseWithWeights graph = new GraphPractiseWithWeights(4);

        HashMap<Integer, Edge[]> graphEdges = new HashMap<>();

        graphEdges.put(0, new Edge[]{new Edge(0,2,2)});
        graphEdges.put(1, new Edge[]{new Edge(1,2,10), new Edge(1,3,0)});
        graphEdges.put(2, new Edge[]{new Edge(2,0,2), new Edge(2,1,10), new Edge(2,3,-1)});
        graphEdges.put(3, new Edge[]{new Edge(3,1,0), new Edge(3,2,-1)});
        graph.createGraph(graphEdges);
        graph.printNeighbours(0);
        graph.printNeighbours(1);
        graph.printNeighbours(2);
        graph.printNeighbours(3);
    }
}
