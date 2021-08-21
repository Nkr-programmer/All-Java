package leetCode;

import java.util.*;


public class EasyAndMedium {

	public static void main(String[] args) {
	}
	//1)121. Best Time to Buy and Sell Stock O(n)
	// Get the maxium difference between elements
	// [7, 1 ,5,3, 6 ,4]  5
	 public int maxProfit(int[] prices) {
	     int min   =Integer.MAX_VALUE;
	        int max=0;
	        for(int i=0;i<prices.length;i++)
	        {
	            if(prices[i]<min){min=prices[i];}
	            else{
	                if(prices[i]-min>max){max=prices[i]-min;}
	            }
	            
	        }
	        return max;
	    }
	 //2) 746. Min Cost Climbing Stairs O(n) //70. Climbing Stairs just fibo nacci numbers O(1)
	 // memo O(n) slow  
	  public int minCostClimbingStairs(int[] cost) {
			 x.clear();
		      return recurse(cost,cost.length); 
			    }
		  static   HashMap<Integer,Integer>x= new HashMap<Integer,Integer>();
		    public static int recurse(int[] cost,int n)
		    {   if(n<=1)return 0;
		    if(x.containsKey(n))return x.get(n);
		        int takeone= cost[n-1]+recurse(cost ,n-1);
		        int taketwo= cost[n-2]+recurse(cost,n-2);
		        x.put(n,Math.min(takeone,taketwo));
		        return x.get(n);
		    }   
		    // tabo O(n)
		    public int minCostClimbingStair2s(int[] cost) {
		        int minimumCost[] = new int[cost.length + 1];
		        for (int i = 2; i < minimumCost.length; i++) {
		            int takeOneStep = minimumCost[i - 1] + cost[i - 1];
		            int takeTwoSteps = minimumCost[i - 2] + cost[i - 2];
		            minimumCost[i] = Math.min(takeOneStep, takeTwoSteps);
		        }
		        return minimumCost[minimumCost.length - 1];
		    }
		
		    //3)392. Is Subsequence	    
		    //O(st)  
		    public boolean isSubsequence(String s, String t) {
			        HashMap<Character, Queue<Integer>> tt= new HashMap<Character,Queue<Integer>>();
			         
			        for(int i=0;i<t.length();i++)
			            {char cc=t.charAt(i);
			        	if(!tt.containsKey(cc))
			        	{tt.put(cc,new LinkedList<Integer>());}		        	
			        	tt.get(cc).add(i);
			            }
			            int c=-1;
			            for(int i=0;i<s.length();i++) {char ss=s.charAt(i);
			                if(!tt.containsKey(ss))return false;
			                int temp=0;
			                if(tt.get(ss).isEmpty())return false;
			                else {
			          
			           while(!tt.get(ss).isEmpty()) {
			           temp=tt.get(ss).poll();
			           if(temp>c){c =temp;break;}
			           if(tt.get(ss).isEmpty())return false;
			           }
			            }}
			        return true;
			        }
		    
		    //4)303. Range Sum Query - Immutable  // O(n)
		    static int full[];
		    public void NumArray(int[] nums) {
		        full=new int[nums.length];full[0]=nums[0];
		        for(int i=1;i<nums.length;i++)
		        {full[i]=full[i-1]+nums[i];}
		    }
		    
		    public int sumRange(int left, int right) {
		        if(left!=0)return full[right]-full[left-1];
		        else return full[right];
		    }
		
//5)53. Maximum Subarray O(n)
		    static int fulls[];
		    public static int maxSubArray(int[] nums) {
		        fulls=new int[nums.length];fulls[0]=nums[0];
	int maxa=fulls[0];
                for(int i=1;i<nums.length;i++)
		        {fulls[i]=nums[i]+(fulls[i-1]>0?fulls[i-1]:0);maxa= Math.max(maxa,fulls[i]);}
return maxa;
            }
//6)1641. Count Sorted Vowel Strings
		    public int countVowelStrings(int n) {
		        int dp[]= new int [5];
		        Arrays.fill(dp,1);
		        if(n==1)return 5;
		        for(int i=2;i<=n;i++)
		        {
		            for(int j=1;j<=4;j++)
		            {
		                dp[j]+=dp[j-1];
		            }
		        }
		        
		        return dp[0]+dp[1]+dp[2]+dp[3]+dp[4];
		    }
		    //7)1314. Matrix Block Sum
		    // first make cummulative array means sum of elements of rectangle 
		    //  00 to i,j
		    public int[][] matrixBlockSum(int[][] mat, int k) {
		        int r=mat.length,c=mat[0].length;
		           int dp[][]= new int[r][c];
		           int a[][]= new int[r][c];
		   dp[0][0]=mat[0][0];       
		           for(int i=1;i<r;i++){dp[i][0]=mat[i][0]+dp[i-1][0];}
		           for(int i=1;i<c;i++){dp[0][i]=mat[0][i]+dp[0][i-1];}
		       
		           for(int i=1;i<r;i++)
		           {
		               for(int j=1;j<c;j++)
		               {
		                   dp[i][j]=mat[i][j]+(dp[i][j-1]-dp[i-1][j-1])+dp[i-1][j];
		               }
		           }
		           for(int i=0;i<r;i++)
		           {
		               for(int j=0;j<c;j++)
		               {
		                   int tl=(i-k)<0?0:(i-k),tr=(i+k)>=r?r-1:(i+k),
		                bl=(j-k)<0?0:(j-k),br=(j+k)>=c?c-1:(j+k);
		                
		                   if(tl==0&&bl==0){a[i][j]=dp[tr][br];}
		                   else if(tl==0&&bl!=0){a[i][j]=dp[tr][br]-dp[tr][bl-1];}
		                   else if(tl!=0&&bl==0){a[i][j]=dp[tr][br]-dp[tl-1][br];}
		                   else if(tl!=0&&bl!=0){a[i][j]=dp[tr][br]-dp[tl-1][br]-dp[tr][bl-1]+
		                       dp[tl-1][bl-1];}
		                   
		               }
		           }
		           
		       return a;
		       }
		  //8)1277. Count Square Submatrices with All Ones
		    public int countSquares(int[][] m) {
		        
		    	int r=m.length,c=m[0].length;
		    	int dp[][]= new int [r][c];
		    	for(int i=0;i<r;i++) {dp[i][0]=m[i][0];}
		    	for(int i=0;i<c;i++) {dp[0][i]=m[0][i];}
		    	int x=0;
		    	for(int i=1;i<r;i++)
		    	{
		    		for(int j=1;j<c;j++)
		    		{
		    			if(m[i][j]==1)
		    			{
		    				dp[i][j]=Math.min(dp[i-1][j-1],Math.min(dp[i][j-1], dp[i-1][j]))+1;
		    			}
		    		}
		    	}

		    	for(int i=0;i<r;i++)
		    	{
		    		for(int j=0;j<c;j++)
		    		{x=x+dp[i][j];}
		    	}
		    	
		    	return x;
		    }
		    //9)338. Counting Bits
		    public int[] countBits(int num) {
		        int a[]= new int[num+1];
		      a[0]=0;if(num==0){return a;}
		      a[1]=1;if(num==1){return a;}
		      
		      for(int i=2;i<=num;i++)
		      {
		    int high=(int)(Math.log(i)/Math.log(2));
		    if((int)(Math.pow(2, high))==i) {a[i]=1;}
		    else {
		    	int bits=0,value=0;
		    while(value!=i) 
		    {
		    	value+=(int) Math.pow(2, high);high--;
		    	if(value>i) {value-=(int) Math.pow(2, high+1);continue;}
		    	bits+=a[(int) Math.pow(2, high+1)];

		    }
		    a[i]=bits;
		    }
		      }
		      
		      return a;
		    }
		    // better one 
		    public int[] countBits2(int num) {

		        int[] bits = new int[num + 1];    
		        for(int i = 1; i <= num; i++){
		            bits[i] = bits[i/2];
		            if(i%2 == 1) bits[i]++; 
		        }
		        return bits;
		    }
		    
