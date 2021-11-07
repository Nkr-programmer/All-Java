package dp;

import java.math.BigInteger;
import java.util.*;

public class t345to404 {
public static void main(String[] args) {
	  int A[]=new int[] {1,3,9,10};
      int k = 51;
      System.out.println(subsets2(A, A.length,k));
	}

//1
	//coin Change
	//O(2^n)
	
	 public long count(int S[], int m, int n) {
		    c=0;
		    ArrayList<Integer>    aa=new ArrayList<Integer>();
		 findout(S,n,0,m-1,aa);    
		return c;
		        }
		        long c;
		        public void findout(int s[],int m,int i,int n, ArrayList<Integer>aa)
		{
		    if(m==0){c++;
		   // System.out.print(aa);
		    return ;}
		    if(i>n)return ;
		    long a=0;
		    if(m-s[i]>=0){aa.add(s[i]);int h=aa.size();
		     findout(s,m-s[i],i,n,aa);
		     aa.remove(h-1);
		    }
		    findout(s,m,i+1,n,aa);
		} 
//O(M*N) Memo
		        
		        public long count2(int S[], int m, int n){long c=0;
		        long [][]dp=new long[m][n];
		        for(long j[]:dp)Arrays.fill(j,-1);
		       		return findout(S,0,n,0,m-1,c,dp);    
		       		        }
		        public long findout(int s[],int w,int m,int i,int n, long c,long dp[][])
				{
				    if(m==w){c++;
				    return c;}
				    if(i>n)return 0;
				    if(dp[i][w]!=-1)return dp[i][w];
				    if(w+s[i]>m)return 0;
				    long a=findout(s,w+s[i],m,i,n,c,dp);
				    long b=findout(s,w,m,i+1,n,c,dp);
				    c=a+b;
				    dp[i][w]=c;
				    return c;
				}
		        //dp O(m*n) O(n)
		        public long count3(int S[], int m, int n){long c=0;
		        long []dp=new long[n+1];
		        Arrays.fill(dp,0);
		        dp[0]=1;
		        for(int i=0;i<m;i++)
		        {
		            for(int j=S[i];j<=n;j++)
		            {
		               dp[j]+=dp[j-S[i]];
		            }
		        }
		       		return dp[n];    
		       		        }
		    //2
		        //recurtion
		        static int knapSack(int W, int wt[], int val[], int n)
		        {
		            if (n == 0 || W == 0)return 0;
		            if (wt[n - 1] > W)
		                return knapSack(W, wt, val, n - 1);
		        return Math.max(val[n - 1]+ knapSack(W - wt[n - 1], wt,val, n - 1),
		                           knapSack(W, wt, val, n - 1));
		        }
		        //memo
		        static int knapSack2(int W, int wt[], int val[], int n) 
		        {
		            int dp[][]=new int[n+1][W+1];
		            for(int g[]:dp)Arrays.fill(g,-1);
		       return knap(W,wt,val,n,dp);
		            } 
		      public static int knap(int W,int[]wt,int []val,int i,int dp[][])
		      {
		          if(W==0)return 0;
		          if(i==0)return 0;
		          if(dp[i][W]!=-1)return dp[i][W];
		          if(W-wt[i-1]<0){dp[i][W]=knap(W,wt,val,i-1,dp); return dp[i][W];}

		          dp[i][W]= Math.max(val[i-1]+knap(W-wt[i-1],wt,val,i-1,dp),
		          knap(W,wt,val,i-1,dp));
		    return dp[i][W];       
		      }
		      //dp
		      static int knapSack3(int W, int wt[], int val[], int n) 
		      {
		         int i, w;
		          int K[][] = new int[n + 1][W + 1];
		   for (i = 0; i <= n; i++)
		          {  for (w = 0; w <= W; w++)
		              {  if (i == 0 || w == 0)K[i][w] = 0;
		                  else if (wt[i - 1] <= w)
		                  K[i][w] = Math.max(val[i - 1] + K[i - 1][w - wt[i - 1]],K[i - 1][w]);
		                  else K[i][w] = K[i - 1][w];
		              }
		          }
		          return K[n][W];      
		    }
		        //3
		        //recurtion
		        static int nCr(int n, int r)
		        {return ncrs(n,r);}
		    static int ncrs(int n,int r)
		    {
		        if(r==0||r==n)return 1;
		        return ncrs(n-1,r-1)+ncrs(n-1,r);
		    }
		    //memo
		    static int nCr2(int n, int r)
		    {if(r>n)return 0;return ncrs(n,r,new int[n+1][r+1]);}
		static int ncrs(int n,int r,int [][]dp)
		{
		    if(r==0||r==n)return 1;
		    if(dp[n][r]!=0)return dp[n][r];
		      dp[n][r]=(ncrs(n-1,r-1,dp)%1000000007+ncrs(n-1,r,dp)%1000000007)%1000000007;
		return dp[n][r];
		}
		//dp
		static int nCr3(int n, int r)
	    {if(r>n)return 0;
	    int dp[][]=new int[n+1][r+1];
	    for(int i=1;i<=n;i++)
	    {for(int j=0;j<=r;j++)
	    {        if(i==j||j==0){dp[i][j]=1;}
	      else{dp[i][j]=((dp[i-1][j-1]%1000000007)+(dp[i-1][j]%1000000007))%1000000007;}
	    }}
	        return dp[n][r];
	    }
		//4
		//permutation coefficent
	 //recursive
		static int nPr3(int n, int r)
        {return nPrs(n,r);}
        static int nPrs(int n,int r)
    {
        if(r>n)return 0;
        if(r==0)return 1;
        return nPrs(n-1,r)+(r*nPrs(n-1,r-1));
    }
        //memo
        static int nPr2(int n, int r)
        {int dp[][]=new int[n+1][r+1];
        for(int[] x:dp) {Arrays.fill(x,-1);}
        	return nPrs(n,r,dp);}
        static int nPrs(int n,int r,int dp[][])
    {
        if(r>n)return 0;
        if(r==0)return 1;
 if(dp[n][r]!=-1)return dp[n][r];
        dp[n][r]= nPrs(n-1,r,dp)+(r*nPrs(n-1,r-1,dp));
    return dp[n][r];
    }
        //dp
        static int nPr(int n,int r)
        {int dp[][]=new int[n+1][r+1];
        for(int i=0;i<=n;i++)
        {
        	for(int j=0;j<=Math.min(i,r);j++)
        	{
        		if(j==0)dp[i][j]=1;
        		else
        		 dp[i][j]= dp[i-1][j]+(j*dp[i-1][j-1]);
        	}
        }
        	return dp[n][r];
        }
        //5
        //recursive
        public static int findCatalan(int n)
        {           return find(n);}
        public static int find(int n){
            if(n<=1)return 1;
            int ans=0;
            for(int i=0;i<n;i++)
            ans+=find(i)*find(n-i-1);
            return ans;
        }
        //memo
        public static long findCatalan2(int n)
        {long dp[]=new long[n+1];Arrays.fill(dp,-1);return find(n,dp);}
        public static long find(int n,long[]dp){
            if(n<=1)return 1;
            long ans=0;
            if(dp[n]!=-1)return dp[n];
            for(int i=0;i<n;i++)
            ans+=find(i,dp)*find(n-i-1,dp);
            return dp[n]= ans;
        }
        //dp
        static int catalan3(int n)
        { int catalan[] = new int[n + 2];
            catalan[0] = 1;
            catalan[1] = 1;
            for (int i = 2; i <= n; i++) {
                catalan[i] = 0;
                for (int j = 0; j < i; j++) {
                    catalan[i]
                        += catalan[j] * catalan[i - j - 1];
                }
            }
         return catalan[n];
        }
        //O(N)
        static long catalan4(int n, int k)
        {
            long res = 1;
            if (k > n - k) {
                k = n - k;
            }
            for (int i = 0; i < k; ++i) {
                res *= (n - i);
                res /= (i + 1);
            }
            return res;
        }
     static long catalan(int n)
        {  long c = catalan4(2 * n, n);
           return c / (n + 1);
        }
     //BigInteger
     public static BigInteger findCatalan5(int n)
     {BigInteger x=new BigInteger("1");
     for(int i=1;i<=n;i++)
     {x=x.multiply(BigInteger.valueOf(i));}
      x=x.multiply(x);
      BigInteger d=new BigInteger("1");
      for(int i=1;i<=2*n;i++)
      {d=d.multiply(BigInteger.valueOf(i));}
      d=d.divide(x);
      d=d.divide(BigInteger.valueOf(n+1));
      return d;
      }
     //6
     //recursive
     static int matrixMultiplication(int N, int arr[])
     {return m(arr,1,N-1);    }
     static int m(int arr[],int i,int j)
     {   int ans=0,min=Integer.MAX_VALUE;
         if(i==j)return 0;
         for(int k=i;k<j;k++)
         {ans=m(arr,i,k)+m(arr,k+1,j)+(arr[i-1]*arr[k]*arr[j]);
         min=Math.min(min,ans);}
     return min;}
     //memo  //O(n3)
     static int matrixMultiplication2(int N, int arr[])
     {int dp[][]=new int[N+1][N+1];for(int[]d:dp)Arrays.fill(d, -1);
    	 return m(arr,1,N-1,dp); }
     static int m(int arr[],int i,int j,int[][]dp)
     {   int ans=0,min=Integer.MAX_VALUE;
         if(i==j)return 0;
         if(dp[i][j]!=-1)return dp[i][j];
         for(int k=i;k<j;k++)
         {ans=m(arr,i,k,dp)+m(arr,k+1,j,dp)+(arr[i-1]*arr[k]*arr[j]);
         min=Math.min(min,ans);}
     return dp[i][j]=min;}
     //dp
     static int matrixMultiplication3(int n, int arr[])
     {int dp[][]=new int[n+1][n+1];
     for(int l=2;l<n;l++)
     {
         for(int i=1;i<n-l+1;i++)
         {int j=i+l-1,ans=0;dp[i][j]=Integer.MAX_VALUE;
         if(j==n)continue;
             for(int k=i;k<j;k++)
            {ans=dp[i][k]+dp[k+1][j]+(arr[i-1]*arr[k]*arr[j]);
            dp[i][j]=Math.min(dp[i][j],ans);}
         }
     }
       	 return dp[1][n-1]; }
     //7
     //recursive
     public int editDistance(String s, String t) {
    	   return edit(s,t,s.length(),t.length());
    	    }
    	    public int edit(String s,String t ,int n,int m)
    	    {
    	        if(n==0)return m;
    	        if(m==0)return n;
    	        if(s.charAt(n-1)==t.charAt(m-1))return edit(s,t,n-1,m-1);
    	        return 1+Math.min(edit(s,t,n-1,m-1),Math.min(edit(s,t,n-1,m),edit(s,t,n,m-1)));
    	    }
    	    //memo
    	    public int editDistance2(String s, String t) {
    	    	int dp[][]=new int [s.length()+1][t.length()+1];
    	    	for(int d[]:dp)Arrays.fill(d,-1);
    	    	   return edit(s,t,s.length(),t.length(),dp);
    	    	    }
    	    	    public int edit(String s,String t ,int n,int m,int [][]dp)
    	    	    {
    	    	        if(n==0)return m;
    	    	        if(m==0)return n;
    	    	        if(dp[n][m]!=-1)return dp[n][m];
    	    	        if(s.charAt(n-1)==t.charAt(m-1))return edit(s,t,n-1,m-1,dp);
    	    	        return dp[n][m]=1+Math.min(edit(s,t,n-1,m-1,dp),Math.min(edit(s,t,n-1,m,dp),edit(s,t,n,m-1,dp)));
    	    	    }
    	    	    //dp
    	    	    public int editDistance3(String s, String t) {int n=s.length(),m=t.length();
    	            int dp[][]=new int [n+1][m+1];
    	            for(int i=0;i<=n;i++)
    	            {  for(int j=0;j<=m;j++)
    	                {if(i==0)dp[i][j]=j;
    	                else if(j==0)dp[i][j]=i;
    	                   else  if(s.charAt(i-1)==t.charAt(j-1))dp[i][j]=dp[i-1][j-1];
    	                    else{dp[i][j]=1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));}
    	                }
    	            }
    	        	    	   return dp[n][m];
    	        	    	    }
		//8
        //SUBSET SUM PROBLEM BUT SAME AS 40 PARTION PROBLEM 
        //BUT SUBSET SUM PROBLEM IS JUST SMALLER VERTION OF 0-1 KNAPSACK PROBLEM
		//recurtion
		static int equalPartition(int n, int arr[])
	    {
	    int sum=0;
	    for(int x:arr){sum+=x;}
	    if(sum%2==1)return 0; 
	    return sets(arr,sum/2,0);
	    }
	    static int sets(int arr[],int x ,int i)
	    {
	        if(i>=arr.length)return 0;
	        if(x<0)return 0;
	        if(x==0)return 1;
	        int a=sets(arr,x-arr[i],i+1);
	        int b=sets(arr,x,i+1);
	    return a==1||b==1?1:0;
	    }
//memo
	    static int equalPartition1(int n, int arr[])
	    {
	    int sum=0;
	    for(int x:arr){sum+=x;}
	    if(sum%2==1)return 0; 
	    int dp[][]=new int[n][(sum/2)+1];
	    for(int[]x:dp)Arrays.fill(x,-1);
	    return sets(arr,sum/2,0,dp);
	    }
	    static int sets(int arr[],int x ,int i,int dp[][])
	    {
	        if(i>=arr.length)return 0;
	        if(x<0)return 0;
	        if(x==0)return 1;
	        if(dp[i][x]!=-1)return dp[i][x];
	        int a=sets(arr,x-arr[i],i+1,dp);
	        int b=sets(arr,x,i+1,dp);
	        dp[i][x]= a==1||b==1?1:0;
	        return dp[i][x];
	    }
	    //dp
	    static int equalPartition3(int n, int arr[])
	    {
	    int sum=0;
	    for(int x:arr){sum+=x;}
	    if(sum%2==1)return 0; 
	    int dp[][]=new int[n+1][(sum/2)+1];
	    for(int[]x:dp)Arrays.fill(x,-1);
	    sum/=2;
	    for(int i=0;i<n;i++){dp[i][0]=1;}
	    for(int i=1;i<=n;i++)
	    {
	        for(int j=0;j<=sum;j++)
	        {
	         int a=0;
	         if((j-arr[i-1])<=sum&&(j-arr[i-1])>=0)
	         a=dp[i-1][j-arr[i-1]];
	        int b=dp[i-1][j];
	        dp[i][j]= a==1||b==1?1:0; 
	        }
	    }
	    return dp[n][sum];
	    }
