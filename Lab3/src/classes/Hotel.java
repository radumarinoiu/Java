package classes;

import interfaces.Payable;
import interfaces.Visitable;
import interfaces.Classifiable;

public class Hotel extends Node implements Classifiable, Payable {
    private String rank;

    @Override
    public double getEntryFee() {
        return EntryFee;
    }

    public void setEntryFee(double entryFee) {
        EntryFee = entryFee;
    }

    private double EntryFee;
    
    public Hotel(String name) {
        super(name);
    }
    
    public void setRank(String rank){
        this.rank=rank;
    }
    
    public String getRank(){
        return rank;
    }
    

    @Override
    public String toString() {
        return "Hotel{" +"name = "+getName()+ "}";// ", rank=" + rank + '}'+'\n';
    }
}

