package intro;

import java.util.ArrayList;

public class IDDFS {
	private static int v;
	private static ArrayList<Integer> a[];
	public IDDFS(int i) {
		v = i;
		a = new ArrayList[i];
		for (int j = 0; j < i; ++j) {
			a[j] = new ArrayList<Integer>();
		}
	}
	void addEdge(int v, int w) {
		a[v].add(w);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IDDFS g = new IDDFS(7);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 3);
		g.addEdge(4, 1);
		g.addEdge(6, 4);
		g.addEdge(5, 6);
		g.addEdge(2, 5);
		g.addEdge(6, 0);
	
System.out.println("IDDFS searching ");
	    if (g.IDDFS(0, 6, 3) == true)
	    	System.out.println(true);
	    else System.out.println(false);
	    
System.out.println("Matrix Probability");
int m=5,n=5;
int i=1,j=1; //coordinates of sourcce element
int N=2; // Nos of turns to cross boundry
System.out.println(matrixProbability(i,j,m,n,N));
	}
	private boolean IDDFS(int i, int j, int k) {
for(int q=0;q<=k;q++)
{
if(DLS(i,j,q))return true;
}		
		return false;
	}
	private boolean DLS(int i, int j, int q) {
		if(i==j)return true;
		if(q<=0)return false;
		for(int z=0;z<a[i].size();z++)
		{
			if(DLS(a[i].get(z),j,q-1))
				return true;
		}	
		return false;
	}
	private static double matrixProbability(int i, int j, int m, int n, int N) {
		if(!isSafe(i,j,m,n))return 0.0;
		if(N==0)return 1.0;
		double prob=0.0;
		prob+=matrixProbability(i-1,j,m,n,N-1)*0.25;
		prob+=matrixProbability(i,j+1,m,n,N-1)*0.25;
		prob+=matrixProbability(i+1,j,m,n,N-1)*0.25;
		prob+=matrixProbability(i,j-1,m,n,N-1)*0.25;
		
		return prob;
	}
	private static boolean isSafe(int i, int j, int m, int n) {
		if(i>=0&&j>=0&&i<m&&j<n)return true;
		return false;
	}
}