//9
	    //recurtion
	    public long countFriendsPairings(int n) 
	    {return count(n);   }
	    public long count(int n)
	    {
	        if(n==1)return 1;
	        if(n==2)return 2;
	        return (((n-1)*count(n-2))%1000000007+(count(n-1))%1000000007)%1000000007;
	    }
	    //memo
	    public long countFriendsPairings2(int n) 
	    {return count(n,new long[n+1]);   }
	    public long count(int n,long dp[])
	    {    if(n==1)return 1;
	        if(n==2)return 2;
	        if(dp[n]!=0){return dp[n];}
	        dp[n]= (((n-1)*count(n-2,dp))%1000000007+(count(n-1,dp)%1000000007))%1000000007;
	    return dp[n];
	    }
	    //dp
	    public long countFriendsPairings3(int n) 
	    {
	        if(n==1)return (long)1;
	        if(n==2)return (long)2;
	        long dp[]=new long[n+1];dp[1]=1;dp[2]=2;
	        for(int i=3;i<=n;i++)
	        {dp[i]= (((i-1)*dp[i-2])%1000000007+(dp[i-1]%1000000007))%1000000007;}
	        return dp[n];   }
	    
	    //10
	    //recursive
	    static int maxGold(int n, int m, int M[][])
	    {
	        int[][] dp = new int[n][m];
	        int max=Integer.MIN_VALUE;
	        for(int i=0;i<n;i++)
	        max=Math.max(fun(n,m,M,i,0),max);
	        return max;
	    }
	    
	    static int fun(int n,int m,int[][] arr,int i,int j)
	    {
	         if(i<0||j<0||i>=n||j>=m)return 0;
	        if(j==m-1)
	        return arr[i][j];
	        int max=Integer.MIN_VALUE;
	        int nbm=arr[i][j]+Math.max(fun(n,m,arr,i+1,j+1),Math.max(fun(n,m,arr,i,j+1),fun(n,m,arr,i-1,j+1)));
	        max=Math.max(max,nbm);
	        return max;
	    }
	    //memo
	    static int maxGold2(int n, int m, int M[][])
	    {
	        int[][] dp = new int[n][m];
	        for(int i=0;i<n;i++)
	        Arrays.fill(dp[i],-1);
	        
	        int max=Integer.MIN_VALUE;
	        for(int i=0;i<n;i++)
	        max=Math.max(fun(n,m,M,dp,i,0),max);
	        
	        return max;
	    }
	    
	    static int fun(int n,int m,int[][] arr,int[][] dp,int i,int j)
	    {
	         if(i<0||j<0||i>=n||j>=m)return 0;
	        if(j==m-1)
	        return arr[i][j];
	        if(dp[i][j]!=-1)
	        return dp[i][j];
	        int max=Integer.MIN_VALUE;
	        int nbm=arr[i][j]+Math.max(fun(n,m,arr,dp,i+1,j+1),Math.max(fun(n,m,arr,dp,i,j+1),fun(n,m,arr,dp,i-1,j+1)));
	        max=Math.max(max,nbm);
	        dp[i][j]=max;
	        return max;
	    }
	    //dp
	    static int maxGold3(int n, int m, int M[][])
	    {   
	        int dp[][]= new int[n][m];
	        for(int i=0; i<n; i++){ dp[i][m-1]=M[i][m-1];   }
	        for(int j=m-2; j>=0; j--){
	            for(int i=0; i<n; i++){
	                int max=0;
	                if(i-1>=0 && j+1<m)max=Math.max(max, dp[i-1][j+1]);
	                if(j+1<m)max=Math.max(max, dp[i][j+1]);
	                if(i+1<n && j+1<m)max=Math.max(max, dp[i+1][j+1]);
	                dp[i][j]=max+M[i][j];
	            }
	        }
	        int ans=dp[0][0];
	        for(int i=1; i<n; i++){
	            ans=Math.max(ans,dp[i][0]);
	        }
	        return ans;
	    }
	  //11
	    static int carAssembly(int a[][], int t[][], int e[], int x[])
	    {   int n=a[0].length;
	        int T1[]= new int [n];
	        int T2[] =new int[n] ;
	        int i;
	        T1[0] = e[0] + a[0][0];
	        T2[0] = e[1] + a[1][0];
	        for (i = 1; i < n; ++i)
	        {
	            T1[i] = Math.min(T1[i - 1] + a[0][i],T2[i - 1] + t[1][i] + a[0][i]);
	            T2[i] = Math.min(T2[i - 1] + a[1][i],T1[i - 1] + t[0][i] + a[1][i]);
	        }
	      return Math.min(T1[n-1] + x[0],T2[n-1] + x[1]);
	    }
	    //12
	    // Painting the Fence 
	    //recurtion
	    long countWays(int n,int k)
	    {h=k-1;x=k;
	        return count(n,0);
	    }
	    int h,x;
	    long count(int n,long ans)
	    {
	        if(n==1)return x;
	        if(n==2)return x*x;
	        ans=(count(n-1,ans)+count(n-2,ans))*h;
	    return ans;
	    }
	    //memo
	    long countWays2(int n,int k)
    {long dp[]=new long[n+1];
        return count(n,k,dp);}
    long count(int n,int k,long dp[])
    {
        if(n==1)return k;
        if(n==2)return k*k;
        if(dp[n]!=0)return dp[n];
        dp[n]=((count(n-1,k,dp)%1000000007+count(n-2,k,dp)%1000000007)*(k-1))%1000000007;
    return dp[n];
    }
    //dp
    long countWays3(int n,int k)
    {if(n==1)return k;
        long dp[]=new long[n+1];dp[1]=k;dp[2]=k*k;
    for(int i=3;i<=n;i++)
    {dp[i]=(((dp[i-1])%1000000007+(dp[i-2])%1000000007)*(k-1))%1000000007;}
    return dp[n];
    }
    //13
    //recursive
    public int maximizeCuts(int n, int x, int y, int z)
    {
        if(n==0)return 0;
        if(n<0)return Integer.MIN_VALUE;
        return 1+Math.max(maximizeCuts(n-x,x,y,z),Math.max(maximizeCuts(n-y,x,y,z),maximizeCuts(n-z,x,y,z)));
    }
    //memo
    public int maximizeCuts2(int n, int x, int y, int z)
    {
     	int dp[]=new int[n+1];Arrays.fill(dp, -1);
     int t= max(n,x,y,z,dp);
     return t<0?0:t;
     }
     public int max(int n, int x, int y, int z,int dp[])
     {
         if(n==0)return 0;
         if(n<0)return Integer.MIN_VALUE;
         if(dp[n]!=-1)return dp[n];
     dp[n]=1+Math.max(max(n-x,x,y,z,dp),Math.max(max(n-y,x,y,z,dp),max(n-z,x,y,z,dp)));
         return dp[n];
     }
     //dp
     static int maximizeCuts3(int l, int p, int q, int r)
     {    int dp[] = new int[l + 1];
         Arrays.fill(dp,-1);
         dp[0] = 0;
         for (int i = 0; i <= l; i++) {
         if (dp[i] == -1)
                 continue;
         if (i + p <= l)
                 dp[i + p] = Math.max(dp[i + p], dp[i] + 1);
         if (i + q <= l)
                 dp[i + q] = Math.max(dp[i + q], dp[i] + 1);
         if (i + r <= l)
                 dp[i + r] = Math.max(dp[i + r], dp[i] + 1);
         }
       if (dp[l] == -1)dp[l] = 0;
             return dp[l];
     }
    //14
    //LCS
    //recursive
    static int lcs(int x, int y, String s1, String s2)
    {
        char x1[]=s1.toCharArray();
        char y1[]=s2.toCharArray();
    return lcs(x,y,x1,y1);
    }
    static int lcs(int i,int j, char[]x,char[]y)
    {
        if(i==0||j==0)return 0;
     if(x[i-1]==y[j-1]){return 1+lcs(i-1,j-1,x,y);}   
      else return Math.max(lcs(i-1,j,x,y),lcs(i,j-1,x,y));
    }
    //memo
    static int lcs2(int x, int y, String s1, String s2)
    {
        int dp[][]=new int[x+1][y+1];
        for(int v[]:dp){Arrays.fill(v,-1);}
        char x1[]=s1.toCharArray();
        char y1[]=s2.toCharArray();
    return lcs(x,y,x1,y1,dp);
    }
    static int lcs(int i,int j, char[]x,char[]y,int dp[][])
    {
        if(i==0||j==0)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
     if(x[i-1]==y[j-1]){dp[i][j]= 1+lcs(i-1,j-1,x,y,dp);return dp[i][j];}   
      else {dp[i][j]=Math.max(lcs(i-1,j,x,y,dp),lcs(i,j-1,x,y,dp));return dp[i][j];}
    }
    //dp
    static int lcs3(int x, int y, String s1, String s2)
    {
        int dp[][]=new int[x+1][y+1];
        char x1[]=s1.toCharArray();
        char y1[]=s2.toCharArray();
        
        for(int i=1;i<=x;i++)
        {
            for(int j=1;j<=y;j++)
            {
                if(x1[i-1]==y1[j-1]){dp[i][j]=1+dp[i-1][j-1];}
                else {dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);}
            }
        }
        
    return dp[x][y];
    }
    //15
    //LRS
    //recursive
    public int LongestRepeatingSubsequence(String s)
    {   int n=s.length();
        char x[]=s.toCharArray();
        return LCS(x,n,n-1);
    }
    public int LCS(char x[],int i,int j)
    {
        if(i==0||j==0)return 0;
        if(i-1!=j-1&&x[i-1]==x[j-1]){return 1+LCS(x,i-1,j-1);}
        return Math.max(LCS(x,i-1,j),LCS(x,i,j-1));
    }
    //memo
    public int LongestRepeatingSubsequence2(String s)
    {   int n=s.length();
        char x[]=s.toCharArray();
        int dp[][]=new int[n+1][n+1];
        for(int[] q:dp)Arrays.fill(q,-1);
        return LCS(x,n,n-1,dp);
    }
    public int LCS(char x[],int i,int j,int[][]dp)
    {
        if(i==0||j==0)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(i-1!=j-1&&x[i-1]==x[j-1]){dp[i][j] =1+LCS(x,i-1,j-1,dp);return dp[i][j];}
        dp[i][j]= Math.max(LCS(x,i-1,j,dp),LCS(x,i,j-1,dp));
return dp[i][j];
    }
    //dp
    public int LongestRepeatingSubsequence3(String s)
    {   int n=s.length();
        char x[]=s.toCharArray();
        int dp[][]=new int[n+1][n+1];
        for(int i=1;i<=n;i++)
        {
            for(int j=2;j<=n;j++)
            {
                if(x[i-1]==x[j-1]&&i-1!=j-1){dp[i][j]=1+dp[i-1][j-1];}
            else  dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);   
            }
        }
        return dp[n][n];
    }
    //16
    //recursive
    static int longestSubsequence(int n, int a[])
    {return Lis(a,0,Integer.MIN_VALUE);}
    static public int Lis(int a[],int n,int prev)
    {
        if(n==a.length)return 0;
        int in=0,ex=0;
        ex=Lis(a,n+1,prev);
        if(a[n]>prev)
        in=1+Lis(a,n+1,a[n]);
        return Math.max(in,ex);
    }
    static int longes(int n,int[] a) {
        int max=1;
        for(int i=0;i<n;i++)
        {max=Math.max(max,Lis(i,a));} 
           return max;}
           static int Lis(int n,int a[])
           {int max=1;
               if(n==0)return 1;
               for(int j=n-1;j>=0;j--)
               {if(a[j]<a[n])max=Math.max(max,1+Lis(j,a));}
          return max; }
    //memo
    //1
    static int longestSubsequence2(int n, int a[])
    {int dp[][]=new int[n][1000000];
    for(int d[]:dp)Arrays.fill(d,-1);
        return Lis(a,0,-1,dp);
        }
    static public int Lis(int a[],int n,int prev,int dp[][])
    {
        if(n>=a.length)return 0;
        int in=0,ex=0;
        if(dp[n][prev+1]!=-1)return dp[n][prev+1];
        ex=Lis(a,n+1,prev,dp);
        if(a[n]>prev)
        in=1+Lis(a,n+1,a[n],dp);
        return dp[n][prev+1]=Math.max(in,ex);
    }
    //2
    static int longestSubsequence3(int n, int a[])
    {int dp[]=new int[1000000];
      Arrays.fill(dp,-1);
        return Lis(a,0,-1,dp);
        }
    static public int Lis(int a[],int n,int prev,int dp[])
    {
        if(n>=a.length)return 0;
        int in=0,ex=0;
        if(dp[prev+1]!=-1)return dp[prev+1];
        ex=Lis(a,n+1,prev,dp);
        if(a[n]>prev)
        in=1+Lis(a,n+1,a[n],dp);
        return dp[prev+1]=Math.max(in,ex);
    }
    //3
    static int longes2(int n,int[] a) {
        int max=1;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        for(int i=0;i<n;i++)
        {max=Math.max(max,Lis(i,a,dp));} 
           return max;}
           static int Lis(int n,int a[],int dp[])
           {int max=1;
               if(n==0)return 1;
              if(dp[n]!=-1)return dp[n];
               for(int j=n-1;j>=0;j--)
               { if(a[j]<a[n])max=Math.max(max,1+Lis(j,a,dp));}
          return dp[n]=max; }
    //dp
    
    static int longestSubsequence4(int n,int[] nums) {
        if (n == 0) return 0;
        int[] dp = new int[n];
        int ans=-12;
       for (int i = 0; i < n; i++) {
          dp[i] = 1; 
          for (int j = 0; j < i; j++) {
            if (nums[i] > nums[j]) {
              dp[i]= Math.max(dp[i], dp[j] + 1);
            }
          }
         ans=Math.max(dp[i],ans);}
      return ans;   
     } 
    //17
    //Lcs O(n)space
    static int lcs4(int x, int y, String s1, String s2)
    {
        int dp[][]=new int[x+1][y+1];
        char x1[]=s1.toCharArray();
        char y1[]=s2.toCharArray();
        int b=0;
        for(int i=1;i<=x;i++)
        { b=i&1;
            for(int j=1;j<=y;j++)
            {
                if(x1[i-1]==y1[j-1]){dp[b][j]=1+dp[1-b][j-1];}
                else {dp[b][j]=Math.max(dp[1-b][j],dp[b][j-1]);}
            }
        }
        
    return dp[b][y];
    }
    //18
    //lcs 3 strings
    //recursive
    static int lcsof3(String s1, String s2, String s3, int x, int y, int z) 
    {   char x1[]=s1.toCharArray();
        char y1[]=s2.toCharArray();
        char z1[]=s3.toCharArray();
    return lcs(x,y,z,x1,y1,z1);
    }
    static int lcs(int i,int j,int k, char[]x,char[]y,char[]z)
    {
        if(i==0||j==0||k==0)return 0;
     if(x[i-1]==y[j-1]&&x[i-1]==z[k-1]){return 1+lcs(i-1,j-1,k-1,x,y,z);}   
      else return Math.max(lcs(i-1,j,k,x,y,z),
      Math.max(lcs(i,j-1,k,x,y,z),lcs(i,j,k-1,x,y,z)));
    }
    //memo O(n3)
    int LCSof32(String s1, String s2, String s3, int x, int y, int z) 
    { 
        int dp[][][]=new int[x+1][y+1][z+1];
        for(int q[][]:dp){for(int f[]:q)Arrays.fill(f,-1);}
        char x1[]=s1.toCharArray();
        char y1[]=s2.toCharArray();
        char z1[]=s3.toCharArray();
    return lcs(x,y,z,x1,y1,z1,dp);
    }
    static int lcs(int i,int j,int k, char[]x,char[]y,char[]z,int dp[][][])
    {
        if(i==0||j==0||k==0)return 0;
        if(dp[i][j][k]!=-1)return dp[i][j][k];
     if(x[i-1]==y[j-1]&&x[i-1]==z[k-1]){dp[i][j][k]= 1+lcs(i-1,j-1,k-1,x,y,z,dp);return dp[i][j][k];}   
      else {dp[i][j][k]=Math.max(lcs(i-1,j,k,x,y,z,dp),
      Math.max(lcs(i,j-1,k,x,y,z,dp),lcs(i,j,k-1,x,y,z,dp)));return dp[i][j][k];}
    }
    //dp O(n3)
    int LCSof33(String s1, String s2, String s3, int x, int y, int z) 
    {
        int dp[][][]=new int[x+1][y+1][z+1];
        char x1[]=s1.toCharArray();
        char y1[]=s2.toCharArray();
        char z1[]=s3.toCharArray();
        
        for(int i=1;i<=x;i++)
        {
            for(int j=1;j<=y;j++)
            {
                for(int k=1;k<=z;k++){
                if(x1[i-1]==y1[j-1]&&x1[i-1]==z1[k-1]){dp[i][j][k]=1+dp[i-1][j-1][k-1];}
                else {dp[i][j][k]=Math.max(dp[i-1][j][k],Math.max(dp[i][j-1][k],dp[i][j][k-1]));}
            }}
        }
        
    return dp[x][y][z];
    }
    //19
    //recursive
    static int maxSumIS(int nums[],int n) {
        int max=nums[0];
   for(int i=0;i<n;i++)
   {max=Math.max(max,Li(i,nums));} 
      return max;}
      static int Li(int n,int a[])
      {int max=a[n];
          if(n==0)return a[n];
          for(int j=n-1;j>=0;j--)
          { if(a[j]<a[n])max=Math.max(max,a[n]+Li(j,a));}
     return max; }
   //memo
   static int maxSumIS2(int nums[],int n) {
       int max=nums[0];
  int dp[]=new int[n+1];
  Arrays.fill(dp,-1);
  for(int i=0;i<n;i++)
  {max=Math.max(max,Li(i,nums,dp));} 
     return max;}
     static int Li(int n,int a[],int dp[])
     {int max=a[n];
         if(n==0)return a[n];
        if(dp[n]!=-1)return dp[n];
         for(int j=n-1;j>=0;j--)
         { if(a[j]<a[n])max=Math.max(max,a[n]+Li(j,a,dp));}
    return dp[n]=max; }
   //dp
   static int maxSumIS3(int nums[],int n) {
       if (n == 0) return 0;
       int[] dp = new int[n];
       int ans=-12;
      for (int i = 0; i < n; i++) {
         dp[i] = nums[i]; 
         for (int j = 0; j < i; j++) {
           if (nums[i] > nums[j]) {
             dp[i]= Math.max(dp[i], dp[j] + nums[i]);
           }
         }
        ans=Math.max(dp[i],ans);}
     return ans;   
    }  
  //20
    public static int subsets(int arr[],int n,int k)
    {
    	return subset(arr,k,0)-1;
    }

    private static int subset(int[] arr, int k, int i) {
    	int x=0,y=0;
    	if(i==arr.length)return 1;
    	if(arr[i]<=k)
    	y=subset(arr,k/arr[i],i+1)+subset(arr,k,i+1);
    	else
    	x=subset(arr,k,i+1);
    	return x+y;
    }
    //memo
    public static int subsets1(int arr[],int n,int k)
    {int dp[][]=new int[n+1][k+1];
    for(int d[]:dp)Arrays.fill(d, -1);
    	return subset(arr,k,0,dp)-1;
    }

    private static int subset(int[] arr, int k, int i,int dp[][]) {
    	if(i==arr.length)return 1;
    	if(dp[i][k]!=-1)return dp[i][k];
    	if(arr[i]<=k)
    	dp[i][k]=subset(arr,k/arr[i],i+1,dp)+subset(arr,k,i+1,dp);
    	else
    	dp[i][k]=subset(arr,k,i+1,dp);
    	return dp[i][k];
    }
    //dp
    public static int subsets2(int arr[],int n,int k)
    {int dp[][]=new int[k+1][n+1];
    for(int j=1;j<=k;j++) {
    for(int i=1;i<=n;i++)
    {
    	if(arr[i-1]<=j&&arr[i-1]>0) {dp[j][i]=dp[j/arr[i-1]][i-1]+dp[j][i-1]+1;}
    	else {dp[j][i]=dp[j][i-1];}
    }
    }
    	return dp[k][n];
    }
    //21
    //recursive
    static int longestSubsequenc(int n, int nums[])
    {         int max=1;
   for(int i=0;i<n;i++)
   {max=Math.max(max,Liss(i,nums));} 
      return max;}
      static int Liss(int n,int a[])
      {int max=1;
          if(n==0)return 1;
          for(int j=n-1;j>=0;j--)
          { if(a[j]+1==a[n]||a[j]-1==a[n])max=Math.max(max,1+Liss(j,a));}
     return max; }
      //memo
      static int longestSubsequenc2(int n, int nums[])
      {           int max=1;
    int dp[]=new int[n+1];
    Arrays.fill(dp,-1);
    for(int i=0;i<n;i++)
    {max=Math.max(max,Liss(i,nums,dp));} 
       return max;}
       static int Liss(int n,int a[],int dp[])
       {int max=1;
           if(n==0)return 1;
          if(dp[n]!=-1)return dp[n];
           for(int j=n-1;j>=0;j--)
           { if(a[j]+1==a[n]||a[j]-1==a[n])max=Math.max(max,1+Liss(j,a,dp));}
      return dp[n]=max; }
       //dp
       static int longestSubsequenc3(int n, int nums[]){
           if (n == 0) return 0;
           int[] dp = new int[n];
           int ans=-12;
          for (int i = 0; i < n; i++) {
             dp[i] = 1; 
             for (int j = 0; j < i; j++) {
               if (nums[i]+1==nums[j]||nums[i]-1==nums[j]) {
                 dp[i]= Math.max(dp[i], dp[j] + 1);
               }
             }
            ans=Math.max(dp[i],ans);}
         return ans;   
        } 
    //22
    //recursive
    public static int sum(int arr[],int n) {
  if(n==0)return arr[0];
  if(n==1)return arr[0]+arr[1];
  if(n==2)return  Math.max(arr[0] + arr[1],Math.max(arr[0]+arr[2],arr[1]+arr[2]));
    	return Math.max(Math.max(sum(arr,n-1),sum(arr,n-2)+arr[n]), arr[n]+arr[n-1]+sum(arr,n-3));
    }
    //memo
  static   int sum[]=new int[6];

    public static int sum2(int arr[],int n) {
    	  if(n==0)return sum[0]=arr[0];
    	  if(n==1)return sum[1]=arr[0]+arr[1];
    	  if(n==2)return sum[2]=Math.max(arr[0] + arr[1],Math.max(arr[0]+arr[2],arr[1]+arr[2]));
    	  if(sum[n]!=-1)return sum[n];  
    	  sum[n]=Math.max(Math.max(sum(arr,n-1),sum(arr,n-2)+arr[n]), arr[n]+arr[n-1]+sum(arr,n-3));
    	    return sum[n];
    }
    //dp
    static int sum3(int arr[],int n)
    {
    	  if(n>=0)return sum[0]=arr[0];
    	  if(n>=1)return sum[1]=arr[0]+arr[1];
    	  if(n>=2)return sum[2]=Math.max(arr[0] + arr[1],Math.max(arr[0]+arr[2],arr[1]+arr[2]));
    	  for(int i=3;i<=n;i++)
    	  {
    		  sum[n]=Math.max(Math.max(sum[i-1],sum[i-2]+arr[i]),sum[i-3]+arr[i]+arr[i-1]);
    	  }
    return sum[n];
    }
    //23
    //recursive
    static int eggDrop(int n, int k) 
	{
	    if(k==0||k==1)return k;
        if(n==1){return k;}
int v=1000000;
for(int i=1;i<=k;i++)
v=Math.min(v,Math.max(eggDrop(n-1,i-1),eggDrop(n,k-i)));
return v+1;
	}
    //memo
    static int eggDrop2(int n,int k)
    {
        if(n==1)return k;
        int dp[][]=new int[n+1][k+1];
        for(int[]d:dp){Arrays.fill(d,-1);}
        eggDrop(n,k,dp);
        return dp[n][k];
    }
    static int eggDrop(int n, int k,int[][]dp) 
	{
	    if(k==0||k==1)return k;
        if(n==1){return k;}
int v=1000000;
if(dp[n][k]!=-1)return dp[n][k];
for(int i=1;i<=k;i++)
v=Math.min(v,Math.max(eggDrop(n-1,i-1,dp),eggDrop(n,k-i,dp)));
dp[n][k]= v+1;
return dp[n][k];
	}
    //dp
    static int eggDrop3(int n, int k)
    {    int eggFloor[][] = new int[n + 1][k + 1];
        int res;
        int i, j, x;
        for (i = 1; i <= n; i++) {
            eggFloor[i][1] = 1;
            eggFloor[i][0] = 0;
        }
        for (j = 1; j <= k; j++)eggFloor[1][j] = j;
  for (i = 2; i <= n; i++) {
            for (j = 2; j <= k; j++) {
                eggFloor[i][j] = Integer.MAX_VALUE;
                for (x = 1; x <= j; x++) {
                    res = 1 + Math.max(eggFloor[i - 1][x - 1],eggFloor[i][j - x]);
                    if (res < eggFloor[i][j])
                        eggFloor[i][j] = res;
                }
            }
        }
 
        return eggFloor[n][k];
    }
    //24
    //recursive
    class Pair{int x,y;}
    int maxChainLength(Pair arr[], int n)
    {
            Arrays.sort(arr, (a, b) -> a.y - b.y);
           return find(arr,0,Integer.MIN_VALUE);  
       }
       public int find(Pair pairs[],int i,int ans)
       {
           if(i>=pairs.length)return 0;
           int z=0;
           if(ans<pairs[i].x){
                   z=1+find(pairs,i+1,pairs[i].y);}
               int v=find(pairs,i+1,ans);
       return Math.max(z,v);
       }
       //memo
       int maxChainLength2(Pair arr[], int n)
       {
               Arrays.sort(arr, (a, b) -> a.y - b.y);
               int dp[]=new int[n+1];Arrays.fill(dp,-1);
              return find(arr,0,Integer.MIN_VALUE,dp);  
          }
          public int find(Pair pairs[],int i,int ans,int[] dp)
          {
              if(i>=pairs.length)return 0;
              int z=0;
              if(dp[i]!=-1)return dp[i];
              if(ans<pairs[i].x){z=1+find(pairs,i+1,pairs[i].y,dp);}
                  int v=find(pairs,i+1,ans,dp);
                  dp[i]=Math.max(z,v);
          return dp[i];
          }
          //dp
          int maxChainLength3(Pair pairs[], int n)
          {
              Arrays.sort(pairs, (a, b) -> a.x - b.x);
                 int N = pairs.length;
                 int[] dp = new int[N];
                 Arrays.fill(dp, 1);

                 for (int j = 1; j < N; ++j) {
                     for (int i = 0; i < j; ++i) {
                         if (pairs[i].y < pairs[j].x)
                             dp[j] = Math.max(dp[j], dp[i] + 1);
                     }
                 }

                 int ans = 0;
                 for (int x: dp) if (x > ans) ans = x;
                 return ans;
             }
          //25
          //recursive
          static int maxSquare(int n, int m, int mat[][]){
        	    if(n==1){for(int i=0;i<mat[0].length;i++){if(mat[0][i]==1)return 1;}return 0;}
        	    if(m==1){for(int i=0;i<mat.length;i++){if(mat[i][0]==1)return 1;}return 0;}
        	     max=0; square(n-1,m-1,mat,100000);return max;}
        	 static int max=0;
        	  static int square(int n,int m,int M[][],int ans){
        	      if(m==0)return M[n][0];
        	      if(n==0)return M[0][m];
        	      if(n>=M.length||n<0||m>=M[0].length||m<0)return 0;
        	      
        	      int x=square(n-1,m,M,ans);
        	      int y=square(n-1,m-1,M,ans);
        	      int z=square(n,m-1,M,ans);
        	      if(M[n][m]==1){
        	      ans=Math.min(x,Math.min(y,Math.min(z,ans)))+1;
        	      }
        	      else{ans=0;}
        	      max=Math.max(max,ans);
        	      return ans;
        	}
        	  //memo
        	  static int maxSquare2(int n, int m, int mat[][]){
        	       if(n==1){for(int i=0;i<mat[0].length;i++){if(mat[0][i]==1)return 1;}return 0;}
        	        		    if(m==1){for(int i=0;i<mat.length;i++){if(mat[i][0]==1)return 1;}return 0;}
        	        		  int dp[][]=new int [n+1][m+1];
        	        		  for(int d[]:dp)Arrays.fill(d,-1);
        	        		    maxi=0; square(n-1,m-1,mat,100000,dp);return maxi;}
        	        		 static int maxi=0;
        	        		  static int square(int n,int m,int M[][],int ans,int dp[][]){
        	        		      if(m==0)return M[n][0];
        	        		      if(n==0)return M[0][m];
        	        		      if(n>=M.length||n<0||m>=M[0].length||m<0)return 0;
        	        		      if(dp[n][m]!=-1)return dp[n][m];
        	        		      int x=square(n-1,m,M,ans,dp);
        	        		      int y=square(n-1,m-1,M,ans,dp);
        	        		      int z=square(n,m-1,M,ans,dp);
        	        		      if(M[n][m]==1){
        	        		      ans=Math.min(x,Math.min(y,Math.min(z,ans)))+1;
        	        		      }
        	        		      else{ans=0;}
        	        		      dp[n][m]=ans;
        	        		      maxi=Math.max(maxi,ans);
        	        		      return ans;
        	        		}
        	        		  //dp
        	        		  static void printMaxSubSquare(int M[][])
        	        		    {   int i,j;
        	        		        int R = M.length;         //no of rows in M[][]
        	        		        int C = M[0].length;     //no of columns in M[][]
        	        		        int S[][] = new int[R][C];    
        	        		        int max_of_s, max_i, max_j;
        	        		        for(i = 0; i < R; i++)
        	        		            S[i][0] = M[i][0];
        	        		     for(j = 0; j < C; j++)
        	        		            S[0][j] = M[0][j];
        	        		        for(i = 1; i < R; i++)
        	        		        {
        	        		            for(j = 1; j < C; j++)
        	        		            {   if(M[i][j] == 1)  S[i][j] = Math.min(S[i][j-1],Math.min(S[i-1][j], S[i-1][j-1])) + 1;
        	        		                else S[i][j] = 0;
        	        		            }
        	        		        }
        	        		        max_of_s = S[0][0];
        	        		        for(i = 0; i < R; i++)
        	        		        {  for(j = 0; j < C; j++)
        	        		            {   if(max_of_s < S[i][j])
        	        		                {   max_of_s = S[i][j];}    
        	        		            }                
        	        		        }    
        	        		            System.out.println(max_of_s);
        	        		        
        	        		    }
          //26 IMP BECAUSE OF CONCEPT OF MEMO LINE
          //recursive
          public static int maxSumPairWithDifferenceLessThanK(int arr[], int n, int k) 
          {Arrays.sort(arr);return sum(arr,n,n-1,k,0);}
          public static int sum(int arr[],int n,int m,int k,int ans)
          {
          if(n==0||k==0||m==0)return ans;
          if(n-1>m-1&&arr[n-1]-arr[m-1]<k){return sum(arr,m-1,m-2,k,ans+arr[n-1]+arr[m-1]);}
           ans= Math.max(sum(arr,n,m-1,k,ans),sum(arr,n-1,m,k,ans));
              return ans;
          }
