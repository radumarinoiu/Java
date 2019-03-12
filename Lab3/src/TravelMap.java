import classes.Edge;
import classes.Node;

import java.util.*;

public class TravelMap {
    List<Node> Nodes;
    List<Edge> Edges;
    
    TravelMap(){
        this.Nodes=new Vector();
        this.Edges=new Vector();
    }

    public void addNode( Node node){
        Nodes.add(node);
    }

   
    public void addEdges(Node v1, Node v2, int cost){
        Edge edge= new Edge(v1,v2,cost,true);
        Edges.add(edge);
    }
    
    public void addEdges(Node v1, Node v2, int cost, boolean twoWays){
        Edge edge= new Edge(v1,v2,cost,twoWays);
        Edges.add(edge);
    }
    
    public List<Node> getNodes(){
       Collections.sort(Nodes,nodeNameComparator);
       return Nodes;
    }

    public List<Node> GetShortestPath(Node start_node, Node finish_node){
        Node current_node = start_node;
        Node next_node;
        ArrayList<Node> path = new ArrayList<>();
        if(this.getNodes().contains(start_node) && this.getNodes().contains(finish_node)){
            path.add(start_node);
            while(!current_node.equals(finish_node)){
                Edge best_road = null;
                for(Edge road: this.Edges){
                    if(
                            (road.getFromLocation().equals(current_node) && !path.contains(road.getToLocation())) ||
                            (road.getTwoWays() && road.getToLocation().equals(current_node) && !path.contains(road.getFromLocation()))
                    ){
                        if(best_road == null || best_road.getCost() > road.getCost()){
                            best_road = road;
                        }
                    }
                }
                if(best_road != null){
                    if(best_road.getFromLocation().equals(current_node)){
                        current_node = best_road.getToLocation();
                    }
                    else{
                        current_node = best_road.getFromLocation();
                    }
                    path.add(current_node);
                }
                else{
                    break;
                }
            }
        }
        return path;
    }

    /**
     * Comparator for node names
     */
    Comparator<Node> nodeNameComparator= new Comparator<Node>(){
        @Override
        public int compare(Node node1,Node node2){
            return node1.getName().compareTo(node2.getName());
        }
    };
    
   
    
    public List<Edge> getEdges(){
        return Edges;
    }

    @Override
    public String toString() {
        return "TravelMap{" + "Nodes=" + Nodes + ", Edges=" + Edges + '}';
    }
    
  
}
