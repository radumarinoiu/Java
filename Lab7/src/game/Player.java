package game;

import base.Graph;


public class Player implements Runnable {
    public static int THINKING_TIME = 200;
    private String name;
    private Game game;
    private Graph graph;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            play();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private boolean play() throws InterruptedException {
        while (game.getBoard().getComplete().getListOfEdges().size() > 0) {
            graph.addEdge(game.getBoard().extract());
            System.out.println(this.name);
            System.out.println(graph.getListOfEdges());
            Thread.sleep(THINKING_TIME);
        }

        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Graph getGraph() {
        return graph;
    }

    public void setGraph(Graph graph) {
        this.graph = graph;
    }

    // implement the run() method, that will repeatedly extract edges
    // implement the toString() method
}