//memo
          public static int maxSumPairWithDifferenceLessThanK2(int arr[], int n, int k) 
          {Arrays.sort(arr);
          int dp[][]=new int[n+1][n+1];
          for(int[]d:dp)Arrays.fill(d,-1);
          return sum(arr,n,n-1,k,0,dp);}
          public static int sum(int arr[],int n,int m,int k,int ans,int dp[][])
          {
          if(n==0||k==0||m==0)return 0;
          if(dp[n][m]!=-1)return dp[n][m];
          if(n-1>m-1&&arr[n-1]-arr[m-1]<k)
          {int x=sum(arr,m-1,m-2,k,ans+arr[n-1]+arr[m-1],dp);
          
      
          dp[n][m]=x+arr[n-1]+arr[m-1];
      //ABOVE LINE IS IMPORTANT FOR CONCEPT
          //*** THAT IS IF PARAMETER IS PASSED FOR + THAT DOESNOT MEAN IT IS GONNA STORE
          // WE HAVE TO ADD IT EXPLICITLY
          //*** WE DONT NEED TO PASS ANS PARAMETER HERE LIKE NEXT Q
          
          return dp[n][m];}
           dp[n][m]= Math.max(sum(arr,n,m-1,k,ans,dp),sum(arr,n-1,m,k,ans,dp));
              return dp[n][m];
          }
          //dp
          static int maxSumPairWithDifferenceLessThanK3(int arr[],int N, int K)
          {Arrays.sort(arr);
           int dp[] = new int[N];
           dp[0] = 0;
           for (int i = 1; i < N; i++)
              {dp[i] = dp[i-1];
           if (arr[i] - arr[i-1] < K)
                  {  if (i >= 2)
                          dp[i] = Math.max(dp[i], dp[i-2] + arr[i] +
                                                          arr[i-1]);
                      else
                          dp[i] = Math.max(dp[i], arr[i] + arr[i-1]);
                  }
              }
              return dp[N - 1];
          }
