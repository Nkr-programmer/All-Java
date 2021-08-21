package graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
	private static int V;
	private static LinkedList<Integer> arg[];

	public Graph(int v) {
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
		Graph g = new Graph(4);

//		g.addEdge(0, 1);
//		g.addEdge(4, 0);
//		g.addEdge(1, 2);
//		g.addEdge(1, 3);
//		g.addEdge(1, 4);
//		g.addEdge(2, 3);
//		g.addEdge(3, 4);
//		g.addEdge(2, 4);
//		g.addEdge(2, 1);
//		g.addEdge(2, 0);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);


		
		
    
for(int i = 0;i < V;i++)
{   
       System.out.print(i+":");
   for(int j = 0;j <arg[i].size();j++)
       {
       if(j == arg[i].size() - 1)
               System.out.println(arg[i].get(j)+" ");
       else
    	     System.out.print(arg[i].get(j)+"--> ");  
}//getfirst&poll&get to chech only not retrive
}

		g.bfs(2);
System.out.println();
		g.dfs(2);
	}

	private void dfs(int i) {
		// TODO Auto-generated method stub
		boolean x[] = new boolean[V];
		dfss(x,i);
	}

	private void dfss(boolean[] x, int t) {
		x[t] = true;
			System.out.println(t);
			Iterator<Integer> i = arg[t].listIterator();
			while (i.hasNext()) {
				int n = i.next();

				if (!x[n]) {
				
					dfss( x, n);
				}
		}
		
	}

	
	
	
	private void bfs(int t) {
		boolean x[] = new boolean[V];
		Queue<Integer> que = new LinkedList<Integer>();
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
