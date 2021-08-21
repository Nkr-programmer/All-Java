package cycle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Bipartite_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int G[][] = {
        		{0, 1, 0, 0, 1},
                {1, 0, 1, 0, 0},
                {0, 1, 0, 1, 0},
                {0, 0, 1, 0, 1},
                {1, 0, 0, 1, 0}};
                               
      if (containsOdd(G, 0))
          System.out.println("Yes") ;
       else
              System.out.println("No");
      
      //if it is in arraayList
      
      ArrayList<Integer> x[] = new ArrayList[4];
		for (int i = 0; i < 4; i++)
			x[i] = new ArrayList<Integer>();
		
		x[0].add(1);
		x[0].add(2);
		x[1].add(3);
		
		  if (containsOdd(G, 0))
	          System.out.println("Yes") ;
	       else
	              System.out.println("No"); 
  }
	
	private static boolean containsOdd(int[][] g, int i) {
		// TODO Auto-generated method stub#
		int col[]=new int[g.length];
		Arrays.fill(col, -1);
		col[i]=1;
		Queue<Integer>a= new LinkedList<Integer>();
		a.add(i);
		while(!a.isEmpty())
		{
			int u=a.poll();
			if(g[u][u]==1) {return true;}//self loop 1 odd leength cycle
			
			for(int j=0;j<g[u].length;j++)
			{
				if(g[u][j]==1&&col[j]==-1) {col[j]=1-col[u];a.add(j);}
				else if(g[u][j]==1&&col[j]==col[u]) {return true;}
			}		
		}
		return false;
	}
	//for disconnected  G IS ALSO CHANGED // G is exactly like nestet arrayList in array
	  private static boolean containOdd(int[][] g, int i) {
			// TODO Auto-generated method stub#
	        
			int col[]=new int[g.length];
			Arrays.fill(col, -1);
			int iscol=0;
	        col[i]=1;
			Queue<Integer>a= new LinkedList<Integer>();
			a.add(i);
	        
			while(!a.isEmpty())
			{
				int u=a.poll();
				
				
				for(int j=0;j<g[u].length;j++)
				{
					if(col[g[u][j]]==-1) {col[g[u][j]]=1-col[u];a.add(g[u][j]);}
					else if(col[g[u][j]]==col[u]) {return true;}
				}		
			if(g[u].length==0&&u+1<g.length){if(a.isEmpty())a.add(u+1);}
	        if(a.isEmpty()&&col[g.length-1]==-1){col[g.length-1]=1;a.add(g.length-1);}
	        }

			return false;
		}
		private static boolean containsOdd(ArrayList<Integer>[]  g, int i) {
			// TODO Auto-generated method stub#
	        
			int col[]=new int[g.length];
			Arrays.fill(col, -1);
			int iscol=0;
	        col[i]=1;
			Queue<Integer>a= new LinkedList<Integer>();
			a.add(i);
	        
			while(!a.isEmpty())
			{
				int u=a.poll();
				//if(g[u][u]==1) {return true;}//self loop 1 odd leength cycle
				
				for(int j=0;j<g[u].size();j++)
				{
					if(col[g[u].get(j)]==-1) {col[g[u].get(j)]=1-col[u];a.add(g[u].get(j));}
					else if(col[g[u].get(j)]==col[u]) {return true;}
				}		
			if(g[u].size()==0&&u+1<g.length){if(a.isEmpty())a.add(u+1);}
	        if(a.isEmpty()&&col[g.length-1]==-1){col[g.length-1]=1;a.add(g.length-1);}
	        }

			return false;
		}
}