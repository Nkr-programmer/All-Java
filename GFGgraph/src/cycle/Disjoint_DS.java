package cycle;

import java.util.Arrays;
//not only detect cycle but count also
public class Disjoint_DS {
int V;
int E;
Edge edge[]; // /collection of all edges

class Edge
{
    int src, dest;
};
public Disjoint_DS(int v,int e)
{
V=v;
E=e;
edge=new Edge[e];
for(int i=0;i<e;i++)
{edge[i]= new Edge();}
}


	public static void main(String[] args) {
		Disjoint_DS d= new Disjoint_DS(8,9);
		d.edge[0].src=0;
		d.edge[0].dest=1;
		
		d.edge[1].src=2;
		d.edge[1].dest=3;
		
		d.edge[2].src=4;
		d.edge[2].dest=5;
		
		d.edge[3].src=6;
		d.edge[3].dest=7;
		
		d.edge[4].src=1;
		d.edge[4].dest=3;
		
		d.edge[5].src=1;
		d.edge[5].dest=4;
		
		d.edge[6].src=0;
		d.edge[6].dest=2;

		d.edge[7].src=5;
		d.edge[7].dest=7;
		
		d.edge[8].src=4;
		d.edge[8].dest=6;
	
	if(d.isCycle()>0) {System.out.println("yes");}
	else System.out.println("no");
	
	}


	private int isCycle() {
		// TODO Auto-generated method stub
		
		int parent[]=new int[V];
		Arrays.fill(parent, -1);
		int count=0;
		for(int i=0;i<E;i++)
		{
			  int x = find(parent, edge[i].src);
	            int y = find(parent, edge[i].dest);
	 
	            if (x == y) {System.out.println(edge[i].src+" "+edge[i].dest);
	                count++;}
	            else
	            Union(parent, x, y);
			
		}
		
		return count;
	}


	private void Union(int[] parent, int x, int y) {
		// TODO Auto-generated method stub
		if(parent[x]<=parent[y]) {parent[x]=parent[x]+parent[y];parent[y]=x;}
		else {parent[y]=parent[x]+parent[y];parent[x]=y;}
	}


	private int find(int[] parent, int src) {
		// TODO Auto-generated method stub
		
		if (parent[src] <0)
            return src;
        return find(parent, parent[src]);
	}

}
