package classes;

import interfaces.Visitable;
import interfaces.Classifiable;

public class Hotel extends Node implements Classifiable{
    private String rank;
    
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

