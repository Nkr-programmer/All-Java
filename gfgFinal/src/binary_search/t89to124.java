package binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Map.Entry;
import java.util.function.BiPredicate;

public class t89to124 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	    BufferedReader br =
	            new BufferedReader(new InputStreamReader(System.in));
	        int t =
	            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
	        while(t-->0)
	        {
	            int n = Integer.parseInt(br.readLine().trim());
	            Integer arr[] = new Integer[(int)(n)];
	            String inputLine[] = br.readLine().trim().split(" ");
	            for (int i = 0; i < n; i++) {
	                arr[i] = Integer.parseInt(inputLine[i]);
	            }
	            
	            t89to124 obj = new t89to124();
	            obj.sortBySetBitCount(arr, n);
	            StringBuilder output = new StringBuilder();
	            for(int i = 0; i < n; i++)
	            output.append(arr[i] + " ");
	            System.out.println(output);
	            
	        }
		}

// 1 
	//First and last occurrences of x 
	//O(logn)
    ArrayList<Long> find(long num[], int n, int x)
    {
       int i=0,j=n-1,fir=0,las=0;
       las= checkr(i,j,x,num);
       fir= checkl(i,j,x,num);
    ArrayList<Long>t=new ArrayList<Long>();
       t.add((long)fir);t.add((long)las);
    return t;
        
    }
    public static int checkl(int i,int j,int t,long[] num){
   if(i<=j)     
  {
       
        int mid= (i+j)/2;
        if((mid==0||num[mid-1]<t)&&num[mid]==t)return mid;      
 else   if(num[mid]<t){return checkl(mid+1,j,t,num);}
 else   {return checkl(i,mid-1,t,num);}
    }
        return -1;       
    }
    
    public static int checkr(int i,int j,int t,long[] num){
   if(i<=j)     
  {
        int mid= (i+j)/2;
        if((mid==num.length-1||num[mid+1]>t)&&num[mid]==t)return mid;      
 else  if(num[mid]>t){return checkr(i,mid-1,t,num);}
 else   {return checkr(mid+1,j,t,num);}

    }
        return -1;       
    }

//2
    //Value equal to index value
    //O(logn)
    public static void xyz() {
    	int a[]= new int [] {-10,-5,1,3,8,16};
    System.out.println(know(0,5,a));
    }
private static int know(int i, int j, int[] a) {
	if(i<=j) {
		int mid=(i+j)/2;
		if(a[mid]==mid) {return mid;}
		else if(a[mid]<mid)return know(mid+1,j,a);
		else return know(i,mid-1,a);
	}
	return -1;
}
//3
//Search in Rotated Sorted Array
//O(logn)
public int search(int[] nums, int t) {
    int n=nums.length;
      int x= search(0,n,nums);
      if(t<=nums[n-1]){return binary(x,n-1,t,nums);}
      else{if(x==0){return -1;}return binary(0,x-1,t,nums);}
  }
  
  public static int binary(int i,int j,int t,int[] num){
 if(i<=j)     
{
      int mid= (i+j)/2;
      if(num[mid]==t)return mid;      
else  if(num[mid]>t){return binary(i,mid-1,t,num);}
else   {return binary(mid+1,j,t,num);}

  }
      return -1;       
  }
  public  static int search(int i,int j,int[]a)
  {
      if(i<=j){
          int mid=(i+j)/2;
          if((mid==0||a[mid-1]>a[a.length-1])&&(a[mid]<=a[a.length-1]))return mid;
          else if(a[mid]>a[a.length-1])return search(mid+1,j,a);
          else return search(i,mid-1,a);
      }
      return -1;
  }
//4
  // Square root of a integer
// O(1) but not binary search  
  static int countSquare(int N) {
      int t= (int)Math.sqrt(N);
      return t*t==N?t-1:(int)t;
  }
  //Binary Search O(logn)
  static int countSquares(int N) {
	  if(N==1)return 0;
	  return binary(0,((int)Math.sqrt(N))+10,N);
 }
 public static int binary(int i,int j,int t){
if(i<=j)     
{
     int mid= (i+j)/2;
     if(mid*mid==t)return mid-1;
     else if(mid*mid<t&&((mid+1)*(mid+1))>t)return mid; 
else  if(mid*mid<t){return binary(mid+1,j,t);}
else   {return binary(i,mid-1,t);}

 }
     return -1;       
 }
 //5
 //Minimum and max  element in array in min no of comparisons
 //O(n)   3*(n-1)/2 compa odd   1+3*(n-1)/2 compa even
 public static void minmax(int arr[],int n)
 {
	 int i=-1,min=100000,max=0;
	 if(n%2==0) {min=arr[0];max=arr[0];i=1;}
	 else {if(arr[0]>arr[1]) 
	 {min=arr[1];max=arr[0];i=2;}else{min=arr[0];max=arr[1];i=2;}}
while(i<n-1)
{
if(arr[i]>arr[i+1]) 
  {if(arr[i]>max)max=arr[i];if(arr[i+1]<min)min=arr[i+1];}
else {if(arr[i+1]>max)max=arr[i+1];if(arr[i]<min)min=arr[i];}
i+=2;
}
 System.out.println(min+" "+max);
 }
 //6
 //Optimum Location 
 //O(nlogn)
