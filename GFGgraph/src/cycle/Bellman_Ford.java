package cycle;

public class Bellman_Ford {
// It can be used to find -ve cycle and for dissconnected graph simple like dfs make loop 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   	    int V = 3; 
		    int E = 3; 
		    int graph[][] = 
//		    	{
//		    			{0,2,3},{2,1,1},{1,0,-5}	
//		    	};//-ve cycle detection
		    	{ { 0, 1, -1 }, { 0, 2, 4 },
		                    { 1, 2, 3 }, { 1, 3, 2 },
		                    { 1, 4, 2 }, { 3, 2, 5 },
		                    { 3, 1, 1 }, { 4, 3, -3 } };
		 
		    BellmanFord(graph, V, E, 0);
	}

	private static void BellmanFord(int[][] graph, int v, int e, int src) {
		// TODO Auto-generated method stub
		int des[]= new int[v];
		for(int k=0;k<v;k++)
		{des[k]=Integer.MAX_VALUE;}
		des[src]=0;
		
		for(int i=0;i<v-1;i++) {
			for(int j=0;j<e;j++)
			{
			if((des[graph[j][0]]!=Integer.MAX_VALUE)&&des[graph[j][0]]+graph[j][2]<des[graph[j][1]])
			{
				des[graph[j][1]]=des[graph[j][0]]+graph[j][2];
			}
			}
		}
		
		
		for(int j=0;j<e;j++)
		{
			int a=des[graph[j][0]];
			int b=graph[j][2];
            int c=des[graph[j][1]];

		if(a+b<c) {System.out.println("-ve Cycle is found");}
		
		}
		
		for(int i=0;i<v;i++)
		{System.out.println(des[i]);}
		
	}

}
