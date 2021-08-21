package graph;

import java.util.Iterator;
import java.util.LinkedList;

public class Detect_cycles {
	private int V;
	private LinkedList<Integer> arg[];

	public Detect_cycles(int v) {
		V = v;
		arg = new LinkedList[v]; // just a declaration to fix a size
		for (int i = 0; i < v; i++) {
			arg[i] = new LinkedList();
		}

	}

	void addEdge(int i, int j) {

		arg[i].add(j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Detect_cycles g = new Detect_cycles(4);

//		g.addEdge(0, 1);
//		g.addEdge(4, 0);
//		g.addEdge(1, 2);
//		g.addEdge(1, 3);
//		g.addEdge(1, 4);
//		g.addEdge(2, 3);
//		g.addEdge(3, 4);
//		g.addEdge(3,3);
		
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);


		g.bfs(2);
System.out.println();
		g.dfs();
	}

	private void dfs() {
		// TODO Auto-generated method stub
		boolean x[] = new boolean[V];

		boolean g=false;
		for(int i=0;i<V;i++)
		{
			for(int j=0;j<V;j++)
			{
x[j]=false;

			}	
			
			
		 g=dfss(x,i,-1);	
		//if(g==false)
		//break;
		 if(g==true)
			{
				System.out.println("truee");
				
			}
			else {
				System.out.println("false");
			}
		}
		
		
		
	}

	private boolean dfss(boolean[] x, int t,int p) {
		
		

		x[t] = true;
		System.out.print(t+"=>");
		
			Iterator<Integer> i = arg[t].listIterator();
			while (i.hasNext()) {
			
				int n = i.next();
				System.out.println(n);
				
				if (!x[n]) {
				
			if(		dfss( x,n,t))
				
					return true;
				}else
				if(n!=p) {
					
					return true;
				
				}
				
		}
			
		return false;
	}

	
	
	
	private void bfs(int t) {
		boolean x[] = new boolean[V];
		LinkedList<Integer> que = new LinkedList<Integer>();
		x[t] = true;
		que.add(t);
		while (!que.isEmpty()) {

			t = que.poll();
			System.out.println(t);
			Iterator<Integer> i = arg[t].listIterator();
			while (i.hasNext()) {
				int n = i.next();

				if (!x[n]) {
					x[n] = true;
					que.add(n);
				}

			}

		}

	}

}
