package BST;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Stack;
public class t234to255 {
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	  }
  class Node
  {
      int data;
      Node left, right,next;

      Node(int item)
      {
          data = item;
          left = right = next = null;
      }
  }
	public static void main(String[] args) {

	}
//1. Searching a node in bst
	// O(logn)
    boolean search(Node root, int k) {
        if(root==null)return false;
        if(root.data==k)return true;
        if(root.data>k)return search(root.left,k);
        if(root.data<k)return search(root.right,k);
    
        return false;
    }
   // ** inserting a node in bst
    //O(logn)
    public TreeNode insertIntoBST(TreeNode root, int k) {
        if(root==null){TreeNode x= new TreeNode(k);return x;}
        if(root.val>k){root.left=insertIntoBST(root.left,k);}
        if(root.val<k){root.right=insertIntoBST(root.right,k);}
    return root;
    }
//2
    // delete a node
    //O(H)
    public TreeNode deleteNode(TreeNode root, int k) {
        if(root==null)return null;
        
        if(root.val==k){
            if(root.left==null&&root.right==null)return null;
            else if(root.left==null)return root.right;
            else if(root.right==null)return root.left;
            else{
                TreeNode temp=root.right;
                TreeNode ans=null;
                  while(temp.left!=null)temp=temp.left;
                 ans=temp;
                root.val=ans.val;
                root.right=deleteNode(root.right,root.val);
                
                return root;
            }
        }
        else if(root.val>k){root.left=deleteNode(root.left,k);}
          else if(root.val<k){root.right=deleteNode(root.right,k);}
return root;
    }
//3
    //Min value in bst
   //O(H)
    int minValue(Node node) {
        int i=-999,j=99999;
        Node temp=node;
        while(temp.left!=null){temp=temp.left;}i=temp.data;
        return i;
    }
    //4
//Predecessor and Successor 
    //O(n)
    class Res
    {
        Node pre = null;
        Node succ = null;
    }
    public static void findPreSuc(Node root, Res p, Res s, int key)
    {          if(root==null)return ;
        findPreSuc(root.left,p,s,key);
        if(root.data<key){p.pre=root;}
        if(s.succ==null&&root.data>key){s.succ=root;}
        if(s.succ!=null)return;
        findPreSuc(root.right,p,s,key);
        
    }

    //5
    //Find TREE is BST or not
    //O(n)
    boolean flag;
    boolean isBST(Node root)
    {flag=true;
        inordersd(root,null);
return flag;         
    }
    public Node inordersd(Node root, Node prev)
    {
        if(root==null)return prev;
         prev=inordersd(root.left,prev);
        if(prev!=null){if(prev.data>=root.data){flag=false;return prev;}}prev=root;
        prev=inordersd(root.right,prev);
        return prev;
    }
    //6
    //Populate Inorder Successor for all nodes
    //O(n)
    public void populateNext(Node root){
        inord(root,null);
       }
        public Node inord(Node root, Node prev)
       {
           if(root==null)return prev;
            prev=inord(root.left,prev);
           if(prev!=null){prev.next=root;}prev=root;
           prev=inord(root.right,prev);
           return prev;
       }
    //7
 //   LCA of 2 nodes in BST
   //O(H)
    Node LCA(Node root, int n1, int n2)
	{
if(root==null)return null;
if(root.data==n1||root.data==n2)return root;
if(root.data<n1&&root.data<n2){return LCA(root.right,n1,n2);}
else if(root.data>n1&&root.data>n2){return LCA(root.left,n1,n2);}
return root;
    }
    //8
    //Construct bst from preorder
    //O(n2)

class Index {int index = 0;}
    Index index = new Index();
    Node constructTreeUtil(int pre[], Index preIndex,int low, int high, int size)
    {
        if (preIndex.index >= size || low > high) return null;
 
        Node root = new Node(pre[preIndex.index]);
        preIndex.index = preIndex.index + 1;
        if (low == high) return root;
      
        int i;
        for (i = low; i <= high; ++i) if (pre[i] > root.data)break;
          
      	root.left = constructTreeUtil(pre, preIndex, preIndex.index, i - 1, size);
        root.right = constructTreeUtil(pre, preIndex, i,high, size);
        return root;
    }
 Node constructTrees(int pre[], int size)
    {       return constructTreeUtil(pre, index, 0, size - 1,size);}