		 //10)1043. Partition Array for Maximum Sum   
		    public int maxSumAfterPartitioning(int[] A, int K) {
		        int N = A.length, dp[] = new int[N + 1];
		        for (int i = 1; i <= N; ++i) {
		            int curMax = 0, best = 0;
		            for (int k = 1; k <= K && i - k >= 0; ++k) {
		                curMax = Math.max(curMax, A[i - k]);
		                best = Math.max(best, dp[i - k] + curMax * k);
		            }
		            dp[i] = best;
		        }
		        return dp[N];
		    }
		    //11)931. Minimum Falling Path Sum
		    public int minFallingPathSum(int[][] mat) {
		        
		    	  int n=mat.length;
		    			int dp[][]	= new int[n][n+2];
		    			for(int i=0;i<n;i++)
		    			{Arrays.fill(dp[i],101 );}
		    			
		    			for(int i=0;i<n;i++)
		    			{dp[0][i+1]= mat[0][i];}
		    	for(int i=1;i<n;i++)
		    	for(int j=1;j<=n;j++)
		    	{dp[i][j]=Math.min(dp[i-1][j], Math.min(dp[i-1][j-1], dp[i-1][j+1]))+mat[i][j-1];}

		    	int max=1000;
		    	for(int i=1;i<=n;i++)
		    	{max=Math.min(max, dp[n-1][i]);}
		    			return max;
		    	    }
//12)1664. Ways to Make a Fair Array
		    public int waysToMakeFair(int[] nums) {
		        int n=nums.length;
		        int left[]= new int[2];
		          int right[]= new int[2];
		        for(int i=0;i<n;i++)
		        {right[i%2]+=nums[i];}int res=0;
		        for(int i=0;i<n;i++)
		        {
		            right[i%2]-=nums[i];
		            if(left[0]+right[1]==left[1]+right[0])res++;
		            left[i%2]+=nums[i];
		        }
		        return res;
		    }
//13) 1706. Where Will the Ball Fall		
		    public int[] findBall(int[][] g) {
		    	 int r= g.length,c=g[0].length;
		    	        int a[]= new int[c];
		    	        for(int j=0;j<c;j++)
		    	        {int pj=j,pi=0;
		    	            for(int i=0;i<r;i++)
		    	            {
		    	                if(i==0){pi=0;}
		    	             if(g[pi][pj]==1)
		    	             {
		    	                 if((pj+1<c)&&(g[pi][pj+1]==1)){pj++;}else{a[j]=-1;break;}
		    	                   pi++;               
		    	             }
		    	             else{
		    	                 
		    	                 if((pj-1>=0)&&(g[pi][pj-1]==-1)){pj--;}else{a[j]=-1;break;}
		    	                   pi++; 
		    	             }
		    	                
		    	            }
		    	        if(a[j]!=-1) a[j]=pj;
		    	            
		    	        }
		    	        return a;
		    	    }
			    //14)1504. Count Submatrices With All Ones
		     public int numSubmat(int[][] mat) {
		         int R = mat.length;
		         int C = mat[0].length;
		         int ans = 0;
		         int[][]dp = new int[R][C];
		         for(int i = 0 ; i < R ; i++){
		             int cnt = 0;
		             for(int j = 0 ; j < C ; j++){
		               if(mat[i][j] == 1){
		                  ++cnt;      
		                 }else{
		                  cnt = 0;
		                 }       
		                dp[i][j] = cnt; 
		             }         
		         }
		       for(int i = 0 ; i < R ; i++){
		           for(int j = 0 ; j < C ; j++){
		               int res = Integer.MAX_VALUE;
		               for(int k = i ; k < R ; k++){
		               if (dp[k][j] == 0) break;    
		                   res = Math.min(dp[k][j] , res);
		                   ans += res;       
		               }
		           }  
		       }
		         return ans;       
		     } 
//15)  413. Arithmetic Slices
		     public int numberOfArithmeticSlices(int[] nums){
		         int n=nums.length;if(n<3){return 0;}
		          int diff[]= new int[n-1];
		          int ans[]= new int[n-1];
		          for(int i=0;i<n-1;i++)
		          {diff[i]=nums[i]-nums[i+1];}
		         ans[0]=0;int res=0;
		          for(int i=1;i<n-1;i++)
		          {
		             if(diff[i-1]==diff[i]){ans[i]=ans[i-1]+1;}
		         else {if(ans[i-1]!=0){res+=(ans[i-1]*(ans[i-1]+1))/2;}ans[i]=0;} 
		         }
		          if(ans[n-2]!=0){res+=(ans[n-2]*(ans[n-2]+1))/2;}
		          return res;
		      }
		     //16)  1143. Longest Common Subsequence
		     public int longestCommonSubsequence(String text1, String text2) {
		     int t1l=text1.length(),t2l=text2.length();
		        int a[][]= new int[t1l+1][t2l+1];
		    char t1[]= text1.toCharArray(),t2[]=text2.toCharArray();
		        for(int i=1;i<t1l+1;i++)
		        {
		            for(int j=1;j<t2l+1;j++)
		            {
		                if(t1[i-1]==t2[j-1])
		                {a[i][j]=a[i-1][j-1]+1;}
		                else{
		                  a[i][j]  =Math.max(a[i-1][j],a[i][j-1]);
		                }
		            }
		        }
		    
		    return a[text1.length()][text2.length()];
		    }
		     //17)583. Delete Operation for Two Strings
		     //uses 16 function
		     public int minDistance(String word1, String word2) {
		         
		         return word1.length()+word2.length()-2*longestCommonSubsequence(word1,word2);
		     }
		     //18) 712. Minimum ASCII Delete Sum for Two Strings
		     public int minimumDeleteSum(String t, String s) 
		     {int x=0;
		       char t1[]= t.toCharArray(),t2[]=s.toCharArray();
		         for(int i=0;i<t.length();i++){x+=(int)t1[i];}
		      for(int i=0;i<s.length();i++){x+=(int)t2[i];}
		         
		         
		            return x-2*longestCommonSubsequenc(t,s);
		 	
		     }
		     public int longestCommonSubsequenc(String text1, String text2) {
		 		     int t1l=text1.length(),t2l=text2.length();
		 		        int a[][]= new int[t1l+1][t2l+1];
		 		    char t1[]= text1.toCharArray(),t2[]=text2.toCharArray();
		 		        for(int i=1;i<t1l+1;i++)
		 		        {
		 		            for(int j=1;j<t2l+1;j++)
		 		            {
		 		                if(t1[i-1]==t2[j-1])
		 		                {a[i][j]=a[i-1][j-1]+(int)t1[i-1];}
		 		                else{
		 		                  a[i][j]  =Math.max(a[i-1][j],a[i][j-1]);
		 		                }
		 		            }
		 		        }
		         
		 		    return a[text1.length()][text2.length()];
		 		    }
//19) 714. Best Time to Buy and Sell Stock with Transaction Fee
		     public int maxProfit(int[] prices, int fee) {
		         int cash=0,hold=-500000;
		          for(int i=0;i<prices.length;i++)
		          {int cash1=cash;
		              cash=Math.max(cash,hold+prices[i]-fee);
		          hold=Math.max(hold,cash1-prices[i]);
		              }
		          
		          return cash;
		      }
		     // 20) 1048. Longest String Chain
		     public int longestStrChain(String[] words) {
		         HashSet<String>a=new HashSet<String>();
            Arrays.sort(words, (e, f)->e.length() - f.length());
		         HashMap<String,Integer>x= new HashMap<String,Integer>();
           int indi=1;
		         for(int j=0;j<words.length;j++)
		         {
		             a.add(words[j]);
		             if(!x.containsKey(words[j])){x.put(words[j],1);}
		             if(words[j].length()>1){
		                 int si=words[j].length()-1;
		                 for(int i=0;i<=si;i++)
		                 {
		                     if(i==0){if(a.contains(words[j].substring(1,si+1))){x.put(words[j],x.get(words[j].substring(1,si+1))+1);indi=Math.max(indi,x.get(words[j]));}}
		        else
		            if(i==si){if(a.contains(words[j].substring(0,si))){x.put(words[j],x.get(words[j].substring(0,si))+1);indi=Math.max(indi,x.get(words[j]));}}
		                     else{if(a.contains(words[j].substring(0,i)+words[j].substring(i+1,si+1))){x.put(words[j],x.get(words[j].substring(0,i)+words[j].substring(i+1,si+1))+1);indi=Math.max(indi,x.get(words[j]));}}
		                 }
		             }
	
		         }
		         
		         
		      return indi;   
		     }
		     //21)  516. Longest Palindromic Subsequence
		     //EASY TO UNDERSTAND RECURSIVE ANS  N^2
		     public int longestPalindromeSubseq(String s) {
		         int n=s.length();
		   char x[]= s.toCharArray();
		         return sub(0,n-1,x,new int[n+1][n+1]);
		   		       }
		   		         static int sub(int i,int j,char x[],int y[][])
		   		       { if(y[i][j]!=0){return y[i][j];}
		                        
		                        if(i==j)return 1;
		                        if(x[i]==x[j]&&(i+1)==j){return 2;}
		                        if(x[i]==x[j]){return sub(i+1,j-1,x,y)+2;}
		                       
		                        y[i][j]= Math.max(sub(i+1,j,x,y),sub(i,j-1,x,y));
		   		   return y[i][j];
		                  }
//tabu
		   		      public int longestPalindromeSubseqs(String s) {
		   		        int[][] dp = new int[s.length()][s.length()];
		   		        
		   		        for (int i = s.length() - 1; i >= 0; i--) {
		   		            dp[i][i] = 1;
		   		            for (int j = i+1; j < s.length(); j++) {
		   		                if (s.charAt(i) == s.charAt(j)) {
		   		                    dp[i][j] = dp[i+1][j-1] + 2;
		   		                } else {
		   		                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
		   		                }
		   		            }
		   		        }
		   		        return dp[0][s.length()-1];
		   		    }
//22)   5. Longest Palindromic Substring   // O(n^2)
		   		   public String longestPalindrome(String s) {
		   		    int start=0,max=1,n=s.length();
		   		        char x[]=s.toCharArray(); 
		   		        int l=0,h=0;
		   		        for(int i=1;i<n;i++)
		   		        {
		   		            l=i-1;h=i;// jvnxy 'cc' bnddnn
		   		            while(l>=0&&h<n&&x[l]==x[h])
		   		            {if(h-l+1>max){max=h-l+1;start=l;}
		   		                h++;l--;}
		   		            
		   		            
		   		            l=i-1;h=i+1; //kjdncjkd 'cvc' iufnckdic
		   		             while(l>=0&&h<n&&x[l]==x[h])
		   		            {if(h-l+1>max){max=h-l+1;start=l;}
		   		                 h++;l--;}
		   		            
		   		        }	 return s.substring(start,start+max);       }

//23)  647. Palindromic Substrings
		   		  public int countSubstrings(String s) {
		   		      int count =0;
		   			for(int i=0;i<s.length();i++) {
		   				count+=numberofpalidrones(s,i,i)+numberofpalidrones(s,i,i+1);
		   			}
		   			return count;
		   		}

