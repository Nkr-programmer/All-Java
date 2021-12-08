package backtraking;
import java.util.*;
public class t424to442 {

	public static void main(String[] args) {
		//knights();
		kth(12);
//System.out.println(palin("nitin"));
	}
	//1
	//Rat in a maze
	// same as 6 graph Search in a maze
	//O(3^n^2) O(lenght of path *nos of path)
   
	//2
	//print all n queen soln
	public static void kth(int n){
		boolean cols[],left[],right[];
		cols=new boolean [n];
		left=new boolean [2*n];
		right=new boolean [2*n];
		ArrayList<ArrayList<Integer>>r=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer>t=new ArrayList<Integer>();
		for(int i=0;i<n;i++)t.add(0);
		findout(cols,left,right,r,t,0,n);
		System.out.println(r);
	}
	
	private static void findout(boolean[] cols, boolean[] left, boolean[] right, ArrayList<ArrayList<Integer>> result,
			ArrayList<Integer> t, int r, int n) {
		if(r==n) {result.add(new ArrayList<Integer>(t));return;}
		for(int c=0;c<n;c++)
		{
			if(cols[c]||left[r+c]||right[r-c+n])continue;
			cols[c]=left[r+c]=right[r-c+n]=true;
			t.set(r, c+1);
			findout(cols,left,right,result,t,r+1,n);
			cols[c]=left[r+c]=right[r-c+n]=false;
		}
		
	}
	//3
	//Word Break 2
	//O(N2 *n) |N|=length
	static List<String> wordBreak(int n, List<String> dict, String s)
    {
        HashSet<String>h=new HashSet<String>(dict);
        return wbreak(s,h,new HashMap<String,LinkedList<String>>());    
    }
    
	private static List<String> wbreak(String s, HashSet<String> h,
			HashMap<String, LinkedList<String>> map) {
if(map.containsKey(s))return map.get(s);
LinkedList<String>tem=new LinkedList<String>();
if(s.length()==0)tem.add("");
for(String v:h)
{
	if(s.startsWith(v)) {
		List<String>sub=wbreak(s.substring(v.length()),h,map);
		for(String c:sub )
			tem.add(v+(c.isEmpty()?"":" ")+c);
	}
}
map.put(s, tem);
	return tem;
	}
	//4
	//remove invalid paranthesis
	//by bfs
    public boolean isvalid(String s)
    {int t=0,n=s.length();
     for(int i=0;i<n;i++)
     {
         if(s.charAt(i)=='(')t++;
         else if(s.charAt(i)==')')t--;
         if(t<0)return false;
     }
        return t==0;
    }
    public List<String> removeInvalidParentheses(String s) {
        int n=s.length();
        List<String>ans=new LinkedList<String>();
        HashSet<String>h=new HashSet<String>();
        boolean flag=false;
        Queue<String>q=new LinkedList<String>();
        q.add(s);h.add(s);
        while(!q.isEmpty())
        {
         s=q.remove(); 
            if(isvalid(s)){ans.add(s);flag=true;}
            if(flag)continue;
                for(int i=0;i<s.length();i++)
                {
                    if(s.charAt(i)!='('&&s.charAt(i)!=')')continue;
                    String c="";
                    c=s.substring(0,i)+s.substring(i+1);
                    if(!h.contains(c)){h.add(c);q.add(c);}
                }
        }
        return ans;
        }

	//5
	//suduko
	//O(9^(n*n))  O(n*n)
 	static boolean SolveSudoku(int grid[][])
    {return solve(grid,0,0);}
    