static class Line {
	int a,b,c;
	 Line(){}
	 Line(int a,int b,int c)
	 {this.a=a;this.b=b;this.c=c;}
 }
static class Point {
	int x,y;
	 Point(){}
	 Point(int x,int y)
	 {this.x=x;this.y=y;}
 }
 public static void xy(){
	 Line l=new Line(1,-1,-3);
	 int p[][]= new int[][] { { -3, -2 },
         { -1, 0 },
         { -1, 2 },
         { 1, 2 },
         { 3, 4 } };
 System.out.println(opLoc(l,p));
 }
 private static double opLoc(Line l, int[][] p) {
int n=p.length;
	 Point ps[]=new Point[n];
	 for(int i=0;i<n;i++)
	 {		ps[i]=new Point(p[i][0],p[i][1]); }
	return binart(l,ps,1e-6,1e6);
}
 public static double EPS=(int)(1e-6)+1;
private static double binart(Line l, Point[] ps, double i, double j) {
	if((j-i)>EPS) {
		double  m1=i+(j-i)/3;
		double  m2=j-(j-i)/3;
	
		double c1=compute(l,ps,m1);
		double c2=compute(l,ps,m2);
	if(c1<c2)
	{		return binart(l,ps,i,m2);}
	else {return binart(l,ps,m1,j);}
	}
	return compute(l,ps,(i+j)/2);
}

private static double compute(Line l, Point[] ps, double m) {
	double y=-1*(m*l.a+l.c)/l.b;
double d=dist(ps,m,y);

return d;
	}
private static double dist(Point[] ps, double m, double y) {
	double res=0.00;
	for(int i=0;i<ps.length;i++)
	{		res+=Math.sqrt(((ps[i].x-m)*(ps[i].x-m))+((ps[i].y-y)*(ps[i].y-y)));}
	return res;
}
//7
 //Find Missing And Repeating
 //O(n)
 int[] findTwoElement(int arr[], int n) {
     int miss=-100,rep=-100;
     for(int i=0;i<n;i++){
         int t=Math.abs(arr[i]);
         if(arr[t-1]>0)arr[t-1]=-1*arr[t-1];
         else {rep=t;}
     }
     for(int i=0;i<n;i++){
         if(arr[i]>0){miss=i+1;}
     }
     int x[]= new int[]{rep,miss};
 return x;
 }
 //8
 //Find majority element
 //O(N)   O(N)
 static int majorityElement(int a[], int size)
 {
if(size==1)return a[0];
     int t=(size+1)/2;
     int ans=-1,check=0;
     HashMap<Integer,Integer>x= new HashMap<Integer,Integer>();
     for(int i=0;i<size;i++)
     {
      if(!x.containsKey(a[i])){x.put(a[i],1);}
      else{x.put(a[i],x.get(a[i])+1);if(x.get(a[i])>=t){ans=a[i];x.put(a[i],1);check++;}}
     }
     if(check>1)return -1;
     return ans;
 }

//O(n) O(1)
 //Boyre moore voting algo
 public int majorityElement(int[] nums) {
     int count = 0;
     Integer candidate = null;

     for (int num : nums) {
         if (count == 0) {
             candidate = num;
         }
         count += (num == candidate) ? 1 : -1;
     }

     return candidate;
 }
 //9
 //Searching in an array where adjacent differ by at most k
 static int search(int arr[], int n,
         int x, int k)
{
int i = 0;
while (i < n) {
if (arr[i] == x)
return i;
i = i + Math.max(1, Math.abs(arr[i]- x) / k);
}

System.out.println("number is "+"not present!");
return -1;
}
 //10
 //Find Pair Given Difference
 //O(nlogn) // O(1)
 public boolean findPair(int arr[], int size, int n)
 {
Arrays.sort(arr);
if(size==1||arr[size-1]<n)return false;
int i=size-1,j=size-2;
while(arr[i]>n){
  while(arr[j]>=(arr[i]-n))
  {
      if(arr[j]==(arr[i]-n))return true;
      if(j==0)return false;
 //  System.out.print(arr[i]+" "+arr[j]);
   j--;
  }
  
  i--;
}
return false;
 }
// K-diff Pairs in an Array
 //O(n)   O(n)
 public int findPairs(int[] arr, int n) {
	 int size=arr.length;
	 int count=0;
	      HashMap<Integer,Integer>x= new HashMap<Integer,Integer>();
	      for(int i=0;i<size;i++){
	          if(!x.containsKey(arr[i])){x.put(arr[i],1);}
	          else{x.put(arr[i],x.get(arr[i])+1);}
	          }
	   for(Entry<Integer, Integer> y:x.entrySet()){
	 	  if(n==0) {if(y.getValue()>1){count++;}}
	 	  else {
	 		  if(x.containsKey(y.getKey()-n)) {count++;}
	 	  }
	   } 
	      x.clear();
	 return count;
	  }
 //11
 //O(n3)
 
public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
     int n = arr.length;
     Arrays.sort(arr);
     ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
       for(int i=0; i<n-3; i++){
         if(i>0 && arr[i-1] == arr[i])
             continue;
         for(int j=i+1; j<n-2; j++){
             if(j>i+1 && arr[j-1] == arr[j])
                 continue;
             int l = j+1;
             int r = n-1;
                     while(l<r){
                 int sum = arr[i] + arr[j] + arr[l] + arr[r];
                     if(sum == k){
                     ArrayList<Integer> a = new ArrayList<>();
                     a.add(arr[i]);
                     a.add(arr[j]);
                     a.add(arr[l]);
                     a.add(arr[r]);
                     ans.add(a);
                     l++;
                     r--;
                     while(l<r && arr[l] == arr[l-1]){l++;}
                     while(l<r && arr[r] == arr[r+1]){r--;}
                   }
                 else if(sum<k){l++;}
                 else{r--;}
             }
         }
     }
     return ans;
 }
