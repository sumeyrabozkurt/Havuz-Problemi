package havuzproblemi;

import java.util.ArrayList;
import java.util.LinkedList; 
  
class Max_Flow 
{ 
    static  int V ;
    private ArrayList<ArrayList<Integer>> paths;
    ArrayList<Integer> path;
    private ArrayList<Integer> pathFlows;

    public Max_Flow(int v){
        this.V = v;
        paths = new ArrayList<>();
        pathFlows = new ArrayList<>();
        
    }

    boolean bfs(int rGraph[][], int s, int t, int parent[]) 
    { 
        boolean visited[] = new boolean[V]; 
        for(int i=0; i<V; ++i) 
            visited[i]=false; 
  
        LinkedList<Integer> queue = new LinkedList<Integer>(); 
        queue.add(s); 
        visited[s] = true; 
        parent[s]=-1; 
  
        // Standard BFS Loop 
        while (queue.size()!=0) 
        { 
            int u = queue.poll(); 
  
            for (int v=0; v<V; v++) 
            { 
                if (visited[v]==false && rGraph[u][v] > 0) 
                { 
                    queue.add(v); 
                    parent[v] = u; 
                    visited[v] = true; 
                } 
            } 
        } 
        return (visited[t] == true); 
    } 
    
    int fordFulkerson(int graph[][], int s, int t) 
    { 
        int u, v; 
  
        int rGraph[][] = new int[V][V]; 
  
        for (u = 0; u < V; u++) 
            for (v = 0; v < V; v++) 
                rGraph[u][v] = graph[u][v]; 
        
        int parent[] = new int[V]; 
        int max_flow = 0;  
        
        while (bfs(rGraph, s, t, parent)) 
        { 
            int path_flow = Integer.MAX_VALUE; 
            for (v=t; v!=s; v=parent[v]) 
            { 
                u = parent[v]; 
                path_flow = Math.min(path_flow, rGraph[u][v]); 
            } 
  
            for (v=t; v != s; v=parent[v]) 
            { 
                u = parent[v]; 
                rGraph[u][v] -= path_flow; 
                rGraph[v][u] += path_flow; 
            } 
            max_flow += path_flow; 
            
            pathFlows.add(path_flow);
            
            path = new ArrayList<>();
            path.add(s);
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    if(graph[i][j] != rGraph[i][j] && graph[i][j]>0){
                        if(!path.contains(i)){
                            path.add(i);
                        }
                        if(!path.contains(j)){
                            path.add(j);
                        }
                    }
                }
            }
            System.out.println("BULUNAN YOLDA KULLANILAN NODE LAR->");
            path.forEach((path1) -> {
                System.out.print(path1);
            });
            paths.add(path);
            
            //residual grafı güncelle
            for (u = 0; u < V; u++) 
            for (v = 0; v < V; v++) 
                graph[u][v] = rGraph[u][v]; 
            
            
            System.out.println("Path Flow->" + path_flow+"\n");
            //Max flow algoritması tamamlandığında Residual graph yazdırma
            for (u = 0; u < V; u++) {
            for (v = 0; v < V; v++) {
                System.out.print(rGraph[u][v]);
                
            }
            System.out.println("");
            }
            System.out.println("");
        } 
        
  
        return max_flow; 
    } 
     public ArrayList<ArrayList<Integer>> getPaths() {
        return paths;
    }
     public ArrayList<Integer> getPathFlows() {
        return pathFlows;
    }
    
  
    
} 