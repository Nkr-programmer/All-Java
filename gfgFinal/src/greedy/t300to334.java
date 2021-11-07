package greedy;
import java.io.*;
import java.util.*;

public class t300to334 {

	public static void main(String[] args) {
int s1[]=new int[] {3,2,1,1,1};
int s2[]=new int[] {4,3,2};
int s3[]=new int[] {1,1,4,1};
int s[]=new int[] {1,2,4,8};
		//System.out.println(max(s,4));
//choclate();
//arrange();
//	wine();
//DieHard();
//def();
chicks();
	}
	//NICE ONE FOR COMPARATER
	 class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
	}
	 int[] JobScheduling(Job arr[], int n)
	    {
	   Arrays.sort(arr,new Comparator<Job>()
	        {public int compare(Job j1,Job j2){
	            if(j1.deadline>j2.deadline){return 1;}
	        else if(j1.deadline==j2.deadline){
	              //return 0;
	                if(j1.profit<j2.profit)return 1;
	                else return -1;
	            }
	            else return -1;
	        }}
	        );
	    for(Job x:arr){System.out.print(x.id+" "+x.deadline+" "+x.profit+" ,");}
	        return new int[]{5,4,3};
	    }
	//1
//Activity Selection problem
	//O(nlogn)
    static class values{int x,y;values(int x,int y){this.x=x;this.y=y;   }}
	static  class StockComparator implements Comparator<values> {
	   	        	public int compare(values s1, values s2)
	   	            {
	   	                if (s1.y == s2.y)
	   	                    return 0;
	   	                else if (s1.y > s2.y)//inc order so revere form is shown here 
	   	                    return 1;
	   	                else
	   	                    return -1;
	   	            }
	   	        }
	   	        public static  int maxMeeting(int s[], int e[], int n)
	   	        {
	   	      List<values>arr=new ArrayList<values>();
	   	      arr.clear();
	   	            for(int i=0;i<s.length;i++)
	   	            {arr.add(new values(s[i], e[i]));}
	   	            Collections.sort(arr, new StockComparator());
	   	            int max=1,i=0;
	  int temp=1,k=i;
	       for(int j=i+1;j<s.length;j++)
	       {if(arr.get(k).y<arr.get(j).x){temp++;k=j;}}
	   if(temp>max){max=temp;}
	   	   return max;
	   	        }
	   	        //3
	   	    // Huff Mann Coding
	   	        class Huff{
	   	        int data;char c;
	   	        Huff left,right;
	   	    }
	   	    public ArrayList<String> huffmanCodes(String S, int f[], int N)
	   	    {
	   	PriorityQueue<Huff>q=new PriorityQueue<Huff>(N,new Comparator<Huff>(){
	   	    public int compare(Huff a,Huff b){
	   	      if(a.data >= b.data){
	   	                    return 1;
	   	                }
	   	                else{
	   	                    return -1;
	   	                }
	   	            }
	   	        });
	   	for(int i=0;i<N;i++)
	   	{
	   	   Huff h=new Huff();
	   	   h.left=null;h.right=null;h.c=S.charAt(i);h.data=f[i];
	   	   q.add(h);
	   	}
	   	while(q.size()>1)
	   	{
	   	    Huff x=q.remove(),y=q.remove();
	   	    Huff g=new Huff();
	   	    g.data=x.data+y.data;
	   	    g.c='-';g.left=x;g.right=y;
	   	q.add(g);
	   	}
	   	ArrayList<String>ar=new ArrayList<String>();
	   	Huff cc=q.remove();
	   	preorder(ar,cc,"");
	   	return ar;
	   	    }
	   	    public void preorder(ArrayList<String>ar,Huff h,String s)
	   	    {
	   	        if(h.left==null&&h.right==null&&h.c!='-'){ar.add(s);return ;}
	   	        preorder(ar,h.left,s+"0");
	   	        preorder(ar,h.right,s+"1");
	   	    }
	   	    //4
	   	   //Water Connection Problem
	   	    //O(n+p)
	   	    static int ans;
	   	    static int ends[];
	   	    static int starts[];
	   	    static int wt[];
	   	    static ArrayList<ArrayList<Integer>>arr;
	   	    static int dfs(int w){
	   	        if(ends[w]==0)return w;
	   	        if(ans>wt[w]){ans=wt[w];}
	   	        return dfs(ends[w]);
	   	    }
	   	   static ArrayList<ArrayList<Integer>> solve(int n, int p, ArrayList<Integer> a ,ArrayList<Integer> b ,ArrayList<Integer> d) 
	   	    { 
	   	        arr=new ArrayList();
	   	        ends=new int[n+1];Arrays.fill(ends,0);
	   	        starts=new int[n+1];Arrays.fill(starts,0);;
	   	        wt=new int[n+1];Arrays.fill(wt,0);
	   	        for(int i=0;i<p;i++)
	   	        {
	   	        ends[a.get(i)]=b.get(i);
	   	        starts[b.get(i)]=a.get(i);
	   	        wt[a.get(i)]=d.get(i);
	   	        }
	   	        for(int i=1;i<=n;i++)
	   	        {
	   	         if(starts[i]==0&&ends[i]>0)
	   	         {
	   	              ans=100000;
	   	         int w=dfs(i);
	   	         ArrayList<Integer>x=new ArrayList<Integer>();x.add(i);x.add(w);x.add(ans);
	   	        arr.add(x);
	   	         }
	   	        }
	   	        
	   	        return arr;
	   	     }

	   	    
	   	        //5
	   	        //Fractional Knapsack
	   	     class Item {
	   	      int value, weight;
	   	      Item(int x, int y){
	   	          this.value = x;
	   	          this.weight = y;
	   	      }
	   	  }
	   	     double fractionalKnapsack(int W, Item arr[], int n) 
	   	    {
	   	        Arrays.sort(arr,new Comparator<Item>(){
	   	            public int compare(Item s1, Item s2)
	   		   	            {
	   		   	                double a=(double)((double)(s1.value)/(double)(s1.weight)),
	   		   	                b=(double)((double)(s2.value)/(double)(s2.weight));
	   		   	                if (a<b)
	   		   	                    return 1;
	   		   	                else if(a>b)
	   		   	                    return -1;
	   		   	                    else return 0;
	   		   	            }
	   	        });
	   	        double ans=0;
	   	for(Item x:arr){
	   	    if(W==0)break;
	   	    if(x.weight<=W){ans+=x.value;W-=x.weight;}
	   	else{double f=(double)((double)(x.value)/(double)(x.weight));
	   	ans+=(double)(W*f);W=0;}
	   	}        
	   	        return ans;
	   	    }
	   	     //6
	   	     //Number of Coins
	   	     //greedy does not work
	   	     //but does not working this approach fine 11 wrong coins 9,1,1 right coins 6,9 collections 9,1,5,6
	   		public int minCoin(int c[], int M, int V) 
	   		{ 
	   		    Arrays.sort(c);
	   		    int ans=0,x=M-1;
	   		    while(V!=0)
	   		    {    x=bs(c,V,0,x);
	   		        int z=c[x];
	   		        ans+=V/z;
	   		        V=V%z;
	   		    }
	   		return ans;
	   		} 
	   		public int bs(int c[] ,int V,int i,int j)
	   		{
	   		    for(int k=j;k>=0;k--)
	   		    {
	   		        if(c[k]<=V){return k;}
	   		    }
	   		    return -1;
	   		}
	   		//recurtion
	   	 static int minCoins(int coins[], int m, int V)
	     { if (V == 0) return 0;
	        int res = Integer.MAX_VALUE;
	        for (int i=0; i<m; i++)
	        {
	          if (coins[i] <= V)
	          {        int sub_res = minCoins(coins, m, V-coins[i]);
	              if (sub_res != Integer.MAX_VALUE && sub_res + 1 < res)
	                 res = sub_res + 1;
	          }
	        }
	        return res;
	     }
