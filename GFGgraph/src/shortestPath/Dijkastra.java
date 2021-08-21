package shortestPath;

import java.util.Arrays;

public class Dijkastra {

	public static void main(String[] args) {
		   int graph[][] = new int[][]
		     { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
               { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
               { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
               { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
               { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
               { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
               { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
               { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
               { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
dijkstra(graph, 0);
	}
	
static int N=9,max=100000;

	private static void dijkstra(int[][] graph, int v) {

		int dis[]= new int[9];
Arrays.fill(dis, max);dis[v]=0;
boolean check[]=new boolean[9];

for(int i=0;i<N-1;i++)
	{
	int u=minDist(dis,check);
check[u]=true;
for(int j=0;j<N;j++)
{
	if(graph[u][j]!=0&&!check[j]&&dis[u]+graph[u][j]<dis[j]&&dis[u]!=max)
	{dis[j]=dis[u]+graph[u][j];}
}
	}

for(int x: dis) {System.out.println(x);}
	
	}

	private static int minDist(int[] dis, boolean[] check) {
int min= max,minIndex=-1;

for(int i=0;i<N;i++)
{
if(dis[i]<=min&&!check[i]){min=dis[i];minIndex=i;}	
}
		return minIndex;
	}
}