package Arrays;

import java.math.BigInteger;
import java.util.*;

public class rows {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= 
{ -1, 2, -3, 4, 5, 6, -7, 8, 9 };
move(a);

	}
	//1) array  344. Reverse String
		 public static  void reverseString(char[] word) {
			    
		        int i = 0;
		        int j = word.length - 1;
		        while (i < j) {
		            word[i] = (char) (word[i] ^ word[j]);
		            word[j] = (char) (word[i] ^ word[j]);
		            word[i] = (char) (word[i] ^ word[j]);
		            i++;
		            j--;
		        }
		    }
		 //2) array find max and min in ana array
		 public static  void find(int[] arr)
		 {
			 int l=arr.length;
			 int max=-99999,min=99999;
			 int i=0,j= l-1;
			 while(i<j)
			 {
				 max=Integer.max(max, arr[i]);max=Integer.max(max, arr[j]);
				 min=Integer.min(min, arr[i]);min=Integer.min(min, arr[j]);
				 i++;j--;
			 }
			 System.out.println(max+" "+min);
			 		 }
		 // 3) find kth largest element in arraay
			public static class Comp implements Comparator<Integer>{
	             
				 public int compare(Integer first, Integer second) {
					//find kth smallest element in arraay
				//	 return first < second ? 1 : -1;
			            return first > second ? 1 : -1;
			        }
		        }
			
		public int findKthLargest(int[] arr, int k) 
			 {
	   PriorityQueue<Integer>x= new PriorityQueue<Integer>(k,new Comp());
		 int l=arr.length;if(l==1)return arr[0];
		 int i=0,j= l-1;
		 while(i<j)
		 {
			 if(x.size()>k) x.poll();
			 x.add(arr[i]);
			 if(x.size()>k)  {x.poll();}
			 x.add(arr[j]);
			
			 if(i+1==j-1) { if(x.size()>k)  x.poll();
			 x.add(arr[i+1]); if(x.size()>k)  {x.poll();}}
			 else if(i+1==j) { if(x.size()>k)  {x.poll();}}
			 i++;j--;
		 }
		 return x.poll();
	   
			 }
		 
		//4
		 public static void sort012(int nums[], int n)
	     { int l=nums.length;
	        int i=0,j=0,k=0;
	        for(int t=0;t<l;t++){
	            if(nums[t]==0)i++;
	            else if(nums[t]==1)j++;
	            else k++;
	        }
	        int t=0;
	        while(i!=0){nums[t]=0;i--;t++;}
	        while(j!=0){nums[t]=1;j--;t++;}
	        while(k!=0){nums[t]=2;k--;t++;}
	   
	    }
	
		//5
		//move -ve to left and +ve to right
		public static void move(int[] arr) {
			int i=0,j=arr.length-1;
			
			while(i<=j) {
				if(arr[i]<0&&arr[j]<0) {i++;}
				else if(arr[i]>0&&arr[j]<0) {int k=arr[i];arr[i]=arr[j];
				arr[j]=k;
				i++;j--;}
				else if(arr[i]>0&&arr[j]>0) {j--;}
				else{i++;j--;}
			}
			for(int x:arr) {System.out.print(x+" ");}
				
		} 
		
		
		//Move 0s
		public void moveZeroes(int[] arr) {
		      int i=0;
		        for(int x:arr){if(x!=0)arr[i++]=x;}
		        for(int t=i;t<arr.length;t++){arr[t]=0;}
		
		}
		//6
		//Intersection
		  public int[] intersection(int[] nums1, int[] nums2) {
				 HashMap<Integer,Integer>x= new HashMap<Integer,Integer>();
				        ArrayList<Integer> c= new  ArrayList<Integer>();int j=0;
				        for(int i:nums1)
				        {if(!x.containsKey(i)){x.put(i,1);}}
				        for(int i:nums2){if(x.containsKey(i)){c.add(i);x.remove(i);}}
				        int cc[]= new int[c.size()];int g=0;
				        for(Integer v:c) {cc[g++]=v;}
				     return cc;
				    }
		  //Union
		    public static int doUnion(int nums1[], int n, int nums2[], int m) 
		    {
		        
		 HashSet<Integer>x= new HashSet<Integer>();
		        for(int i=0;i<nums1.length;i++)
		        {x.add(nums1[i]);}
		  for(int i=0;i<nums2.length;i++)
		        {x.add(nums2[i]);}
		    
		        int []c= new int[x.size()];int i=0;
		        for(Integer a:x){c[i++]=a;}
		        
		        return c.length;
		    }
		//7
		//Rotate array
		
		  public void rotate(int[] nums, int k) {
		        
			  int l=nums.length,count=0;if(l==1||k==0||k==l)return;
			         int tempindex=0,buf=nums[0];
			         int init=0;
			         while(count!=l)
			         {
			            int  b= nums[(tempindex+k)%l];
			             nums[(tempindex+k)%l]=buf;
			             buf=b;
			             tempindex=(tempindex+k)%l;
			             count++;
			             if(init==tempindex){init++;tempindex++;buf=nums[tempindex];}
			         }
			         
			         
			     }
