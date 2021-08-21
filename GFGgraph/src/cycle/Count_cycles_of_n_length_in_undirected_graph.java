package cycle;

public class Count_cycles_of_n_length_in_undirected_graph {
static int count =0;
	public static void main(String[] args) {
		
        int graph[][] = {{0, 1, 0, 1, 0},
                {1, 0, 1, 0, 1},
                {0, 1, 0, 1, 0},
                {1, 0, 1, 0, 1},
                {0, 1, 0, 1, 0}};
  
int n = 4;
  
System.out.println("Total cycles of length "+
                  n + " are "+ 
                  countCycles(graph, n));
	}

	private static int countCycles(int[][] graph, int n) {
	boolean x[]= new boolean[graph.length];
	
	for(int i=0;i<graph.length-(n-1);i++)
	{
		Dfs(graph,x,n-1,i,i);
		x[i]=true;
	}
	
	
		return count/2;
	}

	private static void Dfs(int[][] graph, boolean[] x, int n, int i, int i2) {
		// TODO Auto-generated method stub
		
		x[i]=true;
		
		if(n==0)
		{
		x[i]	=false;
		if(graph[i][i2]==1) {count++;return ;}
		else return ;

		}
		
		
for(int j=0;j<graph.length;j++)
{  if(!x[j]&&graph[i][j]==1) Dfs(graph,x,n-1,j,i2);}
		
		x[i]=false;
	}

	
	
	
}