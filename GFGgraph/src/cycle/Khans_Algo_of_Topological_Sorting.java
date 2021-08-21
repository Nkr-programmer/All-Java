package cycle;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Khans_Algo_of_Topological_Sorting {
int V;

static ArrayList<Integer>ha;

static ArrayList<Integer>adj[];
public Khans_Algo_of_Topological_Sorting (int v) 
{
	V=v;
adj= new ArrayList[v];
for(int i=0;i<v;i++)
{
adj[i]=new ArrayList<Integer>();	
}
}
	public void addEdge(int i,int j)
	{
		adj[i].add(j);
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Khans_Algo_of_Topological_Sorting g= new Khans_Algo_of_Topological_Sorting(6);
		    g.addEdge(5, 2);
	        g.addEdge(5, 0);
	        g.addEdge(4, 0);
	        g.addEdge(4, 1);
	        g.addEdge(2, 3);
	        g.addEdge(3, 1);

	     	     System.out.println(
	            "Following is a Topological Sort");
	     	    g.topologicalSort();
	     	    System.out.println("Min edge to be added ");
	g.minEdgeAdded();
	}
	private void minEdgeAdded() {
		// to get how many edge is possible to be added to have a DAG
		//O(V^2))
		boolean bo[]= new boolean[V];
	int count =0;
		for(int i=0;i<ha.size();i++)
		{
			
			int a= ha.get(i);
			for(int j=0;j<adj[a].size();j++)
			{bo[adj[a].get(j)]=true;}
			
			for(int j=i+1;j<ha.size();j++)
			{
				if(!bo[ha.get(j)]) {System.out.print(a+"->"+ha.get(j)+" ");count++;}
				bo[ha.get(j)]=false;
			}
		}
	System.out.println(count);
	}
	private void topologicalSort() {
		// TODO Auto-generated method stub
		//O(V+E) O(V)
		int indeg[]=new int[V];
		Queue<Integer>q= new LinkedList<Integer>();
		
		for(int i=0;i<V;i++)
		{
			for(int j=0;j<adj[i].size();j++)
			{
				indeg[adj[i].get(j)]++;
			}
		}
	
		for(int i=0;i<indeg.length;i++)
		{
			if(indeg[i]==0)
			{
				q.add(i);
			}
		}
    ha= new ArrayList<Integer>();
		int count=0;
		while(!q.isEmpty())
		{
			int last=q.poll();
			ha.add(last);
			System.out.print(last+" ");count++;
			for(int j=0;j<adj[last].size();j++)
			{
				if(--indeg[adj[last].get(j)]==0)
				{
					q.add(adj[last].get(j));
				}
			}
			
		}
		if(count!=V) {System.out.println("cycle is there");}
		
		
	}

	
	
}