//same approach but slower
public List<List<Integer>> fourSums(int[] nums, int k1) {
 Set<ArrayList<Integer>> res  = new HashSet<>();
if(nums.length<=3) return new ArrayList<>(res);
Arrays.sort(nums);
for(int i=0; i<nums.length-3;i++){
  int t=i+1;
   while(t<nums.length-2){
    int j =t+1, k =nums.length-1;
    while(j<k){
        int sum = nums[i]+nums[j]+nums[k]+nums[t];
        if(sum==k1)
        {ArrayList<Integer>x= new ArrayList<Integer>();x.add(nums[i]);x.add(nums[t]);
        x.add(nums[j++]);x.add(nums[k--]);
        res.add(x);}
        else if ( sum >k1) k--;
        else if (sum<k1) j++;
    }
    t++;
}
}	     
return new ArrayList<>(res);
}
//12
//Stickler Thief/max sum such that no  elements are adjacent 

//O(n)
public int FindMaxSum(int nums[], int n)
{
      return maxLoot(nums,n);
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


 //13
 //Count triplets with sum smaller than X
 //O(n)
 long countTriplets(long nums[], int n,int s)
 {
     if(nums.length==0) return 0;
     int ans=0;
     Arrays.sort(nums);
     for(int i=0; i<n-2;i++){
         int j =i+1;
        int  k = n-1;
         while(j<k){
             long sum = nums[i]+nums[j]+nums[k];
if(sum>=s){k--;}
else{ans+=(k-j);j++;}
         }
     }
     return ans;
 }
 //3 sum
 //O(n) return all set of numbers whose sum is s
 public  List<List<Integer>> threeSum(int[] nums) {
     Set<List<Integer>> res  = new HashSet<>();
     if(nums.length==0) return new ArrayList<>(res);
     Arrays.sort(nums);
     for(int i=0; i<nums.length-2;i++){
         int j =i+1;
        int  k = nums.length-1;
         while(j<k){
             int sum = nums[i]+nums[j]+nums[k];
             if(sum==0)res.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
             else if ( sum >0) k--;
             else if (sum<0) j++;
         }

     }
     return new ArrayList<>(res);

 }
 //14 SAME AS 12 OF ARRAY
//12 merge two sorted array
 // gap method
//O(M+N)
  public void merge(int arr1[], int arr2[], int n, int m){
  int t=(m+n)%2==1?(m+n+1):(m+n);
  while(t!=1)
  {
t/=2;
      for(int i=0;i<m+n;i++)
      {
          if(i<n){
              int a=arr1[i];
              if((i+t)>=m+n){break;}
              int b=(i+t)<n?arr1[i+t]:arr2[(i+t-n)];
              if(a>b){
                  int x=arr1[i];
                  arr1[i]=(i+t)<n?arr1[i+t]:arr2[(i+t-n)];
              
                  if((i+t)<n){ arr1[i+t]=x;}
                  else{arr2[(i+t-n)]=x;}
              }
          }
          else{
              int a=arr2[i-n];
              if((i+t)>=m+n){break;}
              int b=arr2[(i-n)+t];
              if(a>b){
                  int x=a;
                  arr2[i-n]=arr2[(i-n)+t];
                  arr2[(i-n)+t]=x;
              }
          }
      }
if(t%2==1&&t!=1)t++;
  } 
  }

 //15
//O(n) O(n)
 //count all subarry with 0 sum
 public static long findSubarray(long[] arr ,int n) 
 {int c=0;
   HashMap<Long,Integer>a= new HashMap<Long,Integer>();
   long ar[]= new long[n];
   ar[0]=arr[0];
 for(int i=1;i<arr.length;i++)
			 {     ar[i]=ar[i-1]+arr[i]; }
			        for(int i=0;i<arr.length;i++)
			        {
			            if(ar[i]==0){c++;}
			            if(!a.containsKey(ar[i])){a.put(ar[i],0);   }
			            else{a.put(ar[i],a.get(ar[i])+1);
			            c+=a.get(ar[i]);
			         }
			        }
			        return c;
			    }
 //count all subarray with k sum
 //O(N)
 public static int subarraySum2(int[] arr, int k) {
     int c=0,n=arr.length,sum=0;
   HashMap<Integer,Integer>a= new HashMap<Integer,Integer>();
   a.put(0,1);
        for(int i=0;i<n;i++) {
			sum+=arr[i];
            if(a.containsKey(sum-k)){c+=a.get(sum-k);}
            if(!a.containsKey(sum)){a.put(sum,1);}
		    else{a.put(sum,a.get(sum)+1);}
			        }
			        return c;
			    }
//Print all subarray with k sum
 //O(n)
 public int subarraySum3(int[] arr, int k) {
	  int c=0,n=arr.length,sum=0;
	HashMap<Integer,ArrayList<Integer>>b= new HashMap<Integer,ArrayList<Integer>>();
	         ArrayList<Integer>xy= new ArrayList<Integer>();xy.add(0);
	                          b.put(0,xy);
	     for(int i=0;i<n;i++) {
				sum+=arr[i];
	         if(b.containsKey(sum-k)){c+=b.get(sum-k).size();
	             System.out.print(i+" "+b.get(sum-k)); 
	                                 }
	         if(!b.containsKey(sum)){
	         ArrayList<Integer>x= new ArrayList<Integer>();x.add(i+1);
	                          b.put(sum,x);      
	                                 
	                                }
			    else{ArrayList<Integer>tt=new ArrayList<Integer>(b.get(sum));tt.add(i+1);
	             b.put(sum,tt);
	             }
				        }
	       System.out.println();
				        return c;
				    }
 //16
 //Product Array Puzzle
 //O(n)
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
long a[]= new long[n],k=1,z=0;
for(int i=0;i<n;i++)
{if(nums[i]!=0){k*=nums[i];}else{z++;}}
if(z>1){k=0;}
	for(int i=0;i<n;i++)
	{
	    if(z==1){
	        if(nums[i]==0){a[i]=k;}else{a[i]=0;}
	    }
	    else if(z>=2){a[i]=0;}
	    else
	    {a[i]=k/nums[i];}
	}
	    
	    return a;
	}
	//O(n)
	//without (/) use O(n) O(1)
	  public int[] productExceptSelf(int[] nums) {
		    int n=nums.length;
		        int res[]=new int[n];
		        res[0]=1;
		        for(int i=1;i<n;i++)
		        {res[i]=res[i-1]*nums[i-1];}
		    int right=1;
		        for(int i=n-1;i>=0;i--)
		       {
		           res[i]*=right;
		           right*=nums[i];
		       }
		        return res;
		    }