    static boolean solve(int grid[][],int i,int j)
    {
        int n=grid.length;
        if(i==n-1&&j==n)return true;
        if(j==n){i++;j=0;}
    if(grid[i][j]!=0)return solve(grid,i,j+1);
        for(int k=1;k<10;k++)
        {
        if(isSafe(grid,i,j,k))
        {  grid[i][j]=k;if(solve(grid,i,j+1))return true;  }
        grid[i][j]=0;
    }
return false;
    }
    static boolean isSafe(int grid[][],int i,int j,int k)
    {
        for(int t=0;t<9;t++)
        {
            if(grid[i][t]==k||grid[t][j]==k)return false;
        }
     int r= i-i % 3,c= j - j % 3;
        for (int v = 0; v < 3; v++)
            for (int b = 0; b < 3; b++)
                if (grid[v + r][b + c] == k)
                    return false;
 
        return true;
    }
    static void printGrid (int grid[][])
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {System.out.print(grid[i][j]+" ");}
        }
    }
	
	//6
	//m colouring problem 
	// same as 37 graph m colouring problem
	//O(m^V)
	
    //7
    //print all palindromic substrings
    public static ArrayList<ArrayList<String>> palin(String input)
    {
    	int n=input.length();
    	ArrayList<ArrayList<String>>arr=new ArrayList<ArrayList<String>>();
    	Deque<String>d=new LinkedList<String>();
      palindrome(arr,d,input,0,n);
    return arr;
    }
   
	private static  void palindrome(ArrayList<ArrayList<String>> arr, 
			Deque<String> d, String input, int i, int n) {
		if(i>=n) {arr.add(new ArrayList<String>(d));return;}
		for(int x=i;x<n;x++)
		{
			if(pali(input,i,x)) {
			d.addLast(input.substring(i, x+1));
			palindrome(arr,d,input,x+1,n);
			d.removeLast();}
		}
	}
	private static boolean pali(String input, int i, int j) {
		while(i<=j)
		{if(input.charAt(i)!=input.charAt(j)) {return false;}i++;j--;}
		return true;
	}
	//8
	//Partition Equal Subset Sum
	// same as 8 dp
	
	//9
	//knights tour problem
	public static void knights() {
		int dp[][]=new int[8][8];
		int x[]=new int[] {2, 1, -1, -2, -2, -1, 1, 2 };
        int y[]=new int[] {1, 2, 2, 1, -1, -2, -2, -1 };
		for(int j[]:dp)Arrays.fill(j,-1);
		dp[0][0]=0;
		kni(dp,x,y,0,0,1);
		
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++)
				System.out.print(dp[i][j]+" ");
		System.out.println();}
	}
	
     private static boolean kni(int[][] dp,
		int[] x, int[] y, int i, int j,int c) {
         	int n=dp.length,a,b;	
	    	if(c>=(n*n))return true;
	    	for(int z=0;z<8;z++)
	    	{
	    		a=x[z]+i;b=y[z]+j;
	    		if(a<n&&a>=0&&b<n&&b>=0&&dp[a][b]==-1) {
	    		dp[a][b]=c;
	    	    if(kni(dp,x,y,a,b,c+1)) {return true;}
	    	    else   dp[a][b]=-1;
	    	}
	    	}
	    	return false;
	}
     //10
     // Tug of war
     void TOWUtil(int arr[], int n, boolean curr_elements[],
             int no_of_selected_elements, boolean soln[],
             int sum, int curr_sum, int curr_position)
  {   if (curr_position == n)  return;
      if ((n / 2 - no_of_selected_elements) >(n - curr_position))return;
      TOWUtil(arr, n, curr_elements,no_of_selected_elements, soln, sum,curr_sum,
             curr_position+1);
      no_of_selected_elements++;
      curr_sum = curr_sum + arr[curr_position];
      curr_elements[curr_position] = true;
      if (no_of_selected_elements == n / 2)
      {   if (Math.abs(sum / 2 - curr_sum) <min_diff)
          {   min_diff = Math.abs(sum / 2 -curr_sum);
              for (int i = 0; i < n; i++)soln[i] = curr_elements[i];
          }
      }
      else
      { TOWUtil(arr, n, curr_elements, no_of_selected_elements, soln, sum, curr_sum,
                  curr_position + 1);}
     curr_elements[curr_position] = false;
  }
int min_diff=0;
void tugOfWar(int arr[])
  {  int n = arr.length;
      boolean[] curr_elements = new boolean[n];Arrays.fill(curr_elements, false);
      boolean[] soln = new boolean[n];Arrays.fill(soln, false);
      min_diff = Integer.MAX_VALUE;
      int sum = 0;
      for (int i = 0; i < n; i++){sum += arr[i];}
      TOWUtil(arr, n, curr_elements, 0,soln, sum, 0, 0);
      for (int i = 0; i < n; i++)
      {   if (soln[i] == true)System.out.print(arr[i] + " ");}
      for (int i = 0; i < n; i++)
      {   if (soln[i] == false) System.out.print(arr[i] + " ");}
  }
     
     //11
     //Find shortest safe route in a path with landmines
     //its bfs doesnot ork
     static final int R = 12;
     static final int C = 10;
  static int r[] = { -1, 0, 0, 1 };
  static int c[] = { 0, -1, 1, 0 };
  static int min;
  static boolean isSafe(int[][] mat, boolean[][] visited,
          int x, int y)
{
if (mat[x][y] == 0 || visited[x][y])return false;
return true;
}
  
