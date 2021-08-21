package intro;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Find_The_Nos_Of_Islands {

    static int r=5,c=5;
	public static void main(String[] args) {
	     int M[][] = new int[][] {
	    	 { 1, 1, 0, 0, 0 },
             { 0, 1, 0, 0, 1 },
             { 1, 0, 0, 1, 1 },
             { 0, 0, 0, 0, 0 },
             { 1, 0, 1, 0, 1 } };
     
System.out.println("Dfs and Bfs  nos of islands");
System.out.println("Islands "+CountIslands(M));
	}

	private static int CountIslands(int i[][]) {
int count=0;
boolean check[][]= new boolean [r][c];
		for(int a=0;a<i.length;a++)
		{
			for(int b=0;b<i[0].length;b++)
			{
				if(i[a][b]==1&&check[a][b]!=true)
				{
					
					DFS(i,check,a,b);
					System.out.println("Region "+(count+1)+" "+region);
					region=1;
//					BFS(i,check,a,b);
					count++;
				}
			}
		}
		return count;
	}
	static int region=1;
	//DFSSSSS
	private static void DFS(int[][] i, boolean[][] check, int a, int b) {
		  int rowNbr[] = new int[] { -1, -1, -1, 0, 0, 1, 1, 1 };
	        int colNbr[] = new int[] { -1, 0, 1, -1, 1, -1, 0, 1 };

	        check[a][b]= true;
	        
	        for(int z=0;z<rowNbr.length;z++)
	        {
	        	if(isSafe(i,check,a+rowNbr[z],b+colNbr[z]))
	        	{ region++;    	DFS(i,check,a+rowNbr[z],b+colNbr[z]);}
	        }
		
	}
	static class pair
	{
	    int first, second;
	    public pair(int first, int second)
	    {
	        this.first = first;
	        this.second = second;
	    }
	}//   BFSSSSS
static void BFS(int i[][], boolean check[][],int a, int b)
{
    int row[] = { -1, -1, -1, 0, 0, 1, 1, 1 };
    int col[] = { -1, 0, 1, -1, 1, -1, 0, 1 };
    Queue<pair> q = new LinkedList<pair>();
    q.add(new pair(a, b));
    check[a][b] = true;
    while (!q.isEmpty())
    {
 
        int r1 = q.peek().first;
        int c1 = q.peek().second;
        q.remove();
 for (int k = 0; k < 8; k++)
        {
            if (isSafe(i,check, r1 + row[k],c1 + col[k]))
            {
                check[r1 + row[k]][c1 + col[k]] = true;
                q.add(new pair(r1 + row[k], c1 + col[k]));
            }
        }
    }
}
 
	private static boolean isSafe(int[][] i, boolean[][] check, int m, int n) {
		if(m>=0&&n>=0&&m<i.length&&n<i[0].length&&i[m][n]==1&&!check[m][n])return true;
		return false;
	}
}