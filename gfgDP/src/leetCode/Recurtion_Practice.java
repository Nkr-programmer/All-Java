package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Recurtion_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    //    practice recurtion
	//12)1664. Ways to Make a Fair Array
	public int waysToMakeFair(int[] nums) {
        int n=nums.length;
         int  left[]= new int[2];
        int right[]= new int[2];
        
        sum(nums,right,0);
        // for(int i=0;i<n;i++)
        // {right[i%2]+=nums[i];}
         
        int res=find(nums,right,left,0,0);
        // for(int i=0;i<n;i++)
        // {
        //     right[i%2]-=nums[i];
        //     if(left[0]+right[1]==left[1]+right[0])res++;
        //     left[i%2]+=nums[i];
        // }
        return res;
    }
	
    public static int find(int nums[],int right[],int left[],int n,int res)
    {
        if(n==nums.length){return res;}
         right[n%2]-=nums[n];
               if(left[0]+right[1]==left[1]+right[0])res++;
            left[n%2]+=nums[n];
       res= find(nums,right,left,n+1,res);
        return res;
    }
    public static void sum(int nums[],int right[],int n)
    {
       
        if(n==nums.length){return ;}
        
        right[n%2]+=nums[n];
        sum(nums,right,n+1);
        return ;
    }
  //13) 1706. Where Will the Ball Fall
    public int[] findBall(int[][] g) {
    	 int r= g.length,c=g[0].length;
    	        int a[]= new int[c];
//    	        for(int j=0;j<c;j++)
//    	        {int pj=j,pi=0;
//    	            for(int i=0;i<r;i++)
//    	            {
//    	                if(i==0){pi=0;}
//    	             if(g[pi][pj]==1)
//    	             {
//    	                 if((pj+1<c)&&(g[pi][pj+1]==1)){pj++;}else{a[j]=-1;break;}
//    	                   pi++;               
//    	             }
//    	             else{
//    	                 
//    	                 if((pj-1>=0)&&(g[pi][pj-1]==-1)){pj--;}else{a[j]=-1;break;}
//    	                   pi++; 
//    	             }
//    	                
//    	            }
//    	        if(a[j]!=-1) a[j]=pj;
//    	            
//    	        }
    	    findo(g,0,r,c,a);    
    	        return a;
    	    }
    	    public static void findo(int[][]g,int jj,int r,int c,int[]a)
    	    {
    	        if(jj==c){return;}
    	        int pj=jj,pi=0;
    	         for(int i=0;i<r;i++)
    	            {
    	                if(i==0){pi=0;}
    	             if(g[pi][pj]==1)
    	             {
    	                 if((pj+1<c)&&(g[pi][pj+1]==1)){pj++;}else{a[jj]=-1;break;}
    	                   pi++;               
    	             }
    	             else{
    	                 
    	                 if((pj-1>=0)&&(g[pi][pj-1]==-1)){pj--;}else{a[jj]=-1;break;}
    	                   pi++; 
    	             }}
    	              if(a[jj]!=-1) a[jj]=pj;    
    	            findo(g,jj+1,r,c,a);
    	        return;
    	    }
    	    //15)  413. Arithmetic Slices
    	    public int numberOfArithmeticSlices(int[] nums){
    	        int n=nums.length;if(n<3){return 0;}
    	         int diff[]= new int[n-1];
    	         int ans[]= new int[n-1];
    	         // for(int i=0;i<n-1;i++)
    	         // {diff[i]=nums[i]-nums[i+1];}
    	        int res=0;
    	         res=numbo(ans,res,nums,diff,n-2);
    	         
    	         
    	        // ans[0]=0;int res=0;
    	         
    	        //  for(int i=1;i<n-1;i++)
    	        //  {
    	        //     if(diff[i-1]==diff[i]){ans[i]=ans[i-1]+1;}
    	        // else {if(ans[i-1]!=0){res+=(ans[i-1]*(ans[i-1]+1))/2;}ans[i]=0;} 
    	        // }
    	       
    	         if(ans[n-2]!=0){res+=(ans[n-2]*(ans[n-2]+1))/2;}
    	         return res;
    	     }   
    	     
    	    public static int numbo(int ans[],int res,int nu[],int diff[],int n)
    	    {
    	        if(n<0){return res;}
    	        res=numbo(ans,res,nu,diff,n-1);
    	        diff[n]=nu[n]-nu[n+1];
    	        ans[0]=0;
    	        if(n!=0)
    	        {
    	         if(diff[n-1]==diff[n]){ans[n]=ans[n-1]+1;}
    	       else {if(ans[n-1]!=0){res+=(ans[n-1]*(ans[n-1]+1))/2;}ans[n]=0;}    
    	        }
    	        
    	        
    	        return res;
    	    }
    	    
    	 //   Recurtion  Easy 1863. Sum of All Subset XOR Totals
    	    
    	    public int subsetXORSum(int[] nums) {
    	    	  int n=nums.length;
    	    	      return   re(nums,0,n,0);
    	    	            
    	    	    }
    	    	public static int re(int[] nums,int i,int n,int x)
    	    	{
    	    	     if(i==n)  System.out.print(x+" ");
    	    	    if(i==n)return x ;

    	    	    int include=0,exclude=0;
    	    	    
    	    	    include=re(nums,i+1,n,x^nums[i]);
    	    	     exclude=re(nums,i+1,n,x);
    	    	 
    	    	    return include+exclude;
    	    	}