//dp
	   	 static int minCoi(int coins[], int m, int V)
	     { int table[] = new int[V + 1];
	         table[0] = 0;
	        for (int i = 1; i <= V; i++)
	         table[i] = Integer.MAX_VALUE;
	         for (int i = 1; i <= V; i++)
	         {for (int j = 0; j < m; j++)
	             if (coins[j] <= i)
	             {
	                 int sub_res = table[i - coins[j]];
	                 if (sub_res != Integer.MAX_VALUE
	                        && sub_res + 1 < table[i])
	                        table[i] = sub_res + 1;
	             }
	         }
	           if(table[V]==Integer.MAX_VALUE)
	             return -1;
	         return table[V];
	     }   		
	   	        //7
	   	        //Maximum trains for which stoppage can be provided
	   	        //O(nlogn)
	   	     static class air implements Comparable<air> {
	   	    	int arrival;
	   	    	int departure;
	   	    	public air(int arrival, int departure) {
	   	    	this.arrival = arrival;
	   	    	this.departure = departure;
	   	    	}
	   	    	@Override
	   	    	public int compareTo(air o) {
	   	    	return this.departure-o.departure;
	   	    	}
	   	    	}
	   	    	public static int maxStop(int n, int m, int[] start, int[] end, int[] platform) {
	   	    	HashMap<Integer, ArrayList<air>> map = new HashMap<>();
                 for (int i = 1; i <= n; i++) {
	   	    	map.putIfAbsent(i, new ArrayList<>());
	   	    	}
	   	    	for (int i = 0; i < m; i++) {
	   	    	if (map.containsKey(platform[i])) {
	   	    	map.get(platform[i]).add(new air(start[i], end[i]));
	   	    	}
	   	    	}
	   	    	int count = 0;
	   	    	for (Map.Entry<Integer, ArrayList<air>> entry : map.entrySet()) {
	   	    	ArrayList<air> pair = entry.getValue();
	   	    	count += findStoppage(pair);
	   	    	}
	   	    	return count;
	   	    	}
	   	    	public static int findStoppage(ArrayList<air> list) {
	   	    	Collections.sort(list);
	   	    	int meeting = 1;
	   	    	int lastEnd = list.get(0).departure;
	   	    	for (int i = 1; i < list.size(); i++) {
	   	    	int fstart = list.get(i).arrival;
	   	    	if (fstart > lastEnd) {
	   	    	meeting++;
	   	    	lastEnd = list.get(i).departure;
	   	    	}
	   	    	}
	   	    	return meeting;
	   	    	}
	   	 //8
	   	        // Minimum Platform
	   	        //O(nlogn O(N) 
	   	     static class value2{int x;char y;value2(int x,char y){this.x=x;this.y=y;}}
	         static  class StockComparat implements Comparator<value2> {
	   	   	 	   	        	public int compare(value2 s1, value2 s2)
	   	   	 	   	            {
	   	   	 	   	                if (s1.x == s2.x)
	   	   	 	   	                    {if(s2.y=='a')return 1;else return -1;  }
	   	   	 	   	                else if (s1.x > s2.x)
	   	   	 	   	                    return 1;
	   	   	 	   	                else
	   	   	 	   	                    return -1;
	   	   	 	   	            }
	   	   	 	   	        }
	          public static  int findPlatform(int s[], int e[], int n)
	   	   	 	   	        {
	   	   	 	   	      List<value2>arr=new ArrayList<value2>();
	   	   	 	   	      arr.clear();
	   	   	 	   	      for(int i=0;i<s.length;i++)
	   	   	 	   	   {arr.add(new value2(s[i], 'a'));arr.add(new value2(e[i], 'd'));}
	   	   	 	   	   Collections.sort(arr, new StockComparat());
	   	   	 	   	   
	   	   	 	   	   int max=0,ans=-1;;
	   	   	 	   	   for(value2 x:arr){
	   	   	 	   	       if(x.y=='a'){max++;}
	   	   	 	   	       else if(x.y=='d'){max--;}ans=Math.max(ans,max);
	   	   	 	   	   }
	   	   	 	   	   return ans;
	   	   	 	   	        }