//reversing the array algo
		  public void rotate2(int[] nums, int k) {
			    k %= nums.length;
			    reverse(nums, 0, nums.length - 1);
			    reverse(nums, 0, k - 1);
			    reverse(nums, k, nums.length - 1);
			  }
			  public void reverse(int[] nums, int start, int end) {
			    while (start < end) {
			      int temp = nums[start];
			      nums[start] = nums[end];
			      nums[end] = temp;
			      start++;
			      end--;
			    }
			  }
//8 Find the contiguous sub-array with maximum sum. //13 kadene algorithm
			  int maxSubarraySum(int arr[], int n){
			        int full[]= new int[arr.length];full[0]=arr[0];
			        int max=full[0];
			        for(int i=1;i<full.length;i++)
			        {
			         full[i]=arr[i]+(full[i-1]>0?full[i-1]:0);
			         max=Math.max(max,full[i]);   
			        }
			        return max;
			    }
			  //9 Minimize the height 1
			    int getMinDiff(int[] A, int n, int K) {
			        int N = A.length;
			            Arrays.sort(A);
			            int ans = A[N-1] - A[0];

			            for (int i = 0; i < A.length - 1; ++i) {
			                int a = A[i], b = A[i+1];
			                int high = Math.max(A[N-1] - K, a + K);
			                int low = Math.min(A[0] + K, b - K);
			                ans = Math.min(ans, high - low);
			            }
			            return ans;
			        }
			    //Minimize the height 2
			    // imp
			    int getMinDiff2(int[] A, int n, int K) {
			    	 int N = A.length;
			    	        Arrays.sort(A);
			    	        int ans = A[N-1] - A[0];

			    	        for (int i = 1; i < A.length; ++i)   {
			    	        if(A[i]>=K){    int high = Math.max(A[i-1] + K, A[N-1] - K);
			    	            int low = Math.min(A[i] - K, A[0] + K);
			    	            ans = Math.min(ans, high - low);
			    	        }else{continue;}}
			    	           
			    	        
			    	        return ans;
			    	    }
			    	
