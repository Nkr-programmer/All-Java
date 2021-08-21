package sort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import cycle.Detect_Cycle_In_a_Directed_Graph;

public class Topolgical_sort {

	private final int V;
    private  static List<List<Integer>> adj;
  
    public Topolgical_sort(int V) 
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
		   Topolgical_sort g = new Topolgical_sort(6);
    		   // g.addEdge(0, 2);g.addEdge(2, 0);
		        g.addEdge(0, 5);
		        g.addEdge(0, 1);
		        //g.addEdge(0, 3);g.addEdge(3, 0);
		        g.addEdge(1, 2);
		        g.addEdge(5, 1);
		        g.addEdge(1, 4);
		        g.addEdge(1, 3);

		        g.addEdge(3, 4);
		       
		        g.addEdge(2, 4);
		        //g.addEdge(5, 4); g.addEdge(4, 5);
		        g.addEdge(2, 3);
		        g.addEdge(5, 2);
	          System.out.println("Topological sort");
		      int x[]=  {0,0,4};
		      int y[]=  {2,3,5};
		      System.out.println("Before"+adj);
		      g.topological_sort(x,y);	       
	          System.out.println("Asign Direction to directed graph remains acyclic");
	          System.out.println("After"+adj);
	    }
	private void topological_sort(int[] x, int[] y) {

boolean visited[]= new boolean[V];
Stack<Integer>q= new Stack<Integer>();
for(int i=0;i<V;i++)
{
	if(!visited[i])
topological_sort_util(i,visited,q);	
}
for(int i=0;i<x.length;i++)
{
int hi=q.indexOf(x[i]);
int pi=q.indexOf(y[i]);
if(hi>pi) {adj.get(x[i]).add(y[i]);}
else {adj.get(y[i]).add(x[i]);}
}
System.out.println(q+"reverese of it");
	}

	private void topological_sort_util(int i, boolean[] visited, Stack<Integer> q) {

		
visited[i]=true;
		for(int j=0;j<adj.get(i).size();j++)
		{
			if(!visited[adj.get(i).get(j)])
			topological_sort_util(adj.get(i).get(j),visited,q);
		}
		
		q.add(i);
	}
}