//dp2
          static int maxSumPairWithDifferenceLessThanK4(int arr[],int N,int k)
          {
              int maxSum = 0;
           Arrays.sort(arr);
           for (int i = N - 1; i > 0; --i)
              {if (arr[i] - arr[i - 1] < k)
                  {
                      maxSum += arr[i];
                      maxSum += arr[i - 1];
                      --i;
                  }
              }
              return maxSum;
          }//27
          //recursive
          static int maximumPath(int N, int M[][])
          {int ans=0;
          for(int q=0;q<M.length;q++){
          int y=getsum(0,q,M,0);
              ans=Math.max(y,ans);
          }
              return ans;
          }
          static int getsum(int i,int q,int [][]M,int ans)
          {
             if(i>=M.length){return ans;} 
              int x=0,y=0,z=0;
              
          if(q>=0&&q<M.length){x=getsum(i+1,q-1,M,ans+M[i][q]);
              y=getsum(i+1,q,M,ans+M[i][q]);
              z=getsum(i+1,q+1,M,ans+M[i][q]);
              ans=Math.max(x,Math.max(y,z));
              }
              return ans;
          }
          //memo
          static int maximumPath2(int N, int M[][])
          {int ans=Integer.MIN_VALUE;
          int dp[][]=new int[N+1][N+1];
          for(int[] row: dp)Arrays.fill(row,-1);
          for(int q=0;q<N;q++){
          int y=getsum(0,q,M,dp);
              ans=Math.max(y,ans);
          }
              return ans;
          }
          static int getsum(int i,int q,int [][]M,int[][]dp)
          {
             if(i>=M.length||q<0||q>=M.length){return 0;} 
              int x=0,y=0,z=0;
          if(dp[i][q]!=-1)return dp[i][q];
              x=getsum(i+1,q-1,M,dp);
              y=getsum(i+1,q,M,dp);
              z=getsum(i+1,q+1,M,dp);
              int ans=Math.max(x,Math.max(y,z));
              dp[i][q]=ans+M[i][q];
              return dp[i][q];
          }
          //dp
          static int maximumPath3(int n, int m[][])
          {
              int ans[][] = new int [n][n];
              for (int i=0; i<n; i++)
              ans[0][i]= m[0][i];
              int max= Integer.MIN_VALUE;
              
              if(n==1)
              return m[0][0];
              
              
              for(int i=1; i <n; i++)
              {
                  for (int j=0; j<n; j++)
                  {
                      if(j==0)
                      ans[i][j] = m[i][j]+ Math.max(ans[i-1][j+1], ans[i-1][j]);
                      else if(j==n-1)
                       ans[i][j]= m[i][j]+ Math.max(ans[i-1][j-1], ans[i-1][j]);
                       else
                        ans[i][j]= m[i][j]+ Math.max(Math.max(ans[i-1][j-1], ans[i-1][j]),ans[i-1][j+1]);
                        
                        
                       if(ans[i][j]>max)
                       max=ans[i][j];
              }
          }
          return max;   
      }
       
          //28
          //recursive varient of kadenes
          int max(String S) {int n=S.length();
          int arr[]=new int[n];
          for(int i=0;i<n;i++){arr[i]=S.charAt(i)=='0'?1:-1;}
      int s=0;
      for(int h:arr)s+=h;
      return sum1(arr,0,n-1,s);
  }
  int sum1(int arr[],int i,int j,int s)
  {    int x=0,y=0;
      if(i>=j)return s;
       x=sum1(arr,i+1,j,s-arr[i]);
       y=sum1(arr,i,j-1,s-arr[j]);
       return Math.max(x,Math.max(s,y));
  }
  //memo but requre O(n)
  int max2(String S) {int n=S.length();
  int arr[]=new int[n];
  for(int i=0;i<n;i++){arr[i]=S.charAt(i)=='0'?1:-1;}
int s=0;
for(int h:arr)s+=h;
int dp[][]=new int[n+1][n+1];
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{dp[i][j]=-10000000;}
}
return sum2(arr,0,n-1,s,dp);
}
int sum2(int arr[],int i,int j,int s,int dp[][])
{    int x=0,y=0;
if(i>=j)return s;
if(dp[i][j]!=-10000000)return dp[i][j];
x=sum2(arr,i+1,j,s-arr[i],dp);
y=sum2(arr,i,j-1,s-arr[j],dp);
return dp[i][j]=Math.max(x,Math.max(s,y));
}
//dp
int max3(String S) {int n=S.length();
char[]arr=S.toCharArray();
   			        int full[]= new int[arr.length];full[0]=arr[0]=='0'?1:-1;
   			        int max=full[0];
   			        for(int i=1;i<full.length;i++)
   			        {int x=arr[i]=='0'?1:-1;
   			         full[i]=x+(full[i-1]>0?full[i-1]:0);
   			         max=Math.max(max,full[i]);   
   			        }
   			        return max;
   			    }
//29  // no code of recurtion+memo  working on gfg practice 
//recursive
static int minJumps(int arr[], int l, int h)
{ if (h == l)return 0;
  if (arr[l] == 0)return Integer.MAX_VALUE;
   int min = Integer.MAX_VALUE;
    for (int i = l + 1; i <= h&& i <= l + arr[l];i++) {
        int jumps = minJumps(arr, i, h);
        if (jumps != Integer.MAX_VALUE && jumps + 1 < min)
            min = jumps + 1;
    }
    return min;
}    public int jump(int[] arr) {
    if(arr.length<2)return 0;
    if(arr[0]==0)return -1;
    int x=minJumps(arr,0,arr.length-1);
  return x>=Integer.MAX_VALUE?-1:x;
}
//memo

static int minJumps(int arr[], int l, int h,int dp[])
{ if (h == l)return 0;
  if (arr[l] == 0)return Integer.MAX_VALUE;
   int min = Integer.MAX_VALUE;
 if(dp[l]!=-1)return dp[l];
    for (int i = l + 1; i <= h&& i <= l + arr[l];i++) {
        int jumps = minJumps(arr, i, h,dp);
        if (jumps != Integer.MAX_VALUE && jumps + 1 < min)
            min = jumps + 1;
    }
    return dp[l]=min;
}    public int jump2(int[] arr) {
    if(arr.length<2)return 0;
    if(arr[0]==0)return -1;
 int dp[]=new int[arr.length+1];
 Arrays.fill(dp,-1);
    int x=minJumps(arr,0,arr.length-1,dp);
  return x>=Integer.MAX_VALUE?-1:x;
}
//dp
static int minJumps(int arr[],int n)
{int[] jumps = new int[n];
int min;
jumps[n - 1] = 0;
for (int i = n - 2; i >= 0; i--) {
if (arr[i] == 0)jumps[i] = Integer.MAX_VALUE;
else if (arr[i] >= n - i - 1)jumps[i] = 1;
else {min = Integer.MAX_VALUE;
for (int j = i + 1; j < n && j <= arr[i] + i; j++) {
    if (min > jumps[j]) min = jumps[j];
}
if (min != Integer.MAX_VALUE)jumps[i] = min + 1;
else jumps[i] = min; }
}
return jumps[0];
}
//30
//recursive // similar to 13 max segments
public int minimumCost(int cost[], int N,int W){
int x= maximize(cost,N,W);
	    return x>1000000?-1:x;
	}
	 public int maximize(int cost[], int N,int W)
    {
        if(W==0)return 0;
        if(W<0)return 1000000;
        int x=Integer.MAX_VALUE;
        for(int i=0;i<N;i++)
        {  if(cost[i]==-1)continue;
        x=Math.min(x,cost[i]+maximize(cost,N,W-i-1));}
    return x; 
    }
	 //memo
		public int minimumCost2(int cost[], int N,int W){
		    int dp[]=new int[W+1];
		    Arrays.fill(dp,-1);
	int x= maximize(cost,N,W,dp);
		    return x>1000000?-1:x;
		}
		 public int maximize(int cost[], int N,int W,int dp[])
	    {
	        if(W==0)return 0;
	        if(W<0)return 1000000;
	        if(dp[W]!=-1)return dp[W];
	        int x=Integer.MAX_VALUE;
	        for(int i=0;i<N;i++)
	        {  if(cost[i]==-1)continue;
	        x=Math.min(x,cost[i]+maximize(cost,N,W-i-1,dp));
	        }dp[W]=x;
	    return x; 
	    }
		 //dp
		 static int minimumCost3(int[] cost, int n, int w) {

		        int dp[] = new int[w+1];

		        for(int i=1;i<=w;i++){
		            dp[i] = Integer.MAX_VALUE;
		            for(int j=1;j<=n;j++){
		                if(i-j>=0){
		                    if(cost[j-1]!=-1&&dp[i-j]!=Integer.MAX_VALUE)
		                    { dp[i] = Math.min(dp[i],cost[j-1] + dp[i-j]);}
		                }
		                else break;
		            }
		        }
		   return dp[w]==Integer.MAX_VALUE?-1:dp[w];
		    }
          //31
          //recursive
          public static int remove(int arr[],int n,int k) {Arrays.sort(arr);
        	  return remove(arr,k,0,n-1);
          }
          public static int remove(int arr[],int k,int i,int j)
         {
        	  if(i>=j)return 0;
        	  if(arr[j]-arr[i]<=k)return 0;
        	  int in=1+remove(arr,k,i,j-1);
        	  int ou=1+remove(arr,k,i+1,j);
        	  System.out.println(in+" "+ou);
        	  return Math.min(in,ou);
         }
          //memo
          public static int remove2(int arr[],int n,int k) {Arrays.sort(arr);
    	  int dp[][]=new int[n+1][n+1];
    	  for(int d[]:dp)Arrays.fill(d, -1);
          return remove(arr,k,0,n-1,dp);
      }
      public static int remove(int arr[],int k,int i,int j,int[][]dp)
     {
    	  if(i>=j)return 0;
    	  if(arr[j]-arr[i]<=k)return 0;
    	  if(dp[i][j]!=-1)return dp[i][j];
    	  int in=1+remove(arr,k,i,j-1);
    	  int ou=1+remove(arr,k,i+1,j);
    	  System.out.println(in+" "+ou);
    	  return dp[i][j] =Math.min(in,ou);
     }
      //dp
      static int findInd(int key, int i,int n, int k, int arr[])
{int start, end, mid, ind = -1;
start = i + 1;
end = n - 1;
while (start < end)
{ mid = start + (end - start) / 2;
   if (arr[mid] - key <= k)
   {   ind = mid; start = mid + 1;}
   else   {end = mid;}
}
return ind;
}
      
static int removals(int arr[], int n, int k)
{int i, j, ans = n - 1;
Arrays.sort(arr);
for(i = 0; i < n; i++)
{  j = findInd(arr[i], i, n, k, arr);
   if (j != -1)
   {ans = Math.min(ans,n - (j - i + 1));}
}
return ans;
}
//32
//recursive
int longestCommonSubstr(String S1, String S2, int n, int m){
    ans=0;  sub(n,m,S1,S2);
return ans;}
int sub(int n,int m,String S1,String S2)
{
    if(n<=0||m<=0)return 0;
    sub(n-1,m,S1,S2);
    sub(n,m-1,S1,S2);
    if(S1.charAt(n-1)==S2.charAt(m-1))
    { int x= 1+sub(n-1,m-1,S1,S2);
        ans=Math.max(x,ans);
        return x;
    }
    return 0;
}
//memo // imp and smart
int longestCommonSubstr2(String S1, String S2, int n, int m){
    ans=0;
    int dp[][]=new int[n+1][m+1];
    for(int d[]:dp)Arrays.fill(d,-1);
sub(n,m,S1,S2,dp);
return ans;}
static int ans=0;
int sub(int n,int m,String S1,String S2,int dp[][])
{
    if(n<=0||m<=0)return 0;
    if(dp[n][m]!=-1)return dp[n][m];
    sub(n-1,m,S1,S2,dp);
    sub(n,m-1,S1,S2,dp);
    if(S1.charAt(n-1)==S2.charAt(m-1))
    { dp[n][m]= 1+sub(n-1,m-1,S1,S2,dp);
        ans=Math.max(dp[n][m],ans);
        return dp[n][m];
    }
    return dp[n][m]=0;
}
//dp
int longestCommonSubstr3(String S1, String S2, int n, int m){
    ans=0;  int dp[][]=new int[n+1][m+1];
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=m;j++)
        {
             if(S1.charAt(i-1)==S2.charAt(j-1))
             {
        dp[i][j]= 1+dp[i-1][j-1];
        ans=Math.max(ans,dp[i][j]);
             }
        }
    }