//17
	//Sort arary by nos set bits
	//O(n2) TLE
	static void sortBySetBitCount(Integer arr[], int n)
{
      int aux[] = new int[n];
   for (int i = 0; i < n; i++)
       aux[i] = countBits(arr[i]);

   insertionSort(arr, aux, n);
}
static int countBits(int a)
{
   int count = 0;
   while (a > 0)
   {
       if ((a & 1) > 0)
           count+= 1;
       a = a >> 1;
   }
   return count;
}
static void insertionSort(Integer arr[],
                         int aux[], int n)
{
   for (int i = 1; i < n; i++)
   {
       int key1 = aux[i];
       Integer key2 = arr[i];
       int j = i - 1;
       while (j >= 0 && aux[j] < key1)
       {
           aux[j + 1] = aux[j];
           arr[j + 1] = arr[j];
           j = j - 1;
       }
       aux[j + 1] = key1;
       arr[j + 1] = key2;
   }
}
//O(nlog(n)) but some error

static void sortBySetBitCount2(Integer arr[], int n)
{  
   Arrays.sort(arr, new Comparator<Integer>() {
       @Override
       public int compare(Integer arg0, Integer arg1)
       {
           // TODO Auto-generated method stub
           int c1 = Integer.bitCount(arg0);
           int c2 = Integer.bitCount(arg1);
           if (c1 <= c2)
               return 1;
           else
               return -1;
       }
   });
}
//O(Nlogn) working
//leetcode 
public int[] sortByBits(int[] arr) {
    Integer aa[]= new Integer[arr.length];
    int y=0;for(int b:arr){aa[y++]=b;}
   Arrays.sort(aa, (a, b) -> Integer.bitCount(a) == Integer.bitCount(b) ? a - b : Integer.bitCount(a) - Integer.bitCount(b));
y=0;
    for(Integer x:aa){arr[y++]=x;}
    return arr;
}
	//18
	//Minimum Swaps to Sort
	public static int minSwaps(int[] A, int N)
	{				int z,y=0,m=0;
				int o= Integer.MAX_VALUE;
				for(int i=0;i<N;i++)
				{o= Integer.MAX_VALUE;
					for(int j=i;j<N;j++)
					{		if(A[j]<o)
							{	o=A[j];
							y=j;
							}
					}
					if(A[i]!=o)
					{
						z=A[y];
						A[y]=A[i];
						A[i]=z;
						m++;
							}
				}
						return m;
}
	//O(nlogn)
    public int minSwaps2(int[] arr, int N)
    {
        int ans = 0;
        int[] temp = Arrays.copyOfRange(arr, 0, N);
        HashMap<Integer, Integer> h
            = new HashMap<Integer, Integer>();
        Arrays.sort(temp);
        for (int i = 0; i < N; i++)
        {            h.put(arr[i], i);   }
        for (int i = 0; i < N; i++)
        {
            if (arr[i] != temp[i])
            {
                ans++;
                int init = arr[i];
                swap(arr, i, h.get(temp[i]));
                h.put(init, h.get(temp[i]));
                h.put(temp[i], i);
            }
        }
        return ans;
    }
    public void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    //19
    //Bhishu and Soldiers
    public static void bhisu() {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sums[]=new int[n+1];
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            sums[i+1]=sums[i]+arr[i];
          }
        int t=sc.nextInt();
        while(t-->0){
        int count=0;
        int p=sc.nextInt();
        if(arr[0]>p) {count=-1;}
        else if(arr[n-1]<=p) {count=n-1;}
        else {
        count=BinarySearch(arr,0,n-1,p);
        }
        System.out.println((count+1)+" "+ sums[count+1]);
        }
    }
     private static  int BinarySearch(int arr[],int i,int j,int k) {
    	 if(i<=j)
    	 {
    		 int mid=(i+j)/2;
    		 if(arr[mid]<=k&&arr[mid+1]>k) {return mid;}
    		 else if(arr[mid]<=k) {return BinarySearch(arr,mid+1,j,k);}
    		 else {return BinarySearch(arr,i,mid-1,k);}
    	 }
    	 
    		return -1;
    	}