//29)494. Target Sum
    	    	  static int count=0;
    	    	    public int findTargetSumWays(int[] nums, int t) {
    	    	    	  int n=nums.length;count=0;
    	    	    	    	         re(nums,0,n,0,t);
    	    	    	    	      return count;      
    	    	    	    	    }
    	    	    	    	public static int re(int[] nums,int i,int n,int x,int t)
    	    	    	    	{
    	    	    	    	     if(i==n&&x==t)count++;
    	    	    	    	    if(i==n)return x ;

    	    	    	    	    int include=0,exclude=0;
    	    	    	    	    
    	    	    	    	    include=re(nums,i+1,n,x+nums[i],t);
    	    	    	    	     exclude=re(nums,i+1,n,x-nums[i],t);
    	    	    	    	 
    	    	    	    	    return include+exclude;
    	    	    	    	}
//30) 300. Longest Increasing Subsequence
    	    	    	    	  public int lengthOfLIS(int[] nums) {
    	    	    	    	        return lengthofLIS(nums, Integer.MIN_VALUE, 0);
    	    	    	    	    }

    	    	    	    	    public int lengthofLIS(int[] nums, int prev, int curpos) {
    	    	    	    	        if (curpos == nums.length) {
    	    	    	    	            return 0;
    	    	    	    	        }
    	    	    	    	        int taken = 0;
    	    	    	    	        if (nums[curpos] > prev) {
    	    	    	    	            taken = 1 + lengthofLIS(nums, nums[curpos], curpos + 1);
    	    	    	    	        }
    	    	    	    	        int nottaken = lengthofLIS(nums, prev, curpos + 1);
    	    	    	    	        return Math.max(taken, nottaken);
    	    	    	    	    }
