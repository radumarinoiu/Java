import java.util.*;
import java.text.ParseException;

import catalog.Catalog;
import items.Graph;

public class Main {
    public static void main(String arg[]) throws ParseException {

        String path = "..\\..\\..\\Extra";

        try {
            Catalog catalog = Catalog.getInstance();
            Graph petersenGraph  = new Graph("Peterson", path + "\\peterson.tgf", path + "\\peterson.png");
            Graph k4Graph = new Graph("K4", path + "\\k4.tgf", path + "\\k4.png");
            catalog.add (petersenGraph);
            catalog.add (k4Graph);
            catalog.open(petersenGraph);

            catalog.save(path + "\\catalog.dat");
            catalog.load(path + "\\catalog.dat");
            catalog.list();
        }


        catch(Exception e){
            e.printStackTrace();
            System.err.println(e.toString());
        }
    }

}
