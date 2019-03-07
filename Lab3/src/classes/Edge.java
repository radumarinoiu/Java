package classes;

public class Edge {
   private int cost;
   private Node fromLocation;
   private Node toLocation;
   private boolean twoWays=true;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Node getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(Node fromLocation) {
        this.fromLocation = fromLocation;
    }

    public Node getToLocation() {
        return toLocation;
    }

    public void setToLocation(Node toLocation) {
        this.toLocation = toLocation;
    }

    public boolean getTwoWays() {
        return twoWays;
    }

    public void setTwoWays(boolean twoWays) {
        this.twoWays = twoWays;
    }

    public Edge( Node fromLocation, Node toLocation,int cost, boolean twoWays) {
        this.cost = cost;
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.twoWays=twoWays;
    }

    @Override
    public String toString() {
        return "Edge{" + "cost=" + cost + ", " + fromLocation + "->" + toLocation + ", twoWays=" + twoWays + '}';
    }
    
    
}

