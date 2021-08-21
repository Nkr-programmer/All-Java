package intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class Graph_bfs_And_dfs {

	private static int v;
	private static ArrayList<Integer> a[];
	private int[][] tc;

	public Graph_bfs_And_dfs(int i) {
		v = i;
		a = new ArrayList[i];
		this.tc = new int[this.v][this.v];
		for (int j = 0; j < i; ++j) {
			a[j] = new ArrayList<Integer>();

		}

	}

	void addEdge(int v, int w) {
		a[v].add(w);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph_bfs_And_dfs g = new Graph_bfs_And_dfs(7);

//		g.addEdge(0, 1);
//		g.addEdge(0, 2);
//		g.addEdge(1, 2);
//		g.addEdge(2, 0);
//		g.addEdge(2, 3);
//		g.addEdge(3, 3);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 3);
		g.addEdge(4, 1);
		g.addEdge(6, 4);
		g.addEdge(5, 6);
		g.addEdge(5, 2);
		g.addEdge(6, 0);

		System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");

		g.BFS(0);
		System.out.println("Following is depth First Traversal " + "(starting from vertex 2)");
		g.DFS();
		System.out.println("Following is mother vertex");
		System.out.println(motherVertex(g, v));
		System.out.println("Following is  transitiveClosure");
		g.transitiveClosure();
		System.out.println("Following is iterative depth First Traversal ");
		Dfs();
		System.out.println();
		System.out.println("Following is nos of paths to reach end from first ");
		System.out.println(paths(0, 3));
		System.out.println("Following is count nos of trees in forest ");
		System.out.println(g.countTrees());
		System.out.println("following is Check if two nodes are on same path in a tree");
		int n = 9;
		Vector<Integer>[] graph = new Vector[n + 1];
		for (int i = 0; i < graph.length; i++)
			graph[i] = new Vector<Integer>();

		graph[1].add(2);
		graph[1].add(3);
		graph[3].add(6);
		graph[2].add(4);
		graph[2].add(5);
		graph[5].add(7);
		graph[5].add(8);
		graph[5].add(9);
		dfs(graph, 1);

		if (query(1, 5))
			System.out.print("Yes\n");
		else
			System.out.print("No\n");

		if (query(2, 9))
			System.out.print("Yes\n");
		else
			System.out.print("No\n");

		if (query(2, 6))
			System.out.print("Yes\n");
		else
			System.out.print("No\n");
	}

	private void BFS(int i) {
		// TODO Auto-generated method stub
		boolean x[] = new boolean[v];
		Queue<Integer> b = new LinkedList<Integer>();
		x[i] = true;
		b.add(i);

		while (!b.isEmpty()) {
			i = b.poll();

			System.out.println(i);

			for (int j = 0; j < a[i].size(); j++) {
				int n = a[i].get(j);
				if (!x[n]) {
					x[n] = true;
					b.add(n);
				}
			}
		}
	}

	private void DFS() {
		boolean x[] = new boolean[v];
		for (int i = 0; i < v; ++i)
			if (x[i] == false)
				dfs(i, x);
	}

	private void dfs(int i, boolean[] x) {
		// TODO Auto-generated method stub
		x[i] = true;
		System.out.println(i);

		for (int j = 0; j < a[i].size(); j++) {
			int n = a[i].get(j);
			if (!x[n]) {
				dfs(n, x);
			}
		}

	}

	private static void dfsMV(int i, boolean[] x) {
		// TODO Auto-generated method stub
		x[i] = true;

		for (int j = 0; j < a[i].size(); j++) {
			int n = a[i].get(j);
			if (!x[n]) {
				dfsMV(n, x);
			}
		}

	}

	private static int motherVertex(Graph_bfs_And_dfs g, int v2) {
		// TODO Auto-generated method stub
		boolean x[] = new boolean[v];
		int h = -1;
		for (int i = 0; i < v; i++) {
			if (!x[i]) {
				dfsMV(i, x);
				h = i;
			}
		}

		boolean y[] = new boolean[v];
		for (boolean i : x) {
			if (!i) {
				return -1;
			}
		}

		return h;
	}

	public void transitiveClosure() {

		for (int i = 0; i < v; i++) {
			dfsUtil(i, i);
		}

		for (int i = 0; i < v; i++) {
			System.out.println(Arrays.toString(tc[i]));
		}
	}

	private void dfsUtil(int s, int v) {

		tc[s][v] = 1;

		for (int adj : a[v]) {
			if (tc[s][adj] == 0) {
				dfsUtil(s, adj);
			}
		}
	}

	static void DFSUtil(int s, Vector<Boolean> visited) {
		Stack<Integer> stack = new Stack<>();
		stack.push(s);

		while (stack.empty() == false) {
			s = stack.peek();
			stack.pop();

			if (visited.get(s) == false) {
				System.out.print(s + " ");
				visited.set(s, true);
			}

			Iterator<Integer> itr = a[s].iterator();

			while (itr.hasNext()) {
				int v = itr.next();
				if (!visited.get(v))
					stack.push(v);
			}

		}
	}

	static void Dfs() {
		Vector<Boolean> visited = new Vector<Boolean>(v);
		for (int i = 0; i < v; i++)
			visited.add(false);

		for (int i = 0; i < v; i++)
			if (!visited.get(i))
				DFSUtil(i, visited);
	}

	private static int paths(int i, int j) {
		// TODO Auto-generated method stub
		int pathcount = 0;
		pathcount = count(i, j, pathcount);

		return pathcount;
	}

	private static int count(int i, int j, int pathcount) {
		// TODO Auto-generated method stub

		if (i == j)
			pathcount++;
		else {
			for (int k = 0; k < a[i].size(); k++) {
				pathcount = count(a[i].get(k), j, pathcount);
			}

		}

		return pathcount;
	}

	void DFSUtil(int v, boolean visited[]) {
		visited[v] = true;
		Iterator<Integer> i = a[v].listIterator();
		while (i.hasNext()) {
			int n = i.next();
			if (!visited[n]) {
				DFSUtil(n, visited);
			}
		}
	}

	int countTrees() {
		boolean visited[] = new boolean[v];
		int res = 0;

		for (int i = 0; i < v; ++i) {
			if (visited[i] == false) {
				DFSUtil(i, visited);
				res++;
			}
		}
		return res;
	}

	static int MAX = 100001;
	static boolean[] visit = new boolean[MAX];
	static int[] intime = new int[MAX];
	static int[] outtime = new int[MAX];
	static int timer = 0;

	static void dfs(Vector<Integer> graph[], int v) {
		visit[v] = true;
		++timer;
		intime[v] = timer;
		for (int it : graph[v]) {
			if (visit[it] == false)
				dfs(graph, it);
			it++;
		}
		++timer;
		outtime[v] = timer;
	}

	static boolean query(int u, int v) {
		return ((intime[u] < intime[v] && outtime[u] > outtime[v])
				|| (intime[v] < intime[u] && outtime[v] > outtime[u]));
	}
}