return ans;}
         //33
//easier vertion of 1 dp coin change problem
public long count4(int n) {
    long[] dp = new long[(int)n+1];
    Arrays.fill(dp, 0);
    dp[0] = 1;
    int S[]=new int[]{3,5,10};
for(int i=0;i<3;i++)
{
 for(int j=S[i];j<=n;j++)
 {
    dp[j]+=dp[j-S[i]];
 }
}
    return dp[n];
}
//34
//recursive
static long countBT(int h){
    if(h==0||h==1)return 1;
    return ((((countBT(h-1)%1000000007)*(countBT(h-1)%1000000007))%1000000007)+
    (((countBT(h-2)%1000000007)*(countBT(h-1)%1000000007))%1000000007)+
    (((countBT(h-1)%1000000007)*(countBT(h-2)%1000000007))%1000000007))%1000000007;
}
//memo
static long countBT2(int h){
long dp[]=new long[h+1];
Arrays.fill(dp, -1);
countBT(h,dp);
return dp[h];
}
static long countBT(int h,long dp[]){
   if(h==0||h==1)return 1;
   if(dp[h]!=-1)return dp[h];
   return dp[h]=((((countBT(h-1,dp)%1000000007)*(countBT(h-1,dp)%1000000007))%1000000007)+
   (((countBT(h-2,dp)%1000000007)*(countBT(h-1,dp)%1000000007))%1000000007)+
   (((countBT(h-1,dp)%1000000007)*(countBT(h-2,dp)%1000000007))%1000000007))%1000000007;
}
//dp
static long countBT3(int hi){
	long dp[]=new long[hi+1];dp[0]=1;dp[1]=1;
	for(int h=2;h<=hi;h++)
	{
		dp[h]=((((dp[h-1]%1000000007)*(dp[h-1]%1000000007))%1000000007)+
				   (((dp[h-2]%1000000007)*(dp[h-1]%1000000007))%1000000007)+
				   (((dp[h-1]%1000000007)*(dp[h-2]%1000000007))%1000000007))%1000000007;
	}
	return dp[hi];
	}
//35
//famous largest subarray sum problem
//1 kadanes
static int maxSubArraySum(int a[])
{
    int size = a.length;
    int ans = Integer.MIN_VALUE, end = 0;
   for (int i = 0; i < size; i++)
    { end = end + a[i];
        if (ans < end) ans = end;
        if (end < 0)end = 0;
    }
    return ans;
}
//2 print that subarray
static void maxSubArraySum(int a[], int size)
{
    int ans = Integer.MIN_VALUE,ends = 0,start = 0,end = 0, s = 0;
    for (int i = 0; i < size; i++)
    {  ends += a[i];
        if (ans < ends)
        {  ans = ends;
            start = s; end = i;}
        if (ends < 0)
        {   ends = 0;
            s = i + 1;}
    }
    System.out.println("Maximum contiguous sum is "+ ans);
    System.out.println("Starting index " + start);
    System.out.println("Ending index " + end);
}
//3 recurtion
long maxSubarraySum(int arr[], int n){
    int s=0;
    for(int h:arr)s+=h;
    return sum(arr,0,n-1,s);
}
long sum(int arr[],int i,int j,int s)
{    long x=0,y=0;
    if(i>=j)return s;
     x=sum(arr,i+1,j,s-arr[i]);
     y=sum(arr,i,j-1,s-arr[j]);
     return Math.max(x,Math.max(s,y));
}
//memo
long maxSubarraySum2(int arr[], int n){
int s=0;
for(int h:arr)s+=h;
long dp[][]=new long[n+1][n+1];
for(int i=0;i<n;i++)
{
    for(int j=0;j<n;j++)
    {dp[i][j]=-10000000;}
}
return sum(arr,0,n-1,s,dp);
}
long sum(int arr[],int i,int j,int s,long dp[][])
{    long x=0,y=0;
if(i>=j)return s;
if(dp[i][j]!=-10000000)return dp[i][j];
 x=sum(arr,i+1,j,s-arr[i],dp);
 y=sum(arr,i,j-1,s-arr[j],dp);
 return dp[i][j]=Math.max(x,Math.max(s,y));
}
//36
//smallest sumarray sum
static int smallestSumSubarr(int arr[], int n)
{int end = 2147483647;
    int ans = 2147483647;
    for (int i = 0; i < n; i++)
    {   if (end > 0)
    	end = arr[i];
        else  end += arr[i];
    ans = Math.min(ans,end);        
    }
    return ans;
}
//37
//recursive//doesnot gonna work as rod cutting problem because here if weight is less than still it'll work 
static int knapSack(int n, int W, int val[], int wt[])
{	            if (n == 0 || W == 0)return 0;
                if (wt[n - 1] > W) return knapSack(n-1,W,val, wt);
	        return Math.max(val[n - 1]+ knapSack(n,W - wt[n - 1],val, wt),
	                           knapSack(n-1,W,val, wt));
	        }
//memo
static int knapSack2(int n, int W, int val[], int wt[])
{
    int dp[][]=new int[n+1][W+1];
    for(int d[]:dp)Arrays.fill(d,-1);
    return knapSack(n,W,val,wt,dp);
} 
static int knapSack(int n, int W, int val[], int wt[],int dp[][])
{
	            if (n == 0 || W == 0)return 0;
                if(dp[n][W]!=-1)return dp[n][W];
	            if (wt[n - 1] > W) return knapSack(n-1,W,val, wt,dp);
	        return dp[n][W]=Math.max(val[n - 1]+ knapSack(n,W - wt[n - 1],val, wt,dp),
	                           knapSack(n-1,W,val, wt,dp));
	        }
