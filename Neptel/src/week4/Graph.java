package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Graph {
	int N;
	 static ArrayList<ArrayList<Integer>> adj;
	  Graph(int V){
	        this.N = V;
	        adj = new ArrayList<>();
	        for(int i=0;i<V;i++)
	            adj.add(new ArrayList<>());
	    }
	 
	    // function to add an edge to graph
	    void addEdge(int v, int w)
	    {
	        adj.get(v).add(w);
	        adj.get(w).add(v);
	    }
	 
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
			int		n = Integer.parseInt(st.nextToken());
			int		q = Integer.parseInt(st.nextToken());
			int[][] x= new int[n][n];
			   Graph g = new Graph(n);

			for(int i=0;i<q;i++)
			{
				 st = new StringTokenizer(br.readLine());
				 int a= Integer.parseInt(st.nextToken());
				 int u= Integer.parseInt(st.nextToken());
				 int v= Integer.parseInt(st.nextToken());
				if(a==0) {g.addEdge(u, v);}
				else {System.out.println(isReachable(u,v,n)?1:0);}
			}
			 
	          }

	private static boolean isReachable(int s, int d,int n) {
       if (s == d)
            return true;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++)
            visited[i] = false;
        Queue<Integer> queue = new LinkedList<>();
        visited[s] = true;
        queue.add(s);
        while (!queue.isEmpty()) {
            s = queue.remove();
            for (int i=0; i<adj.get(s).size();i++) {
                if (adj.get(s).get(i) == d)
                return true;
                if (!visited[adj.get(s).get(i)]) {
                    visited[adj.get(s).get(i)] = true;
                    queue.add(adj.get(s).get(i));
                }
            }
        }
    return false;
    }
		

	}