//21
     //Kth smallest number again
     public static void kthsamllest() { Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();
     while(t-- > 0){
         int n = sc.nextInt();
          int q = sc.nextInt();
          long  li[][] = new long[n][2];
          for(int i =0; i <n; i++){
          li[i][0] = sc.nextLong();
          li[i][1] = sc.nextLong();
          }
          li=merges2(li);
          int idx = 0;
          while(q-- > 0){
          boolean isFound = false;
          long k = sc.nextLong();
          for(int i =0; i < li.length; i++){
              long diff = li[i][1] - li[i][0];
              if(k <= diff + 1){
              System.out.println(li[i][0] + k -1 );
              isFound = true;
              break;
              }
              else{
              k = k - diff-1;
              }
          }
          if(!isFound){
          System.out.println(-1);
          }
          }}}
     public static long[][] merges2(long[][] intervals) {
	        Arrays.sort(intervals, (a, b) -> 
            Long.compare(a[0], b[0]));
	        LinkedList<long[]> merged = new LinkedList<>();
	        for (long[] interval : intervals) {
	            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
	                merged.add(interval);
	            }
	            else {
	                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
	            }
	        }
	        return merged.toArray(new long[merged.size()][]);
	    }
//22
 //Find the pivot element in an array
//O(logn)
public static int[] searc(int[] nums) {
   int n=nums.length;
     int x= searched(0,n,nums);
     int pivot=x==0?nums[n-1]:nums[x-1],rotated=x==0?0:x;
System.out.println("pivot element"+pivot+"No of times rotated"+rotated); 
return new int[] {pivot,rotated};
}
 public  static int searched(int i,int j,int[]a)
 {
     if(i<=j){
         int mid=(i+j)/2;
         if((mid==0||a[mid-1]>a[a.length-1])&&(a[mid]<=a[a.length-1]))return mid;
         else if(a[mid]>a[a.length-1])return searched(mid+1,j,a);
         else return searched(i,mid-1,a);
     }
     return -1;
 }
//23
	// Kth smallest element in 2 sorted array
	//O(Min(m+n))
	public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
	       int t=k,i=0,j=0;
	       while(t>1)
	       {
	           if(arr1[i]<=arr2[j])i++;
	           else{j++;}t--;
	           if(i>=n||j>=m)break;
	       }
	      // System.out.println(i+" "+j+" "+t);
	       if(i>=n)return arr2[j+t-1];
	       else if(j>=m)return arr1[i+t-1];
	       else return Math.min(arr1[i],arr2[j]);
	        
	    }
	//o(min(logm ,logn))
	public long kthElement2( int arr1[], int arr2[], int n, int m, int k) {
       if(n > m) {
           return kthElement2(arr2, arr1, m, n, k); 
       }
       
       int low = Math.max(0,k-m), high = Math.min(k,n);
       
       while(low <= high) {
           int cut1 = (low + high) >> 1; 
           int cut2 = k - cut1; 
           int l1 = cut1 == 0 ? Integer.MIN_VALUE : arr1[cut1 - 1]; 
           int l2 = cut2 == 0 ? Integer.MIN_VALUE : arr2[cut2 - 1];
           int r1 = cut1 == n ? Integer.MAX_VALUE : arr1[cut1]; 
           int r2 = cut2 == m ? Integer.MAX_VALUE : arr2[cut2]; 
           
           if(l1 <= r2 && l2 <= r1) {
               return Math.max(l1, l2);
           }
           else if (l1 > r2) {
               high = cut1 - 1;
           }
           else {
               low = cut1 + 1; 
           }
       }
       return 1; 
   }
//	2
//	5 3
//	1
//	2
//	8
//	4
//	9
//	0
//	6 4
//	1
//	5
//	8
//	11
//	13
//	16
	//24
	//Aggressive cows
	//O(nlogn)
	public static void cows() {
		Scanner sc= new Scanner (System.in);
		int t= sc.nextInt();
		while(t-->0) {
			int n=0,c=0;
			n=sc.nextInt();c=sc.nextInt();
			int arr[]= new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			Arrays.sort(arr);anss=0;
			int ans=binarys(arr,0,1000000000,c);
			System.out.println(ans);
		}
	}static int anss=0;
 private static int binarys(int[] arr, int i, int j, int c) {
	if(i<=j) {
		int mid=(i+j)/2;
		int cows=1;int prev=arr[0];
		for(int t=1;t<arr.length;t++)
		{
			if(arr[t]-prev>=mid) {cows++;prev=arr[t];if(c==cows)break;}
		}
	//	System.out.println(anss);
if(cows==c) {anss=mid;return binarys(arr,mid+1,j,c);}
else {return binarys(arr,i,mid-1,c);}
		
	}
		return anss;
	}
 //25
