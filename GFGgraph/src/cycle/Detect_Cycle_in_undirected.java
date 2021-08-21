package cycle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Detect_Cycle_in_undirected {

	private final int V;
    private final List<List<Integer>> adj;
  
    public Detect_Cycle_in_undirected(int V) 
    {
        this.V = V;
        adj = new ArrayList<>(V);
          
        for (int i = 0; i < V; i++)
            adj.add(new LinkedList<>());
    }
    
    private void addEdge(int source, int dest) {
        adj.get(source).add(dest);
        adj.get(dest).add(source);
    }
    //[[3,4],[1,2],[2,4],[3,5],[2,5]]
	   public static void main(String[] args)
	    {
		   Detect_Cycle_in_undirected g1 = new Detect_Cycle_in_undirected(4);
	        g1.addEdge(0,1);
	        g1.addEdge(0,2);
	        g1.addEdge(1,3);
//	        g1.addEdge(2,4);
//	        g1.addEdge(0,4);
	        if(g1.isCyclic())
	            System.out.println("Graph contains cycle");
	        else
	            System.out.println("Graph doesn't "
	                                    + "contain cycle");
	    }

	private boolean isCyclic() {
boolean visited[]= new boolean[V];
for(int i=0;i<V;i++)
{
	if(!visited[i])
if(isCyclicUtil(i,visited,-1))return true;	
}
		return false;
	}


	private boolean isCyclicUtil(int i, boolean[] visited,int parent) {
visited[i]=true;
		for(int j=0;j<adj.get(i).size();j++)
		{if(!visited[adj.get(i).get(j)])
			{if(isCyclicUtil(adj.get(i).get(j),visited,i))return true;}
		else if(adj.get(i).get(j)!=parent) {System.out.println(adj.get(i).get(j)+" "+i);return true;}
		}
		
		return false;
	}
}