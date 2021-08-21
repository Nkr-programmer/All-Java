package cycle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Detect_Cycle_In_a_Directed_Graph {
	private final int V;
    private final List<List<Integer>> adj;
  
    public Detect_Cycle_In_a_Directed_Graph(int V) 
    {
        this.V = V;
        adj = new ArrayList<>(V);
          
        for (int i = 0; i < V; i++)
            adj.add(new LinkedList<>());
    }
    
    private void addEdge(int source, int dest) {
        adj.get(source).add(dest);
    }
	   public static void main(String[] args)
	    {
		   Detect_Cycle_In_a_Directed_Graph graph = new Detect_Cycle_In_a_Directed_Graph(4);
	        graph.addEdge(0, 1);
	        graph.addEdge(0, 2);
	        graph.addEdge(1, 2);
	//        graph.addEdge(2, 0);
	        graph.addEdge(2, 3);
	  //      graph.addEdge(3, 3);
	          
	        if(graph.isCyclic())
	            System.out.println("Graph contains cycle");
	        else
	            System.out.println("Graph doesn't "
	                                    + "contain cycle");
	    }

	private boolean isCyclic() {
boolean restack[]= new boolean[V];
boolean visited[]= new boolean[V];

for(int i=0;i<V;i++)
{
if(isCyclicUtil(i,visited,restack))return true;	
}
		return false;
	}

	private boolean isCyclicUtil(int i, boolean[] visited, boolean[] restack) {
		if(restack[i]) {return true;}
		if(visited[i])return false;
		
visited[i]=true;
restack[i]=true;
		for(int j=0;j<adj.get(i).size();j++)
		{
			if(isCyclicUtil(adj.get(i).get(j),visited,restack))return true;
		}
		
		restack[i]=false;//this is used to make it ready again for next element of adj
		return false;
	}
}