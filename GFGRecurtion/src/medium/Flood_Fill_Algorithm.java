package medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Flood_Fill_Algorithm {

	  public static void main(String[] args) throws IOException
	    {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int T = Integer.parseInt(br.readLine().trim());
	        while(T-->0)
	        {
	            String[] S1 = br.readLine().trim().split(" ");
	            int n = Integer.parseInt(S1[0]);
	            int m = Integer.parseInt(S1[1]);
	            int[][] image =  new int[n][m];
	            for(int i = 0; i < n; i++){
	                String[] S2 = br.readLine().trim().split(" ");
	                for(int j = 0; j < m; j++)
	                    image[i][j] = Integer.parseInt(S2[j]);
	            }
	            String[] S3 = br.readLine().trim().split(" ");
	            int sr = Integer.parseInt(S3[0]);
	            int sc = Integer.parseInt(S3[1]);
	            int newColor = Integer.parseInt(S3[2]);
	            flood obj = new flood();
	            int[][] ans = obj.floodFill(image, sr, sc, newColor);
	            for(int i = 0; i < ans.length; i++){
	                for(int j = 0; j < ans[i].length; j++)
	                    System.out.print(ans[i][j] + " ");
	                System.out.println();
	            }
	        }
	    }
	}
	class flood
	{
	    public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
	    {	
	    if(image[sr][sc]!=newColor) {	
		 int old=image[sr][sc];
		        dfs(image,sr,sc,old,newColor);
	    }

	        return image;
	    }
		public static void dfs(int[][] g, int i, int j, int parent,int newColor)
		{
		    if(i<0 || j<0 || i>=g.length|| j>=g[i].length || g[i][j]!=parent)
		    return;
		    g[i][j]=newColor;
		    dfs(g,i+1,j,parent,newColor);
		    dfs(g,i-1,j,parent,newColor);
		    dfs(g,i,j+1,parent,newColor);
		    dfs(g,i,j-1,parent,newColor);
		}
	}