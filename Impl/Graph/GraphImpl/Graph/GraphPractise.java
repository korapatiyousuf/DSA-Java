package Impl.Graph.GraphImpl.Graph;

import Impl.Graph.GraphInterface.GraphInterface;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;

public class GraphPractise implements GraphInterface {
    ArrayList<Edge>[] graph;

    int idxPtr=0;

    public GraphPractise(int vertex) {
        graph = new ArrayList[vertex];
    }

    @Override
    public void createGraph(HashMap<Integer, int[]> graphSrcDes) {
        for(int i=idxPtr;i<graphSrcDes.size();i++) {
            graph[i] = new ArrayList<Edge>();
        }

        for(Map.Entry<Integer, int[]> map: graphSrcDes.entrySet()) {
            for(int num: map.getValue()){
                graph[idxPtr].add(new Edge(map.getKey(), num));
            }
            idxPtr++;
        }
    }


    @Override
    public void bfs(int startVertex, boolean[] isVisited) {
        Queue<Integer> queue= new LinkedList<>();
        queue.add(startVertex);
        System.out.println("Graph bfs");
        while(!queue.isEmpty()) {
            int curr = queue.poll();
            if(!isVisited[curr]) {
                System.out.print(curr +" ");
                isVisited[curr] = true;
                for(int i=0;i<graph[curr].size();i++) {
                    queue.offer(graph[curr].get(i).getDes());
                }
            }
        }

        System.out.println();

        for(int i=0;i< graph.length;i++) {
            if(!isVisited[i]) {
                bfs(i, isVisited);
            }
        }
    }

    @Override
    public void dfs(int startVertex, boolean[] isVisited) {
        System.out.print(startVertex +" ");
        isVisited[startVertex] = true;
        for(int i=0;i<graph[startVertex].size();i++) {
            int nextVertex = graph[startVertex].get(i).getDes();
            if(!isVisited[nextVertex]) {
                dfs(nextVertex, isVisited);
            }
        }
    }

    @Override
    public void printNeighbours(int src) {
        for(int i=0;i< graph.length;i++) {
            if(graph[i].getFirst().src == src) {
                System.out.println("Neighbours of " +src +" are: ");
                for(Edge edge: graph[i]) {
                    System.out.print(edge.des +" ");
                }
                System.out.println();
                return;
            }
        }
        System.out.println("Source vertex is not available in graph");
    }

    @Override
    public void printVerticesAndEdges() {
        System.out.println("Print all vertices and edges");
        for(int i=0;i< graph.length;i++) {
            System.out.print("Source: " +i +" -> {");
            for(int j=0;j<graph[i].size();j++) {
                Edge edge = graph[i].get(j);
                System.out.print(edge.getDes() +" ");
            }
            System.out.println("}");
        }

    }

    class Edge {
        private int src;
        private int des;
        public Edge(int src, int des) {
            this.src = src;
            this.des = des;
        }
        public int getSrc() {
            return this.src;
        }
        public int getDes() {
            return this.des;
        }
    }
}
