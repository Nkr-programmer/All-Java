package Heap;

import java.util.*;

public class t405to423 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//1
	//Build a binary heap
	//O(nlogn)
	public int[] heaps(int[] ans) {
		int n=ans.length;
	for(int i=n/2;i>=0;i--)
	{merges(ans,n,i);}
	   // for(int x:ans)System.out.print(x+" ");
	    return ans;
	    }
	    public void merges(int a[],int n,int i)
	    {
	        if(i>=n)return ;
	        int l=i*2+1;
	        int r=i*2+2;
	        int max=i;
	        if(l<n&&a[l]>a[i])max=l;
	        if(r<n&&a[r]>a[max])max=r;
	        if(i!=max)
	        {
	            int t=a[i];
	            a[i]=a[max];
	            a[max]=t;
	            merges(a,n,max);
	        }
	        
	    }
	    //2
	    //Heap sort
	  //O(nlogn)
		public int[] sort(int[] ans) {
			int n=ans.length;
		for(int i=n/2;i>=0;i--)
		{merged(ans,n,i);}
		for(int i=n-1;i>0;i--)
		{
			int x=ans[i];
			ans[i]=ans[0];
			ans[0]=x;
			merged(ans,i,0);
		}
		   // for(int x:ans)System.out.print(x+" ");
		    return ans;
		    }
		    public void merged(int a[],int n,int i)
		    {
		        if(i>=n)return ;
		        int l=i*2+1;
		        int r=i*2+2;
		        int max=i;
		        if(l<n&&a[l]>a[i])max=l;
		        if(r<n&&a[r]>a[max])max=r;
		        if(i!=max)
		        {
		            int t=a[i];
		            a[i]=a[max];
		            a[max]=t;
		            merged(a,n,max);
		        }
		        
		    }    
	    //3
		    //Sliding Window Maximum (Maximum of all subarrays of size k)
		    //1
		    //O(n*k)
		    static void printKMax1(int arr[], int n, int k)
		    {
		        int j, max;
		 
		        for (int i = 0; i <= n - k; i++) {
		 
		            max = arr[i];
		 
		            for (j = 1; j < k; j++) {
		                if (arr[i + j] > max)
		                    max = arr[i + j];
		            }
		            System.out.print(max + " ");
		        }
		    }
		    //2
		    //O(nlogk) O(k)
		    //Self balancing binary tree/heap
		    static ArrayList <Integer> max_of_subarrays2(int arr[], int n, int k)
		    {
		        PriorityQueue<Integer>pq=new PriorityQueue<Integer>(Collections.reverseOrder());
		        ArrayList<Integer>a=new ArrayList<Integer>();
		        for(int i=0;i<k;i++)
		        {pq.add(arr[i]);}
		        a.add(pq.peek());
		        pq.remove(arr[0]);
		        for(int i=k;i<n;i++)
		        {
		            pq.add(arr[i]);
		            a.add(pq.peek());
		            pq.remove(arr[i-k+1]);
		        }
		        return a;
		    }
		    //3
		    //O(n)
		    static ArrayList <Integer> max_of_subarrays3(int arr[], int n, int k)
		    {
		        Deque<Integer>d=new LinkedList<Integer>();
		        ArrayList<Integer>a=new ArrayList<Integer>();
		        for(int i=0;i<k;i++)
		        {
		            while(!d.isEmpty()&&arr[i]>=arr[d.peekLast()])
		            d.removeLast();
		            d.addLast(i);
		        }
		        
		        for(int i=k;i<n;i++)
		        {
		            a.add(arr[d.peekFirst()]);
		            while(!d.isEmpty()&&d.peekFirst()<=i-k)
		            d.removeFirst();
		            while(!d.isEmpty()&&arr[i]>=arr[d.peekLast()])
		            d.removeLast();
		            d.addLast(i);
		        }
		        a.add(arr[d.peekFirst()]);
		        return a;
		    }
		    
