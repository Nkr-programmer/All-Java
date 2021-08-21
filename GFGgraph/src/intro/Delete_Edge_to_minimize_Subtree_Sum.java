package intro;

import java.util.ArrayList;

public class Delete_Edge_to_minimize_Subtree_Sum {

	static int res;
	public static void main(String[] args) {
		 res = Integer.MAX_VALUE;
		 
		    int[] vertex = { 4, 2, 1, 6, 3, 5, 2 };
		    int[][] edges = { { 0, 1 }, { 0, 2 },
		                      { 0, 3 }, { 2, 4 },
		                      { 2, 5 }, { 3, 6 } };
		    int N = vertex.length;
		 System.out.println("Following is min subtree sum difference");
		    System.out.println(getMinSubtreeSumDifference(
		        vertex, edges, N));
	}
	private static int getMinSubtreeSumDifference(int[] vertex, int[][] edges, int n) {
		// TODO Auto-generated method stub
	int totalSum=0;
int subtree[]= new int[n];
	for(int i=0;i<n;i++)
	{
		subtree[i]=vertex[i];
		totalSum+=vertex[i];
	}
		ArrayList<Integer>a[]= new ArrayList[n];
	for(int i=0;i<n;i++)
	{
		a[i]= new ArrayList();
	}
	for(int i=0;i<n-1;i++)
	{
		a[edges[i][0]].add(edges[i][1]);
		a[edges[i][1]].add(edges[i][0]);
	}
	
dfs(0,-1,a,subtree,totalSum);		
		return res;
	}
	private static void dfs(int u, int v, ArrayList<Integer>[] a, int[] subtree, int totalSum) {
		// TODO Auto-generated method stub
		
		int sum= subtree[u];
		for (int j = 0; j < a[u].size(); j++) {
			int n = a[u].get(j);
			if (n!=v) {
		       dfs(n,u,a,subtree,totalSum);
		       sum+=subtree[n];
			}
		}
		subtree[u]=sum;
		
		if(u!=0&&Math.abs(totalSum-2*sum)<res)
		{res=Math.abs(totalSum-2*sum);}
	}
}