//10 min jumps needed to reach end
			   public int jump(int[] nums) {
		           int n= nums.length;if(n==1)return 0;
		        int count=1;if(nums[0]==0)return -1;
		        
		        int hi=nums[0],i=1;
		        while(hi<n-1)
		        {int max=0;
		         while(i<=hi)
		         {
		             if(max==n-1){return count+1;}
		             max=Math.max(max,nums[i]+i);i++;
		         }
		         if(hi<max){hi=max;count++;}
		         else{return -1;}
		        }
		            return count;
		    }
			   //11   Find the Duplicate Number
			   public int findDuplicate(int[] nums) {
			       
			        int i=nums[0],kn=nums[i];
			        while(kn!=0)
			        { nums[i]=0;
			             i=kn;
			        kn=nums[i];
			        }
			         return i;
			    }
			//12 merge two sorted array
			   // gap method

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
			    // Insertion sort
			    public void merge2(int X[], int Y[], int m, int n) {
			          for (int i = 0; i < m; i++)
			        {
			            if (X[i] > Y[0])
			            {
			                int temp = X[i];
			                X[i] = Y[0];
			                Y[0] = temp;
			 
			                int first = Y[0];
			                int k;
			                for (k = 1; k < n && Y[k] < first; k++) {
			                    Y[k - 1] = Y[k];
			                }
			                Y[k - 1] = first;
			            }
			        }
			    }
			    //14 Merge the intervals
//mine
  			    public static class ton{
			    	int x,y; 
			    	public ton(int x,int y) 
			    	{this.x=x;this.y=y;}
			    	}
			    public static class Student implements Comparator<ton>{
					@Override
					public int compare(ton o1, ton o2) {
						   return o1.x - o2.x ;
					}			
			        }
			    public static int[][] merges (int[][] intervals)
			    {
                    if(intervals.length==1)return intervals;
			    	ArrayList<ton> x= new ArrayList<ton>();
			    	for(int i=0;i<intervals.length;i++) 
			    	{x.add(new ton(intervals[i][0],intervals[i][1]));}
			    	Collections.sort(x,new Student());
			    	for(ton z:x) {System.out.println(z.x+" "+z.y);}
                    int t=0;
while(t!=x.size()-1)
{if(x.get(t).y>=x.get(t+1).x&&x.get(t).y<=x.get(t+1).y){
x.get(t).y=x.get(t+1).y;
x.remove(t+1);	}
    else
if(x.get(t).y>=x.get(t+1).y)
{x.remove(t+1);	} 
else {t++;}
}
int xx[][]=new int[x.size()][2];
for(int i=0;i<x.size();i++)
{xx[i][0]=x.get(i).x;xx[i][1]=x.get(i).y;}
			    	return xx;
			    }