		   		private int numberofpalidrones(String s, int i, int i2) {
		   			// TODO Auto-generated method stub
		   			int count =0,start=i,last=i2;
		   			while(start>=0&&last<s.length()&&s.charAt(start--)==s.charAt(last++))
		   			{count++;}	
		   			
		   			return count;
		   		}
	//24)  64. Minimum Path Sum
		   	   public int minPathSum(int[][] grid) {
		           int r=grid.length,c=grid[0].length;
		           int h[][]=new  int[r][c];
		           int most=0;
		           h[0][0]=grid[0][0];
		           for(int i=1;i<r;i++)
		           {h[i][0]=h[i-1][0]+grid[i][0];}
		           for(int i=1;i<c;i++)
		           {h[0][i]=h[0][i-1]+grid[0][i];}
		           
		           for(int i=1;i<r;i++)
		           {
		               for(int j=1;j<c;j++)
		               {
		                   h[i][j]=grid[i][j]+Math.min(h[i-1][j],h[i][j-1]);
		               }
		           }
		           return h[r-1][c-1];
		       }
//25)  62. Unique Paths
		   	  public int uniquePaths(int m, int n) {
		          int r=m,c=n;
		  		           int h[][]=new  int[r][c];
		  		        h[0][0]=1;
		  		           for(int i=1;i<r;i++)
		  		           {h[i][0]=1;}
		  		           for(int i=1;i<c;i++)
		  		           {h[0][i]=1;}
		  		           
		  		           for(int i=1;i<r;i++)
		  		           {
		  		               for(int j=1;j<c;j++)
		  		               {
		  		                   h[i][j]=h[i-1][j]+h[i][j-1];
		  		               }
		  		           }
		  		           return h[r-1][c-1];
		  		       }
		   	  //26)Unique Paths 2
		   	  public int uniquePathsWithObstacles(int[][] g) {
		          if(g[0][0]==1)return 0;
		            int r=g.length,c=g[0].length;
		  		  		           int h[][]=new  int[r][c];
		  		  		        h[0][0]=1;
		  		  		           for(int i=1;i<r;i++)
		  		  		           {if(g[i][0]==1){break;}h[i][0]=1;}
		  		  		           for(int i=1;i<c;i++)
		  		  		           {if(g[0][i]==1){break;}h[0][i]=1;}
		  		  		           
		  		  		           for(int i=1;i<r;i++)
		  		  		           {
		  		  		               for(int j=1;j<c;j++)
		  		  		               {if(g[i][j]==1){continue;}
		  		  		                   h[i][j]=h[i-1][j]+h[i][j-1];
		  		  		               }
		  		  		           }
		  		  		           return h[r-1][c-1];
		  		  		       }
// 27)   646. Maximum Length of Pair Chain
		   	  public int findLongestChain(int[][] pairs) {
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
		      }
		   	  //greedy approach imp
		   	public int findLongestChains(int[][] pairs) {
		        Arrays.sort(pairs, (a, b) -> a[1] - b[1]);
		        int cur = Integer.MIN_VALUE, ans = 0;
		        for (int[] pair: pairs) if (cur < pair[0]) {
		            cur = pair[1];
		            ans++;
		        }
		        return ans;
		    }
//28)1654. Minimum Jumps to Reach Home
		  