static boolean isValid(int x, int y)
{
if (x < R && y < C && x >= 0 && y >= 0)return true;
return false;
}

static void markUnsafeCells(int[][] mat)
{
for(int i = 0; i < R; i++)
  {for(int j = 0; j < C; j++)
     {
      if (mat[i][j] == 0)
       {
    	  for(int k = 0; k < 4; k++)
           if (isValid(i + r[k], j + c[k]))
            mat[i + r[k]][j + c[k]] = -1;
      }
   }
 }
for(int i = 0; i < R; i++)
{for(int j = 0; j < C; j++)
    {if (mat[i][j] == -1)
      mat[i][j] = 0;
    }
}
}

static void findShortestPathUtil(int[][] mat,
        boolean[][] visited, int i, int j, int dist)
{
if (j == C - 1){min = Math.min(dist, min);return;}
if (dist > min)return;
visited[i][j] = true;
for(int k = 0; k < 4; k++)
{
if (isValid(i + r[k], j + c[k]) && isSafe(mat, visited, i + r[k],j + c[k]))
{findShortestPathUtil(mat, visited, i + r[k],j + c[k], dist + 1);}
}
visited[i][j] = false;
}

 public static void shortestpath(int [][]mat) 
  {
	  min=Integer.MAX_VALUE;
	  boolean[][] visited = new boolean[R][C];
	  markUnsafeCells(mat);
	  for(int i = 0; i < R; i++)
	    {
		  if (mat[i][0] == 1)
	        {
	            for(int k = 0; k < R; k++)
	            {   Arrays.fill(visited[k], false);}
	     findShortestPathUtil(mat, visited, i, 0, 0);
	            if (min == C - 1)  break;
	        }
	    }
	    if (min != Integer.MAX_VALUE)
	        System.out.println("Length of shortest " +"safe route is " + min);
	    else
	        System.out.println("Destination not " +"reachable from given source");
  
  }
		//12
    //Combinational Sum
    //O(X2 * 2N), where X is average of summation O(X2 * 2N)
    static ArrayList<ArrayList<Integer> >combinationSum(ArrayList<Integer> arr, int sum)
    {
        ArrayList<ArrayList<Integer> > ans= new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
 
        Set<Integer> set = new HashSet<>(arr);
        arr.clear();
        arr.addAll(set);
        Collections.sort(arr);
        findNumbers(ans, arr, sum, 0, temp);
        return ans;
    }
    static void findNumbers(ArrayList<ArrayList<Integer> > ans,ArrayList<Integer> arr, int sum, int index,ArrayList<Integer> temp)
    {
        if (sum == 0) {
            ans.add(new ArrayList<>(temp));
       return;
        }
        for (int i = index; i < arr.size(); i++) {
            if ((sum - arr.get(i)) >= 0) {
                temp.add(arr.get(i));
                findNumbers(ans, arr, sum - arr.get(i), i, temp);
  temp.remove(arr.get(i));
            }
        }
    }
    //13
    //Largest number in K swaps
    //O(n^K)  O(n)
    static String max;
    public static String findMaximumNum(String s,int k)
    {max=s;
    char ar[]=s.toCharArray();
        findMaximumNum(ar,k);
        return max;}
     public static void findMaximumNum(char ar[], int k)
        {
            if (k == 0)
                return;
            int n = ar.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (ar[j] > ar[i]) {
                        char temp = ar[i];
                        ar[i] = ar[j];
                        ar[j] = temp;
                        String st = new String(ar);
                        if (max.compareTo(st) < 0) {max = st;}
                        findMaximumNum(ar, k - 1);
                        temp = ar[i];
                        ar[i] = ar[j];
                        ar[j] = temp;
                    }
                }
            }
        }
   //14
 	//Print all possible permutations of a strings
 	//O(n!*n) O(n)
 	List<String>x= new ArrayList<String>();
     public List<String> find_permutation(String S) {
         char c[]= S.toCharArray();
         S=String.valueOf(c);
         int n=S.length();
         check(S,0,n-1);
         Collections.sort(x);
 return x;
     }
     public void check(String s, int i,int j){
         if(i==j){x.add(s); return;}
         
         for(int t=i;t<=j;t++)
         {
             s=swap(s,i,t);
             check(s,i+1,j);
             s=swap(s,i,t);
         }
     }
     public String swap(String s,int i,int j)
     {
         char c[]= s.toCharArray();
         char temp=c[i];
         c[i]=c[j];
         c[j]=temp;
         return String.valueOf(c);
     }


     //15
    //same as graph 36  O(n!)
    //Find if there is a path of more than k length from a source

     //16
     //Longest Possible Route in a Matrix with Hurdles
    public static class pair{
     int value;
     boolean find;
    pair(int v,boolean f){this.value=v;this.find=f;}
    }
     public static int  routes(int arr[][],int i,int j,int x,int y) {
    	 
    	 boolean vis[][]=new boolean[arr.length][arr[0].length];
    	 pair p=routes(arr,i,j,x,y,vis);
    	 if(p.find)return p.value;
    	 else return -1;
     }
    
    private static pair routes(int[][] arr, int i, int j, int x, int y, boolean[][] vis) {
if(i==x-1&&j==y-1)return new pair(0,true);
if(i<0||j<0||i>=arr.length||j>=arr[0].length||arr[i][j]==0||vis[i][j])
	return new pair(Integer.MAX_VALUE,false);
vis[i][j]=true;
int res=Integer.MIN_VALUE;

pair sol=routes(arr,i+1,j,x,y,vis);
if(sol.find)res=Math.max(res, sol.value);

sol=routes(arr,i,j+1,x,y,vis);
if(sol.find)res=Math.max(res, sol.value);

sol=routes(arr,i-1,j,x,y,vis);
if(sol.find)res=Math.max(res, sol.value);

sol=routes(arr,i,j-1,x,y,vis);
if(sol.find)res=Math.max(res, sol.value);

vis[i][j]=false;
if(res!=Integer.MIN_VALUE)return new pair(res+1,true);
else return new pair(Integer.MAX_VALUE,false);
	}
	//17
    //Print all possible paths from top left to bottom right of a mXn matrix
    //O((2^n)*n) O(n)
    public static void print(int mat[][],int m,int n,int i,int j,List<Integer>list)
    {
    	if(i>m||j>n) return;
    	list.add(mat[i][j]);
    	if(i==m-1&&j==n-1)System.out.println(list);
    	print(mat,m,n,i+1,j,list);
    	print(mat,m,n,i,j+1,list);
    	list.remove(mat[i][j]);
    }
    //18
    //O(n*2^n)
    public boolean isKPartitionPossible(int arr[], int n, int k)
    {
        if(k==1)return true;
        if(k>n)return false;
	    int sum=0;
	    for(int x:arr){sum+=x;}
	    boolean x[]=new boolean[n];
	    int y[]=new int[n];
	    Arrays.fill(y,0);
	    Arrays.fill(x,false);
	    if(sum%k!=0)return false;
	    y[0]=arr[n-1];
	    x[n-1]=true;
	    return sets(arr,x,y,sum/k,k,n,0,n-1);
	    }
	private boolean sets(int[] arr, boolean[] taken, int[] subset, int sub, int k, 
			int n, int cur, int lim) {
if(subset[cur]==sub)
{
	if(cur==k-2)return true;
	return sets(arr,taken,subset,sub,k,n,cur+1,n-1);
}
for(int j=lim;j>=0;j--)
{
	if(taken[j])continue;
int t=subset[cur]+arr[j];
if(t<=sub)
{
taken[j]=true;
subset[cur]+=arr[j];
boolean ni=sets(arr,taken,subset,sub,k,n,cur,j-1);
taken[j]=false;
subset[cur]-=arr[j];
if(ni)return true;
}
}
		return false;
	}
	//19
	//O(n2)
	//Permutation Sequence
	 public String getPermutation(int n, int k) {
	      ArrayList<Integer>arr=new ArrayList<Integer>();
	       int fact=1;
	        for(int i=1;i<=n;i++)
	        {
	        arr.add(i);
	            if(i!=n)fact*=i;
	        }
	        k=k-1;
	        String s="";
	        while(!arr.isEmpty())
	        {
	            int x=k/fact;s=s+arr.remove(x);
	            k=k%fact;
	            if(n!=1){fact=fact/(n-1);n--;}
	        }
	        
	        return s;
	    }
}