//faster but same time complexity O(nlogn)
			    public int[][] merges2(int[][] intervals) {
			        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
			        LinkedList<int[]> merged = new LinkedList<>();
			        for (int[] interval : intervals) {
			            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
			                merged.add(interval);
			            }
			            else {
			                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
			            }
			        }
			        return merged.toArray(new int[merged.size()][]);
			    }
			    //15
			    //31. Next Permutation
			    
			    public void nextPermutation(int[] nums) {
			        int n=nums.length,j=n-1;
			        int st=-1;
			        while(j!=0)
			              {
			            if(nums[j-1]<nums[j])
			            {st=j-1;break;}
			            else{j--;}
			        }
			            if(st==-1){
			             int yy=n-1,xx=0;
			            while(xx<yy){
			                int k2=nums[yy];
			                nums[yy]=nums[xx];
			                nums[xx]=k2;
			                xx++;yy--;
			            }
			        }
			        else{
			            int ja=n-1,su=0;
			            while(ja>st)
			            {
			                if(nums[ja]>nums[st]){su=ja;break;}
			             else{ja--;}
			            }
//			       System.out.println(st+" "+su+" "+j);       
			            
			            int k=nums[su];
			            nums[su]=nums[st];
			            nums[st]=k;
			            int y=n-1,x=st+1;
			            while(x<y){
			                int kk=nums[y];
			                nums[y]=nums[x];
			                nums[x]=kk;
			            x++;y--;
			            }
			        }
			    }
			    //16  Count Inverstion
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
//			    315. Count of Smaller Numbers After Self
			    int[] counts;
			    public List<Integer> countSmaller(int[] nums) {
			        List<Integer> res = new ArrayList<Integer>();     

			        counts = new int[nums.length];
			        int[] indexes = new int[nums.length];
			        for(int i = 0; i < nums.length; i++){
			        	indexes[i] = i;
			        }
			        mergesort(nums, indexes, 0, nums.length - 1);
			        for(int i = 0; i < count.length; i++){
			        	res.add(counts[i]);
			        }
			        return res;
			    }
			    private void mergesort(int[] nums, int[] indexes, int start, int end){
			    	if(end <= start){
			    		return;
			    	}
			    	int mid = (start + end) / 2;
			    	mergesort(nums, indexes, start, mid);
			    	mergesort(nums, indexes, mid + 1, end);
			    	
			    	merges(nums, indexes, start, end);
			    }
			    private void merges(int[] nums, int[] indexes, int start, int end){
			    	int mid = (start + end) / 2;
			    	int left_index = start;
			    	int right_index = mid+1;
			    	int rightcount = 0;    	
			    	int[] new_indexes = new int[end - start + 1];

			    	int sort_index = 0;
			    	while(left_index <= mid && right_index <= end){
			    		if(nums[indexes[right_index]] < nums[indexes[left_index]]){
			    			new_indexes[sort_index] = indexes[right_index];
			    			rightcount++;
			    			right_index++;
			    		}else{
			    			new_indexes[sort_index] = indexes[left_index];
			    			count[indexes[left_index]] += rightcount;
			    			left_index++;
			    		}
			    		sort_index++;
			    	}
			    	while(left_index <= mid){
			    		new_indexes[sort_index] = indexes[left_index];
			    		count[indexes[left_index]] += rightcount;
			    		left_index++;
			    		sort_index++;
			    	}
			    	while(right_index <= end){
			    		new_indexes[sort_index++] = indexes[right_index++];
			    	}
			    	for(int i = start; i <= end; i++){
			    		indexes[i] = new_indexes[i - start];
			    	}
			    }
			    		    
			    
			    //17
			    //Best time to sell and buy
			    public int maxProfit(int[] prices) {
			        int min   =Integer.MAX_VALUE;
			           int max=0;
			           for(int i=0;i<prices.length;i++)
			           {
			               if(prices[i]<min){min=prices[i];}
			               else{
			                   if(prices[i]-min>0){max=Math.max(max,prices[i]-min);}
			               }
			               
			           }
			           return max;
			       }
			    //18
			    //Count pairs with given sum
			    int getPairsCount(int[] arr, int n, int k) {
			    	HashMap<Integer,Integer>a= new HashMap<Integer,Integer>();
			    	int co=0;
			    	for(int i=0;i<arr.length;i++)
			    	{
			    	if(arr[i]>k)continue;
			    	else{
			    	    if(a.containsKey(k-arr[i]))
			    	    {co+=a.get(k-arr[i]);}
			    	    }
			    	    if(a.containsKey(arr[i])){a.put(arr[i],a.get(arr[i])+1);}
			    	else{a.put(arr[i],1);}
			    	    
			    	}
			           return co;
			    	    }
//19 Common elements
//O(N) if Contains PROPERTY RUNS EACH TIME THEN DIFFICULY
			    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
			    {int i=0,j=0,k=0;
			        ArrayList<Integer>a= new ArrayList<Integer>();
			        while(i!=n1&&j!=n2&&k!=n3)
			        {
			            if(A[i]==B[j]&&B[j]==C[k]){
			                if(!a.contains(A[i]))a.add(A[i]);
			                i++;j++;k++;}
			        else{
			            int min=Math.min(A[i],Math.min(B[j],C[k]));
			            if(A[i]==min){i++;}
			            if(B[j]==min){j++;}
			            if(C[k]==min){k++;}
			        }
			        }
			        return a;
			           }
			    //20
