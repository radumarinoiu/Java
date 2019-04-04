package base;

public class Board {
    private final Graph complete;
    private int numberOfNodes;

    public Board(int numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
        // create the complete graph
        // shuffle its edges
        complete = new Graph(numberOfNodes);
        int[][] matrix = new int[numberOfNodes][numberOfNodes];
        int i, j;
        for (i = 0; i < numberOfNodes; i++) {
            for (j = 0; j < numberOfNodes; j++) {
                if (i != j)
                    matrix[i][j] = 1;
                else
                    matrix[i][j] = 0;
            }
        }
        for (i = 0; i < numberOfNodes; i++) {
            for (j = 0; j < numberOfNodes; j++) {
                if (matrix[i][j] == 1)
                    complete.addEdge(new Edge(i, j));
            }
        }
    }

    public void show() {
        complete.show();
    }

    public synchronized Edge extract() {
        // replace the dots so that the board is thread-safe
        Edge edge = complete.pollFirst();
        return edge;
    }

//    public boolean isEmpty() {
//
//    }


    public Graph getComplete() {
        return complete;
    }

    public int getNumberOfNodes() {
        return numberOfNodes;
    }

    public void setNumberOfNodes(int numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
    }
}