		    public int minimumJumps(int[] forbidden, int a, int b, int x) {
		        PriorityQueue<int[]> pq = new PriorityQueue<>((a1,a2)-> a1[0] - a2[0]);
		        pq.offer(new int[]{0,0,0});//step, current index, direction(0 is back, 1 is forward)
		        Set<Integer> forbit = new HashSet<>();
		        Set<String> visited = new HashSet<>();
		        int maxLimit = 2000 + 2 * b;
		        for(int num : forbidden){
		            forbit.add(num);
		            maxLimit = Math.max(maxLimit, num + 2 * b);
		        }
		        while(!pq.isEmpty()){
		            int[] node = pq.poll();
		            int step = node[0];
		            int idx = node[1];
		            int dir = node[2];
		            if(idx == x) return step;
					//try jump forward
		            if(idx+a < maxLimit && !forbit.contains(idx+a) && !visited.contains(idx+a+","+0)){
		                visited.add(idx+a+","+0);
		                pq.offer(new int[]{step+1, idx+a, 0});
		            }
					//try jump back
		            if(idx-b >= 0 && !forbit.contains(idx-b) && !visited.contains(idx-b+","+1) && dir != 1){
		                visited.add(idx-b+","+1);
		                pq.offer(new int[]{step+1, idx-b, 1});
		            }
		        }
		        return -1;
		    }
//29)494. Target Sum
		    int count = 0;
		    public int findTargetSumWays(int[] nums, int S) {
		        int[][] memo = new int[nums.length][2001];
		        for (int[] row: memo)
		            Arrays.fill(row, Integer.MIN_VALUE);
		        return calculate(nums, 0, 0, S, memo);
		    }
		    public int calculate(int[] nums, int i, int sum, int S, int[][] memo) {
		        if (i == nums.length) {
		            if (sum == S)
		                return 1;
		            else
		                return 0;
		        } else {
		            if (memo[i][sum + 1000] != Integer.MIN_VALUE) {
		                return memo[i][sum + 1000];
		            }
		            int add = calculate(nums, i + 1, sum + nums[i], S, memo);
		            int subtract = calculate(nums, i + 1, sum - nums[i], S, memo);
		            memo[i][sum + 1000] = add + subtract;
		            return memo[i][sum + 1000];
		        }
		    }
		
//30)  300. Longest Increasing Subsequence
		    public int lengthOfLIS(int[] arr) {
		        int n=arr.length;
		   	int dp[]= new int[n];
				Arrays.fill(dp, 1);
				for(int i=1;i<n;i++)
				{
					for(int j=0;j<i;j++)
					{
						if(arr[i]>arr[j]&&dp[i]<dp[j]+1) {dp[i]=dp[j]+1;}
					}
				}
				int max=0;
				for(int h:dp) {
					if(max<h) {max=h;}}
				return max;
			}
		    //31)  120. Triangle
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
    	    //32)279. Perfect Squares
    	    public int numSquares(int n) {
    	        HashMap<Integer, Integer> map = new HashMap<>();
    	        return find(n, map);
    	    }
    	    public int find(int n, HashMap<Integer, Integer> map){
    	        if(n<=3){
    	            return n;
    	        }
    	        if(map.containsKey(n)){
    	            return map.get(n);
    	        }
    	        int min = Integer.MAX_VALUE;
    	        for(int i = 1; i*i<=n; i++){
    	            min = Math.min(min, find(n-i*i,map)+1);
    	        }
    	        map.put(n,min);
    	        return min;
    	    }
    	    //better
    	        static List<Integer> result = new ArrayList<>();
    	        public int numSquares2(int n) {
    	            if (result.size() == 0) {
    	                result.add(0);
    	            }
    	            while (result.size() <= n) {
    	                int m = result.size();
    	                int tempMin = Integer.MAX_VALUE;
    	                for (int j = 1; j * j <= m; j++) {
    	                    tempMin = Math.min(tempMin, result.get(m - j * j) + 1);
    	                }
    	                result.add(tempMin);
    	            }
    	            return result.get(n);
    	        }
//33)  343. Integer Break
    	        //dp
    	        public int integerBreak2(int n) {
    	            int[] dp = new int[n + 1];
    	            dp[1] = 1;
    	            for(int i = 2; i <= n; i ++) {
    	                for(int j = 1; j < i; j ++) {
    	                    dp[i] = Math.max(dp[i], (Math.max(j,dp[j])) * (Math.max(i - j, dp[i - j])));
    	                }
    	            }
    	            return dp[n];
    	         }
    	        //memo
    	        public int integerBreak(int n) {
    	            memo.clear();
    	    return dfs(n,1,0);    
    	    }
    	    static HashMap<String,Integer>memo= new HashMap<String,Integer>(); 
    	        public static int dfs(int n,int pro,int curr)
    	        {
    	            if(curr==n){
    	              
    	                return pro;}
    	            if(curr>n){ return 0;}
    	            int max=Integer.MIN_VALUE;
    	             
    	             String key = "" + pro + ","+curr;
    	            if (memo.containsKey(key)) return memo.get(key);
    	            for(int i=1;i<=Math.ceil(n/2.0);i++)
    	            {
    	                max= Math.max(max,dfs(n,pro*i,curr+i));
    	              
    	            }
    	            memo.put(key,max);
    	            return max;
    	        } 
    	        //34)  718. Maximum Length of Repeated Subarray
    	        // JUST INT VERTION OF LONGEST COMMON SUBSTRING
    	        
