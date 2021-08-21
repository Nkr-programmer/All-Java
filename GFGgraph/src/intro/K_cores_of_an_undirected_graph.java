package intro;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class K_cores_of_an_undirected_graph {

    int V; // No. of vertices
    
    // Pointer to an array containing adjacency lists
    Vector<Integer>[] adj;

    @SuppressWarnings("unchecked")
    K_cores_of_an_undirected_graph(int V)
    {
        this.V = V;
        this.adj = new Vector[V];

        for (int i = 0; i < V; i++)
            adj[i] = new Vector<>();
    }

    // function to add an edge to graph
    void addEdge(int u, int v)
    {
        this.adj[u].add(v);
        this.adj[v].add(u);
    }
	public static void main(String[] args)
    {
 
        // Create a graph given in the above diagram
        int k = 3;
        K_cores_of_an_undirected_graph g1 = new K_cores_of_an_undirected_graph(9);
        g1.addEdge(0, 1);
        g1.addEdge(0, 2);
        g1.addEdge(1, 2);
        g1.addEdge(1, 5);
        g1.addEdge(2, 3);
        g1.addEdge(2, 4);
        g1.addEdge(2, 5);
        g1.addEdge(2, 6);
        g1.addEdge(3, 4);
        g1.addEdge(3, 6);
        g1.addEdge(3, 7);
        g1.addEdge(4, 6);
        g1.addEdge(4, 7);
        g1.addEdge(5, 6);
        g1.addEdge(5, 8);
        g1.addEdge(6, 7);
        g1.addEdge(6, 8);
        g1.printKCores(k);
 
        System.out.println();
 
        K_cores_of_an_undirected_graph g = new K_cores_of_an_undirected_graph(6);
        
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(2, 5);
        g.printKCores(k);
        
        int l=2;
       System.out.println( g.countNosNodesInLevel(0,l));
    }



	private void printKCores(int k) {
		// TODO Auto-generated method stub
	boolean x[]=new boolean[V];
	boolean y[]=new boolean[V];
		Arrays.fill(x, false);
		Arrays.fill(y, false);
		int mindeg= Integer.MAX_VALUE;
		int startVertex=0;
		int stDeg[]= new int[V];
		for(int i=0;i<V;i++)
		{
			 stDeg[i] = adj[i].size();
			 
             if (stDeg[i] < mindeg)
             {
                 mindeg = stDeg[i];
                 startVertex = i;
             }
			
		}
		DFSUtil(startVertex,x,stDeg,k);	
		
		  for (int i = 0; i < V; i++)
              if (!x[i])
                  DFSUtil(i, x, stDeg, k);

          System.out.println("K-Cores : ");
          for (int v = 0; v < V; v++)
          {

                  if (stDeg[v] >= k)
              {
                  System.out.printf("\n[%d]", v);

                  for (int i : adj[v])
                      if (stDeg[i] >= k)
                          System.out.printf(" -> %d", i);
              }
          }
		
	}
    boolean DFSUtil(int v, boolean[] visited, int[] vDegree, int k)
    {
        visited[v] = true;

        for (int i : adj[v])
        {

            if (vDegree[v] < k)
                vDegree[i]--;
            if (!visited[i])
            {
                DFSUtil(i, visited, vDegree, k);
            }
        }
        return (vDegree[v] < k);
    }	
	
	private int countNosNodesInLevel(int i, int level) {
		// TODO Auto-generated method stub
	
		boolean x[] = new boolean[V];
		int levels[]= new int[V];
		Queue<Integer> b = new LinkedList<Integer>();
		x[i] = true;
		b.add(i);
int count=0;
levels[i]=0;
		while (!b.isEmpty()) {
			i = b.poll();
			

			for (int j = 0; j < adj[i].size(); j++) {
				int n = adj[i].get(j);
				if (!x[n]) {
levels[n]=levels[i]+1;					
					x[n] = true;
					b.add(n);
				}
			}
			  count = 0;
		      for (int t = 0; t < V; t++)
		        if (levels[t] == level)
		          count++;
		    }
		    return count;
			
				
	}
}
