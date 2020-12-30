package havuzproblemi;

import java.util.HashMap;

public class Graph {
    
   private  HashMap<Integer,Node> nodes;
   private  HashMap<Integer, Edge> edges;
   private  HashMap<Integer, Integer> weights;
   
   public Graph(){
       
   }
   
   public static int[][] createAdjList(HashMap<Integer,Node> n, HashMap<Integer, Edge> e, HashMap<Integer, Integer> w){
       
       //girilen grafı adjacency matrix e çevir...
       int[][] adjList = new int[n.size()][n.size()] ;
       
       for (int i = 0; i < n.size(); i++) {
           for (int j = 0; j < n.size(); j++) {
               adjList[i][j] = 0;
           }
       }
       
       for (int i = 0; i < e.size(); i++) {
           
           adjList[e.get(i).getStartNodeId()][e.get(i).getEndNodeId()] = w.get(i);
           
       }
       return adjList;
   }

    public HashMap<Integer, Node> getNodes() {
        return nodes;
    }

    public void setNodes(HashMap<Integer, Node> nodes) {
        this.nodes = nodes;
    }

    public HashMap<Integer, Edge> getEdges() {
        return edges;
    }

    public void setEdges(HashMap<Integer, Edge> edges) {
        this.edges = edges;
    }

    public HashMap<Integer, Integer> getWeights() {
        return weights;
    }

    public void setWeights(HashMap<Integer, Integer> weights) {
        this.weights = weights;
    }

   

    
}