//O(N) stack method
 //BST Q 19
 
 //9
    //Binary tree to BST
    class Car implements Comparator<Node> {
		public int compare(Node a,Node b)
		{
			if(a.data<b.data)return -1;
			if(a.data>b.data)return 1;
			return 0;
		}
	}
    Node binaryTreeToBST(Node root)
    {  
    	ArrayList<Node>a=new ArrayList<Node>();
    	setTheNodes(root,a);
    	Collections.sort(a,new Car());
    	return findout2(a,0,a.size()-1);
    }
    public  void setTheNodes(Node root,ArrayList<Node>a)
    {
    	if(root==null)return;
    	setTheNodes(root.left,a);
    	a.add(root);
    	setTheNodes(root.right,a);
    }
    public  Node findout2(ArrayList<Node>a,int i,int j)
    {
    	if(i>j)return null;
    	
    		int mid=(i+j)/2;
    		Node root=a.get(mid);
    		root.left=findout2(a,i,mid-1);
    		root.right=findout2(a,mid+1,j);
    		return root;
    }
    //10
    //Convert a normal BST to Balanced BST
    //1382. Balance a Binary Search Tree
    //O(n)
    public static TreeNode convert(TreeNode root)
    {
    	ArrayList<TreeNode>a=new ArrayList<TreeNode>();
    	setTheNodes(root,a);
    	return findout(a,0,a.size()-1);
    }
    public static void setTheNodes(TreeNode root,ArrayList<TreeNode>a)
    {
    	if(root==null)return;
    	setTheNodes(root.left,a);
    	a.add(root);
    	setTheNodes(root.right,a);
    }
    public static TreeNode findout(ArrayList<TreeNode>a,int i,int j)
    {
    	if(i>j)return null;
    	
    		int mid=(i+j)/2;
    		TreeNode root=a.get(mid);
    		root.left=findout(a,i,mid-1);
    		root.right=findout(a,mid+1,j);
    		return root;
    }
  //11
    //Merge 2 Bsts
    Node MergeTrees(Node n1,Node m1)
    {
    	ArrayList<Node>a= new ArrayList<Node>();
    	ArrayList<Node>b= new ArrayList<Node>();
        inorder(n1,a);inorder(m1,b);
        ArrayList<Node> c=merge(a,b);
        return find(c,0,c.size()-1);
    }
    void inorder(Node x ,ArrayList<Node>a)
    {
    	if(x==null)return;
    inorder(x.left,a);
    a.add(x);
    inorder(x.right,a);
    }
    ArrayList<Node> merge(ArrayList<Node>a,ArrayList<Node>b)
    {
    	if(a.size()==0)return b;if(b.size()==0)return a;
    	ArrayList<Node>c= new ArrayList<Node>();
    	int i=0,j=0;
    	while(i<a.size()&&j<b.size())
    	{
    		if(a.get(i).data<b.get(j).data)
    		{c.add(a.get(i));i++;}
    		else {c.add(b.get(j));j++;}
    	}
    	while(i<a.size())
    	{c.add(a.get(i));i++;}
    	while(j<b.size())
    	{c.add(b.get(j));j++;}
    	return c;
    }
    public Node find(ArrayList<Node>a,int i,int j)
    {
    	if(i>j)return null;
    	
    		int mid=(i+j)/2;
    		Node root=a.get(mid);
    		root.left=find(a,i,mid-1);
    		root.right=find(a,mid+1,j);
    		return root;
    }
//12
    //find kth largest element in bst 
    private int x,ans;
    public int kthLargest(Node root,int k)
    { x=k;ans=0;
     inorder(root);
        return ans;
    }
    public void inorder(Node root)
    {
        if(root==null)return ;
 
       inorder(root.right);
           x--;if(x==0){ans=root.data;return;}
       inorder(root.left);
    }
    //13
  //find kth smallest element in bst 
    public int KthSmallestElement(Node root,int k)
    { x=k;ans=0;
     inorders(root);
        return x>0?-1:ans;
    }
    public void inorders(Node root)
    {
        if(root==null)return ;
 
       inorders(root.left);
           x--;if(x==0){ans=root.data;return;}
           if(x<0)return;
       inorders(root.right);
    }
    //14
    //Count pairs from 2 bst whose sum is equal to x
    //O(n)
    static int anss;
    public static int countPairs(Node root1, Node root2, int x)
    	{ anss=0;
    	HashSet<Integer>h= new HashSet<Integer>();
    	    inorder(root1,h);
            inorder(root2,h,x);
    return anss;
    	}
    	public static void inorder(Node root,HashSet<Integer>h)
    	{if(root==null)return;
    	inorder(root.left,h);
    	h.add(root.data);
    	inorder(root.right,h);
    	}
    	public static void inorder(Node root,HashSet<Integer>h,int x)
    	{if(root==null)return;
    	inorder(root.right,h,x);
        if(h.contains(x-root.data)){anss++;}
    	inorder(root.left,h,x);
    	}
    	//15