//Rearrange array in alternating positive & negative items with O(1) extra space
			    void rightrotate(int arr[], int n, int outofplace,
			                     int cur)
			    {
			        int tmp = arr[cur];
			        for (int i = cur; i > outofplace; i--)
			            arr[i] = arr[i - 1];
			        arr[outofplace] = tmp;
			    }
			 
			    void rearrange(int arr[], int n)
			    {
			        int outofplace = -1;
			 
			        for (int index = 0; index < n; index++)
			        {
			            if (outofplace >= 0)
			            {   if (((arr[index] >= 0)
			                     && (arr[outofplace] < 0))
			                    || ((arr[index] < 0)
			                        && (arr[outofplace] >= 0))) {
			                    rightrotate(arr, n, outofplace, index);
			 
			                    // the new out-of-place entry is now 2
			                    // steps ahead
			                    //***because next place is safe due to right rotate
			                    if (index - outofplace >= 2)
			                        outofplace = outofplace + 2;
			                    else
			                        outofplace = -1;
			                }
			            }
			 
			          if (outofplace == -1)
			            {
			                if (((arr[index] >= 0)
			                     && ((index & 0x01) == 0))
			                    || ((arr[index] < 0)
			                        && (index & 0x01) == 1))
			                    outofplace = index;
			            }
			        }
			    }
//21
			    //Subarray with 0 sum
			    static boolean findsum(int arr[],int n)
			    {
			 for(int i=1;i<arr.length;i++)
			 {     arr[i]+=arr[i-1]; }//Your code here
			    HashSet<Integer>a= new HashSet<Integer>();
			        for(int i=0;i<arr.length;i++)
			        {
			            if(arr[i]==0){return true;}
			            if(!a.contains(arr[i])){a.add(arr[i]);}
			            else{return true;}
			        }
			        return false;
			    }
//22
			    // Factorial of large values
// By ArrayList
  			    static ArrayList<Integer> factorial(int N){
			        ArrayList<Integer>x= new ArrayList<Integer>();
			        ArrayList<Integer>y= new ArrayList<Integer>();
			      x.add(1);
			              for(int i=2;i<=N;i++)
			        {multiply(i,x);}
			        for(int i=0;i<x.size();i++)
			        {y.add(0,x.get(i));}
			      return y;
			    }
			    public static void multiply(int x,ArrayList<Integer>t){
			        int c=0;
			        for(int i=0;i<t.size();i++)
			        {
			            int l=(t.get(i)*x)+c;
			            t.remove(i);
			            t.add(i,l%10);
			            c=l/10;
			        }
			        while(c!=0){
			            t.add(c%10);
			            c=c/10;
			        }
			    }
			    //By BigInteger
static BigInteger factorials(int N) {
	BigInteger x= new BigInteger("1");
	
	for(int i=2;i<N;i++)
	{		x=x.multiply(BigInteger.valueOf(i));}
	
	return x;
}
//23
// Maximum Product Subarray
// short but complicated
long maxProduct(int[] arr, int n) {
    
    long max=arr[0],min=arr[0];
    long ma=arr[0];
    for(int i=1;i<n;i++)
    {if(arr[i]<0){long t=max;max=min;min=t;}
     max=Math.max(arr[i],max*arr[i]);
     min=Math.min(arr[i],min*arr[i]);    
     ma=Math.max(ma,max);
    }			        
    return ma;
}

