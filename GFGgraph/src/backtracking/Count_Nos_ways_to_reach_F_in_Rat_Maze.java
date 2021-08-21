package backtracking;

public class Count_Nos_ways_to_reach_F_in_Rat_Maze {

	public static void main(String[] args) {
//o(m*n)
        int maze[][] = 
        	  { { 0, 0, 0, 0, 0 },
                { 0, 0, 0, -1, 0 },
                { 0 , 0, 0, -1, 0 },
                { -1, -1, -1, -1, 0 },
                { -1, -1, -1, -1, 0 }};
        System.out.println (countPaths(maze));
System.out.println("Count all possible paths from top left to bottom right of a mXn matrix");

System.out.println(numberOfPaths2(3, 3));
	}
static int R=5;
static int C=5;
	private static int countPaths(int[][] maze) {
		
		if(maze[0][0]==-1)return 0;
		
		for(int i=0;i<R;i++)
		{
			if(maze[i][0]==0) {maze[i][0]=1;}
			else break;
		}
		for(int i=1;i<C;i++)
		{
			if(maze[0][i]==0) {maze[0][i]=1;}
			else break;
		}
		
		for(int i=1;i<R;i++) {
			for(int j=1;j<C;j++)
			{
				if(maze[i][j]==-1)continue;
				
				if(maze[i-1][j]>0) {maze[i][j]=maze[i][j]+maze[i-1][j];}
				if(maze[i][j-1]>0) {maze[i][j]=maze[i][j]+maze[i][j-1];}
				
			
			}
		}
		
		
		for(int i=0;i<R;i++)
		{
			for(int j=0;j<C;j++)
			{
					System.out.print(maze[i][j]+" ");
			}
			System.out.println();
		}
		return maze[R-1][C-1]>0?maze[R-1][C-1]:0;
	}
	  static int numberOfPaths(int m, int n)
	    {
	        // We have to calculate m+n-2 C n-1 here
	        // which will be (m+n-2)! / (n-1)! (m-1)!
	        int path = 1;
	        for (int i = n; i < (m + n - 1); i++) {
	            path *= i;
	            path /= (i - n + 1);
	        }
	        return path;
	    }
	  static int numberOfPaths2(int m, int n)
	    {
	        // Create a 1D array to store results of subproblems
	        int[] dp = new int[n];
	        dp[0] = 1;
	 
	        for (int i = 0; i < m; i++) {
	            for (int j = 1; j < n; j++) {
	                dp[j] += dp[j - 1];
	            }
	        }
	 
	        return dp[n - 1];
	    }
}
