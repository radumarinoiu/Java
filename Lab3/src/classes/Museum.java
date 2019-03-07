package classes;

import interfaces.Visitable;
import interfaces.Classifiable;
import interfaces.Payable;

public class Museum extends Node implements Payable, Visitable,Classifiable{
    private String entryFee;
    private String openingHours;
    private String rank;
    
    public Museum(String name) {
        super(name);
       
    }
    
     public void setEntryFee(String entryFee){
         this.entryFee=entryFee;
     }
    public String getEntryFee(){
        return entryFee;
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
    

    @Override
    public String toString() {
        return "Museum{" +"name= "+getName()+"}\n";// ", entryFee=" + entryFee + ", openingHours=" + openingHours + ", rank=" + rank + '}'+'\n';
    }
    
    
    
}