//4
	//k largest elements
	//O(N + klogk)   O(k)
	 int[] kLargest(int[] arr, int n, int k) {
	        PriorityQueue<Integer>pq=new PriorityQueue<Integer>();
	        for(int i=0;i<n;i++)
	        {
	            if(pq.size()<k){pq.add(arr[i]);}
	            else{
	                if(pq.peek()>arr[i])continue;
	                else {pq.remove();pq.add(arr[i]);}
	            }
	        }
	        int ans[]=new int[k];int g=k-1;
	        while(!pq.isEmpty()){ans[g]=pq.remove();g--;}
	    return ans;
	    }
	 //5
	 //K’th Smallest Element in Unsorted Array
	 public static int kthSmallest(int[] arr, int l, int r, int k) 
	    { 
	        //Your code here
	        
	        PriorityQueue<Integer> pQ = new PriorityQueue<Integer>();
	        
	        
	        for(int i =0;i<arr.length;i++){
	            pQ.add(arr[i]);
	        }
	        
	        int ans =0;
	        
	        for(int i =0;i<k;i++){
	            //System.out.println(pQ.peek());
	            ans = pQ.peek();
	            pQ.poll();
	        }
	        
	        return ans;
	    }
	 
	//6
	 //O(k2 logk)
	 //Merge k Sorted Arrays 
	 public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
	    {
	ArrayList<Integer>a=new ArrayList<Integer>();
	PriorityQueue<int[]>pq=new PriorityQueue<int[]>(
			new Comparator<int[]>() {
				public int compare(int[]a,int []b)
				{
					if(a[1]>b[1])return 1;
					else return -1;
				}
			}
			);
	for(int i=0;i<K;i++)
	{pq.add(new int[] {i,arr[i][0],0});}
	
while(!pq.isEmpty())
{
int g[]=pq.remove();
a.add(g[1]);
int j=g[2];
if(j+1<K) {
g[1]= arr[g[0]][j+1];
g[2]=j+1;
pq.add(g);}
}
	return a;
	    }
	 //7
	 //Merge two binary Max heaps
	 //O(nlogn)
	 public int[] mergeHeaps(int[] a, int[] b, int n, int m) {
		    int ans[]=new int[m+n];
		    int j=0,k=0;
		    for(int i=0;i<n;i++)
		    {ans[i]=a[i];}
		    for(int i=n;i<n+m;i++)
		    {ans[i]=b[i-n];}
		n=n+m;
		for(int i=n/2;i>=0;i--)
		{merge(ans,n,i);}
		   // for(int x:ans)System.out.print(x+" ");
		    return ans;
		    }
		    public void merge(int a[],int n,int i)
		    {
		        if(i>=n)return ;
		        int l=i*2+1;
		        int r=i*2+2;
		        int max=i;
		        if(l<n&&a[l]>a[i])max=l;
		        if(r<n&&a[r]>a[max])max=r;
		        if(i!=max)
		        {
		            int t=a[i];
		            a[i]=a[max];
		            a[max]=t;
		            merge(a,n,max);
		        }
		        
		    }
	 //8
	 //O(n^2 log k)
	 //K-th Largest Sum Contiguous Subarray
	 public static void kthlargest(int arr[],int n,int k)
	 {
		 int sum[]=new int[n+1];
		 sum[0]=0;
		 sum[1]=arr[0];
		 for(int i=1;i<=n;i++)
		 {sum[i]=sum[i-1]+arr[i];}
PriorityQueue<Integer>pq=new PriorityQueue<Integer>();
		 for(int i=1;i<=n;i++)
{
  for(int j=i;j<=n;j++)
  {
	  int x=sum[j]-sum[i-1];
	  if(pq.size()<k)
	  {
		  pq.add(x);
	  }
	  else {
		  if(pq.peek()<x) {pq.poll();pq.add(x);}
	  }
  }
}
System.out.println(pq.remove());
	 }
	 
	 
	 //9
	// same as //O(nklogk)
	//767. Reorganize String
		 //same as 34 of string
	 
	 //10
	 //merge k sorted linked list
	 // same as linked list 31
	 
	 //13
	 //Is Binary Tree Heap
	 class Node{
		    int data;
		    Node left,right;
		    Node(int d){
		        data=d;
		        left=right=null;
		    }
		}
	 boolean isHeap(Node tree)
	    {   int count=countNodes(tree);
	        if(!complete(tree,0,count))return false;
	        return isHeaps(tree);
	    }
	    boolean complete(Node tree,int i,int c)
	    {
	        if(tree==null)return true;
	        if(i>=c)return false;
	        return complete(tree.left,i*2+1,c)&&complete(tree.right,i*2+2,c);
	    }
	        int countNodes(Node tree)
	        {
	            if(tree==null)return 0;
	            return 1+countNodes(tree.left)+countNodes(tree.right);
	        }
	        
	    boolean isHeaps(Node tree) {
	    if(tree==null||(tree.left==null&&tree.right==null))return true;
	    if(tree.left!=null&&tree.left.data>tree.data)return false;
	    if(tree.right!=null&&tree.right.data>tree.data)return false;
	    return isHeaps(tree.left)&&isHeaps(tree.right);
	    }
	 //14
	 //Minimum Cost of ropes
	 //O(NLOGN) O(n)
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
	 //15
   //Convert BST to Min Heap
	    private static void bstToArray(Node root, ArrayList<Integer> arr){
	        if(root==null)return;
	            bstToArray(root.left, arr);
	            arr.add(root.data);
	            bstToArray(root.right, arr);
	    }
	    static int  index = 0;
	    private static void arrToMinHeap(Node root, ArrayList<Integer> arr){
	        if(root== null) return;
	        root.data = arr.get(index++);
	        arrToMinHeap(root.left, arr);
	        arrToMinHeap(root.right, arr);
	 }
	    static void convertToMinHeap(Node root)
	    {
	        ArrayList<Integer> arr = new ArrayList<Integer>();
	        bstToArray(root, arr);
	        arrToMinHeap(root,arr);
	     }
	  //16
	    //convert min heap to max heap
	    //O(n)
	    //G fact=>
	    //THEORY IMP
