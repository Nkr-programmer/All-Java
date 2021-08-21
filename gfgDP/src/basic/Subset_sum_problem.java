package basic;

import java.util.ArrayDeque;

public class Subset_sum_problem {
static class Pair{
	public Pair(int i, int j, String pass) {
	this.i=i;
	this.j=j;
	this.pass=pass;
	
	}
	int i;
	int j;
	String pass;
}
	public static void main(String[] args) {
		//int n=14;
		int n=10;
//		int a[]= {2,3,5,7,10};
	int a[]= {4,2,7,1,3};
		int m= a.length;
		int dp[][]= new int[a.length][n+1];
		for(int i=0;i<m;i++)dp[i][0]=1;
		for(int i=0;i<m;i++)
		{
		for(int j=1;j<=n;j++){
			if(a[i]>j&&i>0) {dp[i][j]=dp[i-1][j];continue;}
		if(i>0) {	dp[i][j]=dp[i-1][j-a[i]];}
		if(a[i]==j) {dp[i][j]=1;}
		if(i>0&&dp[i-1][j]==1) {dp[i][j]=1;}
			}
		}
		
		for(int[] t:dp) {
			for(int v:t)
		{System.out.print(v+" ");}
System.out.println();
		}

		
		
		
		
		ArrayDeque<Pair> q= new ArrayDeque<>();
		q.add(new Pair(a.length,n,""));
		
		while(q.size()>0)
		{
			Pair rem=q.removeFirst();
			
	if(rem.i==0&&rem.j==0)
	{System.out.println(rem.pass);}
	else {
		
		if(rem.i-1>=0&&rem.j>=a[rem.i-1])
		{int inc= dp[rem.i-1][rem.j-a[rem.i-1]];
			if(inc==1) 
			{
				q.add(new Pair(rem.i-1,rem.j-a[rem.i-1],rem.pass+a[(rem.i-1)]+" "));
			}
		}
		
	if((rem.i-1)>=0) {	int exc=dp[rem.i-1][rem.j];
		if(exc==1) 
		{q.add(new Pair(rem.i-1,rem.j,rem.pass));}}
}
	
			
		}		
		
		
		
		

		//Is there any subset   **** MOST IMPORTANT
		System.out.println("yes"+dp[a.length-1][n]);	
// O(mn) but space is also O(mn)
		
        int  subset[][] = new int[2][n+1];
        
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
        
                if (j == 0)
                    subset[i % 2][j] = 1; 
                else if (i == 0)
                    subset[i % 2][j] = 0; 
                else if (a[i - 1] <= j)
                    subset[i % 2][j] = subset[(i + 1) % 2][j - a[i - 1]]==1 || subset[(i + 1) % 2][j]==1?1:0;
                else
                    subset[i % 2][j] = subset[(i + 1) % 2][j];
            }
        }
       System.out.println(subset[m % 2][n]);
	}
}