    	        public int findLength(int[] t1, int[] t2) {
    			     int t1l=t1.length,t2l=t2.length;
    			        int a[][]= new int[t1l+1][t2l+1];
    	            int result=0;
    	            for(int i=1;i<t1l+1;i++)
    			        {
    			            for(int j=1;j<t2l+1;j++)
    			            {
    			                if(t1[i-1]==t2[j-1])
    			                {
    	                            a[i][j]=a[i-1][j-1]+1;
    	                        result=Math.max(result,a[i][j]);
    	                        }
    			                
    			            }
    			        }
    			    
    			    return result;
    			    }
    	        //35) 650. 2 Keys Keyboard
    	        public int minSteps(int n) {
    	            int ans = 0, d = 2;
    	            while (n > 1) {
    	                while (n % d == 0) {
    	                    ans += d;
    	                    n /= d;
    	                }
    	                d++;
    	            }
    	            return ans;
    	        }
//36) 198. House Robber
    	        //IMP
    	    //    same as 31 q in gfg  Find max stolen value
    	        public int rob(int[] nums) {
    	            return maxLoot(nums,nums.length);
    	            }
    	         	private static int maxLoot(int[] hval, int n) {
    	                if(n==0)return 0;
    	                int ind1=hval[0];
    	                if(n==1)return ind1;
    	                int ind2=Math.max(ind1,hval[1]);
    	                if(n==2)return ind2;
    	                int max=0;

    	                for(int i=2;i<n;i++)
    	        		{
    	        			max=Math.max(hval[i]+ind1,ind2);
    	                    ind1=ind2;
    	                    ind2=max;
    	        		}
    	        		
    	        		return max;	}
//37)  740. Delete and Earn
    	            public int deleteAndEarn(int[] nums) {
    	            	 int hval[]= new int[10002];
    	            	        for(int i=0;i<nums.length;i++)hval[nums[i]]+=nums[i];
    	            			for(int i=2;i<hval.length;i++)
    	            			{			hval[i]=Math.max(hval[i]+hval[i-2],hval[i-1]);}
    	            		//	for(int k:dp) {System.out.print(k+" ");}
    	            			
    	            			return hval[10001];
    	            	        }
//38)  152. Maximum Product Subarray
    	            public int maxProduct(int[] hval) {int n=hval.length;
    	             if(n==0)return 0;
    	    	                int max=hval[0],maxi=hval[0],min=hval[0];
    	    	                for(int i=1;i<n;i++)
    	    	        		{int temp=max;
    	    	        			max=Math.max(hval[i],Math.max(hval[i]*max,hval[i]*min));
    	                            min=Math.min(hval[i],Math.min(hval[i]*temp,hval[i]*min));
    	    	                maxi=Math.max(max,Math.max(maxi,min));
    	    	        	
    	                        }

    	    	        		return maxi;	    }
//39) 213. House Robber II
    	            public int rob2(int[] hval) {
    	            	int n=hval.length;
    	            	        if(n==0)return 0;
    	            	    	                int ind1=hval[0];
    	            	    	                if(n==1)return ind1;
    	            	    	                int ind2=Math.max(ind1,hval[1]);
    	            	    	                if(n==2)return ind2;
    	            	    	                int max=ind2;

    	            	    	                for(int i=2;i<n-1;i++)
    	            	    	        		{
    	            	    	        			max=Math.max(hval[i]+ind1,ind2);
    	            	    	                    ind1=ind2;
    	            	    	                    ind2=max;
    	            	    	        		}
    	            	        int max1=max;ind1=hval[1];ind2=Math.max(hval[1],hval[2]);
    	            	    	        	max=0;	for(int i=3;i<n;i++)
    	            	    	        		{
    	            	    	        			max=Math.max(hval[i]+ind1,ind2);
    	            	    	                    ind1=ind2;
    	            	    	                    ind2=max;
    	            	    	        		}
    	            	    	        		return Integer.max(max,max1);	   
    	            	    }
//40) 264. Ugly Number II
    	            //SAME AS UGLY NUMBER IN GFG OF 1ST Q

//41)322. Coin Change
    	            public int coinChange(int[] coins, int n) 
    	            {    int m= coins.length;
    	     int dp[]= new int[n+1];
    	     Arrays.fill(dp, n+1);
    	     dp[0]=0;
    	     for(int i=1;i<=n;i++)
    	     {
    	     for(int j=0;j<m;j++)	 if (coins[j] <= i){dp[i]=Math.min(dp[i],1+ dp[i-coins[j]]) ;}
    	     //for(int g: dp) {System.out.print(g+" ");}System.out.println(); // just  for printing
    	     }
    	     return dp[n]>n?-1:dp[n];
    	         }
//42)673. Number of Longest Increasing Subsequence
    	            // just addion of count dp array 
    	            public int findNumberOfLIS(int[] arr) {
    	                if(arr.length==1)return 1;
    	            	int max=-5;
    	                int n=arr.length;
    	           	int dp[]= new int[n];
    	                	int dpc[]= new int[n];
    	        		Arrays.fill(dp, 1);
    	                		Arrays.fill(dpc, 1);
    	        		for(int i=1;i<n;i++)
    	        		{
    	        			for(int j=0;j<i;j++)
    	        			{   if(arr[i]<=arr[j])continue;
    	        				if(dp[i]<dp[j]+1) {dp[i]=dp[j]+1;dpc[i]=dpc[j];}
    	                     else if(dp[i]==dp[j]+1){dpc[i]+=dpc[j];}
    	        			}
    	                    max=Integer.max(max,dp[i]);
    	        		}
    	        	int count =0;
    	        		 for(int i = 0; i < n; i++){if(max==dp[i]) {count+=dpc[i];}}
    	        		return count;
    	        	}
// 43) 1770. Maximum Score from Performing Multiplication Operations
    	            //Working but tle
    	            public int maximumScore(int[] num, int[] mul) {
       	             int c=  known(num,mul,0,0,num.length-1);
                            z.clear();
       	            return c;
       	              }
       	       static HashMap<Integer,HashMap<Integer,Integer>>z= new HashMap<Integer,HashMap<Integer,Integer>>();
       	          public static int known(int[] num,int[] mul,int f,int i,int l)
       	          {
       	              if(i==mul.length)return 0;
       	              if(z.containsKey(f)&&z.get(f).containsKey(i))return z.get(f).get(i);
       	              int left=mul[i]*num[f]+known(num,mul,f+1,i+1,l);
       	              int right=mul[i]*num[l]+known(num,mul,f,i+1,l-1);
       	              if(!z.containsKey(f)) {z.put(f,new HashMap<Integer,Integer>());}
       	              z.get(f).put(i,Math.max(left,right));
       	          return z.get(f).get(i);
       	          }
//Atleast working one
       	       public int maximumScore2(int[] num, int[] mul) {
	                  int c=known(num,mul,0,0);
	                z.clear();          
               return c;}
	          public static int known(int[] num,int[] mul,int f,int i)
	          {
               if(z.containsKey(f)&&z.get(f).containsKey(i))return z.get(f).get(i);
	              if(i==mul.length)return 0;
	         
	              int left=mul[i]*num[f]+known(num,mul,f+1,i+1);
	              int right=mul[i]*num[num.length - (i-f) - 1]+known(num,mul,f,i+1);
	              if(!z.containsKey(f)) {z.put(f,new HashMap<Integer,Integer>());}
	              z.get(f).put(i,Math.max(left,right));
	          return z.get(f).get(i);
	          }
//44) 91. Decode Ways
	          //O(n) 
	          public int numDecodings(String s) {
	       	   if(s.isEmpty())return 0;        
	              xo.clear();
	       	               char []f= s.toCharArray();
	       	              return nums(0,f);
	       	          }
	       	          static HashMap<Integer,Integer> xo= new HashMap<Integer,Integer>();
	       	          public static int  nums(int i,char[] s)
	       	          {int n=s.length;
	       	           if(i==n)return 1;
	       	           if(s[i]=='0')return 0;
	       	           if(xo.containsKey(i))return xo.get(i);
	       	        int res=nums(i+1,s);
	       	           if(i<(n-1)&&(s[i]=='1'||(s[i]=='2'&&s[i+1]<'7')))
	       	           {res+=nums(i+2,s);}
	       	        xo.put(i,res);
	       	           return res;
	       	          }
	      //tabu
	          public int numDecodings2(String si) {
	              if(si.isEmpty())return 0;
	                char []s= si.toCharArray();
	              int n=s.length;
	              int dp[]=new int[n+1];
	              dp[n]=1;
	              for(int i=n-1;i>=0;i--)
	              {
	          if(s[i]=='0'){dp[i]=0;}
	                  else{dp[i]=dp[i+1];
	                         if(i<(n-1)&&(s[i]=='1'||(s[i]=='2'&&s[i+1]<'7')))
	          {dp[i]+=dp[i+2];}  
	                  }
	              }
	                    return dp[0];
	         }
// 45)  523. Continuous Subarray Sum

