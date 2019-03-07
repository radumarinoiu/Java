import classes.Church;
import classes.Hotel;
import classes.Museum;
import classes.Restaurant;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Hotel v1= new Hotel("California");
        Museum v2= new Museum("Grigore Antipa");
        Church v3=new Church("Biserica Neagra");
        Restaurant v4=new Restaurant("La Bomba");

        TravelMap map= new TravelMap();
        map.addNode(v1);
        map.addNode(v2);
        map.addNode(v3);
        map.addNode(v4);
        map.addEdges(v1, v2, 15);
        map.addEdges(v3,v2,1,false);
        map.addEdges(v1,v3,10);
        map.addEdges(v3,v4,1);
        map.addEdges(v2,v4,12);

        System.out.println("The map is-> \n"+ map.getNodes());
        //System.out.println(map);


    }

}