//24
//Longest consucutive subsequence
//Hashing
static int findLongestConseqSubseq(int arr[], int n)
{
 HashSet<Integer>x= new HashSet<Integer>();
 for(int i=0;i<n;i++)x.add(arr[i]);
 int ans=1,j=0;
 for(int i=0;i<n;i++)
 {
     if(!x.contains(arr[i]-1)){j=arr[i];
         while(x.contains(j)){j++;}
         ans=Math.max(ans,j-(arr[i]));
         
     }
 }

  return ans;
}
//by priority queue but O(nLogn) because it uses sorting property which o(nlogn)
//25
//Given an array of size n and a number k, 
//find all elements that appear more than n/3 times
public List<Integer> majorityElement(int[] nums) {
  if(nums.length==0)return new ArrayList<Integer>();
  int n1=nums[0],n2=nums[0],c1=0,c2=0,n=nums.length;
  
  for(int i=0;i<n;i++)
  {
      if(n1==nums[i]){c1++;}
      else if(n2==nums[i]){c2++;}
      else if(c1==0){c1=1;n1=nums[i];}
      else if(c2==0){c2=1;n2=nums[i];}
      else {c1--;c2--;}
  }
  ArrayList<Integer>x= new ArrayList<Integer>();
  c1=0;c2=0;
  for(int i=0;i<n;i++)
  {if(nums[i]==n1){c1++;}
  else if(nums[i]==n2){c2++;}}
  if(c1>n/3){x.add(n1);}
  if(c2>n/3){x.add(n2);}
  return x;
}
//Given an array of size n and a number k, 
//find all elements that appear more than n/k times


static class eleCount {
  int e; // Element
  int c; // Count
};
static void moreThanNdK(int arr[], int n, int k)
{
  if (k < 2)
      return;
eleCount []temp = new eleCount[k - 1];
  for (int i = 0; i < k - 1; i++)
      temp[i] = new eleCount();
  for (int i = 0; i < k - 1; i++) {
      temp[i].c = 0;
  }
 
 
  for (int i = 0; i < n; i++)
  {
      int j;

      
      
      for (j = 0; j < k - 1; j++)
      {
          if (temp[j].e == arr[i])
          {
              temp[j].c += 1;
              break;
          }
      }

      
      if (j == k - 1) {
          int l;

         
          
          for (l = 0; l < k - 1; l++)
          {
              if (temp[l].c == 0)
              {
                  temp[l].e = arr[i];
                  temp[l].c = 1;
                  break;
              }
          }

  
          
          if (l == k - 1)
              for (l = 0; l < k-1; l++)
                  temp[l].c -= 1;
      }
  }

  
  
  
  for (int i = 0; i < k - 1; i++)
  {
     
      int ac = 0; // actual count
      for (int j = 0; j < n; j++)
          if (arr[j] == temp[i].e)
              ac++;

      
      
      if (ac > n / k)
          System.out.print("Number:" +  temp[i].e
              + " Count:" +  ac +"\n");
  }
}
//26
//Maximum profit by buying and selling a share once only
static int maxProfit1(int price[], int n)
{
int profit=0;
int max_price = price[n - 1];
for (int i = n - 2; i >= 0; i--) {
    if (price[i] > max_price)
        max_price = price[i];
    profit = Math.max(profit,
                         max_price - price[i]);
}
return profit;
}
//Maximum profit by buying and selling a share at most twice
static int maxProfit(int price[], int n)
{
  int profit[] = new int[n];
  for (int i = 0; i < n; i++)
      profit[i] = 0;
  int max_price = price[n - 1];
  for (int i = n - 2; i >= 0; i--) {
      if (price[i] > max_price)
          max_price = price[i];
      profit[i] = Math.max(profit[i + 1],
                           max_price - price[i]);
  }
  int min_price = price[0];
  for (int i = 1; i < n; i++) {
      if (price[i] < min_price)
          min_price = price[i];
     profit[i] = Math.max(
          profit[i - 1],
          profit[i] + (price[i] - min_price));
  }
  int result = profit[n - 1];
  return result;
}
//Maximum profit by buying and selling a share at infinite times
//dp
static int maxProfit2(int price[], int n)
{
  int profit=0;
  for (int i = 1; i <n; i++) {
      if (price[i] -price[i-1]> 0)profit+=price[i]-price[i-1];
  }return profit;
}

//27
//Array Subset of another array
// if element are not unique then use hashmap
public String isSubset( long a1[], long a2[], long n, long m) {
    HashSet<Long>x= new HashSet<Long>();
    for(int i=0;i<n;i++)
    {x.add(a1[i]);}
    for(int i=0;i<m;i++)
    {if(!x.contains(a2[i])){return "No";}}
 
 return "Yes";   
}


