package base;

import java.util.LinkedList;

public class Graph {
    private LinkedList<Edge> listOfEdges;
    private int numberOfNodes;

    public Graph(int numberOfNodes) {
        listOfEdges = new LinkedList<Edge>();
        this.numberOfNodes = numberOfNodes;
    }

    public void addEdge(Edge edge) {
        listOfEdges.add(edge);
    }

    public void removeEdge(Edge edge) {
        listOfEdges.remove(edge);
    }

    public void show() {
        for (Edge edge : listOfEdges) {
            System.out.println(edge);
        }
    }

    public Edge pollFirst() {
        return listOfEdges.pollFirst();
    }

    public LinkedList<Edge> getListOfEdges() {
        return listOfEdges;
    }

    public void setListOfEdges(LinkedList<Edge> listOfEdges) {
        this.listOfEdges = listOfEdges;
    }

    public int getNumberOfNodes() {
        return numberOfNodes;
    }

    public void setNumberOfNodes(int numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
    }

    @Override
    public String toString() {
        return "Graph{" + "\n" + "Number of vertices: " + numberOfNodes + "\n" + "Edges: " + listOfEdges + "}";
    }
}
