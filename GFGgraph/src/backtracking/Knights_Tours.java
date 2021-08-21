package backtracking;

import java.util.Arrays;

public class Knights_Tours {

	public static void main(String[] args) {
		//  O(8^(n^2))
solvekt();
	}
static int V=6;
	private static boolean solvekt() {
		int [][]a= new int[V][V];
	for(int i=0;i<V;i++)
	{
		Arrays.fill(a[i], -1);
	}
		a[0][0]=0;
		int xmov[]=new int[] {2,1,-1,-2,-2,-1,1,2};
		int ymov[]=new int[] {1,2,2,1,-1,-2,-2,-1};
		if(solvektutil(0,0,1,xmov,ymov,a)) {
			for(int i=0;i<V;i++)
			{
				for(int j=0;j<V;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			return true;}
		else {System.out.println("not possible");return false;}//1 is about the nos of move
		
	}

	private static boolean solvektutil(int i, int j, int k, int[] xmov, int[] ymov, int[][] a) {
int nextx,nexty;
		if(k==V*V)return true;
	
	for(int q=0;q<8;q++)
	{nextx=i+xmov[q];
	 nexty=j+ymov[q];
	 
	 if(nextx>=0&&nextx<V&&nexty>=0&&nexty<V&&a[nextx][nexty]==-1) 
	 {
		 a[nextx][nexty]=k;
		 if(solvektutil(nextx,nexty,k+1,xmov,ymov,a)) {return true;}
		 else {a[nextx][nexty]=-1;}
		 
	 }
	 
	}
	
	
	
	return false;
	}

}
