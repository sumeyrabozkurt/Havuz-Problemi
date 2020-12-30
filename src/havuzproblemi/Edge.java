package havuzproblemi;

import java.awt.Point;


public class Edge {
    
    private  int startNodeId;
    private  Point startNode;
    private  int endNodeId;
    private  Point endNode;
    private  int weight;
    
    public Edge(int sId,Point sNode,int eId,Point eNode,int w){
        this.startNodeId =sId;
        this.startNode =sNode;
        this.endNodeId =eId;
        this.endNode =eNode;
        this.weight =w;
        
    } 

    public int getStartNodeId() {
        return startNodeId;
    }

    public void setStartNodeId(int startNodeId) {
        this.startNodeId = startNodeId;
    }

    public Point getStartNode() {
        return startNode;
    }

    public void setStartNode(Point startNode) {
        this.startNode = startNode;
    }

    public int getEndNodeId() {
        return endNodeId;
    }

    public void setEndNodeId(int endNodeId) {
        this.endNodeId = endNodeId;
    }

    public Point getEndNode() {
        return endNode;
    }

    public void setEndNode(Point endNode) {
        this.endNode = endNode;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
     

    

        
            
}
