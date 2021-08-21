package cycle;

public class Floyd_Warshell {
static int INF=9999;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int graph[][] = { {0,   5,  INF, 10},
                 {INF, 0,   3, INF},
                 {INF, INF, 0,   1},
                 {INF, INF, INF, 0}
               };
//		 {
//			 {0, 3, INF, INF}, 
//			 {3 ,0 ,1 ,4},
//			 {INF, 1, 0, 1}, 
//			 {INF, 4, 1, 0} 
//			                };// UNDIRECTED 
		 
//		 { {0, 1, INF, INF},
//             {INF, 0, -1, INF},
//             {INF, INF, 0, -1},
//             {-1, INF, INF, 0}}; // if any negative comes in ans then its -ve cycle

floydWarshall(graph);
	}
	private static void floydWarshall(int[][] graph) {
		// TODO Auto-generated method stub
	int dex[][]=graph;
		
		for(int k=0;k<graph.length;k++)
		{
			for(int i=0;i<graph.length;i++)
			{
				for(int j=0;j<graph.length;j++)
				{
				if(dex[i][j]>dex[i][k]+dex[k][j])
				{dex[i][j]=dex[i][k]+dex[k][j];}
				}
				
			}
		}
		
		
		printGraph(graph);
	}
	private static void printGraph(int[][] graph) {
		// TODO Auto-generated method stub
		for(int i=0;i<graph.length;i++)
		{
			for(int j=0;j<graph[i].length;j++)
			{
				if(graph[i][j]==INF) {
					System.out.print("INF ");
				}else
				System.out.print(graph[i][j]+"  ");
			}
		System.out.println();
		}
	}

}
