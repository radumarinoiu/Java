package classes;

import interfaces.Visitable;
import interfaces.Classifiable;

    public class Church extends Node implements Classifiable, Visitable{
    private String openingHours;
    private String rank;

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Church(String name) {
        super(name);
        
    }

    @Override
    public String toString() {
        return "Church{" +"name= "+getName()+ "}\n";//, openingHours=" + openingHours + ", rank=" + rank + '}'+'\n';
    }
    
    
}


