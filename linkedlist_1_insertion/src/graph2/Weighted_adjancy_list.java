package graph2;

import java.util.*;

class Graphed{
	class Edge{
		int v,w;
		public Edge(int v, int w) {
			this.v=v;this.w=w;
		}
		@Override
		public String toString() {
			
			k+=w;
			return "{"+v+","+w+"}";
			
			
		}
	}
	int k=0;
	 List <Edge>G[];
	public Graphed(int n) {
		G  = new LinkedList[n]; // just a declaration to fix a size
		for (int i = 0; i < G.length; i++) 
			G[i] = new LinkedList<Edge>();
		

	}
	
	public void addEdge(int i, int j, int w) {
		// TODO Auto-generated method stub
G[i].add(0,new Edge(j,w));
G[j].add(0,new Edge(i,w));
	}
	boolean isconnected(int u,int v) {
		for(Edge i:G[u])
		{
			if(i.v==v)return true;
		}
			return false;
		
	}
	int printsum() {
	return	k;
	}
	@Override
	public String toString() {
		String results="";
		for(int i=0;i<G.length;i++)
			 results +=i+"=>"+G[i]+"  ";
		return results;
	}
}




public class Weighted_adjancy_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Graphed g= new Graphed(10);

g.addEdge(0,2,10);

System.out.println(g+" "+g.isconnected(1, 3)+" "+g.printsum());
	}

}
