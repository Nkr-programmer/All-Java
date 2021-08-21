package intro;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Moves_needed_to_move_in_matrix_between_src_and_des {
	private static int v;
	private static ArrayList<Integer> a[];

	public Moves_needed_to_move_in_matrix_between_src_and_des(int i) {
		v = i;
		a = new ArrayList[i];
		for (int j = 0; j < i; ++j) {
			a[j] = new ArrayList<Integer>();
		}
	}
	static void addEdge(int v, int w) {
		a[v].add(w);
		a[w].add(v);
		}

	public static void main(String[] args) {
		
		int m=5,n=5,k=2,r=1;
		int a[]= {1,3};
		int b[]= {3,3};
		int c[][]=new int[m][n];
		
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				c[i][j]=3;
			}
		}
		
		
		int q=a[0]-1,w=a[1]-1;
		for(int i=0;i<k;i++)
		{
		 if(i==0) {q=a[0]-1;w=a[1]-1;}
		 else
			 if(i==1) {q=b[0]-1;w=b[1]-1;}
		 
    //if((q-r)>=0&&(w+r)<=m-1) {c[q-r][w+r]=0;}
	if((q)>=0&&(w+r)<=m-1) {c[q][w+r]=0;}
	//if((q+r)<=m-1&&(w+r)<=m-1) {c[q+r][w+r]=0;}
	if((q-r)>=0&&(w)<=m-1) {c[q-r][w]=0;}
	if((q)>=0&&(w)<=m-1) {c[q][w]=0;}
	if((q+r)<=m-1&&(w)<=m-1) {c[q+r][w]=0;}
	//if((q-r)>=0&&(w-r)>=0) {c[q-r][w-r]=0;}
	if((q)>=0&&(w-r)>=0) {c[q][w-r]=0;}
	//if((q+r)<=m-1&&(w-r)>=0) {c[q+r][w-r]=0;}
		}
		c[0][0]=1;c[m-1][n-1]=2;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println( BFSmin(c));
		
       
	}

	
	private static int BFSmin(int[][] c) {
	int v=c.length*c.length+2;
	Moves_needed_to_move_in_matrix_between_src_and_des x=new Moves_needed_to_move_in_matrix_between_src_and_des(v);
	
	int k=1,s=0,d=0;
	for(int i=0;i<c.length;i++)
	{
		for(int j=0;j<c[0].length;j++)
		{
			
			if(c[i][j]!=0)
			{
			if(isSafe(i,j+1,c)) {addEdge(k,k+1);}
			if(isSafe(i,j-1,c)) {addEdge(k,k-1);}
			if(isSafe(i-1,j,c)) {addEdge(k,k-c.length);}
			if(isSafe(i+1,j,c)) {addEdge(k,k+c.length);}
			
			}
			
			if(c[i][j]==1) {s=k;}
			if(c[i][j]==2) {d=k;}
		k++;
		}
	}
	HashSet<Integer>q= new HashSet<Integer>();
	return bfs(s,d);
//return dfs(s,d,q);
	}
	private static int bfs(int s, int d) {
		 if (s == d)
		        return 0;

		    int level[] = new int[v];
		    for (int i = 0; i < v; i++)
		        level[i] = -1  ;
		 
		    Queue<Integer> queue= new LinkedList<Integer>();
		 
		    level[s] = 0 ;
		    queue.add(s);
		 
		    while (!queue.isEmpty())
		    {
		        s = queue.poll();		 
		       for (int i=0;i<a[s].size();i++)
		        {
		                      if (level[a[s].get(i)] < 0 || level[a[s].get(i)] > level[s] + 1 )
		            {
		                level[a[s].get(i)] = level[s] + 1 ;
		                queue.add(a[s].get(i));
		            }
		        }
		 
		    }int h=0;
		 for(int x:level)
		 {
			 System.out.println(h +" "+x);h++;
		 }
		    
		    
		    return level[d] ;	
	}
	private static int dfs(int s, int d, HashSet<Integer> q) {
//		 if (s == d)
//        return 0;
//		        int res= Integer.MAX_VALUE;
//		        q.add(s);
//		        for (int i=0;i<a[s].size();i++) {
//		        	System.out.println(a[s].get(i));
//		            if (!q.contains(a[s].get(i)))
//		                res = Math.min(res, 1 + dfs(a[s].get(i), d, q));
//		        }
		            return 0;
	}
	private static boolean isSafe(int i, int j, int[][] c) {
		// TODO Auto-generated method stub
		
		   if ((i < 0 || i >= c.length) ||
		            (j < 0 || j >= c.length ) || c[i][j] == 0)
		        return false;
		    return true;
	}
	


}