//9
//	          Buy Maximum Stocks if i stocks can be bought on i-th day
	          //O(NlogN)
	          static class Buy{int x;int y;Buy(int x,int y){this.x=x;this.y=y;}}
	          static int buyMaximumProducts(int[] price, int K, int n)
	          {int ans=0;
	              PriorityQueue<Buy>q=new PriorityQueue<Buy>(n, new Comparator<Buy>() {
	            	  public int compare(Buy s1, Buy s2)
	   	 	   	            {
	   	 	   	                if (s1.x == s2.x)
	   	 	   	                    {if(s1.y<s2.y)return 1;else return -1;  }
	   	 	   	                else if (s1.x > s2.x)
	   	 	   	                    return 1;
	   	 	   	                else
	   	 	   	                    return -1;
	   	 	   	            }
	              } );
	              for(int i=0;i<n;i++)
	              {q.add(new Buy(price[i],i+1));}
	              while(!q.isEmpty()) 
	              {
	            	  Buy x=q.remove();
	            	 ans+=Math.min(x.y, K/(x.x));
	            	 K-=x.x*Math.min(x.y, K/(x.x));
	              }
	              
	          return ans;
	          }
	          //10
	   	        //Shop in Candy Store
	   	     static ArrayList<Integer> candyStore(int c[],int n,int k){
		   	       int minans=0,maxans=0;Arrays.sort(c);
		   	       for(int i=0;i<n;i++){if((i+1)+((i+1)*k)>=n) { minans+=c[i];break;} minans+=c[i];}
		   	       for(int i=n-1;i>=0;i--){if((n-i)+((n-i)*k)>=n) { maxans+=c[i];break;} maxans+=c[i];}
		   	  ArrayList<Integer> t=new ArrayList<Integer>();
		   	 t.add(minans);t.add(maxans);
		   	 return t;
		   	    }
	   	     //11
	   	     //Minimize Cash Flow among a given set of friends who have borrowed money from each other
	   	  static final int N = 3;
	      static int getMin(int arr[])
	      {   int minInd = 0;
	          for (int i = 1; i < N; i++)if (arr[i] < arr[minInd])minInd = i;
	          return minInd;
	      }
	      static int getMax(int arr[])
	      {   int maxInd = 0;
	          for (int i = 1; i < N; i++)if (arr[i] > arr[maxInd])maxInd = i;
	          return maxInd;
	      }
	      static int minOf2(int x, int y)
	      {return (x < y) ? x: y;}
	      static void minCashFlowRec(int amount[])
	      {   int mxCredit = getMax(amount), mxDebit = getMin(amount);
	          if (amount[mxCredit] == 0 && amount[mxDebit] == 0)return;
	          int min = minOf2(-amount[mxDebit], amount[mxCredit]);
	          amount[mxCredit] -= min;
	          amount[mxDebit] += min;
	          System.out.println("Person " + mxDebit + " pays " + min + " to " + "Person " + mxCredit);
	          minCashFlowRec(amount);
	      }
	      static void minCashFlow(int graph[][])
	      {   int amount[]=new int[N];
	          for (int p = 0; p < N; p++)
	          for (int i = 0; i < N; i++)
	              amount[p] += (graph[i][p] - graph[p][i]);
	          minCashFlowRec(amount);
	      }
	      //12
