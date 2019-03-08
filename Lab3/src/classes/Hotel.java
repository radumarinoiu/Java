package classes;

import interfaces.Payable;
import interfaces.Visitable;
import interfaces.Classifiable;

public class Hotel extends Node implements Classifiable, Payable {
    private String rank;

    @Override
    public float getEntryFee() {
        return EntryFee;
    }

    public void setEntryFee(float entryFee) {
        EntryFee = entryFee;
    }

    private float EntryFee;
    
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
        return "Hotel{" +"name="+getName()+ "}\n";// ", rank=" + rank + '}'+'\n';
    }
}

