package graph;

public class GraphDS {

    public static void main(String[] args) {

        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");


        graph.addEdge("A","B");
        graph.addEdge("B","C");
        graph.addEdge("C","A");

        graph.printGraph();


    }
}