//	      same as 29 
	   	 //13
	   	        //Check if it is possible to survive or not
	   	     static int minimumDays(int S, int N, int M){
	   	      if(M>N||(((6*N)<(7*M))&&S>6)){return -1;}
	   	      else{
	   	          int days=(S*M)/N;
	   	          if((S*M)%N!=0){days++;}
	   	          return days;
	   	      }
	   	      }
	   	        //14  Find all max meeting in 1 room
	   	        //O(nlogn)
	   	        //same as 1 of greedy
	   	        static class value{int x,y,i;value(int x,int y,int i){this.x=x;this.y=y;this.i=i;}}
	   	 	static  class StockComparators implements Comparator<value> {
	   	 	   	        	public int compare(value s1, value s2)
	   	 	   	            {
	   	 	   	                if (s1.y == s2.y)
	   	 	   	                    return 0;
	   	 	   	                else if (s1.y > s2.y)//inc order so revere form is shown here 
	   	 	   	                    return 1;
	   	 	   	                else
	   	 	   	                    return -1;
	   	 	   	            }
	   	 	   	        }
	   	 	   	        public static  int maxMeetings(int s[], int e[], int n)
	   	 	   	        {
	   	 	   	      List<value>arr=new ArrayList<value>();
	   	 	   	      arr.clear();
	   	 	   	      for(int i=0;i<s.length;i++)
	   	 	   	   {arr.add(new value(s[i], e[i],i));}
	   	 	   	   Collections.sort(arr, new StockComparators());
	   	 	   	   int max=1,i=0,temp=1,k=i;
	    	       System.out.print(((arr.get(i).i)+1)+" ");
	   	 	       for(int j=i+1;j<s.length;j++)
	   	 	       {if(arr.get(k).y<arr.get(j).x){temp++;k=j;System.out.print(((arr.get(j).i)+1)+" ");}}
	   	 	   if(temp>max){max=temp;}
	   	 	   	   return max;
	   	 	   	        }
	   	 
	//15
	   	        //Max product subset of an array
	   	        //O(n)
	public static int product(int arr[],int n)
	{
		if(n==1)return arr[0];
		int min=Integer.MAX_VALUE,cz=0,cn=0,ans=1;
		for(int x:arr) {if(x==0) {cz++;continue;}
		if(x<0) {cn++;min=Math.max(min, x);}
		ans=ans*x;
		}
		if(cz==0)return 0;
		if(cn%2==1) {if(cn==1&&cz>0&&n-1==cz)return 0;
		ans=ans/min;}
	return ans;	
	}
	//16
	//Maximize sum after K negations 
	//O(nlogn)
	public static long maximizeSum(long a[], int n, int k)
    {
        Arrays.sort(a);
        long sum=0;
        for(int i=0;i<n;i++){
            if(a[i]<0 && k>0){
                a[i]*=-1;
                k--;
            }
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        sum+=a[i];
        
        if(k%2==1)
        sum-=2*a[0];
        return sum;
    }
	//17
	//Maximize sum(arr[i]*i) of an Array
	//O(nlogn)
	  int Maximize(int arr[], int n)
	    {
	       Arrays.sort(arr);
	       int ans=0;
	       for(int i=0;i<n;i++)
	       {long y=(long)(((long)(i)*(long)(arr[i])))%1000000007;
	       ans+=y;
	       ans=ans%1000000007;}
	return ans;        
	    } 
	//18
	//O(NLOGN) O(1)
	//Max sum of absolte diff of ann array
	static int max(int[]a,int n)
	{
		Arrays.sort(a);int ans=0,i=0,j=n-1;
		boolean t=true;
		while(i<j)
		{
			ans+=Math.abs(a[i]-a[j]);
			if(t) {t=false;i++;}
			else {t=true;j--;}
		}
	System.out.println(ans+" "+a[j]);
		ans+=Math.abs(a[0]-a[(j)]);
	return ans;	
	}
	//19
    long maxSum(long a[] ,int n)
    {
		Arrays.sort(a);long ans=0;int i=0,j=n-1;
		boolean t=true;
		while(i<j)
		{
			ans+=Math.abs(a[i]-a[j]);
			if(t) {t=false;i++;}
			else {t=true;j--;}
		}
//	System.out.println(ans+" "+a[j]);
		ans+=Math.abs(a[0]-a[(j)]);
	return ans;	
	}
	//20
	//O(Nlogn)
	//Min sum of anbsolute diff of pairs of 2 arrays
	public static int minim(int a[],int b[])
	{
		Arrays.sort(a);Arrays.sort(b);
	int n=a.length,ans=0;
	for(int i=0;i<n;i++) {ans+=Math.abs(a[i]-b[i]);}
    return ans;
	}
	//22
	//Page replacement algo
	   static int pageFaults(int N, int C, int pages[]){
		     Queue<Integer>q=new LinkedList<>();
		        int cnt=0;
		        for(int i: pages)
		        {
		            if(!q.contains(i))
		            {if(q.size()==C){q.poll();}
		                q.add(i);
		                cnt++;
		            }
		            else
		            {q.remove(i);q.add(i);}
		        }
		        return cnt;
		}
	   
	//23
	//O(nlogn)
	//smallest subset with sum greater than all other elements
	static int minelements(int arr[],int n)
	{
		int hsum=0;
		for(int i=0;i<n;i++) {hsum+=arr[i];}
		hsum=hsum/2;
		Arrays.sort(arr);int ans=0,c=0;
		for(int i=n-1;i>=0;i--) {ans+=arr[i];c++;if(ans>hsum)return c;}
		return c;
	}
	//24
	//Choclate distribution problem in array
	//25
//	DEFKIN - Defense of a Kingdom
	public static void def() {
		Scanner sc = new Scanner(System.in);
		int t=0;
	    t=sc.nextInt();
		while(t-->0)
		{  int c=sc.nextInt(),r=sc.nextInt(),n=sc.nextInt();
		    ArrayList<Integer>cs=new ArrayList<Integer>();
		    ArrayList<Integer>rs=new ArrayList<Integer>();
		    rs.add(0);
		    cs.add(0);
			for(int i=1;i<=n;i++) {cs.add(sc.nextInt());rs.add(sc.nextInt());}
			cs.add(c+1);rs.add(r+1);
			int m1=0,m2=0;
			Collections.sort(cs);Collections.sort(rs);
			for(int i=1;i<cs.size();i++) {m1=Math.max(m1, cs.get(i)-cs.get(i-1)-1);m2=Math.max(m2, rs.get(i)-rs.get(i-1)-1);}
			
		System.out.println(m1*m2);
		}
	}
	//26
	//Die Hard 
	//O(n2)
	static int dp[][];
	public static void DieHard()
	{
		dp=new int[10000][10000];
		Scanner sc = new Scanner(System.in);
		int n=0;
	    n=sc.nextInt();
		while(n-->0)
		{
			for(int[] x:dp) {Arrays.fill(x, -1);}
			int h=sc.nextInt(),a=sc.nextInt();
			int ans=Math.max(die(h+3,a+2,1), Math.max(die(h-5,a-10,2), die(h-20,a+5,3)));
		System.out.println(ans);
		}
	}
	private static int die(int h, int a, int i) {
		if(h<=0||a<=0)return 0;
		if(dp[h][a]!=-1)return dp[h][a];
		int x=0,y=0,z=0;
		if(i!=1) x=1+die(h+3,a+2,1);
		if(i!=2) y=1+die(h-5,a-10,2);
		if(i!=3) z=1+die(h-20,a+5,3);
		dp[h][a]= Math.max(x, Math.max(y, z));
	return dp[h][a];
	}
	//27
	//gergonia wine country
	public static void wine()
	{
		Scanner sc = new Scanner(System.in);
		int n=0;
	n=sc.nextInt();
		while(n!=0)
		{
			int a[]=new int[n];
			for(int i=0;i<n;i++) {a[i]=sc.nextInt();}
			Queue<int[]>buy=new LinkedList<int[]>();
			Queue<int[]>sell=new LinkedList<int[]>();
			for(int i=0;i<n;i++) {
				if(a[i]>0) {buy.add(new int[]{a[i],i});}
				else {sell.add(new int[]{a[i],i});}
			}
			int ans=0;
			while(!buy.isEmpty()&&!sell.isEmpty()) 
			{
				int x=Math.min(buy.peek()[0], -sell.peek()[0]);
				buy.peek()[0]-=x;
				sell.peek()[0]+=x;
				ans+=(x*Math.abs(buy.peek()[1]-sell.peek()[1]));
				if(buy.peek()[0]==0)buy.remove();
				if(sell.peek()[0]==0)sell.remove();
			}
			System.out.println(ans);
			
			n=sc.nextInt();
		}
	}
	//28
	//GCJ101BB - Picking Up Chicks
	public static void chicks()
	{

		Scanner sc = new Scanner(System.in);
		long ti=0,ll=0;
	ti=sc.nextLong();ll=ti;
	while(ti-->0)
	{
		long n=sc.nextLong(),k=n=sc.nextLong(),b=n=sc.nextLong(),t=n=sc.nextLong();
		long x[]=new long [(int)n];
		for(int i=0;i<n;i++) {x[i]=sc.nextLong();}
		long v[]=new long [(int)n];
		for(int i=0;i<n;i++) {v[i]=sc.nextLong();}
		int count=0,not=0,swaps=0;
	for(int i=(int)n-1;i>=0;i--)
	{
		long dp=v[i]*t;
long dn=b-x[i];
		if(dp>=dn) {
			count++;
			if(not>0) {swaps+=not;}
		}
		else {not++;}
	if(count>=k)break;
	}
		if(count>=k) {System.out.println("Case #"+(ll-ti)+": "+swaps);}
		else System.out.println("Case #"+(ll-ti)+": IMPOSSIBLE");
		
	}
	}
	
	//29
	//Chockolate
	public static void choclate() { 
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int m = sc.nextInt(); int n = sc.nextInt();
            Integer a[] = new Integer[m-1];
            Integer b[] = new Integer[n-1];
            for(int i=0;i<m-1;i++){a[i] = sc.nextInt();}
            for(int i=0;i<n-1;i++){b[i] = sc.nextInt();}
            System.out.println(Maximi(a,b,m-1,n-1));
        } 
	}
	private static int Maximi(Integer[] a, Integer[] b, int m, int n) {
		Arrays.sort(a,Collections.reverseOrder());
		Arrays.sort(b,Collections.reverseOrder());
		int hor=1,vert=1;
		int i=0,j=0,ans=0;
		while(i<m&&j<n)
		{
			if(a[i]>b[j]) {ans+=vert*a[i];hor++;i++;}
			else{ans+=hor*b[j];vert++;j++;}	
		}
		 if(i<m)
			    while(i<m)
			    {
			        ans+=a[i]*vert;
			        i++;
			    }
			    if(j<n)
			    while(j<n)
			    {
			        ans+=b[j]*hor;
			        j++;
			    }
		return ans;
	}
	//30
	//Arrange the amplifers
	public static void arrange() { 
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            int x=0;
            for(int i=0;i<n;i++){a[i] = sc.nextInt();if(a[i]==1) {x++;}}
            Maximi(a,n,x);
        } 
	}
	private static void Maximi(int[] a, int n,int x) {
		Arrays.sort(a);
		for(int i=0;i<x;i++) {System.out.print(1+" ");}
		if(n-x==2&&a[x]==2&&a[x+1]==3) 
		{System.out.println("2 3");System.out.println();return;}
		
		for(int i=n-1;i>=x;i--)
		{System.out.print(a[i]+" ");}
		System.out.println();
	}
	//31
	//K Centers Problem | Set 1 (Greedy Approximate Algorithm)
	static int maxindex(int[] dist, int n)
	{
	    int mi = 0;
	    for(int i = 0; i < n; i++)
	    {if (dist[i] > dist[mi])mi = i;}
	    return mi;
	}
	static void selectKcities(int n, int weights[][],int k)
	{
	    int[] dist = new int[n];
	    ArrayList<Integer> centers = new ArrayList<>();
	    for(int i = 0; i < n; i++)
	    {dist[i] = Integer.MAX_VALUE;}
	    int max = 0;
	    for(int i = 0; i < k; i++)
	    {  centers.add(max);
	        for(int j = 0; j < n; j++)
	        {dist[j] = Math.min(dist[j],weights[max][j]);}
	        max = maxindex(dist, n);
	    }
	    System.out.println(dist[max]);
	 for(int i = 0; i < centers.size(); i++)
	    {System.out.print(centers.get(i) + " ");}
	    System.out.print("\n");
	}
	//32
	//O(NLOGN) O(N)
	long minCost(long arr[], int n) 
    {
        PriorityQueue<Long>pq=new PriorityQueue<Long>();
        for(int i=0;i<n;i++)
        {pq.add(arr[i]);}
        long ans=0;
        while(pq.size()>1)
        {
            long f=pq.remove(),s=pq.remove();
            ans+=(f+s);pq.add(f+s);
        }
    return ans;
    }