//Find median of BST in O(n) time and O(1) space
    	//O(n) O(1)
static int counNodes(Node root)
{ Node current, pre;
 int count = 0;
  if (root == null)       return count;
     current = root;
    while (current != null)
    {       if (current.left == null)   {count++; current = current.right;}
           else
           {pre = current.left;
                while (pre.right != null && pre.right != current)pre = pre.right;
            if(pre.right == null)
            {   pre.right = current; current = current.left;}
            else
            {   pre.right = null;count++;
                current = current.right;
            } /* End of if condition pre->right == NULL */
        } /* End of if condition current->left == NULL*/
    } /* End of while */
    return count;
}
 static int findMedian(Node root)
{if (root == null)       return 0;
    int count = counNodes(root);
    int currCount = 0;
    Node current = root, pre = null, prev = null;
    while (current != null)
    {        if (current.left == null)   {
            currCount++;
         if (count % 2 != 0 && currCount == (count+1)/2)     return prev.data;
    else if (count % 2 == 0 && currCount == (count/2)+1)   return (prev.data + current.data)/2;
            prev = current;
            current = current.right;
        }
        else
        {   pre = current.left;
            while (pre.right != null && pre.right != current) pre = pre.right;
            if (pre.right == null){pre.right = current;   current = current.left;}
            else
            {   pre.right = null;prev = pre;
                currCount++;
                if (count % 2 != 0 && currCount == (count+1)/2 ) return current.data;
                else if (count%2==0 && currCount == (count/2)+1) return (prev.data+current.data)/2;
                prev = current;  current = current.right;
            } /* End of if condition pre->right == NULL */
        } /* End of if condition current->left == NULL*/
    } /* End of while */
    return -1;
}
    	//16
