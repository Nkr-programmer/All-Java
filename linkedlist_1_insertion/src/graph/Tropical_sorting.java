package graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Tropical_sorting {
	private int V;
	private LinkedList<Integer> arg[];

	public Tropical_sorting(int v) {
		V = v;
		arg = new LinkedList[v]; // just a declaration to fix a size
		for (int i = 0; i < v; i++) {
			arg[i] = new LinkedList();
		}

	}
//1. dfs preorder or inorder
//2. bfs level order
	void addEdge(int i, int j) {

		arg[i].add(j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tropical_sorting g = new Tropical_sorting(10);

		g.addEdge(0,1);
		g.addEdge(0,5);
		g.addEdge(6,1);
		g.addEdge(6,0);
		g.addEdge(1,7);
		g.addEdge(6,2);
		g.addEdge(3,2);
		g.addEdge(3,8);
		g.addEdge(8,2);
		g.addEdge(3,7);
		g.addEdge(3,4);
		g.addEdge(4,8);
		g.addEdge(9,4);
		Stack<Integer> q= new Stack<Integer>();
System.out.println();
		g.dfs(q);
	}
 
	private void dfs(Stack<Integer> q) {
		// TODO Auto-generated method stub
		boolean x[] = new boolean[V];
		for(int i=0;i<10;i++)
		dfss(x,i,q);
		for(int i=0;i<10;i++)
			System.out.println(q.pop());
	}

	private void dfss(boolean[] x, int t, Stack<Integer> q) {
		x[t] = true;
		
			Iterator<Integer> i = arg[t].listIterator();
			
			while (i.hasNext()) {
				int n = i.next();
				
				if (!x[n]) {
				dfss( x, n,q);
					}
				if(!q.contains(n))
				{q.add(n);}
		}if(!q.contains(t)&&!i.hasNext())
			q.add(t);
		
	}

	


}
