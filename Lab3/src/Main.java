import classes.Church;
import classes.Hotel;
import classes.Museum;
import classes.Restaurant;

public class Main {

    public static void main(String[] args) {
        Hotel v1 = new Hotel("Hotel Unirea");
        Museum v2 = new Museum("Galeriile de Arta");
        Museum v3 = new Museum("Muzeul Taranului Roman");
        Church v4 = new Church("Biserica Sfanta Treime");
        Church v5 = new Church("Biserica Trei Ierarhi");
        Restaurant v6 = new Restaurant("Restaurant Mamma Mia");

        TravelMap tm = new TravelMap();

        tm.addNode(v1);
        tm.addNode(v2);
        tm.addNode(v3);
        tm.addNode(v4);
        tm.addNode(v5);
        tm.addNode(v6);

        tm.addEdges(v1, v2, 15);
        tm.addEdges(v1, v3, 10);
        tm.addEdges(v3, v2, 1, false);
        tm.addEdges(v3, v4, 2);
        tm.addEdges(v4, v5, 1);
        tm.addEdges(v5, v6, 1);
        tm.addEdges(v2, v6, 10);

        System.out.println("The map is: \n" + tm.getNodes());
    }

}