//dp
static int knapSack3(int n, int W, int val[], int wt[])
{
    int dp[]=new int[W+1];
    for(int i=0;i<=W;i++)
      {for(int j=0;j<n;j++)
{if(wt[j]<=i)dp[i]=Math.max(val[j]+dp[i-wt[j]],dp[i]);}
       }
    return dp[W];
} 
//38
//recursive
public  int wordBreak(String s, ArrayList<String> wordDict )
{   
return wordBreaks(0,s,new HashSet<String>(wordDict))?1:0;   
}
private boolean wordBreaks(int p, String s, Set<String> dict){
int n=s.length();
if(p==n) {
    return true;
}
for(int i=p+1;i<=n;i++) {
    if(dict.contains(s.substring(p,i))&&wordBreaks(i,s,dict)) {return true;}
}
return false;
}
//memo
Boolean[] mem;
public  int wordBreak2(String s, ArrayList<String> wordDict )
{   mem=new Boolean[s.length()];
    return wordBreak(0,s,new HashSet<String>(wordDict))?1:0;   
}
private boolean wordBreak(int p, String s, Set<String> dict){
    int n=s.length();
    if(p==n) {
        return true;
    }
    if(mem[p]!=null) {
        return mem[p];
    }
    for(int i=p+1;i<=n;i++) {
        if(dict.contains(s.substring(p,i))&&wordBreak(i,s,dict)) { 
            return mem[p]=true;
        }
    }
    return mem[p]=false;
}
//dp	
//Boolean[] mem;
public  int wordBreak3(String s, ArrayList<String> wordDict )
{   mem=new Boolean[s.length()+1];
int n=s.length();
Set<String>dict=new HashSet<String>(wordDict);
Arrays.fill(mem,false);
mem[0]=true;
for(int p=1;p<=n;p++)
{  for(int i=0;i<n;i++) {
    if(mem[i]&&dict.contains(s.substring(i,p))) { 
    mem[p]=true;break;
    }}}
return mem[n]?1:0;   
}
          //39
          //Largest Independent Set Problem
          //recursive
          //Thing is to count nos of nodes which grandchild of nodes
          static class Nodes
          {  int data;   Nodes left, right;};
          static int LISS(Nodes root)
          { if (root == null)   return 0;
              int size_excl = LISS(root.left) + LISS(root.right);
              int size_incl = 1;
              if (root.left!=null)
                  size_incl += LISS(root.left.left) + LISS(root.left.right);
              if (root.right!=null)
                  size_incl += LISS(root.right.left) +LISS(root.right.right);
              return Math.max(size_incl, size_excl);
          }
          static Nodes newNode( int data )
          {
              Nodes temp = new Nodes();
              temp.data = data;
              temp.left = temp.right = null;
              return temp;
          }
          //memo
          static class node
          {   int data, liss;  node left, right;
              public node(int data)
              {   this.data = data;   this.liss = 0;}
          }
       static int liss(node root)
          {
              if (root == null) return 0;
       if (root.liss != 0)return root.liss;
              if (root.left == null && root.right == null)return root.liss = 1;
              int liss_excl = liss(root.left) + liss(root.right);
              int liss_incl = 1;
              if (root.left != null)
              {   liss_incl += (liss(root.left.left) + liss(root.left.right));}
              if (root.right != null)
              {   liss_incl += (liss(root.right.left) + liss(root.right.right));}
              return root.liss = Math.max(liss_excl, liss_incl);
          }
       //40
       //Partion problem 
       //same as 8 subset sum problem
       
       //41
       //Longest Palindromic Subsequence
       //recursive
       static int lps(char seq[], int i, int j) {
    	        if (i == j)return 1;
    	        if (seq[i] == seq[j] && i + 1 == j)return 2;
    	        if (seq[i] == seq[j]) return lps(seq, i + 1, j - 1) + 2;
    	    return Math.max(lps(seq, i, j - 1), lps(seq, i + 1, j));
    	    }
       //memo
       static int lpss(char seq[])
       {
    	   int dp[][]=new int[seq.length][seq.length];
    	   for(int x[]:dp)Arrays.fill(x,-1);
    	   return lps(seq,0,seq.length-1,dp);
       }
       static int lps(char seq[], int i, int j,int dp[][]) {
	        if (i == j)return 1;
	        if (seq[i] == seq[j] && i + 1 == j)return 2;
	        if (seq[i] == seq[j]) return lps(seq, i + 1, j - 1,dp) + 2;
	        if(dp[i][j]!=-1)return dp[i][j];
	    return dp[i][j]= Math.max(lps(seq, i, j - 1,dp), lps(seq, i + 1,j,dp));
	    }
       //dp
       
       static int lps(String seq)
       {
       int n = seq.length();
       int i, j, cl;
       int L[][] = new int[n][n];
       for (i = 0; i < n; i++)L[i][i] = 1;
        for (cl=2; cl<=n; cl++)
           {   for (i=0; i<n-cl+1; i++)
               {   j = i+cl-1;
                   if (seq.charAt(i) == seq.charAt(j) && cl == 2)   L[i][j] = 2;
                   else if (seq.charAt(i) == seq.charAt(j)) L[i][j] = L[i+1][j-1] + 2;
                   else L[i][j] = Math.max(L[i][j-1], L[i+1][j]);
               }
           }
           return L[0][n-1];
       }
       //42
       //recursive
       long countPS(String s){
    	   int n=s.length();
    	   return countp(0,n-1,s)%1000000007;
    	                    }
    	      long countp(int i,int j,String s)
    	      {   if(i>j)return 0;
    	          if(i==j)return 1;
    	         else if(s.charAt(i)==s.charAt(j)) return (countp(i+1,j,s)+countp(i,j-1,s)+1)%1000000007;
    	         else return (countp(i+1,j,s)+countp(i,j-1,s)-countp(i+1,j-1,s)+1000000007)%1000000007;
    	         }
       //memo
       long countPS2(String s){
    	   int n=s.length();
    	   long[][] dp=new long[n+1][n+1];
    	   for(int i=0;i<n;i++)Arrays.fill(dp[i],-1);
    	   return countp(0,n-1,dp,s)%1000000007;
    	                    }
    	      long countp(int i,int j,long dp[][],String s)
    	      {   if(i>j)return 0;
    	          if(dp[i][j]>1000000007)dp[i][j]%=1000000007;
    	          if(dp[i][j]!=-1)return dp[i][j];
    	          if(i==j)return dp[i][j]=1;
    	         else if(s.charAt(i)==s.charAt(j)){ dp[i][j]=countp(i+1,j,dp,s)+countp(i,j-1,dp,s)+1;
    	             return dp[i][j]%1000000007;
    	         }
    	         else{  dp[i][j]=countp(i+1,j,dp,s)+countp(i,j-1,dp,s)-countp(i+1,j-1,dp,s)+1000000007;
    	          return dp[i][j]%1000000007;   
    	         }
    	      }
    	      //dp
    	      long countPS3(String s){
      	    	   int n=s.length();
       	    	   long[][] dp=new long[n][n];
       	    	         for (int i = 0; i < n; i++)dp[i][i] = 1;
       	    	   
       	    	         int j=0;
       	    	         for(int cl=2;cl<=n;cl++)
       	    	   {
       	    		   for(int i=0;i<=n-cl;i++)
       	    		   {    j=i+cl-1;
       	    			   if(i==j)dp[i][j]=1;
       	    			   else if(s.charAt(i)==s.charAt(j)){dp[i][j]=(dp[i+1][j]+dp[i][j-1]+1)%1000000007;}
       	    			   else {dp[i][j]=(dp[i+1][j]+dp[i][j-1]-dp[i+1][j-1]+1000000007)%1000000007;}
       	    		   }
       	    	   }
       	    	   return dp[0][n-1]%1000000007;
       	    	                    }
    	      //43
    	      //recursive
    	      int a,b,anss;
    	      public String longestPalindrome(String s) 
    	   {     a=0;b=0;anss=0;
    	    recursive(s,0,s.length()-1);
    	   return s.substring(a,b+1);
    	   }
    	      public boolean recursive(String s,int i,int j)
    	      {
    	      if(i==j)return true;
    	      if(i+1==j&&s.charAt(i)==s.charAt(j)){if(anss<j-i+1){anss=j-i+1;a=i;b=j;}return true;}
    	      if(s.charAt(i)==s.charAt(j)&&recursive(s,i+1,j-1)){if(anss<j-i+1){anss=j-i+1;a=i;b=j;}return true;}
    	      boolean x=recursive(s,i+1,j);
    	      boolean y=recursive(s,i,j-1);
    	      return false;
    	      }
    	      //memo
    	      public String longestPalindrome2(String s) 
    	   {   int n=s.length();
                  int dp[][]=new int[n+1][n+1];
                  a=0;b=0;anss=0;
    	    recursive(s,0,s.length()-1,dp);
    	   return s.substring(a,b+1);
    	   }
    	      public boolean recursive(String s,int i,int j,int dp[][])
    	      {
                  if(dp[i][j]!=0)return dp[i][j]==1?true:false;
    	      if(i==j){dp[i][j]=1;return true;}
    	      if(i+1==j&&s.charAt(i)==s.charAt(j)){if(anss<j-i+1){anss=j-i+1;a=i;b=j;}dp[i][j]=1;return true;}
    	      if(s.charAt(i)==s.charAt(j)&&recursive(s,i+1,j-1,dp))
              {if(anss<j-i+1){anss=j-i+1;a=i;b=j;}dp[i][j]=1;return true;}
    	      dp[i][j]=-1;
              boolean x=recursive(s,i+1,j,dp);
    	      boolean y=recursive(s,i,j-1,dp);
    	      return false;
    	      }
    	      //dp  O(n^2)
    	      public String longestPalindrome3(String S) {
    	    	     int n=S.length(),start=0,len=1;
    	    	        boolean table[][]= new boolean[n][n]; 
    	    	        for(int i=0;i<n;i++)
    	    	        {table[i][i]=true;}
    	    	        
    	    	        for(int i=n-2;i>=0;i--)
    	    	        {if(S.charAt(i)==S.charAt(i+1)) {table[i][i+1]=true;len=2;start=i;}}
    	    	        
    	    	        for(int k=3;k<=n;k++)
    	    	        {
    	    	        	for(int i=0;i<n-k+1;i++)
    	    	        	{
    	    	        		int j=i+k-1;
    	    	        		if(S.charAt(j)==S.charAt(i)&&table[i+1][j-1]) 
    	    	                {table[i][j]=true;if(k>len) {len=k;start=i;}}	
    	    	        	}	
    	    	        }
    	    	        return S.substring(start, start+len);
    	    	    }
    	      //2    O(n) expand around centre
    	      public String longestPalindrome4(String s) {
    	    	    int start=0,max=1,n=s.length();
    	    	        char x[]=s.toCharArray(); 
    	    	        int l=0,h=0;
    	    	        for(int i=1;i<n;i++)
    	    	        {
    	    	            l=i-1;h=i;
    	    	            while(l>=0&&h<n&&x[l]==x[h])
    	    	            {if(h-l+1>max){max=h-l+1;start=l;}
    	    	                h++;l--;}
    	    	            
    	    	            
    	    	            l=i-1;h=i+1;
    	    	             while(l>=0&&h<n&&x[l]==x[h])
    	    	            {if(h-l+1>max){max=h-l+1;start=l;}
    	    	                 h++;l--;}
    	    	            
    	    	        }
    	    			   		 return s.substring(start,start+max);       }
    	      //44
    	      //recursive
    	      public int AlternatingaMaxLength(int[] a){
    	    	    int n=a.length;
    	    	      int max=1;
    	    	        for(int i=0;i<n;i++)
    	    	        {max=Math.max(max,Lis(i,a,1));
    	    	            max=Math.max(max,Lis(i,a,0));
    	    	        } 
    	    	           return max;}
    	    	           static int Lis(int n,int a[],int s)
    	    	           {int max=1;
    	    	               if(n==0)return 1;
    	    	               for(int j=n-1;j>=0;j--)
    	    	               {int x=0,y=0;
    	    	               if(a[j]<a[n]&&s==0)x=Math.max(Lis(j,a,0),1+Lis(j,a,1));
    	    	                if(a[j]>a[n]&&s==1)y=Math.max(Lis(j,a,1),1+Lis(j,a,0));
    	    	                max=Math.max(max,Math.max(x,y));
    	    	               }
    	    	          return max; }
    	    	           //memo
    	    	           //still TLE//O(n2)
    	    	           public int AlternatingaMaxLength2(int[] a){
    	    	        	    int n=a.length;
    	    	        	      int max=1;
    	    	        	      int dp[][]=new int[n][2];
    	    	        	      for(int[]d:dp)Arrays.fill(d,-1);
    	    	        	        for(int i=0;i<n;i++)
    	    	        	        {max=Math.max(max,Lis(i,a,1,dp));
    	    	        	        max=Math.max(max,Lis(i,a,0,dp));
    	    	        	        } 
    	    	        	           return max;}
    	    	        	           static int Lis(int n,int a[],int s,int dp[][])
    	    	        	           {int  x=0,y=0;;
    	    	        	               if(n==0)return 1;
    	    	        	               if(dp[n][s]!=-1)return dp[n][s];
    	    	        	               for(int j=n-1;j>=0;j--)
    	    	        	               {
    	    	        	               if(a[j]<a[n]&&s==0)x=Math.max(x,Math.max(Lis(j,a,0,dp),1+y+Lis(j,a,1,dp)));
    	    	        	                if(a[j]>a[n]&&s==1)y=Math.max(y,Math.max(Lis(j,a,1,dp),1+x+Lis(j,a,0,dp)));
    	    	        	                }
    	    	        	                return dp[n][s]=Math.max(x,y);
    	    	        	     }
     //dp all are O(n2) except last on that is O(n)
    	  //1
    		       static int zzis(int arr[], int n)
    	    	      {   int las[][] = new int[n][2];
    	    	   for (int i = 0; i < n; i++)las[i][0] = las[i][1] = 1;
    	             int res = 1; // Initialize result
    	        for (int i = 1; i < n; i++)
    	        {   for (int j = 0; j < i; j++)
    	   {      if (arr[j] < arr[i]  )  las[i][0] = Math.max(las[j][1] + 1,las[i][0]);
    	   if (arr[j] > arr[i]  )  las[i][1] = Math.max(las[j][0] + 1,las[i][1]);}
    	    	    res = Math.max(res,Math.max(las[i][0], las[i][1]));
    	    	        	               }
    	    	        	               return res;
    	    	        	           }
    	    	        	           //2
    	  public int AlternatingaMaxLength3(int[] arr){
    	        int n=arr.length;
    	           int inc = 1;
    	           int dec = 1;
    	           for (int i = 1; i < n; i++)
    	           {
    	               if (arr[i] > arr[i - 1])inc = dec + 1;
    	               else if (arr[i] < arr[i - 1])dec = inc + 1;
    	           }
   	           return Math.max(inc, dec);
    	       }
    	         
    	    	        	           
    	      //45
    	      //recursive
    	      public static class job{ int start,end,profit;job(int s,int e,int p){this.start=s;this.end=e;this.profit=p;}}
    	      public static int weight(job x[]) {
    	    	  Arrays.sort(x,new Comparator<job>(){
					@Override
					public int compare(job o1, job o2) {
						if(o1.end>=o2.end)return 1;
						else return -1;
					}
    	    	  });
    	    	  for(job t:x) {System.out.println(t.start+" "+t.end+" "+t.profit);}
    	    	  return  find(x,x.length);
    	      }
    	      private static int find(job[] x, int i) {
             if(i==1)return x[i-1].profit;
              int j=-1;
              for(int z=i-1;z>=0;z--)
              {if(x[z].end<=x[i-1].start) {j=z;break;}}
              int inc = x[i-1].profit;
              if(j!=-1)inc+=find(x,j+1);
    	    int ex= find(x,i-1);
			return Math.max(inc, ex);
    	      }
    	      //memo
    	      public static int weight2(job x[]) {
 int dp[]=new int[ x.length+1];
 Arrays.fill(dp,-1);
    	    	  Arrays.sort(x,new Comparator<job>(){
					@Override
					public int compare(job o1, job o2) {
						if(o1.end>=o2.end)return 1;
						else return -1;
					}
    	    	  });
    	    	  for(job t:x) {System.out.println(t.start+" "+t.end+" "+t.profit);}
    	    	  return  find(x,x.length,dp);
    	      }
    	      private static int find(job[] x, int i,int dp[]) {
              if(i==1)return x[i-1].profit;
              if(dp[i]!=-1)return dp[i];
              int j=-1;
              for(int z=i-1;z>=0;z--)
              {if(x[z].end<=x[i-1].start) {j=z;break;}}
              int inc = x[i-1].profit;
              if(j!=-1)inc+=find(x,j+1);
    	    int ex= find(x,i-1);
			return dp[i]= Math.max(inc, ex);
    	      }
    	      //dp
    	      public static int weight3(job x[]) {int n=x.length;
    	    	  int dp[]=new int[ x.length+1];dp[0]=x[0].profit;
    	    	     	    	  Arrays.sort(x,new Comparator<job>(){
    	    	 					@Override
    	    	 					public int compare(job o1, job o2) {
    	    	 						if(o1.end>=o2.end)return 1;
    	    	 						else return -1;
    	    	 					}
    	    	     	    	  });
    	    	     	    	  for(job t:x) {System.out.println(t.start+" "+t.end+" "+t.profit);}
    	    for(int i=1;i<=n;i++) {
    	        int j=-1;
                for(int z=i-1;z>=0;z--)
                {if(x[z].end<=x[i-1].start) {j=z;break;}}
                int inc = x[i].profit;
                if(j!=-1) {inc+=dp[j];}
                int ex= dp[i-1];
    		dp[i]= Math.max(inc, ex);
    	    }
    	    	     	    	  return dp[n];
    	    	     	      }
			//46
    	      //recursive
    	      public static boolean find(int n,int x,int y)
    	      {
    	    	  if(n==0)return false;
    	    	  if(n==1)return true;
    	    	  if(n>=1&&!find(n-1,x,y))return true;
    	    	  else if(n>=x&&!find(n-x,x,y))return true;
    	    	  else if(n>=y&&!find(n-y,x,y))return true;
    	    	  else return false;
    	      }
    	      //memo
    	      static int dp[];
    	      public static boolean fin(int n,int x,int y)
    	      {if(n==0)return false;if(n==1)return true;
    	    	  dp=new int[n+1];Arrays.fill(dp,-1);dp[0]=0;dp[1]=1;
    	    	  return find2(n,x,y,dp);
    	      }
    	      public static boolean find2(int n,int x,int y,int dp[])
    	      {
    	    	  if(n==0)return false;
    	    	  if(n==1)return true;
    	    	  if(dp[n]!=-1)return dp[n]==0?false:true;
    	    	  if(n>=1&&!find(n-1,x,y)) {dp[n]=1;return true;}
    	    	  else if(n>=x&&!find(n-x,x,y)) {dp[n]=1;return true;}
    	    	  else if(n>=y&&!find(n-y,x,y)) {dp[n]=1;return true;}
    	    	  else {dp[n]=0;return false;}
    	      }
    	      //dp
    	      static boolean find3(int n, int x, int y)
    	      {   if(n==0)return false;
	    	  if(n==1)return true;
    	    	  boolean[] dp = new boolean[n + 1];
    	          Arrays.fill(dp, false);
    	          dp[0] = false;dp[1] = true;
    	          for (int i = 2; i <= n; i++) {
    	              if (i - 1 >= 0 && dp[i - 1] == false)dp[i] = true;
    	              else if (i - x >= 0 && dp[i - x] == false)   dp[i] = true;
    	              else if (i - y >= 0 && dp[i - y] == false)  dp[i] = true;
    	              else dp[i] = false;
    	          }
    	          return dp[n];
    	      }
    	      //47
    	      //recursive
    	      static long disarrange(int N){
    	    	    return dis(N);
    	    	    }
    	    	    static long dis(int N)
    	    	{
    	    	    if(N==0||N==1)return 0;
    	    	    if(N==2)return 1;
    	    	    return (((N-1)%1000000007)*
    	    	    (((dis(N-1)%1000000007)+(dis(N-2)%1000000007))
    	    	    %1000000007))%1000000007;
    	    	}
    	      //memo
    	      static long disarrange2(int N){
    	    	    long dp[]=new long[N+1];
    	    	    Arrays.fill(dp,-1);
    	    	    return dis(N,dp);
    	    	    }
    	    	    static long dis(int N,long dp[])
    	    	{
    	    	    if(N==0||N==1)return 0;
    	    	    if(N==2)return 1;
    	    	    if(dp[N]!=-1)return dp[N];
    	    	    return dp[N]=(((N-1)%1000000007)*
    	    	    (((dis(N-1,dp)%1000000007)+(dis(N-2,dp)%1000000007))
    	    	    %1000000007))%1000000007;
    	    	}
    	    	    //dp
    	    	    static long disarrange3(int N){long dp[]=new long[N+1];
    	    	    dp[0]=0;dp[1]=0;dp[2]=1;
    	    	    for(int i=3;i<=N;i++) {dp[i]=(((i-1)%1000000007)*
    	    	    	    (((dp[i-1]%1000000007)+(dp[i-2]%1000000007))
    	    	    	    	    %1000000007))%1000000007;}
    	    	    return dp[N];
    	    	    }
    	      //48
    	     //easier version of 58 dp but O(n2)
    	    // 26 of arrays but O(n)
    	    	    
    	    	// for interview first show worst cases of 58 recursive,memo,dp(O(n2)) then dp of 26 O(n)  
    	    	// then we have worst and most optimix=zed code 
    	    	    //yet another O(n) code
    	    	    public int MaxProfitDpCompactFinal(int[] prices)  {
    	                int buy1 = Integer.MAX_VALUE, buy2 = Integer.MAX_VALUE;
    	                int sell1 = 0, sell2 = 0;

    	                for (int i = 0; i < prices.length; i++) {
    	                    buy1 = Math.min(buy1, prices[i]);
    	                    sell1 = Math.max(sell1, prices[i] - buy1);
    	                    buy2 = Math.min(buy2, prices[i] - sell1);
    	                    sell2 = Math.max(sell2, prices[i] - buy2);
    	                }
    	                return sell2;
    	            }
    	    //49
    	      //recursive
    	      static long countMaximum(int arr[], int n)
    	      {return (long)counts(arr,0,n-1);}
    	      static int counts(int arr[],int i,int j)
    	      {
    	      if(i>j)return 0;
    	      int inc=0,exc=0;
    	      inc=arr[i]+Math.min(counts(arr,i+2,j),counts(arr,i+1,j-1));
    	      exc=arr[j]+Math.min(counts(arr,i,j-2),counts(arr,i+1,j-1));
    	      return Math.max(inc,exc);
    	      }
    	      //memo
    	      static long countMaximum2(int arr[], int n)
    	      {long dp[][]=new long[n+1][n+1];
    	      for(long d[]:dp)Arrays.fill(d, -1);return counts(arr,0,n-1,dp);}
    	      static long counts(int arr[],int i,int j,long [][]dp)
    	      {
    	      if(i>j)return 0;
    	      long inc=0,exc=0;
    	      if(dp[i][j]!=-1)return dp[i][j];
    	      inc=arr[i]+Math.min(counts(arr,i+2,j,dp),counts(arr,i+1,j-1,dp));
    	      exc=arr[j]+Math.min(counts(arr,i,j-2,dp),counts(arr,i+1,j-1,dp));
    	      return dp[i][j]=Math.max(inc,exc);
    	      }
    	      //dp
    	      static long countMaximum3(int arr[], int n)
    	      {
    	          // Your code here
    	  		long [][]dp = new long[n][n];
    	  		for(int d = 0; d < n; d++){
    	  		    for(int j = d, i = 0; j < n; j++, i++){
    	  		        if(d == 0) dp[i][j] = arr[i];
    	  		        else if(d == 1) dp[i][j] = Math.max(arr[i], arr[j]);
    	  		        else {
    	  		            long a1 = arr[i] + Math.min(dp[i + 2][j], dp[i + 1][j - 1]);
    	  		            long a2 = arr[j] + Math.min(dp[i + 1][j - 1], dp[i][j - 2]);
    	  		            dp[i][j] = Math.max(a1, a2);
    	  		        }
    	  		    }
    	  		}
    	  		return (dp[0][n - 1]);
    	          
    	      }
    	      //50
    	      //recursive
    	      static int optCost(int freq[], int i, int j)
    	      {  if (j < i)      // no elements in this subarray
    	           return 0;
    	         if (j == i)     // one element in this subarray
    	           return freq[i];
    	         int fsum = sum(freq, i, j);
    	         int min = Integer.MAX_VALUE;
    	        for (int r = i; r <= j; ++r)
    	         {   int cost = optCost(freq, i, r-1) +
    	                            optCost(freq, r+1, j);
    	             if (cost < min)
    	                min = cost;
    	         }
    	         return min + fsum;
    	      }
    	      static int optimalSearchTree(int keys[], int freq[], int n)
    	      {     return optCost(freq, 0, n-1);}
    	      static int sum(int freq[], int i, int j)
    	      {
    	          int s = 0;
    	          for (int k = i; k <=j; k++)
    	             s += freq[k];
    	          return s;
    	      }
    	      //dp O(n4)
    	      static int optimalSearchTree2(int keys[], int freq[], int n) {
    	    	  int cost[][] = new int[n + 1][n + 1];
    	          for (int i = 0; i < n; i++)    cost[i][i] = freq[i];
    	          for (int L = 2; L <= n; L++) {
    	              for (int i = 0; i <= n - L + 1; i++) {
    	                  int j = i + L - 1;
    	                              for (int r = i; r <= j; r++) {
    	                      int c = ((r > i) ? cost[i][r - 1] : 0)
    	                              + ((r < j) ? cost[r + 1][j] : 0) + sum(freq, i, j);
    	                      if (c < cost[i][j]) cost[i][j] = c;
    	                  }
    	              }
    	          }
    	          return cost[0][n - 1];
    	      }
    	      //51
    	      //recursive same as 6 matrix chain multiplication
    	      static int palindromicPartition(String str)
    	      {return m(str,0,str.length()-1);}
    	      static boolean palindrone(String s,int i,int j)
    	      {
    	          while(i<j){
    	              if(s.charAt(i)!=s.charAt(j))return false;
    	              i++;j--;
    	          }
    	          return true;
    	      }
    	       static int m(String s,int i,int j)
    	       {   int ans=0,min=Integer.MAX_VALUE;
    	           if(i>=j||palindrone(s,i,j))return 0;
    	           for(int k=i;k<j;k++)
    	           {ans=m(s,i,k)+m(s,k+1,j)+1;
    	           min=Math.min(min,ans);}
    	       return min;}
    	       //memo //O(n*n*(string length))
    	       static int palindromicPartition2(String str)
    	       {int N=str.length();
    	           int dp[][]=new int[N+1][N+1];for(int[]d:dp)Arrays.fill(d, -1);
    	       return m(str,0,N-1,dp);}
    	        static int m(String s,int i,int j,int [][]dp)
    	        {   int ans=0,min=Integer.MAX_VALUE;
    	            if(i>=j||palindrone(s,i,j))return 0;
    	            if(dp[i][j]!=-1)return dp[i][j];
    	            for(int k=i;k<j;k++)
    	            {ans=m(s,i,k,dp)+m(s,k+1,j,dp)+1;
    	            min=Math.min(min,ans);}
    	        return dp[i][j]=min;}
    	        //dp//O(n2)
    	        public static int minCut(String a)
    	        {
    	            int[] cut = new int[a.length()];
    	            boolean[][] palindrome = new boolean[a.length()][a.length()];
    	     
    	            for (int i = 0; i < a.length(); i++) {
    	                int minCut = i;
    	                for (int j = 0; j <= i; j++) {
    	                    if (a.charAt(i) == a.charAt(j) && 
    	                    		(i - j < 2 || palindrome[j + 1][i - 1])) {
    	                        palindrome[j][i] = true;
    	                        minCut = Math.min(minCut, j == 0 ? 0 : (cut[j - 1] + 1));
    	                    }
    	                }
    	                cut[i] = minCut;
    	            }
    	     
    	            return cut[a.length() - 1];
    	        }
    	        //52
    	        //recursive
    	        public int solveWordWrap (int[] nums, int k)
    	        {int n=nums.length;
    	           return solve(nums,n,k,0,k);
    	        }
    	        public int solve(int nums[],int n,int len,int i,int rem)
    	        {
    	            if(i==n-1)return nums[i] < rem ? 0 :rem*rem;
    	        int c=nums[i];
    	        if(c<rem)
    	        {return Math.min(solve(nums,n,len,i+1,rem == len ? rem-c : rem-c- 1),
    	                         (rem*rem)+solve(nums,n,len,i+1,len-c));}
    	        else{return (rem*rem)+solve(nums,n,len,i+1,len-c);}
    	        }
    	        //memo
    	        public int solveWordWrap2(int[] nums, int k)
    	        {int n=nums.length;
    	        int dp[][]=new int [n+1][k+1];
    	        for(int d[]:dp)Arrays.fill(d,-1);
    	           return solve(nums,n,k,0,k,dp);
    	        }
    	        public int solve(int nums[],int n,int len,int i,int rem,int dp[][])
    	        {
    	            if(i==n-1)return nums[i] < rem ? 0 :rem*rem;
    	        int c=nums[i];
    	        if(dp[i][rem]!=-1)return dp[i][rem];
    	        if(c<rem)
    	        {return dp[i][rem]=Math.min(solve(nums,n,len,i+1,rem == len ? rem-c : rem-c- 1,dp),
    	                         (rem*rem)+solve(nums,n,len,i+1,len-c,dp));}
    	        else{return dp[i][rem]=(rem*rem)+solve(nums,n,len,i+1,len-c,dp);}
    	        }
    	        //dp
    	        public int solveWordWrap3 (int[] nums, int k)
    	        {
    	            // Code here 
    	            int n = nums.length;
    	            int currLen = 0;
    	            int cost = 0;
    	            int dp[] = new int[n];
    	            dp[n-1] = 0;
    	            for(int i = n-2; i >=0; i--){
    	                currLen = -1;
    	                dp[i] = Integer.MAX_VALUE;
    	                for(int j = i; j < n; j++){
    	                    currLen += nums[j] +1;
    	                    if(currLen > k){
    	                        break;
    	                    }
    	                    if(j == n-1){
    	                        cost = 0;
    	                    }
    	                    else{
    	                        cost = (k-currLen)*(k-currLen) + dp[j+1];
    	                    }
    	                    if(cost < dp[i]){
    	                        dp[i] = cost;
    	                    }
    	                }
    	            }
    	            return dp[0];
    	        }
    	        //53
    	        //recursive
    	        public long getCount(int N)
    	    	{
    	    	    if(N<=0)return 0;
    	    	    if(N==1)return 10;
    	    	    char key[][]=new char[][]{{'1','2','3'},
    	    	                            {'4','5','6'},
    	    	                            {'7','8','9'},
    	    	                            {'*','0','#'}};
    	    long cost=0;
    	    for(int i=0;i<=3;i++)
    	    { for(int j=0;j<=2;j++)
    	        {if(key[i][j]!='*'&&key[i][j]!='#'){cost+=num(key,i,j,N);}}
    	    }
    	    return cost;
    	    	}
    	    	public long num(char [][]key,int i,int j,int N)
    	    	{
    	    	if(N<=0)return 0;
    	    	if(N==1)return 1;
    	    	long cost=0;
    	    	int x=0,y=0;
    	    	for(int k=0;k<5;k++)
    	    	    {
    	    	        x=i+X[k];y=j+Y[k];
    	    	        if(x>=0&&x<=3&&y>=0&&y<=2&&key[x][y]!='*'&&key[x][y]!='#')
    	    	        cost+=num(key,x,y,N-1);
    	    	    }
    	    	    return cost;
    	    	}
    	        //memo
    	    	//O(20*N)=> O(N)
    	        public long getCount2(int N)
    	    	{
    	    	    if(N<=0)return 0;
    	    	    if(N==1)return 10;
    	    	    char key[][]=new char[][]{{'1','2','3'},
    	    	                            {'4','5','6'},
    	    	                            {'7','8','9'},
    	    	                            {'*','0','#'}};
    	    	                            long dp[][][]=new long[5][4][N+1];
    	    	                            for(long[][] d:dp)
    	                                       for(long []p:d)
    	                                       Arrays.fill(p,-1);
    	    long cost=0;
    	    for(int i=0;i<=3;i++)
    	    { for(int j=0;j<=2;j++)
    	        {if(key[i][j]!='*'&&key[i][j]!='#'){cost+=num(key,i,j,N,dp);}}
    	    }
    	    return cost;
    	    	}
    	    	int X[]=new int[]{0,-1,1,0,0};
    	    	int Y[]=new int[]{0,0,0,-1,1};
    	    	public long num(char [][]key,int i,int j,int N,long dp[][][])
    	    	{
    	    	if(N<=0)return 0;
    	    	if(N==1)return 1;
    	    	if(dp[i][j][N]!=-1)return dp[i][j][N];
    	    	long cost=0;
    	    	int x=0,y=0;
    	    	for(int k=0;k<5;k++)
    	    	    {
    	    	        x=i+X[k];y=j+Y[k];
    	    	        if(x>=0&&x<=3&&y>=0&&y<=2&&key[x][y]!='*'&&key[x][y]!='#')
    	    	        cost+=num(key,x,y,N-1,dp);
    	    	    }
    	    	    return dp[i][j][N]=cost;
    	    	}
    	    	//dp
    	    	public long getCount3(int n)
    	    	{
    	    	    char keypad[][]=new char[][]{{'1','2','3'},
    	    	                            {'4','5','6'},
    	    	                            {'7','8','9'},
    	    	                            {'*','0','#'}};
    	    	   if(keypad == null || n <= 0)return 0;
    	        if(n == 1)return 10;
    	         int row[] = {0, 0, -1, 0, 1};
    	        int col[] = {0, -1, 0, 1, 0};
    	     
    	        long [][]count = new long[10][n + 1];
    	        int i = 0, j = 0, k = 0, move = 0,ro = 0, co = 0, num = 0;
    	        int nextNum = 0;long totalCount = 0;
    	     
    	        for (i = 0; i <= 9; i++)
    	        {   count[i][0] = 0;   count[i][1] = 1;}
    	        
    	        for (k = 2; k <= n; k++)
    	        {for (i = 0; i < 4; i++) // Loop on keypad row
    	            {   for (j = 0; j < 3; j++) // Loop on keypad column
    	                {if (keypad[i][j] != '*' &&
    	                        keypad[i][j] != '#')
    	                    {               num = keypad[i][j] - '0';
    	                        count[num][k] = 0;
    	                    for (move = 0; move < 5; move++)
    	                        {
    	                            ro = i + row[move];
    	                            co = j + col[move];
    	                            if (ro >= 0 && ro <= 3 && co >= 0 &&
    	                                co <= 2 && keypad[ro][co] != '*' &&
    	                                           keypad[ro][co] != '#')
    	                            {
    	                                nextNum = keypad[ro][co] - '0';
    	                                count[num][k] += count[nextNum][k - 1];
    	                            }
    	                        }
    	                    }
    	                }
    	            }
    	        }
    	        totalCount = 0;
    	        for (i = 0; i <= 9; i++) totalCount += count[i][n];
    	        return totalCount;
    	    }
    	        //54
    	        // similar to matrix chain multiplication
    	        //recursive and memo
    	        
    	        static int countWays(int N, String S){
    	            int dp[][][] = new int[N + 1][N + 1][2];
    	            for (int row[][] : dp)
    	                for (int col[] : row)
    	                    Arrays.fill(col, -1);
    	            return parenthesis_count(S, 0, N - 1, 1, dp)%1003;
    	        }
    	        public static int parenthesis_count(String str, int i,int j, int isTrue,int[][][] dp)
    	        {        if (i > j)return 0;
    	                 if (i == j)
    	            {   if (isTrue == 1) return (str.charAt(i) == 'T') ? 1 : 0;
    	                else return (str.charAt(i) == 'F') ? 1 : 0;
    	            }
    	            if (dp[i][j][isTrue] != -1) return dp[i][j][isTrue];
    	            int temp_ans = 0;
    	            int leftTrue, rightTrue, leftFalse, rightFalse;
    	            for (int k = i + 1; k <= j - 1; k = k + 2)
    	            {
    	                if (dp[i][k - 1][1] != -1)leftTrue = dp[i][k - 1][1];
    	                else leftTrue = parenthesis_count(str, i, k - 1,1, dp)%1003;
    	                
    	                if (dp[i][k - 1][0] != -1) leftFalse = dp[i][k - 1][0];
    	                else leftFalse = parenthesis_count(str, i, k - 1,0, dp)%1003;
    	           
    	                if (dp[k + 1][j][1] != -1)rightTrue = dp[k + 1][j][1];
    	                else rightTrue = parenthesis_count(str, k + 1, j,1, dp)%1003;
    	                
    	                if (dp[k + 1][j][0] != -1)rightFalse = dp[k + 1][j][0];
    	                else rightFalse = parenthesis_count(str, k + 1,j, 0, dp)%1003;
    	                
    	                if (str.charAt(k) == '&')
    	                {   if (isTrue == 1)
    	                    {   temp_ans = temp_ans + leftTrue * rightTrue;temp_ans%=1003;}
    	                    else
    	                    {
    	                        temp_ans = temp_ans
    	                                   + leftTrue * rightFalse
    	                                   + leftFalse * rightTrue
    	                                   + leftFalse * rightFalse;
    	                     temp_ans%=1003;}
    	                }
    	                // Evaluate OR operation
    	                else if (str.charAt(k) == '|')
    	                {   if (isTrue == 1)
    	                    {
    	                        temp_ans = temp_ans
    	                                   + leftTrue * rightTrue
    	                                   + leftTrue * rightFalse
    	                                   + leftFalse * rightTrue;
    	                     temp_ans%=1003;}
    	                    else
    	                    {
    	                        temp_ans
    	                            = temp_ans + leftFalse * rightFalse;
    	                     temp_ans%=1003;}
    	                }
    	                // Evaluate XOR operation
    	                else if (str.charAt(k) == '^')
    	                {
    	                    if (isTrue == 1)
    	                    {
    	                        temp_ans = temp_ans
    	                                   + leftTrue * rightFalse
    	                                   + leftFalse * rightTrue;
    	                     temp_ans%=1003;}
    	                    else
    	                    {
    	                        temp_ans = temp_ans
    	                                   + leftTrue * rightTrue
    	                                   + leftFalse * rightFalse;
    	                     temp_ans%=1003;}
    	                }
    	                dp[i][j][isTrue] = temp_ans;
    	            }
    	            return temp_ans;
    	        } 
    	        //dp
    	        static int countParenth(char symb[],char oper[],int n)
{
    int F[][] = new int[n][n];
    int T[][] = new int[n][n];
    for (int i = 0; i < n; i++) {
        F[i][i] = (symb[i] == 'F') ? 1 : 0;
        T[i][i] = (symb[i] == 'T') ? 1 : 0;
    }
   for (int gap = 1; gap < n; ++gap) // size of string between braces
    {   for (int i = 0,j = gap; j < n;++i, ++j)// start and end
        {   T[i][j] = F[i][j] = 0;
            for (int g = 0; g < gap; g++) // transverse between start and end 
            {   int k = i + g;
                int tik = T[i][k]+ F[i][k];
                int tkj = T[k + 1][j]+ F[k + 1][j];
                if (oper[k] == '&')
                {
                    T[i][j] += T[i][k]
                            * T[k + 1][j];
                    F[i][j]
                        += (tik * tkj
                            - T[i][k]
                            * T[k + 1][j]);
                }
                if (oper[k] == '|')
                {
                    F[i][j] += F[i][k]
                            * F[k + 1][j];
                    T[i][j]
                        += (tik * tkj
                            - F[i][k]
                            * F[k + 1][j]);
                }
                if (oper[k] == '^')
                {
                    T[i][j] += F[i][k]
                           * T[k + 1][j]
                               + T[i][k]
                               * F[k + 1][j];
                    F[i][j] += T[i][k]
                           * T[k + 1][j]
                               + F[i][k]
                           * F[k + 1][j];
                }
            }
        }
    }
    return T[0][n - 1];
}
    	      //55
    	      //O(N^3) memoized best approach
    	      static int start, end;
    	      public static void sumMatrix(int matrix[][],int R,int C,int k)
    	      {
    	    	  int temp[]=new int[R];
    	    	  int area;
    	    	    boolean sum = false;
    	    	    int fup = 0, fdown = 0, fleft = 0, fright = 0;
    	    	    int maxArea = Integer.MIN_VALUE;
   for(int l=0;l<C;l++)
   {
	   Arrays.fill(temp,0);
	   for(int r=l;r<C;r++)
	   {
		   for(int v=0;v<R;v++)
		   temp[v]+=matrix[v][r];
			   sum=check(temp,R,k);
			   area=(end-start+1)*(r-l+1);
			   if(sum&&maxArea<area)
			   {
				   maxArea=area;
				   fup=start;
				   fdown=end;
				   fleft=l;
				   fright=r;
		   }
	   }
   }    if (fup == 0 && fdown == 0 && fleft == 0 &&fright == 0 && matrix[0][0] != k)
	        {System.out.print("No sub-matrixwith k");return;}
	        System.out.print(fup+ ", " +fleft+"\n");
	        System.out.print(fdown+ ", "+fright+"\n");
	        
	      for (int j = fup; j <= fdown; j++)
	        {   for (int i = fleft; i <= fright; i++)
	                System.out.print(matrix[j][i] + " ");
	            System.out.println();
	        }
	   
   
    	      }
    	  private static boolean check(int[] temp, int v, int k) {
    		    HashMap<Integer,Integer> um = new HashMap<Integer,Integer>();
    		   int sum = 0, maxLen = 0;  
    		  for(int i=0;i<v;i++)
    		  {
    			  sum+=temp[i];
    			  if(sum==k) {maxLen=i+1;start=0;end=i;}
    			  if(!um.containsKey(sum)) {um.put(sum,i);}
    			  if(um.containsKey(sum-k)) {
    				   if (maxLen < (i - um.get(sum - k))) {
    				  maxLen = i - um.get(sum - k);
    	                start = um.get(sum - k) + 1;
    	                end = i;}
    			  }
    		  }
    		  
				return maxLen!=0;
			}
    	  //56
	      static int start1, end1;
	      public static void sumMatri(int matrix[][],int R,int C,int k)
	      {
	    	  int temp[]=new int[R];
	    	  int area;
	    	    boolean sum = false;
	    	    int fup = 0, fdown = 0, fleft = 0, fright = 0;
	    	    int maxArea = Integer.MIN_VALUE;
for(int l=0;l<C;l++)
{
   Arrays.fill(temp,0);
   for(int r=l;r<C;r++)
   {
	   for(int v=0;v<R;v++)
	   temp[v]+=matrix[v][r]==1?1:-1;
		   sum=check1(temp,R,k);
		   area=(end1-start1+1)*(r-l+1);
		   if(sum&&maxArea<area)
		   {
			   maxArea=area;
			   fup=start1;
			   fdown=end1;
			   fleft=l;
			   fright=r;
	   }
   }
}    if (fup == 0 && fdown == 0 && fleft == 0 &&fright == 0 && matrix[0][0] != k)
        {System.out.print("No sub-matrix with k");return;}
        System.out.print(fup+ ", " +fleft+"\n");
        System.out.print(fdown+ ", "+fright+"\n");
        
      for (int j = fup; j <= fdown; j++)
        {   for (int i = fleft; i <= fright; i++)
                System.out.print(matrix[j][i] + " ");
            System.out.println();
        }
   

	      }
	  private static boolean check1(int[] temp, int v, int k) {
		    HashMap<Integer,Integer> um = new HashMap<Integer,Integer>();
		   int sum = 0, maxLen = 0;  
		  for(int i=0;i<v;i++)
		  {
			  sum+=temp[i];
			  if(sum==k) {maxLen=i+1;start1=0;end1=i;}
			  if(!um.containsKey(sum)) {um.put(sum,i);}
			  if(um.containsKey(sum-k)) {
				   if (maxLen < (i - um.get(sum - k))) {
				  maxLen = i - um.get(sum - k);
	                start1 = um.get(sum - k) + 1;
	                end1 = i;}
			  }
		  }
		  
			return maxLen!=0;
		}	  
    	  //57
    	  static int maximumSumRectangle(int N,int M,int[][] mat)
    	    {
    	        int m = mat.length;
    	        int n = mat[0].length;
    	        int preSum[][] = new int[m + 1][n];
    	 
    	        for (int i = 0; i < m; i++)
    	        {
    	            for (int j = 0; j < n; j++)
    	            {
    	                preSum[i + 1][j] =preSum[i][j] + mat[i][j];
    	            }
    	        }
    	 
    	        int maxSum = -1;
    	        int minSum = Integer.MIN_VALUE;
    	        for (int rowStart = 0;rowStart < m;rowStart++)
    	        { for (int row = rowStart; row < m; row++)
    	            {   int sum = 0;
    	                for (int col = 0; col < n; col++)
    	                { sum += preSum[row + 1][col]- preSum[rowStart][col];
    	                    if (sum < 0) {
    	                        if (minSum < sum) {minSum = sum;}
    	                        sum = 0;
    	                    }
    	                    else if (maxSum < sum)
    	                    {   maxSum = sum;}
    	                }
    	            }
    	        }
    	        return maxSum == -1 ? minSum : maxSum;
    	    }
    	  //58
    	  //recursive
    	  static int maxProfit(int K, int N, int A[]) {
    		    return profit(A,0,K,0);
    		    }
    		    static int profit(int A[],int buy,int left,int i)
    		    {
    		        if(i>=A.length||left<=0)return 0;
    		        int profits=profit(A,buy,left,i+1);
    		        if(buy==1){profits=Math.max(profits,profit(A,0,left-1,i+1)+A[i]);}
    		        else{profits=Math.max(profits,profit(A,1,left,i+1)-A[i]);}
    		    return profits;
    		    }
    		    //memo//O(n2)
    		    static int maxProfit2(int K,int A[]) {
    		        int dp[][][]=new int[A.length+1][K+1][2];
    		        for(int d[][]:dp)
    		            for(int p[]:d)
    		                Arrays.fill(p,-1);
    		    return profit(A,0,K,0,dp);
    		    }
    		    static int profit(int A[],int buy,int left,int i,int dp[][][])
    		    {
    		        if(i>=A.length||left<=0)return 0;
    		        if(dp[i][left][buy]!=-1)return dp[i][left][buy];
    		        int profits=profit(A,buy,left,i+1,dp);
    		        if(buy==1){profits=Math.max(profits,profit(A,0,left-1,i+1,dp)+A[i]);}
    		        else{profits=Math.max(profits,profit(A,1,left,i+1,dp)-A[i]);}
    		    return dp[i][left][buy]=profits;
    		    }
    		    //dp O(kn2)
    		    static int maxProfit3(int k,int price[]) 
    	        {int n=price.length;
    	         if(n<2)return 0;
    	       int[][] profit = new int[k + 1][n + 1];
    	       for (int i = 0; i <= k; i++) profit[i][0] = 0;

    	       for (int j = 0; j <= n; j++) profit[0][j] = 0;
    	    for (int i = 1; i <= k; i++)
    	       {  for (int j = 1; j < n; j++)
    	           {
    	               int max_so_far = 0;
    	               for (int m = 0; m < j; m++)
    	               max_so_far = Math.max(max_so_far, price[j] -price[m] + profit[i - 1][m]);
    	               profit[i][j] = Math.max(profit[i] [j - 1],max_so_far);
    	           }
    	       }
    	       return profit[k][n - 1];
    	        }
    		    //O(kn)
    		    static int maxProfit(int price[],int n, int k)
   {
       int profit[][] = new int[k + 1][ n + 1];
       for (int i = 0; i <= k; i++)
           profit[i][0] = 0;
       for (int j = 0; j <= n; j++)
           profit[0][j] = 0;
for (int i = 1; i <= k; i++)
       {  int prevDiff = Integer.MIN_VALUE;
           for (int j = 1; j < n; j++)
           {  prevDiff = Math.max(prevDiff, profit[i - 1][j - 1] -price[j - 1]);
               profit[i][j] = Math.max(profit[i][j - 1], price[j] + prevDiff);
           }
       }
       return profit[k][n - 1];
   }
			//59
    //recursive
    public static boolean isInterLeave(String a,String b,String c)
   	{
   	    if(a.length()+b.length()!=c.length())return false;
   	    return isI(a.length(),b.length(),c.length(),a,b,c);
   	}
   	public static boolean isI(int i,int j,int k,String a,String b,String c)
   	{
   	    if(i==0&&j==0&&k==0)return true;
   	    boolean x=false,y=false;
   	    if(i-1>=0&&a.charAt(i-1)==c.charAt(k-1)){x= isI(i-1,j,k-1,a,b,c);}
   	     if(j-1>=0&&b.charAt(j-1)==c.charAt(k-1)){y= isI(i,j-1,k-1,a,b,c);} 
   	     return x||y;
   	}
	//memo
   	public static boolean isInterLeave2(String a,String b,String c)
	{
	    if(a.length()+b.length()!=c.length())return false;
	    int [][][]dp=new int[a.length()+1][b.length()+1][c.length()+1];
	    for(int d[][]:dp) {for(int[]p:d) {Arrays.fill(p, -1);}}
	    return isI(a.length(),b.length(),c.length(),a,b,c,dp);
	}
	public static boolean isI(int i,int j,int k,String a,String b,String c,int [][][]dp)
	{
	    if(i==0&&j==0&&k==0)return true;
	    if(dp[i][j][k]!=-1)return dp[i][j][k]==1?true:false;
	    boolean y=false;
	    if(i-1>=0&&a.charAt(i-1)==c.charAt(k-1)){dp[i][j][k]= isI(i-1,j,k-1,a,b,c,dp)==true?1:0;}
	    if(j-1>=0&&b.charAt(j-1)==c.charAt(k-1)){y= isI(i,j-1,k-1,a,b,c,dp);} 
	    dp[i][j][k]=(dp[i][j][k]==1?true:false||y)==true?1:0;
	    return dp[i][j][k]==1?true:false;
	}
	//dp
	public boolean isInterLeave3(String a,String b,String c)
	{   int len1=a.length(),len2=b.length();
        boolean dp[][]=new boolean[len1+1][len2+1];
        dp[0][0]=true;
        for(int i=1,idx=0;i<=len1;i++,idx++)
        {
            if(a.charAt(i-1)==c.charAt(idx))
                dp[i][0]|=dp[i-1][0];
            else
                break;
        }
        
        for(int i=1,idx=0;i<=len2;i++,idx++)
        {
            if(b.charAt(i-1)==c.charAt(idx))
                dp[0][i]|=dp[0][i-1];
            else
                break;
        }
        
        for(int i=1;i<=len1;i++)
        {
            for(int j=1;j<=len2;j++)
            {
                int idx=i+j-1;
                if(a.charAt(i-1)==c.charAt(idx))
                    dp[i][j]|=dp[i-1][j];
                if(b.charAt(j-1)==c.charAt(idx))
                    dp[i][j]|=dp[i][j-1];
            }
        }
        return dp[len1][len2];
	}
	//60
    //recursive
    public int findLongestChain(int[][] pairs) {
        int n=pairs.length;
            Arrays.sort(pairs, (a, b) -> a[1] - b[1]);
           return find(pairs,0,Integer.MIN_VALUE);  
       }
       public int find(int [][]pairs,int i,int ans)
       {
           if(i>=pairs.length)return 0;
           int z=0;
           if(ans<pairs[i][0]){
                   z=1+find(pairs,i+1,pairs[i][1]);}
               int v=find(pairs,i+1,ans);
       return Math.max(z,v);
       }
    //memo
    public int findLongestChain2(int[][] pairs) {
        int n=pairs.length;
            Arrays.sort(pairs, (a, b) -> a[1] - b[1]);
           int dp[]=new int[n+1];Arrays.fill(dp,-1);
           
           return find(pairs,0,Integer.MIN_VALUE,dp);  
       }
       public int find(int [][]pairs,int i,int ans,int[]dp)
       {
           if(i>=pairs.length)return 0;
           int z=0;
           if(dp[i]!=-1)return dp[i];
           if(ans<pairs[i][0]){
                   z=1+find(pairs,i+1,pairs[i][1],dp);}
               int v=find(pairs,i+1,ans,dp);
       dp[i]= Math.max(z,v);
       return dp[i];
       }
       //dp
       public int findLongestChain3(int[][] pairs) {
           Arrays.sort(pairs, (a, b) -> a[0] - b[0]);
           int N = pairs.length;
           int[] dp = new int[N];
           Arrays.fill(dp, 1);

           for (int j = 1; j < N; ++j) {
               for (int i = 0; i < j; ++i) {
                   if (pairs[i][1] < pairs[j][0])
                       dp[j] = Math.max(dp[j], dp[i] + 1);
               }
           }

           int ans = 0;
           for (int x: dp) if (x > ans) ans = x;
           return ans;
       }}