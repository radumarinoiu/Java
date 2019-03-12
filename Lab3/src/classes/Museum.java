package classes;

import interfaces.Visitable;
import interfaces.Classifiable;
import interfaces.Payable;

public class Museum extends Node implements Payable, Visitable, Classifiable{
    @Override
    public double getEntryFee() {
        return EntryFee;
    }

    @Override
    public void setEntryFee(double entryFee) {
        EntryFee = entryFee;
    }

    private double EntryFee;
    private String openingHours;
    private String rank;
    
    public Museum(String name) {
        super(name);
       
    }
   
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

    private String closingHours;

    @Override
    public void setClosingHours(String closingHours) {
        this.closingHours = closingHours;
    }

    @Override
    public String getClosingHours() {
        return closingHours;
    }
    

    @Override
    public String toString() {
        return "Museum{" +"name = "+getName()+"}\n";// ", entryFee=" + entryFee + ", openingHours=" + openingHours + ", rank=" + rank + '}'+'\n';
    }
}
