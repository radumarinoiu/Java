import classes.*;
import interfaces.Payable;
import interfaces.Visitable;

import java.util.Comparator;
import java.util.List;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {
        Hotel v1 = new Hotel("Hotel Unirea");
        Museum v2 = new Museum("Galeriile de Arta");
        Museum v3 = new Museum("Muzeul Taranului Roman");
        Church v4 = new Church("Biserica Sfanta Treime");
        Church v5 = new Church("Biserica Trei Ierarhi");
        Restaurant v6 = new Restaurant("Restaurant Mamma Mia");

        v1.setEntryFee(80);

        v2.setEntryFee(16.99);
        v2.setOpeningHours("10:00");
        v2.setClosingHours("20:00");

        v3.setEntryFee(8.5);
        v3.setOpeningHours("09:00");
        v3.setClosingHours("20:00");

        v4.setOpeningHours("08:00");
        v4.setClosingHours("20:00");

        v5.setOpeningHours("08:00");
        v5.setClosingHours("19:00");

        v6.setEntryFee(24);

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

        tm.getNodes().stream().filter(
                node->((node instanceof Visitable)&&!(node instanceof Payable))
        ).map(node -> (Visitable)node).sorted(
                Comparator.comparing(Visitable::getOpeningHours).thenComparing(Visitable::getClosingHours)
        ).forEach(
                y-> System.out.println(y)
        );

        List<Edge> route = tm.GetShortestPath(v2, v3);
        System.out.println("Route from " + v2 + " to " + v3);
        for(Edge road: route){
            System.out.println(road);
        }
    }

}