package Impl.Graph.GraphImpl;

public class Edge {
    private int src;
    private int des;
    private int wgt;

    public Edge(int src, int des, int wgt) {
        this.src = src;
        this.des = des;
        this.wgt = wgt;
    }

    public int getSrc() {
        return this.src;
    }
    public int getDes() {
        return this.des;
    }
    public int getWgt() {
        return this.wgt;
    }
}
