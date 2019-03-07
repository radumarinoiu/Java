package classes;

import interfaces.Visitable;
import interfaces.Classifiable;

public class Restaurant extends Node implements Classifiable, Visitable{
    private String rank;
    private String openingHours;
   
    public Restaurant(String name) {
        super(name);
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    @Override
    public String toString() {
        return "Restaurant{" +"name= " +getName()+"}\n";// ", rank=" + rank + ", openingHours=" + openingHours + '}'+'\n';
    }
    
    
    
}
