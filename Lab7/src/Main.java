import base.Board;
import game.Game;
import game.Player;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        Board board = new Board(10);
//        Graph graph = new Graph(3);
//        graph.addEdge(new Edge(2, 1));
//        graph.addEdge(new Edge(1, 2));
//        graph.addEdge(new Edge(1, 3));
        Game game = new Game(board);
        game.addPlayer(new Player("Gheorghe"));
        game.addPlayer(new Player("Vasile"));
        game.start();

//        System.out.println(graph);
    }
}
