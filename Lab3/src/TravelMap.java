import classes.Edge;
import classes.Node;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

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