//28
//t O(n2) S O(n)required S O(1)
//Triplet Sum in Array 
public static boolean find3Numbers(int arr[], int n, int k) { 
 
	   
 int co=0;
  if(arr.length<3)return false;
   for(int j=0;j<arr.length;j++)
   {
       HashMap<Integer,Integer>a= new HashMap<Integer,Integer>();
   if(j>0&&arr[j-1]==arr[j]){continue;}
       int k1=k-arr[j];
       for(int i=0;i<arr.length;i++)
       {
           if(i==j)continue;
           if(arr[i]>k1)continue;
           else{
               if(a.containsKey(k1-arr[i])){co+=a.get(k1-arr[i]);
        return true;
                                           }
           }
           if(a.containsKey(arr[i])){a.put(arr[i],a.get(arr[i])+1);}
           else{a.put(arr[i],1);}
       }
   }
   return false;
   
}
//t O(n2)  S O(1) by two pointer
boolean find3Numbers2(int A[], int arr_size, int sum)
{    int l, r;
 Arrays.sort(A);
 for (int i = 0; i < arr_size - 2; i++) {
     l = i + 1; // index of the first element in the remaining elements
     r = arr_size - 1; // index of the last element
     while (l < r) {
         if (A[i] + A[l] + A[r] == sum) {
             System.out.print("Triplet is " + A[i] + ", " + A[l] + ", " + A[r]);
             return true;
         }
         else if (A[i] + A[l] + A[r] < sum)
             l++;

         else // A[i] + A[l] + A[r] > sum
             r--;
     }
 }
 return false;
}
//3sum 
//barely working   should use 2 poiinter method
public List<List<Integer>> threeSum(int[] arr) {
Arrays.sort(arr);
   int co=0,k=0;
     Set<List<Integer>>x=new HashSet();
    if(arr.length<3)return new ArrayList<>(x);
     for(int j=0;j<arr.length;j++)
     {
     if(j>0&&arr[j-1]==arr[j]){continue;}
         HashMap<Integer,Integer>a= new HashMap<Integer,Integer>();
         int k1=k-arr[j];
         for(int i=0;i<arr.length;i++)
         {
             if(i==j)continue;
//commented because k=0&&arr[i]could be -ve
             //if(arr[i]>k1)continue;
            // else{
                 if(a.containsKey(k1-arr[i])){co+=a.get(k1-arr[i]);
             ArrayList<Integer>y=new ArrayList<Integer>(); 
                                              y.add(arr[i]);
                                              y.add(k1-arr[i]);
                                              y.add(arr[j]);
            Collections.sort(y);
                                              
                                                     x.add(y);
                                             }
             //}
             if(a.containsKey(arr[i])){a.put(arr[i],a.get(arr[i])+1);}
             else{a.put(arr[i],1);}
         }
     }
     return new ArrayList<>(x);
     
 }
