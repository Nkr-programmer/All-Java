package backtracking;

import java.util.ArrayList;


public class Find_if_there_is_a_path_of_more_than_k_length_from_a_source {
	
	
	class adj{
		int de;int weight;
		adj(int de,int we) {this.de=de;this.weight=we;}
	}
	
	
	
	private static int v;
	private static ArrayList<adj> a[];
	
	public Find_if_there_is_a_path_of_more_than_k_length_from_a_source(int i) {
		v = i;
		a = new ArrayList[i];
		for (int j = 0; j < i; ++j) {
			a[j] = new ArrayList<adj>();

		}

	}

	void addEdge(int s,int d, int w) {
		adj node=new adj(d,w);
		a[s].add(node);
		adj node1=new adj(s,w);
		a[d].add(node1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//O(N!)
		Find_if_there_is_a_path_of_more_than_k_length_from_a_source g = new Find_if_there_is_a_path_of_more_than_k_length_from_a_source(9);

		g.addEdge(0, 1, 4); 
	    g.addEdge(0, 7, 8); 
	    g.addEdge(1, 2, 8); 
	    g.addEdge(1, 7, 11); 
	    g.addEdge(2, 3, 7); 
	    g.addEdge(2, 8, 2); 
	    g.addEdge(2, 5, 4); 
	    g.addEdge(3, 4, 9); 
	    g.addEdge(3, 5, 14); 
	    g.addEdge(4, 5, 10); 
	    g.addEdge(5, 6, 2); 
	    g.addEdge(6, 7, 1); 
	    g.addEdge(6, 8, 6); 
	    g.addEdge(7, 8, 7); 
	  
	    int src = 0; 
	    int k = 62; 
	  
	    if(g.pathMoreThanK(src, k))
	      System.out.println("YES");
	    else
	      System.out.println("NO");
	  
	  
	    k = 60; 
	    if(g.pathMoreThanK(src, k))
	      System.out.println("YES");
	    else
	      System.out.println("NO");
	}

	private boolean pathMoreThanK(int src, int k) {
		boolean path[]= new boolean[v];
	path[src]=true;
		return pathMoreThanKUtil(src,k,path);
	}

	private boolean pathMoreThanKUtil(int src, int k, boolean[] path) {
		
		if(k<=0)return true;
		int index=0;
		 for(int i=0;i<a[src].size();i++)
		 {
			adj vertex=a[src].get(i); 
			 int d=vertex.de;
			 int wei=vertex.weight;
			 index++;
			 if(path[d]==true)continue;
			 if(wei>=k)return true;
			 path[d]=true;
			 if(pathMoreThanKUtil(d,k-wei,path))return true;
			 path[d]=false;
		 }
		return false;
	}



}