//33
	//smallest number with given sum of digits as S and number of digits as D
	//O(D)
	 static String smallestNumber(int S, int D){
	     String ans="";
	     if(S>D*9)return "-1"+ans;
	     while(D>1){
	         if(S>9){ans=9+ans;S=S-9;}
	         else if(S>1&&S<=9){ans=(S-1)+ans;S=1;}
	         else{ans='0'+ans;}
	         D--;
	     }
	         ans=S+ans;
	    return ans;
	    }
	//34
	//Rearrange characters
	//O(n) same as 34 of string
	public static void gross() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
			int		n = Integer.parseInt(st.nextToken());
HashMap<Character,Integer>h= new HashMap<Character,Integer>();
			for(int i=0;i<n;i++)
			{h.clear();
				 st = new StringTokenizer(br.readLine());
				 String a= st.nextToken();
				 char[]b= a.toCharArray();
				 int max=-5;
                  for(int j=0;j<a.length();j++)
                  {
                	  if(!h.containsKey(b[j])) {h.put(b[j],1);}
                	  else {h.put(b[j],h.get(b[j])+1);max=Math.max(max, h.get(b[j]));}
                  }
             if(a.length()%2==0) {if(max<=a.length()/2)System.out.println(1);else System.out.println(0);}
             else {if(max<=(int)((a.length()/2)+1))System.out.println(1);else System.out.println(0);}     
			}
			 
	          }
	//35
	//O(n+m+k)
	//Find Max sum Possible equal sum of 3 stacks
	public static int maxSum(int s1[],int s2[],int s3[])
	{
		int sum1=0,sum2=0,sum3=0;
		int j=s1.length-1,k=s2.length-1,l=s3.length-1;
for(int i=0;i<s1.length;i++) {sum1+=s1[i];}
for(int i=0;i<s2.length;i++) {sum2+=s2[i];}
for(int i=0;i<s3.length;i++) {sum3+=s3[i];}
	while(j>=0||k>=0||l>=0)
	{
		if(sum1==sum2&&sum2==sum3) {
			for(int i=0;i<=j;i++) {System.out.print(s1[i]+" ");}
			for(int i=0;i<=k;i++) {System.out.print(s2[i]+" ");}
			for(int i=0;i<=l;i++) {System.out.print(s3[i]+" ");}	
			return sum1;}
		if(sum1>sum2) {if(sum1>sum3) {sum1-=s1[j];j--;}else if(sum1<=sum3) {sum3-=s3[l];l--;}}
		else {if(sum2>sum3) {sum2-=s2[k];k--;}else if(sum2<=sum3) {sum3-=s3[l];l--;}}
	}
return 0;
	}
}
