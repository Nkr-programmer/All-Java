package medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
//FLOYD FILL ALGORITHM
public class GOOGLE_Replace_O_With_X {
	public static void main (String[] args)throws IOException 
	{
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String s[] = br.readLine().split(" ");
		    int m = Integer.parseInt(s[0]);
		    int n = Integer.parseInt(s[1]);
		    String str[] = br.readLine().split(" ");
		    char g[][] = new char[m][n];
		    int gg=0;
		    for(int i=0; i<m; i++)
		    {
		        for(int j=0; j<n; j++)
		        g[i][j]= str[gg++].charAt(0);
		    }
		    //visited= new boolean[m][n];
		    for(int i=0; i<m; i++)
		    {
		        for(int j=0; j<n; j++)
		        {
		            if(g[i][j]=='O')
		            g[i][j]='-';
		        }
		    }
		    for(int i=0; i<n; i++)
		    {
		        if(g[0][i]=='-')
		        dfs(g,0,i,g[0][i]);
		    }

		    for(int i=0; i<n; i++)
		    {
		        if(g[m-1][i]=='-')
		        dfs(g,m-1,i,g[m-1][i]);
		    }
		    for(int i=0; i<m; i++)
		    {
		        if(g[i][0]=='-')
		        dfs(g,i,0,g[i][0]);
		    }
		    for(int i=0; i<m; i++)
		    {
		        if(g[i][n-1]=='-')
		        dfs(g,i,n-1,g[i][n-1]);
		    }
		    for(int i=0; i<m; i++)
		    {
		        for(int j=0; j<n; j++)
		        {
		            if(g[i][j]=='-')
		            System.out.print('X'+" ");
		            else
		            System.out.print(g[i][j]+" ");
		        }
		    }
		    System.out.println();
		}
	}
	public static void dfs(char[][] g, int i, int j, int parent)
	{
	    if(i<0 || j<0 || i>=g.length|| j>=g[i].length || g[i][j]!=parent)
	    return;
	    g[i][j]='O';
	    dfs(g,i+1,j,parent);
	    dfs(g,i-1,j,parent);
	    dfs(g,i,j+1,parent);
	    dfs(g,i,j-1,parent);
	}
}