//Book Allocation problem
//O(NlogN)
 public static int findPages(int[]arr,int n,int m)
 {
 if(n<m) {return -1;}
 int start =0,sum=0;
 for(int i=0;i<n;i++) {sum+=arr[i];}int end=sum;
 int result= binary(arr,start,end,m);
 return result;
 }
 static int res=Integer.MAX_VALUE; 
private static int binary(int[] arr, int s, int e, int m) {
	if(s<=e) {
		int mid=(s+e)/2;
		if(possible(arr,m,mid)) {res=mid;return binary(arr,s,mid-1,m);}
		else {return binary(arr,mid+1,e,m);}
	}
	return res;
}
private static boolean possible(int[] arr, int m, int mid) {
	int nos=1,sum=0;
	for(int i=0;i<arr.length;i++)
	{
		if(mid<arr[i]) {return false;}
		if(mid<(arr[i]+sum)) {
			nos++;sum=arr[i];
			if(m<nos) {return false;}
		}
		else {sum+=arr[i];}
	}
	//System.out.println(mid+" "+sum);
	return true;
}
//26
//ekospoj
//O(nlogn)
//but giving Tle
public static void eko() {
	Scanner sc= new Scanner(System.in);
	long n=0,m=0;
	n=sc.nextLong();m=sc.nextLong();
	long a[]= new long[(int)n];long max=Integer.MAX_VALUE;
	for(int i=0;i<n;i++) {a[i]=sc.nextLong();max=Math.max(max, a[i]);}
long i=0,j=max;
long res= binar(a,i,j,m);
System.out.println(res);
} static long result=0;
private static long binar(long[] arr, long s, long e, long m) {
	if(s<=e) {
		long mid=s+(e-s)/2;
		if(possibl(arr,m,mid)) {result=mid;return binar(arr,mid+1,e,m);}
		else {return binar(arr,s,mid-1,m);}
	}
	return result;
}
private static boolean possibl(long[] arr, long m, long mid) {
	long sum=0;
	for(int i=0;i<arr.length;i++)
	{
		if(sum>=m)return true;
		if(arr[i]<=mid) continue;
		else {sum+=arr[i]-mid;}
	}
	//System.out.println(mid+" "+sum);
	return sum>=m?true:false;
}
//27
static class Job
{    int start, finish, profit;
    Job(int start, int finish, int profit){
        this.start = start;
        this.finish = finish;
        this.profit = profit;
    }}
static class JobComparator implements Comparator<Job>
{
    public int compare(Job a, Job b)
    {
        return a.finish < b.finish ? -1 : a.finish == b.finish ? 0 : 1;
    }
}
  static public int binarySearch(Job jobs[], int index)
    {
        int lo = 0, hi = index - 1;
  while (lo <= hi)
        {
            int mid = (lo + hi) / 2;
            if (jobs[mid].finish <= jobs[index].start)
            {                if (jobs[mid + 1].finish <= jobs[index].start)
                    lo = mid + 1;
                else
                    return mid;          }
            else
                hi = mid - 1;
        }
        return -1;
    }
  static public int schedule(Job jobs[])
    {      Arrays.sort(jobs, new JobComparator());
        int n = jobs.length;
        int table[] = new int[n];
        table[0] = jobs[0].profit;
        for (int i=1; i<n; i++)
        {
            int inclProf = jobs[i].profit;
            int l = binarySearch(jobs, i);
            if (l != -1)
                inclProf += table[l];
            table[i] = Math.max(inclProf, table[i-1]);
        }
     return table[n-1];
    }
    public static void jobalgo()
    {
        Job jobs[] = {new Job(1, 2, 50), new Job(3, 5, 20),
                      new Job(6, 19, 100), new Job(2, 100, 200)};
  
        System.out.println("Optimal profit is " + schedule(jobs));
    }
    //28