	          public boolean checkSubarraySum(int[] nums, int k) {
	       int n=nums.length;
	              int dp[]= new int[n];dp[0]=nums[0]; 
	              for(int i=1;i<n;i++)
	              {dp[i]=nums[i]+dp[i-1];
	               if(nums[i]==0&&nums[i-1]==0)return true;
	               if(dp[i]%k==0)return true;}
	              if(dp[n-1]<k)return false;
	              for(int i=0;i<n-2;i++)
	              {
	                  for(int j=i+2;j<n;j++)
	                  {
	                      if((dp[j]-dp[i])%k==0)return true;
	                  }
	              }
	          return false;
	          }
//46)  1594. Maximum Non Negative Product in a Matrix
	          public class Zone
	          {
	              long x;
	              long y;
	              public Zone(long x,long y)
	              {
	                  this.x=x;
	                  this.y=y;
	              }
	          }
	          public int maxProductPath(int[][] grid) {
	              int r= grid.length,c=grid[0].length;
	              Zone [][]dp= new Zone [r][c];
	          
	              dp[0][0]=new Zone(0,0);
	              dp[0][0].x=(long)grid[0][0];dp[0][0].y=(long)grid[0][0];
	          for(int i=1;i<r;i++)
	          {dp[i][0]=new Zone(0,0);
	              dp[i][0].x=dp[i-1][0].x*((long)grid[i][0]);
	          dp[i][0].y=dp[i][0].x;}
	           for(int i=1;i<c;i++)
	          {dp[0][i]=new Zone(0,0);
	               dp[0][i].x=dp[0][i-1].x*((long)grid[0][i]);
	          dp[0][i].y=dp[0][i].x;}
	              
	              
	              for(int i=1;i<r;i++)
	              {
	                  for(int j=1;j<c;j++)
	                  {
	                      dp[i][j]=new Zone(0,0);
	                      long min=0,max=0;
	                          long a=((long)grid[i][j])*dp[i-1][j].x;
	                          long b=((long)grid[i][j])*dp[i][j-1].x;
	                          long e=((long)grid[i][j])*dp[i-1][j].y;
	                          long d=((long)grid[i][j])*dp[i][j-1].y;
	                              min=Math.min(a,Math.min(b,Math.min(e,Math.min(e,d))));
	                              max=Math.max(a,Math.max(b,Math.max(e,Math.max(e,d))));
	                  dp[i][j].x=min;
	                  dp[i][j].y=max;
	                  }
	              }
	                  
	              
	              return dp[r-1][c-1].y<0?-1:(int)(dp[r-1][c-1].y%(1e9+7));
	          }
	      //47) 1856. Maximum Subarray Min-Product
	          public int maxSumMinProduct(int[] nums) {
	              int n=nums.length;
	          Stack<Integer> x= new Stack<Integer>(); 
	             int lbound[]= new int[n]; 
	              int rbound[]= new int[n];
	              long sum[]= new long[n+1];
	              
	              for(int i=0;i<n;i++)
	              {
	                  while(!x.isEmpty()&&nums[x.peek()]>=nums[i]){x.pop();}
	              if(!x.isEmpty()){lbound[i]=x.peek()+1;}
	              else{lbound[i]=0;}
	                  x.add(i);
	              }
	              x= new Stack<Integer>(); 
	                for(int i=n-1;i>=0;i--)
	              {
	                  while(!x.isEmpty()&&nums[x.peek()]>=nums[i]){x.pop();}
	              if(!x.isEmpty()){rbound[i]=x.peek()-1;}
	              else{rbound[i]=n-1;}
	              x.add(i);
	                }
	              for(int i=0;i<n;i++){sum[i+1]=sum[i]+nums[i];}
	              //for(int i:rbound){System.out.print(i+" ");}
	              long max=0;
	              for(int i=0;i<n;i++)
	              {	                  max=Math.max(max,(sum[rbound[i]+1]-sum[lbound[i]])*nums[i]);}
	              return (int)(max%1000000007);
	          }
	          //48)  221. Maximal Square
	          public int maximalSquare(char[][] matrix) {
	              
	              int m= matrix.length,n=matrix[0].length;
	              int [][]mat= new int [m+1][n+1];
	              int max=0;
	              for(int i=1;i<=m;i++)
	              {
	                  for(int j=1;j<=n;j++)
	                  {
	                      if(matrix[i-1][j-1]=='1')
	                      {
	                mat[i][j]=Math.min(Math.min(mat[i-1][j],mat[i-1][j-1]),mat[i][j-1])+1;  
	                          max=Math.max(max,mat[i][j]);
	                      }
	                  }
	              }
	              
	              return max*max;
	          }
	          //49)139. Word Break
	          HashMap<String,Boolean> xx=new HashMap<String,Boolean>(); 
	          public boolean wordBreak(String s, List<String> wordDict) {
	              if(s.length()==0)return true;
	              if(x.containsKey(s))return xx.get(s);
	              for(String l:wordDict)
	              {int k=l.length();
	                  if(s.indexOf(l)==0)
	                  {
	                      if(wordBreak(s.substring(k),wordDict))return true;
	                  }
	              }
	              xx.put(s,false);
	            //  System.out.print(x);
	              return false;
	          }
	          //50)  416. Partition Equal Subset Sum
	          public boolean canPartition(int[] nums) {
	              int n=nums.length,sum=0;
	              Arrays.sort(nums);
	              HashSet<Integer> c= new HashSet<Integer>();
	              for(int i=0;i<n;i++){sum+=nums[i];c.add(sum);}
	      if(sum%2!=0)return false;
	              if(c.contains(sum/2))return true;
	              int dp[][]= new int[n+1][(sum/2)+1];sum=sum/2;
	       for(int i=1;i<n+1;i++)
	      {
	      for(int j=1;j<sum+1;j++)
	        {
	      	if(nums[i-1]<=j) {dp[i][j]=Integer.max(dp[i-1][j], dp[i-1][j-nums[i-1]]+nums[i-1]);}
	      	else {dp[i][j]=dp[i-1][j];}
	        }
	      }
	              return dp[n][sum]==sum?true:false;
	          }
	          //51) 	97.    Interleaving String

