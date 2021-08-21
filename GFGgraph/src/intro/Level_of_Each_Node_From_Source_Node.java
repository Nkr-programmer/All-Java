package intro;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Level_of_Each_Node_From_Source_Node {

	private static int v;
	private static ArrayList<Integer> a[];
	private static ArrayList<Integer> tr[];

	public Level_of_Each_Node_From_Source_Node(int i) {
		v = i;
		a = new ArrayList[i];
		tr= new ArrayList[i];
		for (int j = 0; j < i; ++j) {
			a[j] = new ArrayList<Integer>();

		}
		for (int j = 0; j < i; ++j) {
			tr[j] = new ArrayList<Integer>();

		}

	}

	void addEdge(int v, int w,boolean x ) {
		if(x)
		a[v].add(w);
		else 
			tr[v].add(w);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Level_of_Each_Node_From_Source_Node g = new Level_of_Each_Node_From_Source_Node(8);
		g.addEdge(0, 1,true);
		g.addEdge(0, 2,true);
		g.addEdge(1, 3,true);
		g.addEdge(1, 4,true);
		g.addEdge(1, 5,true);
		g.addEdge(2, 5,true);
		g.addEdge(2, 6,true);
		g.addEdge(6, 7,true);
	
		g.transpose();
		System.out.println("Following is level of node from souse node");
		g.BFS(0);

	}

	private void transpose() {
		// TODO Auto-generated method stub
		for(int i=0;i<v;i++)
		{
			for(int j=0;j<a[i].size();j++)
				addEdge(a[i].get(j),i,false);
		}
		System.out.println("printed form of transpose");
		for(int i=0;i<v;i++)
		{
			for(int j=0;j<tr[i].size();j++)
				System.out.println(i+"->"+tr[i].get(j));
		}
		
	}

	private void BFS(int i) {
		// TODO Auto-generated method stub
		boolean x[] = new boolean[v];
		Queue<Integer> b = new LinkedList<Integer>();
		int level[]= new int[v];
		x[i] = true;
		b.add(i);
level[i]=0;
		while (!b.isEmpty()) {
			i = b.poll();
			

			for (int j = 0; j < a[i].size(); j++) {
				int n = a[i].get(j);
				if (!x[n]) {
			level[n]=level[i]+1;
					x[n] = true;
					b.add(n);
				}
			}
		}
	
	for(int k=0;k<level.length;k++)
	{
		System.out.println(level[k]);
	}
	
	}
}