//AP
 static int inSequence(int A, int B, int C){
if(C==0){if(B==A)return 1;else return 0;}
     int n=((B-A)/C)+1;
     if(n<=0)return 0;
     int t=A+((n-1)*C);
     return B==t?1:0;
 }
 //Missing number in a AP
 //O(logn)
 static int findMissingUtil(int arr[], int low,
         int high, int diff)
{if (high <= low)
return Integer.MAX_VALUE;
int mid = low + (high - low) / 2;
if (arr[mid + 1] - arr[mid] != diff)
return (arr[mid] + diff);
if (mid > 0 && arr[mid] -
 arr[mid - 1] != diff)
return (arr[mid - 1] + diff);
if (arr[mid] == arr[0] + mid * diff)
return findMissingUtil(arr, mid + 1,
             high, diff);
return findMissingUtil(arr, low, mid - 1, diff);
}
static int findMissing(int arr[], int n)
{int diff = (arr[n - 1] - arr[0]) / n;
return findMissingUtil(arr, 0, n - 1, diff);}
//29
// Smallest nos with at least n trailing 0s
static boolean check(int p, int n)
{
    int temp = p, count = 0, f = 5;
    while (f <= temp)
    {
        count += temp / f;
        f = f * 5;
    }
    return (count >= n);
}
static int findNum(int n)
{if(n==1)return 5;
return find(n,0,5*n);
}
static int find(int n,int i,int j)
{
    if(i<j){
        int mid=(i+j)>>1;
     //   System.out.print(mid);
        if(check(mid,n))return find(n,i,mid);
        else return find(n,mid+1,j);
    }
    return i;
}
//30
//The painters Problem 
//same as 25 book alloction problem JUST LONG IS REQUIRED
//O(NlogN)
static long minTime(int[] arr,int n,int k){
    //code here
    long max = Integer.MIN_VALUE, sum = 0L;
    for(int i:arr){
        if((long)i>max)max = (long)i;
        sum += (long)i;
    }
    long left = (long)max;
    long right = (long)sum;
    long min = (long)right;
    if(k>=n)return (long)left;
    if(k==1)return (long)right;
       while(left<=right){
        long mid = (long)left + (long)((right-left)/2);
        if(possible(arr,k,mid)){
            min = mid;
            right = mid-1;
        }
        else{
            left = mid+1;
        }
    }
    return min;
}
static boolean possible(int[] arr, int k, long time){
    long temp = 0;
    for(int i=0; i<arr.length; i++){
        if((long)arr[i]>time) return false;
        if(temp+(long)arr[i] > time){
            temp = (long)arr[i];
            k--;
            if(k==0) return false;
        }
        else{
            temp+=(long)arr[i];
        }
    }
    return true;
}
//31
//Roti Prata
//O(nLogM) M max time taken by most less rank cook
public static void Roti()
{
Scanner sc= new Scanner(System.in);
int t=0;
t=sc.nextInt();
while(t-->0)
{
int p=0,n=0;
p=sc.nextInt();n=sc.nextInt();
int a[]= new int[n];
for(int i=0;i<n;i++){a[i]=sc.nextInt();}Arrays.sort(a);
if(n<=0) {System.out.println(0);continue;}
if(p<n) {System.out.println(0);continue;}
int i=0,j=a[0]*((p*(p+1))/2);
System.out.print(binaries(i,j,a,p));
System.out.println();
}
}
static int val=Integer.MAX_VALUE;
private static int binaries(int s, int e, int[] a, int m) {
	if(s<=e) {
		int mid=(e+s)/2;
		if(possib(a,m,mid)) {val=mid;return binaries(s,mid-1,a,m);}
		else {return binaries(mid+1,e,a,m);}
	}
	return val;
}
private static boolean possib(int[] arr, int m, int mid) {
	int res=0,t=1;
	for(int i=0;i<arr.length;i++)
	{t=2*mid;
		t=t/arr[i];t=4*t;t=(int)(Math.sqrt(t+1))-1;t=(int)(t/2);res+=t;
		if(res>=m)return true;
	}
	//System.out.println(mid+" "+res+" "+m);
	return res>=m?true:false;
}

//32
//DoubleHelix
//O(n)
public static void helix() {
	Scanner sc= new Scanner(System.in);
	int n=-1;
	while(n!=0) {
	n=sc.nextInt();if(n==0)break;
	int a[]= new int[n];
	HashMap<Integer,Integer>h= new HashMap<Integer,Integer>();
	for(int i=0;i<n;i++) {a[i]=sc.nextInt();}
	int m=0;m=sc.nextInt();int b[]= new int[m];
	for(int i=0;i<m;i++) {b[i]=sc.nextInt();}
	for(int i=0;i<n;i++) {h.put(a[i],i);}
	int sum1=0,sum2=0,ans=0,prev=0;
	for(int i=0;i<m;i++){
		if(!h.containsKey(b[i])) 
		   {sum2+=b[i];}
		else{sum2+=b[i];int now=h.get(b[i]);
		for(int j=prev;j<=now;j++) {sum1+=a[j];}prev=now+1;
		//System.out.println(sum1+" "+sum2);
		ans+=Math.max(sum1,sum2);
		sum1=0;sum2=0;
		}
			}
	for(int i=prev;i<n;i++) {sum1+=a[i];}ans+=Math.max(sum1, sum2);
	System.out.println(ans);
	}
	}
//33
//Subsets Sums
//gfg 
//O(2*(2^(N/2)))
public static void sums()
{Scanner sc= new Scanner(System.in);
int n=0,a=0,b=0;
 n=sc.nextInt();a=sc.nextInt();b=sc.nextInt();
int arr[]= new int[n];
for(int i=0;i<n;i++)
{arr[i]=sc.nextInt();}
System.out.println(numberOfSubsets(arr, n, a, b));
}
private static void generateSubsetSumsRecur(int[] arr,int index,int end,  int runningSum, List<Integer> sums) {
    if (index == end+1) {
        sums.add(runningSum);
        return;
    }
    generateSubsetSumsRecur(arr,index+1,end, runningSum+arr[index], sums);
    generateSubsetSumsRecur(arr,index+1,end, runningSum, sums);
}
private static long numberOfSubsets(int arr[],int n, int a, int b) {
    // Generate subset sums for the first half set
    List<Integer> sums = new ArrayList<>();
    generateSubsetSumsRecur(arr,0,n/2, 0, sums);
    Integer[] firstSubsetSums= sums.toArray(new Integer[0]);
 
    // Generate subset sums for the second half set
    List<Integer> sums2 = new ArrayList<>();
    generateSubsetSumsRecur(arr, n/2+1, n-1, 0, sums2);
    Integer[] secondSubsetSums= sums2.toArray(new Integer[0]);
     
    // Sort the second half set
    Arrays.sort(secondSubsetSums);
     
    long count = 0;
    for(int i=0; i<firstSubsetSums.length; i++) {
        int p = findLastIdxWithFalsePredicate(secondSubsetSums,
                                              a-firstSubsetSums[i],1);
        int q = findLastIdxWithFalsePredicate(secondSubsetSums,
                                              b-firstSubsetSums[i],0);
        count += (q-p);
    }
    return count;
}
private static int findLastIdxWithFalsePredicate(Integer[] sums,
                                                 int val,int kn) {
    int min = 0;
    int max = sums.length-1;
    while (min<max) {
        int mid = min + (max-min+1)/2;
        if ((kn==1&&sums[mid]>=val)||(kn==0&&sums[mid]>val)) {
            max = mid-1;
        } else {
            min = mid;
        }
    }
    if ((kn==1&&sums[min]>=val)||(kn==0&&sums[min]>val))
        return -1;
    return min;
}
//34
 //Count invertion
 // O(nlogn)