//    	/Count BST nodes that lie in a given range
//O(n)
    	//    	  static int anss;
    	    int getCount(Node root,int l, int h)
    	    {anss=0;    inorder(root,l,h);return anss;}
    	public static void inorder(Node root,int l,int h)
    	    	{if(root==null)return;
    	    	inorder(root.left,l,h);
    	    if(root.data>=l&&root.data<=h){anss++;}
    	    	inorder(root.right,l,h);
    	    	}
    //O(H+K)
    	int getCount2(Node node, int low, int high)
        {
            if(node == null)  return 0;
            if(node.data >= low && node.data <= high)
                return 1 + getCount2(node.left, low, high)+
                    getCount2(node.right, low, high);
             else if(node.data < low)
                return this.getCount(node.right, low, high);
             else
                return this.getCount(node.left, low, high);    
        }
    	//17
    	// Replace every element with the least greater element on its right
    	//O(n2)
    	 Node root,succ;
         Node insert(Node node, int data)
    	{
    	    if (node == null)node = new Node(data);
    	    if (data < node.data)
    	    {   succ = node; node.left = insert(node.left, data);}
    	    else if (data > node.data)  node.right = insert(node.right, data);
    	    return node;
    	}
    	 void replace(int arr[], int n)
    	{
    		for(int i = n - 1; i >= 0; i--)
    	    {    succ = null;
    	        root = insert(root, arr[i]);
    	 if (succ != null)
    	            arr[i] = succ.data;
    	        else   arr[i] = -1;
    	    }
    	}
    	 //18
    	 //Given n appointments, find all conflicting appointments
    	 //O(Nlogn)
    	 static class Interval{int low, high;}
    	 static class ITNode{Interval i;int max;ITNode left, right;}
    	 static Interval newNode(int l, int h)
    	 {Interval temp = new Interval();
    	     temp.low = l;temp.high = h;
    	     return temp;
    	 }
    	 static ITNode newNode(Interval i)
    	 { ITNode temp = new ITNode();
    	     temp.i = i;temp.max = i.high;
    	     temp.left = temp.right = null;
    	     return temp;
    	 }
    	 static ITNode insert(ITNode root, Interval i)
    	 {if (root == null)return newNode(i);
    	     int l = root.i.low;
    	     if (i.low < l)    root.left = insert(root.left, i);
    	     else root.right = insert(root.right, i);
    	     if (root.max < i.high)       root.max = i.high;
    	     return root;
    	 }
    	 static boolean doOVerlap(Interval i1, Interval i2)
    	 {if (i1.low < i2.high && i2.low < i1.high)return true;
    	     return false;
    	 }
    	 static Interval overlapSearch(ITNode root,Interval i)
    	 {  if (root == null)   return null;
    	     if (doOVerlap(root.i, i))return root.i;
    	     if (root.left != null &&root.left.max >= i.low)
    	         return overlapSearch(root.left, i);
    	     return overlapSearch(root.right, i);
    	 }
    	 static void printConflicting(Interval appt[], int n)
    	 {   ITNode root = null;
    	     root = insert(root, appt[0]);
    	     for(int i = 1; i < n; i++)
    	     {
    	         Interval res = overlapSearch(root, appt[i]);
    	         if (res != null)
    	             System.out.print("[" + appt[i].low +
    	                              "," + appt[i].high +
    	                              "] Conflicts with [" +
    	                              res.low + "," +
    	                              res.high + "]\n");
    	         root = insert(root, appt[i]);
    	     }
    	 }
    	//19
    	//Check preorder is valid or not
    	public  Node constructTree(int pre[], int n) 
    	{Node root=new Node(pre[0]);
    	Stack<Node>s= new Stack<Node>();s.add(root);
    	for(int i=1;i<n;i++)
    	{
    	    Node temp=null;
    	    while(!s.isEmpty()&&pre[i]>s.peek().data)temp=s.pop();
    	Node m=new Node(pre[i]);
    	    if(temp==null){s.peek().left=m;}
    	    else{temp.right=m;}
    	s.push(m);
    	}
    	return root;
    	}
    	//20
    	//Check whether BST contains Dead End
    	//O(n) O(N)
    	static boolean flags=false;
    	 public static boolean isDeadEnd(Node root)
    	 {
    	 HashSet<Integer> h= new HashSet<Integer>();
    	 ino(root,h);return flags;
    	 }
    	 public static void ino(Node root,HashSet<Integer> h)
    	 {
    	     if(root==null)return ;
    	     if(!(root.left==null&&root.right==null)){h.add(root.data);}
    	     ino(root.left,h);
    	     if(root.left==null&&root.right==null)
    	     {
    	         if(root.data==1&&h.contains(2)){flags=true;return;}
    	         if(h.contains(root.data-1)&&h.contains(root.data+1)){System.out.print(root.data);flags=true;return ;}
    	     }
    	     ino(root.right,h);
    	 }
    	 //O(N) O(1)
    	  public static boolean isDeadEnd2(Node root)
    	    {
    	        return isDeadEnd(root,1,Integer.MAX_VALUE);
    	    }
    	     
    	    public static boolean isDeadEnd(Node root,int min,int max)
    	    {
    	     if(root==null)return false;
    	     if(min==max)return true;
    	     return isDeadEnd(root.left,min,root.data-1)||isDeadEnd(root.right,root.data+1,max);
    	    }
    	    //21
    	    //Largest BST in a Binary Tree
    	    //O(n2)
    	    int largestBST(Node root)
    	    {
    	        if (root == null)
    	            return 0;
    	 
    	        if (isBST(root))
    	            return size(root);
    	 
    	        return Math.max(largestBST(root.left),
    	                        largestBST(root.right));
    	    }
    	    //*** this thing is imp how to find size with global variable
    	    int size(Node node)
    	    {
    	        if (node == null)
    	            return 0;
    	        else
    	            return(size(node.left) + 1 + size(node.right));
    	    }
    	    //O(n)
    	    class Node1
    	    
    	    {   boolean isBst;
    	        int size;
    	        int mini;
    	        int maxi;
    	        public Node1(boolean isBst,int size,int mini,int maxi)
    	        {
    	            this.isBst = isBst;
    	            this.size = size;
    	            this.mini = mini;
    	            this.maxi = maxi;
    	        }
    	    }
    	    class Solution{
    	        
    	         Node1 bst(Node root)
    	        {   Node1 x;
    	            if(root == null)
    	            {  x = new Node1(true,0,1000000,0);   return x;}
    	            Node1 left = bst(root.left);
    	            Node1 right = bst(root.right);
    	            if(left.isBst && right.isBst && root.data > left.maxi && root.data < right.mini)
    	       x = new Node1(true,1+left.size+right.size,Math.min(root.data,left.mini),Math.max(root.data,right.maxi));
    	            else   x = new Node1(false,Math.max(left.size,right.size),1000000,0);
    	            return x;
    	        }
    	         int largestBst(Node root){ return bst(root).size;}
    	    }
    	//22
    //Flatten a bst to dll
    public Node flatten(Node root) {
    	Node d= new Node(-1);
    	Node prev=d;
    	inorde(root,prev);Node ans=d.right;
    	prev.left=null;
    	prev.right=null;
    return ans;
    }
    public void inorde(Node root,Node prev)
    {
    	if(root==null)return ;
    inorde(root.left,prev);
    prev.left=null;
    prev.right=root;prev=root;
    inorde(root.right,prev);
    }
}