	          public boolean isInterleave(String s1, String s2, String s3) {
	              if(s1.length()+s2.length()!=s3.length())
	                  return false;
	              if(s1.length()==s3.length()){
	                  if(s1.equals(s3))return true;
	                  else return false;
	              }
	              mmo = new int[s1.length()][s2.length()];
	               for (int i = 0; i < s1.length(); i++) {
	                  for (int j = 0; j < s2.length(); j++) {
	                      mmo[i][j] = -1;
	                  }}
	              return check(0,0,0,s1,s2,s3);
	          }
	      static  int mmo[][] ;
	         public static boolean check(int a,int b,int c,String s1,String s2,String s3)
	         {
	             int sl1=s1.length();
	             int sl2=s2.length();
	             int sl3=s3.length();
	              
	              if(sl1==a)return s3.substring(c).equals(s2.substring(b));
	              if(sl2==b) return s3.substring(c).equals(s1.substring(a));
	          
	          if (mmo[a][b] >= 0) {
	                  return mmo[a][b] == 1 ? true : false;
	              }
	             
	               boolean ans= ((s3.charAt(c) == s1.charAt(a)) && check(
	                                    a + 1, b, c + 1,s1,s2,s3))
	                 || ((s3.charAt(c) == s2.charAt(b)) && check(
	                                       a, b + 1, c + 1,s1,s2,s3));
	         mmo[a][b] = ans ? 1 : 0;
	             return ans;
	         }
//52)   131. Palindrome Partitioning
	         //N*(2^N)
	         public List<List<String>> partition(String s) {
	             List<List<String>>x= new ArrayList<List<String>>();
	                List<String>list= new ArrayList<String>();
	                pali(s,list,x,0);
	            return x;
	            }
	            public static void pali(String s,List<String> list,List<List<String>> x,int pos)
	            {
	                if(pos==s.length()){x.add(new ArrayList<String>(list));return;}
	                for(int i=pos;i<s.length();i++)
	                {
	                    if(palin(s.substring(pos,i+1))){
	                    list.add(s.substring(pos,i+1));
	                    pali(s,list,x,i+1);
	                    list.remove(list.size()-1);
	                }
	            }
	            }
	            public static boolean palin(String s)
	            {
	                StringBuilder x= new StringBuilder(s);
	                return x.reverse().toString().equals(s);
	            }
	            //53)  376. WiggleSubSequences
	                public int wiggleMaxLength(int[] nums) {
	                    if (nums.length < 2)
	                        return nums.length;
	                    int[] up = new int[nums.length];
	                    int[] down = new int[nums.length];
	                    up[0] = down[0] = 1;
	                    for (int i = 1; i < nums.length; i++) {
	                        if (nums[i] > nums[i - 1]) {
	                            up[i] = down[i - 1] + 1;
	                            down[i] = down[i - 1];
	                        } else if (nums[i] < nums[i - 1]) {
	                            down[i] = up[i - 1] + 1;
	                            up[i] = up[i - 1];
	                        } else {
	                            down[i] = down[i - 1];
	                            up[i] = up[i - 1];
	                        }
	                    }
	                    return Math.max(down[nums.length - 1], up[nums.length - 1]);
	                }
	                //54)  377. Combination Sum IV
	                // imp diff form of coin change problem and in many comapnies
	                