// same in arrays Count Invertion
 long[] count;
public long inversionCount(long[] nums,long n) {
long h=0;
 count = new long[(int)nums.length];
 long[] indexes = new long[(int)nums.length];
 for(int i = 0; i < nums.length; i++){
 	indexes[i] = i;
 }
 mergesort(nums, indexes, 0, nums.length - 1);
 for(int i = 0; i < count.length; i++){
 	h+=count[i];
 }
 return h;
}
private void mergesort(long[] nums, long[] indexes, long start, long end){
	if(end <= start){
		return;
	}
	long mid = (start + end) / 2;
	mergesort(nums, indexes, start, mid);
	mergesort(nums, indexes, mid + 1, end);
	
	merge(nums, indexes, start, end);
}
private void merge(long[] nums, long[] indexes, long start, long end){
	long mid = (start + end) / 2;
	long left_index = start;
	long right_index = mid+1;
	long rightcount = 0;    	
	long[] new_indexes = new long[(int)(end - start + 1)];

	long sort_index = 0;
	while(left_index <= mid && right_index <= end){
		if(nums[(int)indexes[(int)right_index]] < nums[(int)indexes[(int)left_index]]){
			new_indexes[(int)sort_index] = indexes[(int)right_index];
			rightcount++;
			right_index++;
		}else{
			new_indexes[(int)sort_index] = indexes[(int)left_index];
			count[(int)indexes[(int)left_index]] += rightcount;
			left_index++;
		}
		sort_index++;
	}
	while(left_index <= mid){
		new_indexes[(int)sort_index] = indexes[(int)left_index];
		count[(int)indexes[(int)left_index]] += rightcount;
		left_index++;
		sort_index++;
	}
	while(right_index <= end){
		new_indexes[(int)sort_index++] = indexes[(int)right_index++];
	}
	for(int i = (int)start; i <= end; i++){
		indexes[i] = new_indexes[(int)(i - start)];
	}
}

 //35
//Merge sort in place=> No extra memory 
static void mergeSort(int arr[], int l, int r)
{if (l < r) {
int m = l + (r - l) / 2;
mergeSort(arr, l, m);
mergeSort(arr, m + 1, r);
merge1(arr, l, m, r);
//merge2(arr, l, r);
//merge3(arr, l, m, r);
}}

static void printArray(int A[], int size)
{int i;
for (i = 0; i < size; i++)
System.out.print(A[i] + " ");
System.out.println();}

public static void in()
{int arr[] = { 12, 11, 13, 5, 6, 7 },arr_size = arr.length;
mergeSort(arr, 0, arr_size - 1);
printArray(arr, arr_size);}

// 1)   O(n^2*logn)
static void merge1(int arr[], int start, int mid,int end)
{int start2 = mid + 1;
if (arr[mid] <= arr[start2]) {return;}
while (start <= mid && start2 <= end) {
if (arr[start] <= arr[start2]) {start++;}
else {  int value = arr[start2],index = start2;
while (index != start) {
      arr[index] = arr[index - 1];
      index--;
  }
  arr[start] = value;
  start++;
  mid++;
  start2++;}}}
//2)   Gap Method O(logn * Nlogn)
private static int nextGap(int gap)
{
    if (gap <= 1)
        return 0;
    return (int)Math.ceil(gap / 2.0);
}

private static void swaps(int[] nums, int i, int j)
{
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
}
private static void merge2(int[] nums, int start,
                                 int end)
{
    int gap = end - start + 1;
    for (gap = nextGap(gap); gap > 0;
         gap = nextGap(gap)) {
        for (int i = start; i + gap <= end; i++) {
            int j = i + gap;
            if (nums[i] > nums[j])
                swaps(nums, i, j);
        }
    }
}
//3) O(nlogn) best approach
public static void merge3(int a[], int l, int m, int r)
{
	int mx = Math.max(a[m], a[r]) + 1;
    int i = l, j = m + 1, k = l;
    while (i <= m && j <= r && k <= r) {
       int e1 = a[i] % mx;
        int e2 = a[j] % mx;
        if (e1 <= e2) {a[k] += (e1 * mx);i++; k++;}
        else {a[k] += (e2 * mx);j++;k++;}
    }
 while (i <= m) {int el = a[i] % mx;
 a[k] += (el * mx);i++;k++;}
 while (j <= r) {int el = a[j] % mx;
 a[k] += (el * mx);j++;k++;}
      for (int t = l; t <= r; t++)
        a[t] /= mx;
}
}