//	    The logic does not produce a tight bound—it overestimates the complexity of each heapify. If built from the bottom up, insertion (heapify) can be much less than O(log(n)).
//
//	    The process is as follows:
//
//	    ( Step 1 ) The first n/2 elements go on the bottom row of the heap. h=0, so heapify is not needed.
//
//	    ( Step 2 ) The next n/2² elements go on row 1 up from the bottom. h=1, heapify filters 1 level down.
//
//	    ( Step i ) The next n/(2^i) elements go in row i up from the bottom. h=i, heapify filters i levels down.
//
//	    ( Step log(n) ) The last n/(2^log2(n)) = 1 element goes in row log(n) up from the bottom. h=log(n), heapify filters log(n) levels down.
//
//	    Note: After step one, 1/2 of the elements (n/2) are already in the heap, and we didn't even need to call heapify once. Also, notice that only a single element, the root, actually incurs the full log(n) complexity.
	    
	    public int[] convert(int[] ans) {
			int n=ans.length;
		for(int i=n/2-2;i>=0;i--)
		{merg(ans,n,i);}
		   // for(int x:ans)System.out.print(x+" ");
		    return ans;
		    }
		    public void merg(int a[],int n,int i)
		    {
		        if(i>=n)return ;
		        int l=i*2+1;
		        int r=i*2+2;
		        int max=i;
		        if(l<n&&a[l]>a[i])max=l;
		        if(r<n&&a[r]>a[max])max=r;
		        if(i!=max)
		        {
		            int t=a[i];
		            a[i]=a[max];
		            a[max]=t;
		            merg(a,n,max);
		        }
		        
		    }    
	 //17
	 //rearrange the characters of s so that any two adjacent characters are not the same.
	 //same as 34 of string
	 //its heap sol is almost same as this one
	 public String reorganizeString(String S) {
	        if (S == null || S.length() == 1) return S;
	        Map<Character, Integer> dic = new HashMap<>();
	        char maxChar = S.charAt(0);
	        int L = S.length();
	               for (char c: S.toCharArray()) {
	            dic.put(c, dic.getOrDefault(c, 0) +1);
	            if (dic.get(c) > dic.get(maxChar)) {
	                maxChar = c;
	            }
	        }
	        if (dic.get(maxChar) > (L+1)/2) return "";
	        int idx = 0;
	        char[] ret = new char[L];
	                while (idx < L && dic.get(maxChar) > 0) {
	            ret[idx] = maxChar;
	            dic.put(maxChar, dic.get(maxChar)-1);
	            idx +=2;
	        }
	        for (Character c: dic.keySet()) {
	            while (dic.get(c) > 0) {
	                if (idx >= L) idx = 1;
	                ret[idx] = c;
	                dic.put(c, dic.get(c)-1);
	                idx += 2;
	            }
	        }
	        return new String(ret);
	    }
//18
	 //Min sum formed by digits 
	 public static long minSum(int arr[], int n)
	    {
	        PriorityQueue<Integer>pq=new PriorityQueue<Integer>();
	        for(int h:arr)pq.add(h);
	        long a=0,b=0;
	        while(!pq.isEmpty())
	        {
	            if(a==0){a=a+pq.remove();}else{a=a*10+pq.remove();}
	            if(!pq.isEmpty()){
	                if(b==0){b=b+pq.remove();}else{b=b*10+pq.remove();}
	            }
	        }
	        return (long)(a+b);
	    }
}