	                public int combinationSum4(int[] nums, int target) {
	                    int[] dp = new int[target + 1];
	                    dp[0] = 1;
	                    for (int i = 1; i <= target; i++) {
	                        for (int n : nums) {
	                            if (i >= n) {
	                                dp[i] += dp[i - n];
	                            }
	                        }
	                    }
	                    return dp[target];
	                }
	                //55) 1423. Maximum Points You Can Obtain from Cards
	                public int maxScore(int[] num, int k) {
	                    
	                    int sum=0,n=num.length;
	                        for(int i=0;i<k;i++)
	                        {sum+=num[i];}
	                        int max=sum,j=n-1;
	                        for(int b=k-1;b>=0;b--)
	                        {
	                            sum=sum-num[b]+num[j--];
	                            max=Math.max(max,sum);
	                        }
	                        return max;
	                    }
	                //56)    309. Best Time to Buy and Sell Stock with Cooldown
	                
	                private int maxProfit(int index, int stock, int[] prices, int[][] dp) {
	                    if (index >= prices.length) {
	                        return 0;
	                    }
	                    
	                    if (dp[stock][index] != -1) {
	                        return dp[stock][index];
	                    }
	                    
	                    if (stock == 0) {
	                        dp[stock][index] = Math.max(
	                            maxProfit(index + 1, 1, prices, dp) - prices[index],
	                            maxProfit(index + 1, 0, prices, dp)
	                        );
	                    } else {
	                        dp[stock][index] = Math.max(
	                            maxProfit(index + 2, 0, prices, dp) + prices[index],
	                            maxProfit(index + 1, 1, prices, dp)
	                        );
	                    }
	                    return dp[stock][index];
	                }
	                
	                public int maxProfit2(int[] prices) {
	                    int[][] dp = new int[2][prices.length];
	                    for(int[] arr : dp) {
	                        Arrays.fill(arr, -1);
	                    }
	                    return maxProfit(0, 0, prices, dp);
	                }
	            }