//2 pointer method
public  List<List<Integer>> threeSum2(int[] nums) {
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
//29 Trapping Rain Water
//T(n) ,S(1)
static int findWater(int arr[], int n)
{
     int result = 0;
int left_max = 0, right_max = 0;
int lo = 0, hi = n - 1;

 while (lo <= hi) {
     if (arr[lo] < arr[hi]) {
         if (arr[lo] > left_max)
          left_max = arr[lo];
         else
             result += left_max - arr[lo];
         lo++;
     }
     else {
         if (arr[hi] > right_max)
             right_max = arr[hi];
         else
             result += right_max - arr[hi];
         hi--;
     }
 }

 return result;
}
//O(n) O(1)
//2 pointer algo
static int trappingWater(int arr[], int n) { 
 int l=0,r=n-1,l_max=0,r_max=0,res=0;
 
while(l<=r)
{
 if(l_max<=r_max){
     res+=Math.max(l_max-arr[l],0);
     l_max=Math.max(l_max,arr[l]);
l++;
 }
 else{
     res+=Math.max(r_max-arr[r],0);
     r_max=Math.max(r_max,arr[r]);
r--;
 }
 
}
 return res;
}

//30
//Chocolate Distribution Problem
public long findMinDiff (ArrayList<Long> a, long n, long m)
{
    Collections.sort(a);
    long v=1000000000;
    for(int i=1;i<n;i++)
    {
        if(i>=(int)(m-1)){v=Math.min(v,
        (long)
        (a.get(i)-a.get(i-(int)(m-1)))
        ); }
    }
    return v;
}
//31
//Smallest subarray with sum greater than x
public static int sb(int a[], int n, int x) {
    int j=-1,max=100000;
    if(n==1)return 1;
    for(int i=1;i<n;i++)
    {
        a[i]=a[i-1]+a[i];
        if(a[i]>x){max=Math.min(max,i+1);}
        while((a[i]-a[j+1])>x)
        {j++;max=Math.min(max,i-j);}
    }
return max;
    }
//32
//Three way partitioning
public void threeWayPartition(int arr[], int a, int b)
{
    int i=0,n=arr.length,j=n-1;
    for(int t=0;t<=j;)
    {
        if(arr[t]>b){int te=arr[t];arr[t]=arr[j];arr[j]=te;j--;}
        else if(arr[t]<a){int te=arr[t];arr[t]=arr[i];arr[i]=te;i++;t++;}
        else{t++;}
        int h=555;
        StringBuilder x= new StringBuilder();x.setLength(0);
x.append(h);
        System.out.println(  x.reverse().compareTo(x));

}
}
 //33
//Minimum swaps and K together 
// 2 pointer algo
public static int minSwap (int arr[], int n, int k){
    int c=0,max=0;
    for(int i=0;i<n;i++)
{if(arr[i]<=k){c++;}}
int in=0;
    for(int i=0;i<c;i++)
{if(arr[i]<=k){in++;}}
max=in;int total=in;
for(int i=1;i<=(n-c);i++)
{int a= arr[i-1]<=k?1:0;
    int b=arr[i+c-1]<=k?1:0;
     total= total-a+b;
 //   System.out.println(a+" "+b+" "+total);
    max=Math.max(max,total);
}

return (c-max);
}
//34
//min no of merge operations to make an aray palindrone
static int findMinOps(int[] arr, int n)
{
    int ans = 0; 
    for (int i=0,j=n-1; i<=j;)
    {
        if (arr[i] == arr[j])
        {  i++; j--;}
        else if (arr[i] > arr[j])
        {
            j--;
            arr[j] += arr[j+1] ;
            ans++;
        }
        else
        {
            i++;
            arr[i] += arr[i-1];
            ans++;
        }
    }

    return ans;
}

//36
//Median of two sorted arrays of different sizes
//O(LOG(m+n))  O(1)
// Binary Search
public double findMedianSortedArrays(int[] A, int[] B) {
int m=A.length,n=B.length;
    if(m>n){return findMedianSortedArrays(B,A);}
    int s=0,e=m,la=0,lb=0,ra=0,rb=0,rmid=(m+n+1)/2;
    while(s<=e)
    {
    int mid= (s+e)/2;
    int as=mid;
    int bs=rmid-mid;
     la=(as>0)?A[as-1]:Integer.MIN_VALUE;
     lb=(bs>0)?B[bs-1]:Integer.MIN_VALUE;
     ra=(as<m)?A[as]:Integer.MAX_VALUE;
     rb=(bs<n)?B[bs]:Integer.MAX_VALUE;
    
    if(la<=rb&&lb<=ra)
    {
        if((m+n)%2==0){return (Math.max(la,lb)+Math.min(ra,rb))/2.0;}
        return Math.max(la,lb);
    }
        
    else if(la>rb){e=mid-1;}
    else{s=mid+1;}
    
    }
    
    return 0.0;
}

}