//recursive approch  31) 120. Triangle
    	    	    	    	    public int minimumTotal2(List<List<Integer>> triangle) {
    	    	    	    	  	  int n=triangle.size();    	    	    	    	    	    	    	 return  re(triangle,0,n,0,0);
    	    	    	    	   	    	    }
    	    	    	    	      public static int re(List<List<Integer>> nums,int i,int n,int x,int j)	{
    	    	    	    	      	
    	    	    	    	    //if(i==n)  System.out.print(x+" ");
    	    	    	    	          if(i==n)return x ;
    	    	    	    	         	    int include=0,exclude=0;
    	    	    	    	          exclude=re(nums,i+1,n,x+nums.get(i).get(j),j+1);  
    	    	    	    	          include=re(nums,i+1,n,x+nums.get(i).get(j),j);
    	    	    	    	     	    return Math.min(include,exclude);
    	    	    	    	      	    	    	    	    	    	    	    	}
    	    	    	    	    
    	    	    	    	    
    	    	    	    	    
    	    	    	    	    
    	    	    	    	 // memo;   
    	    	    	    	    public int minimumTotal(List<List<Integer>> triangle) {
    	    	    	    	        int [][] memo = new int [triangle.size()][];
    	    	    	    	        for(int i = 0; i < triangle.size(); i++){
    	    	    	    	            memo[i] = new int[triangle.get(i).size()];
    	    	    	    	            Arrays.fill(memo[i], Integer.MAX_VALUE);
    	    	    	    	        }
    	    	    	    	        return dfs(memo, triangle, 0, 0);
    	    	    	    	    }
    	    	    	    	    
    	    	    	    	    private int dfs(int [][] memo, List<List<Integer>> triangle, int height, int col) {
    	    	    	    	    	if(height >= triangle.size()) return 0;
    	    	    	    	    	if (memo[height][col] != Integer.MAX_VALUE)
    	    	    	    	    		return memo[height][col];
    	    	    	    	    	int left = dfs(memo, triangle, height +1, col);
    	    	    	    	    	int right = dfs(memo, triangle, height +1, col+1);
    	    	    	    	    	memo[height][col] =  Math.min(left,right) + triangle.get(height).get(col);
    	    	    	    	    	return memo[height][col];
    	    	    	    	    }
   // Recurtion 1137. N-th Tribonacci Number
    	    	    	    	    public int tribonacci(int n) {
    	    	    	    	        int x=re(n);
    	    	    	    	 return x;
    	    	    	    	    }
    	    	    	    	    static HashMap<Integer,Integer>h= new HashMap<Integer,Integer>();
    	    	    	    	public static int re(int n)
    	    	    	    	{
    	    	    	    	    if(h.containsKey(n))return h.get(n);
    	    	    	    	 if(n==0)return 0;
    	    	    	    	    if(n==1)return 1;
    	    	    	    	    if(n==2)return 1;
    	    	    	    	    
    	    	    	    	    int g= re(n-3)+re(n-2)+re(n-1);
    	    	    	    	h.put(n,g);
    	    	    	    	    return g;
    	    	    	    	}
    	    	    	     
    // 1780. Check if Number is a Sum of Powers of Three	    	    	    	
    	    	    	    	
    	    	    	    	public boolean checkPowersOfThree(int n) {
    	    	    	            return re(0,n);
    	    	    	        }
    	    	    	    public static boolean re(int i,int n)
    	    	    	        {
    	    	    	            if(i>16)return false;
    	    	    	            if(n<0)return false;
    	    	    	            if(n==0)return true;
    	    	    	            boolean exclude =re(i+1,n-(int)Math.pow(3,i));
    	    	    	            boolean include=re(i+1,n);
    	    	    	          
    	    	    	            return exclude||include;
    	    	    	        } 
//32)  279. Perfect Squares
    	    	    	    public int numSquares(int n) {
    	    	    	    	if(n<=3)return n;
    	    	    	    	        int min =Integer.MAX_VALUE;
    	    	    	    	        for(int i=1;i*i<=n;i++)
    	    	    	    	        {
    	    	    	    	            min=Math.min(min,numSquares(n-i*i)+1);
    	    	    	    	        }
    	    	    	    	        return min;
    	    	    	    	    	    	    	        } 
// UNBOUNDED SUM FOR A TARGET 
    	    	    	    public int integerBreak(int n) {
    	    	    	    	return dfs(n,1,0);    
    	    	    	    	}

    	    	    	    	    public static int dfs(int n,int pro,int curr)
    	    	    	    	    {
    	    	    	    	        if(curr==n){
    	    	    	    	          //  System.out.println(curr+"t");
    	    	    	    	            return pro;}
    	    	    	    	        if(curr>n){// System.out.println(curr+"wrong ");
    	    	    	    	        	return 0;}
    	    	    	    	        
    	    	    	    	        int max=Integer.MIN_VALUE;
    	    	    	    	         
    	    	    	    	        for(int i=1;i<=Math.ceil(n/2.0);i++)
    	    	    	    	        {
    	    	    	    	            // System.out.print(curr+" ");
    	    	    	    	            max= Math.max(max,dfs(n,pro*i,curr+i));
    	    	    	    	          
    	    	    	    	        }
    	    	    	    	        return max;
    	    	    	    	    }
   //35) 650. 2 Keys Keyboard
    	    	    	    	    public int minSteps(int n) {
    	    	    	    	    	  ans=0;
    	    	    	    	    	        check(n,1,0,1);
    	    	    	    	    	    return ans;
    	    	    	    	    	    }

    	    	    	    	    	static      int ans = 0;
    	    	    	    	    	    public static void check(int n, int h, int count, int copy){
    	    	    	    	    	        if(h > n)
    	    	    	    	    	            return;
    	    	    	    	    	        if(n == h){
    	    	    	    	    	            ans = count;
    	    	    	    	    	            return;
    	    	    	    	    	        }
    	    	    	    	    	        check(n, h + copy, count+1, copy);
    	    	    	    	    	        check(n, h*2, count+2, h);
    	    	    	    	    	        
    	    	    	    	    	    }
    	    	    	    	    	}
    	    	    	    	