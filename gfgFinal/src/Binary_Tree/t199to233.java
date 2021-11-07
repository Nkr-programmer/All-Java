package Binary_Tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Stack;

public class t199to233 {

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
	      Node left, right;

	      Node(int item)
	      {
	          data = item;
	          left = right = null;
	      }
	  }
	public static void main(String[] args) {
		//27
        Graph g1 = new Graph(5);
        g1.addEdge(1, 0);
        g1.addEdge(0, 2);
        g1.addEdge(0, 3);
        g1.addEdge(3, 4);
        if (g1.isTree())
            System.out.println("Graph is Tree");
        else
            System.out.println("Graph is not Tree");
	}

	//1
	//Level Order transversal
	//O(n) O(n)
    static ArrayList <Integer> levelOrder(Node root) 
    {
        if(root==null)return new ArrayList<Integer>();
        ArrayList<Integer>a= new ArrayList<Integer>();
        Queue<Node>q= new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty())
        {
            Node curr=q.remove();a.add(curr.data);
            if(curr.left!=null){q.add(curr.left);}
            if(curr.right!=null){q.add(curr.right);}
        }
        return a;
    }
//102 Leetcode
	  public List<List<Integer>> levelOrder(TreeNode root) {
		  
	        List<List<Integer>>a= new ArrayList();
	        if(root==null) return a;
	        Queue<TreeNode>q= new LinkedList<TreeNode>();
	        q.add(root);
	        while(!q.isEmpty())
	        {
	            int n=q.size();
	         ArrayList<Integer>temp=new ArrayList<Integer>();
	         for(int i=0;i<n;i++){
	            TreeNode curr=q.remove();temp.add(curr.val);
	            if(curr.left!=null){q.add(curr.left);}
	            if(curr.right!=null){q.add(curr.right);}    
	         }
	           a.add(temp);
	        }
	        return a;
	    }
//2
//Reverse Level oorder transversal
//O(n) O(n)
	  public ArrayList<Integer> reverseLevelOrder(Node root) 
	    {
	        if(root==null)return new ArrayList<Integer>();
	        ArrayList<Integer>a= new ArrayList<Integer>();
	        Queue<Node>q= new LinkedList<Node>();
	        q.add(root);
	        while(!q.isEmpty())
	        {
	            Node curr=q.remove();a.add(0,curr.data);
	            if(curr.right!=null){q.add(curr.right);}
	            if(curr.left!=null){q.add(curr.left);}
	        }
	        return a;
	    }
//107 leetcode

public List<List<Integer>> levelOrder2(TreeNode root) {

List<List<Integer>>a= new ArrayList();
if(root==null) return a;
Queue<TreeNode>q= new LinkedList<TreeNode>();
q.add(root);
while(!q.isEmpty())
{
    int n=q.size();
 ArrayList<Integer>temp=new ArrayList<Integer>();
 for(int i=0;i<n;i++){
    TreeNode curr=q.remove();temp.add(curr.val);
    if(curr.left!=null){q.add(curr.left);}
    if(curr.right!=null){q.add(curr.right);}    
 }
   a.add(0,temp);
}
return a;
}
//another approach
public List<List<Integer>> levelOrderBottom(TreeNode root) {
      int d=maxdepth(root);
       List<List<Integer>> a= new ArrayList<>();
     if(root==null)return a;  
   for(int i=0;i<d;i++)
       {a.add(0,new ArrayList());}
       inordef(a,root,d-1);
	        return a;
  }
	private void inordef(List<List<Integer>> a, TreeNode root,int x) {
if (root != null) { 
      	inordef(a,root.left,x-1); 
      	a.get(x).add(root.val);
          inordef(a,root.right,x-1); 
      } 
}
int maxdepth(TreeNode root) {
		if (root == null)
			return 0;
		else {
			int lheight = maxdepth(root.left);
			int rheight = maxdepth(root.right);
			if (lheight > rheight)return (lheight + 1);
			else return (rheight + 1);
		}}
//3
//Height of tree
//O(n) O(n) 
int height(Node root) 
{
    if(root==null)return 0;
    int left=height(root.left)+1;
    int right=height(root.right)+1;
return Math.max(left,right);
}
//4
//Diameter of binary Tree
//O(n) O(n)
int max=0;
int diameter(Node root) {
    height(root);
    return max-1;
}
int heights(Node root) 
{
if(root==null)return 0;
int left=heights(root.left)+1;
int right=heights(root.right)+1;
 max= Math.max(max,left+right);
return Math.max(left,right);
}
//5
//Mirror and create a new tree
//O(n) O(n)
Node create(int data) {
	Node root= new Node(data);
	root.left=null;root.right=null;
	return root;}
Node mirror(Node root)
{
	if(root==null)return null;
Node r=create(root.data);
r.right=mirror(root.left);
r.left=mirror(root.right);
return r;
}
// mirror the same tree
Node mirrorify(Node root)
{
	if(root==null)return null;
Node l=mirrorify(root.left);
Node r=mirrorify(root.right);
root.left=r;root.right=l;
return root;
}
//101 check is Mirrored
boolean check(Node x)
{
if(x==null)return true;
return symm(x.left,x.right);
}
boolean symm(Node left,Node right)
{
if(left==null&&right==null)return true;
if(left==null||right==null)return true;
if(left.data!=right.data) {return false;}
return symm(left.left,right.right)&&symm(left.right,right.left);
}
//6
//Inorder in both recursive and iterative
public static void inorder(Node root) 
{
if(root==null)return;
inorder(root.left);
System.out.println(root.data);
inorder(root.right);
}
//iterative
public static void inorder1(Node root) 
{
if(root==null)return;
Stack<Node>s= new Stack<Node>();
Node curr=root;
while(curr!=null||!s.isEmpty())
{
if(curr!=null) {s.push(curr);curr=curr.left;}
else {curr=s.pop();System.out.println(curr.data);curr=curr.right;}
}
}
//7
//preorder in both recursive and iterative
public static void preorder(Node root) 
{
if(root==null)return;
System.out.println(root.data);
inorder(root.left);
inorder(root.right);
}
//iterative
public static void preorder1(Node root) 
{
if(root==null)return;
Stack<Node>s= new Stack<Node>();
Node curr=root;s.push(curr);
while(!s.isEmpty())
{    curr=s.pop();
	System.out.println(curr.data);
if(curr.right!=null) {s.push(curr.right);}
if(curr.left!=null) {s.push(curr.left);}
}
}
//8
//postorder in both recursive and iterative
public static void postorder(Node root) 
{
if(root==null)return;
inorder(root.left);
inorder(root.right);
System.out.println(root.data);
}
//iterative
public static void postorder1(Node root) 
{
if(root==null)return;
Stack<Node>s= new Stack<Node>();
Node curr=root;s.push(curr);
while(!s.isEmpty())
{    curr=s.pop();
	System.out.println(curr.data);
if(curr.left!=null) {s.push(curr.left);}
if(curr.right!=null) {s.push(curr.right);}
}
}
//9
//Left View
//O(N) O(N)
public static ArrayList<Integer> leftView(Node root)
{
    ArrayList<Integer>a=new ArrayList<Integer>();
inorder(root,0,a);
return a;
}
public static void inorder(Node root,int i,ArrayList<Integer>a) 
{
if(root==null)return;
if(a.size()==i)a.add(root.data);
inorder(root.left,i+1,a);
inorder(root.right,i+1,a);
}
//10
//Right view
//O(n) O(N)
ArrayList<Integer> rightView(Node root)
{
    ArrayList<Integer>a=new ArrayList<Integer>();
inorder1(root,0,a);
return a;
}
public static void inorder1(Node root,int i,ArrayList<Integer>a) 
{
if(root==null)return;
if(a.size()==i)a.add(root.data);
inorder1(root.right,i+1,a);
inorder1(root.left,i+1,a);
}
//11
//Top View of Binary Tree 
//O(n) O(n)
static class pair{
    int v;
    Node node;
    pair(int v,Node node){this.v=v;this.node=node;}
}
static ArrayList<Integer> topView(Node root)
{
HashMap<Integer,Node>h= new HashMap<Integer,Node>();
Queue<pair>q= new LinkedList<pair>();
ArrayList<Integer>a= new ArrayList<Integer>();
q.add(new pair(0,root));int m=10000;
while(!q.isEmpty()){
 pair x= q.remove();int p=x.v;Node r= x.node;
 m=Math.min(m,p);
 if(!h.containsKey(p)){h.put(p,r);}
 if(r.left!=null){q.add(new pair(p-1,r.left));}
 if(r.right!=null){q.add(new pair(p+1,r.right));}
}
while(h.containsKey(m)){a.add(h.get(m).data);m++;}
return a;
}
//12
//Bottom view 
//O(n) O(n)
 static ArrayList<Integer> bottomView(Node root)
{
HashMap<Integer,Node>h= new HashMap<Integer,Node>();
Queue<pair>q= new LinkedList<pair>();
ArrayList<Integer>a= new ArrayList<Integer>();
q.add(new pair(0,root));int m=10000;
while(!q.isEmpty()){
pair x= q.remove();int p=x.v;Node r= x.node;
m=Math.min(m,p);
h.put(p,r);
if(r.left!=null){q.add(new pair(p-1,r.left));}
if(r.right!=null){q.add(new pair(p+1,r.right));}
}
while(h.containsKey(m)){a.add(h.get(m).data);m++;}
return a;
}
 //Vertical Order

 //  WORKING ONE BUT with LIST<List>
// static class pairs{
//	    int v;
//	    TreeNode node;
//	    pairs(int v,TreeNode node){this.v=v;this.node=node;}
//	} 
// public List<List<Integer>> verticalTraversal(TreeNode root) {
//HashMap<Integer,List<Integer>>h= new HashMap<Integer,List<Integer>>();
//Queue<pairs>q= new LinkedList<pairs>();
//List<List<Integer>>a= new ArrayList();
//q.add(new pairs(0,root));int m=10000;
//while(!q.isEmpty()){
//pairs x= q.remove();int p=x.v;TreeNode r= x.node;
//m=Math.min(m,p);
//if(!h.containsKey(p)){List<Integer>b= new ArrayList<Integer>();b.add(r.val);   h.put(p,b);}
//   else{h.get(p).add(r.val);}
//if(r.left!=null){q.add(new pairs(p-1,r.left));}
//if(r.right!=null){q.add(new pairs(p+1,r.right));}
//}
//while(h.containsKey(m)){a.add(h.get(m));m++;}
//return a;
//}
 static class pairs{
	    int v;
	    Node node;
	    pairs(int v,Node node){this.v=v;this.node=node;}
	} 
 static ArrayList <Integer> verticalOrder(Node root){
HashMap<Integer,List<Integer>>h= new HashMap<Integer,List<Integer>>();
Queue<pairs>q= new LinkedList<pairs>();
ArrayList<Integer>a= new ArrayList<Integer>();
q.add(new pairs(0,root));int m=10000;
while(!q.isEmpty()){
pairs x= q.remove();int p=x.v;Node r= x.node;
m=Math.min(m,p);
if(!h.containsKey(p)){List<Integer>b= new ArrayList<Integer>();b.add(r.data);   h.put(p,b);}
else{h.get(p).add(r.data);}
if(r.left!=null){q.add(new pairs(p-1,r.left));}
if(r.right!=null){q.add(new pairs(p+1,r.right));}
}
while(h.containsKey(m)){a.addAll(h.get(m));m++;}
return a;
}


//13
//Zig Zag Taversal
//O(n) O(N)
ArrayList<Integer> zigZagTraversal(Node root)
{
        ArrayList<Integer>a= new ArrayList<Integer>();
        if(root==null) return a;
        Queue<Node>q= new LinkedList<Node>();
        q.add(root);int level=0;
        while(!q.isEmpty())
        {
            int n=q.size();
            int ii=a.size();
         for(int i=0;i<n;i++){
            Node curr=q.remove();
            if(level%2==1)a.add(ii,curr.data);
            else{a.add(curr.data);}
            if(curr.left!=null){q.add(curr.left);}
            if(curr.right!=null){q.add(curr.right);}    
         }
           level++;
        }
        return a;
    }
//Leetcode 103.  Binary Tree Zigzag Level Order Traversal
public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    
    List<List<Integer>>a= new ArrayList();
    if(root==null) return a;
    Queue<TreeNode>q= new LinkedList<TreeNode>();
    q.add(root);int level=0;
    while(!q.isEmpty())
    {
        int n=q.size();
        int ii=a.size();
        ArrayList<Integer>temp= new ArrayList<Integer>();
     for(int i=0;i<n;i++){
        TreeNode curr=q.remove();
        if(level%2==1)temp.add(0,curr.val);
        else{temp.add(curr.val);}
        if(curr.left!=null){q.add(curr.left);}
        if(curr.right!=null){q.add(curr.right);}    
     }
        a.add(temp);
       level++;
    }
    return a;
}
//14
//check if tree is balanced or not
int h=0;
public boolean isBalanced(TreeNode root) 
     {height(root);
return h==0?true:false;
}
int height(TreeNode root) 
{
if(root==null)return 0;
int left=height(root.left)+1;
int right=height(root.right)+1;
if(Math.abs(left-right)>1){h=1;}
return Math.max(left,right);
}
//better
public boolean isBalanced2(TreeNode root) {
    if(root == null){
        return true;
    }
    return helper(root) != -1;
}
private int helper(TreeNode root){
    if(root == null){
        return 0;
    }
    int left = helper(root.left);
    int right = helper(root.right);
    if(left == -1 || right == -1 || Math.abs(left - right) > 1){
        return -1;
    }
    return Math.max(left, right) + 1;
}
//15
//Diagonal Traversal of Binary Tree
public ArrayList<Integer> diagonal(Node root)
{
    ArrayList<Integer>a= new ArrayList<Integer>();
    Queue<Node>q= new LinkedList<Node>();
    q.add(root);
    while(!q.isEmpty())
    {
        Node g=q.remove();
        while(g!=null)
        {
            a.add(g.data);
            if(g.left!=null){q.add(g.left);}
            g=g.right;
        }
    }
    return a;
}
//16
//Boundary Traversal of binary tree  O(n)
ArrayList <Integer> printBoundary(Node root)
{
    if(root==null)return new ArrayList<Integer>();
    ArrayList<Integer>a= new ArrayList<Integer>();
  a.add(root.data);
printleft(root.left,a);
printleaves(root.left,a);
printleaves(root.right,a);
printright(root.right,a);
return a;
}
void	printleft(Node root,ArrayList <Integer>a)
{
     if(root==null)return ;
     if(root.left!=null){a.add(root.data);printleft(root.left,a);}
else   if(root.right!=null){a.add(root.data);printleft(root.right,a);}
}
void	printright(Node root,ArrayList <Integer>a)
{
     if(root==null)return ;
     if(root.right!=null){printright(root.right,a);a.add(root.data);}
else   if(root.left!=null){printright(root.left,a);a.add(root.data);}
}
void	printleaves(Node root,ArrayList <Integer>a)
{
  if(root==null)return;
  printleaves(root.left,a);
	  if(root.left==null&&root.right==null){a.add(root.data);}
  printleaves(root.right,a);
}
//17
///Construct Binary Tree from String with bracket representation
//O(n2)
 int findIndex(String str, int si, int ei)
{  if (si > ei)   return -1;
  Stack<Character> s = new Stack<>();
  for (int i = si; i <= ei; i++)
  { if (str.charAt(i) == '(')   s.add(str.charAt(i));
    else if (str.charAt(i) == ')')
    {
      if (s.peek() == '(')     {s.pop();if (s.isEmpty())return i;}
    }
  }
return -1;
}
 Node treeFromString(String str, int si, int ei)
{
if (si > ei) return null;
Node root = new Node((int)(str.charAt(si) - '0'));
  int index = -1;
  if (si + 1 <= ei && str.charAt(si+1) == '(')
    index = findIndex(str, si + 1, ei);
  if (index != -1)
  {
   root.left = treeFromString(str, si + 2, index - 1);
   root.right  = treeFromString(str, index + 2, ei - 1);
  }
  return root;
}
//O(n)
 int start = 0;
 Node constructTree(String s)
{
 if (s.length() == 0 || s == null)return null;
 if (start >= s.length())return null;
 boolean neg = false;
 if (s.charAt(start) == '-'){neg = true;start++;}
 int num=0;
 while (start < s.length() &&Character.isDigit(s.charAt(start)))
 {
     int digit = Character.getNumericValue(s.charAt(start));
     num = num * 10 + digit;start++;
 }
 if (neg)num = -num;
  Node node = new Node(num);
// for root this is contidion  
 if (start >= s.length())return node;
 
 if (start < s.length() && s.charAt(start) == '(' )
 {start++;node.left = constructTree(s);} 
 if (start < s.length() && s.charAt(start) == ')')
 {start++;return node;}
 
 if (start < s.length() && s.charAt(start) == '(')
 {start++;node.right = constructTree(s);}
 if (start < s.length() && s.charAt(start) == ')')
 {start++;return node;}
 
 return node;
}
//18
//Binary tree to dll
Node root1,prev;
Node bToDLL(Node root)
{ root1=null;   prev=null;inorders(root);return root1;}   
void inorders(Node root) 
{
if(root==null)return;
inorders(root.left);
if(root1==null){root1=root;}root.left=prev;if(prev!=null){prev.right=root;}prev=root;
inorders(root.right);
}
// Better
Node head;
Node bToDLL2(Node root)
{ head=null;  inorde(root);return head;}
Node inorde(Node root)
{
if(root==null)return null;
inorde(root.right);
root.right=head;if(head!=null) {head.left=root;}head=root;
inorde(root.left);
return head;
}
//114. Flatten Binary Tree to Linked List
private TreeNode prevs=null;
public void flatten(TreeNode root) {
  if(root==null)return ;
    flatten(root.right);
    flatten(root.left);
    root.left=null;
    root.right=prevs;
    prevs=root;
}
//19
//Transform to Sum Tree 
public void toSumTree(Node root){toSumTrees(root);}
public int toSumTrees(Node root){
if(root==null)return 0;
int x=toSumTrees(root.left);
int y=toSumTrees(root.right);
int z=root.data;root.data=x+y;

return z+x+y;
}
//20
//Construct BT from in and pre
public TreeNode buildTree(int[] preorder, int[] inorder) {
   	if (inorder == null || preorder == null || inorder.length != preorder.length)
		return null;
	HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
	for (int i=0;i<inorder.length;++i)
		hm.put(inorder[i], i);
	return buildTreePreIn(inorder, 0, inorder.length-1, preorder, 0, 
                          preorder.length-1,hm);
}

private TreeNode buildTreePreIn(int[] inorder, int is, int ie, int[] preorder, int ps, int pe, 
                                 HashMap<Integer,Integer> hm){
	if (ps>pe || is>ie) return null;
	TreeNode root = new TreeNode(preorder[ps]);
	int ri = hm.get(preorder[ps]);
	TreeNode leftchild = buildTreePreIn(inorder, is, ri-1, preorder, ps+1, ps+ri-is, hm);
	TreeNode rightchild = buildTreePreIn(inorder,ri+1, ie, preorder, ps+ri-is+1, pe, hm);
	root.left = leftchild;
	root.right = rightchild;
	return root;
}
//post and in

public TreeNode buildTreee(int[] inorder, int[] postorder) {
	if (inorder == null || postorder == null || inorder.length != postorder.length)
	return null;
HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
for (int i=0;i<inorder.length;++i)
	hm.put(inorder[i], i);
return buildTreePostIn(inorder, 0, inorder.length-1, postorder, 0, 
                      postorder.length-1,hm);
}

private TreeNode buildTreePostIn(int[] inorder, int is, int ie, int[] postorder, int ps, int pe, 
                             HashMap<Integer,Integer> hm){
if (ps>pe || is>ie) return null;
TreeNode root = new TreeNode(postorder[pe]);
int ri = hm.get(postorder[pe]);
TreeNode leftchild = buildTreePostIn(inorder, is, ri-1, postorder, ps, ps+ri-is-1, hm);
TreeNode rightchild = buildTreePostIn(inorder,ri+1, ie, postorder, ps+ri-is, pe-1, hm);
root.left = leftchild;
root.right = rightchild;
return root;
}
//post and pre
int preIndex = 0, posIndex = 0;
public TreeNode constructFromPrePost(int[]pre, int[]post) {
    TreeNode root = new TreeNode(pre[preIndex++]);
    if (root.val != post[posIndex])
        root.left = constructFromPrePost(pre, post);
    if (root.val != post[posIndex])
        root.right = constructFromPrePost(pre, post);
    posIndex++;
    return root;
}
//2way iterative
int preindex;
 Node constructTreeUtil(int pre[], int post[], int l,int h, int size)
{if (preindex >= size || l > h)return null;// all done
Node root = new Node(pre[preindex]);
preindex++;//searching for next element
if (l == h || preindex >= size)return root;//Leaf node
int i;
for (i = l; i <= h; i++)
{if (post[i] == pre[preindex])break;}

if (i <= h){root.left = constructTreeUtil(pre, post, l, i, size);
 root.right = constructTreeUtil(pre, post, i + 1, h-1, size);}

return root;
}
 Node constructTree(int pre[], int post[], int size)
{preindex = 0;return constructTreeUtil(pre, post, 0, size - 1, size);
}

//21
//Min swaps required to convert binary tree into bst
//JUST STORE THE INORDER OF BT  IN ARRAY THEN THIS Q IS SAME AS
//(18) SORTING AND SEARCHING
//O(NlogN)

//22
//Check Binary Tree is sum tree or not
//O(n)
boolean isSumTree(Node root)
{    int ans=traverse(root);
    return ans<0?false:true;}

    int traverse(Node root)
    {
        if(root==null)return 0;
        int x=traverse(root.left);if(x<0)return x;
        int y=traverse(root.right);if(y<0)return y;
        if(root.left==null&&root.right==null)return root.data;
    int h=0,k=0;
        if(root.left!=null){
            if(root.left.left==null&&root.left.right==null){h=x;}
            else{h=2*x;}
        }
        if(root.right!=null){
            if(root.right.left==null&&root.right.right==null){k=y;}
            else{k=2*y;}
        }
        return root.data==h+k?h+k:-1;
    }

//23
//Leaf at same level 
int ans=-1;
boolean checks(Node root)
{	
    return inorder(root,0);
}
boolean inorder(Node root,int i)
{
    if(root==null)return true;
    boolean x=inorder(root.left,i+1);

    if(root.left==null&&root.right==null)
    {if(ans==-1){ans=i;}else{if(ans!=i){return false;}}}
    
    boolean y=inorder(root.right,i+1);
return x&&y;
}
//24
//Duplicate subtree in Binary Tree
public static String dupSubUtil(Node root, HashSet<String> subtrees)
{    String s = "";
    if (root == null)
        return s + '$';
    String lStr = dupSubUtil(root.left,subtrees);if (lStr.equals("")) return "";
    String rStr = dupSubUtil(root.right,subtrees);if (rStr.equals(""))return "";
    s = s + root.data + lStr + rStr;
    if (s.length() > 3 && subtrees.contains(s))       return "";
     subtrees.add(s);
    return s;
}
public static int dupSub(Node root)
{
    HashSet<String> subtrees=new HashSet<>();
    return dupSubUtil(root,subtrees)==""?1:0;
}
//25
//Check if 2 trees are mirror or not
static int checkMirrorTree(int n, int e, int[] A, int[] B) {
    if(e==1){if(A[0]==B[0]&&A[1]==B[1])return 1; else return 0;}
Stack<int[]>a= new Stack<int[]>();
Queue<int[]>b= new LinkedList<int[]>();
for(int i=0;i<2*e;i+=2)
{a.push(new int[]{A[i],A[i+1]});b.add(new int[]{B[i],B[i+1]});
if(i!=((2*e)-2)){if(A[i]==A[i+2]&&A[i+1]==B[i+1]&&A[i+3]==B[i+3]
&&A[i]==B[i]&&A[i+2]==B[i+2])return 0;}
   while(!a.isEmpty()&&!b.isEmpty()&&a.peek()[0]==b.peek()[0]&&a.peek()[1]==b.peek()[1])
    {a.pop();b.remove();}
}
return a.isEmpty()?1:0;
}
//26
//Sum of nodes on longest path root to leaf
public int sumOfLongRootToLeafPath(Node root)
{m=0;
subtree(root,0,0);
return m;
}
int m=0,index=0;
public  int subtree(Node root,int sum,int i) 
{
if(root==null) {return sum;}sum+=root.data;
subtree(root.left,sum,i+1);
index=Math.max(index,i);
if(root.left==null&&root.right==null&&i>index)m=sum;
else if(root.left==null&&root.right==null&&i==index)m=Math.max(m,sum);
subtree(root.right,sum,i+1);

return sum;
}

// If pathsum initial point not necessary to root
int maxValue;

public int maxPathSum(TreeNode root) {
    maxValue = Integer.MIN_VALUE;
    maxPathDown(root);
    return maxValue;
}

private int maxPathDown(TreeNode node) {
    if (node == null) return 0;
    int left = Math.max(0, maxPathDown(node.left));
    int right = Math.max(0, maxPathDown(node.right));
    maxValue = Math.max(maxValue, left + right + node.val);
    return Math.max(left, right) + node.val;
} //27
//Check if a given graph is tree or not
static class Graph
{
  private int V; // No. of vertices
  private LinkedList<Integer> adj[]; //Adjacency List
Graph(int v)
  { V = v;
      adj = new LinkedList[V];
      for (int i=0; i<v; ++i)
          adj[i] = new LinkedList<Integer>();
}
void addEdge(int v,int w)
  {        adj[v].add(w);   adj[w].add(v);}
  boolean isCyclicUtil(int v, boolean visited[], int parent)
  {       visited[v] = true;Integer i;
      Iterator<Integer> it = adj[v].iterator();
      while (it.hasNext())
      {
          i = it.next();
          if (!visited[i])
          {        if (isCyclicUtil(i, visited, v))return true;}
          else if (i != parent)
          return true;
      }
      return false;
  }
  boolean isTree()
  {
      boolean visited[] = new boolean[V];
      for (int i = 0; i < V; i++)
          visited[i] = false;
      if (isCyclicUtil(0, visited, -1))
          return false;
      for (int u = 0; u < V; u++)
          if (!visited[u])
              return false;
      return true;
  }
}

//28
//Find largest subtree sum in a tree
//O(N) O(N)
int ma=0;
public  int subtree(TreeNode root) 
{
	if(root==null) {return 0;}
	int x=subtree(root.left);
	int y=subtree(root.right);
	ma=Math.max(x+y+root.val, ma);
return x+y+root.val;
}
//508. Most Frequent Subtree Sum
// SEEMS HARD BUT SO MUCH EASY
static int hi=1;
HashMap<Integer,Integer>b;
public int[] findFrequentTreeSum(TreeNode root) {
	 hi=1;
   b=new HashMap<Integer,Integer>();      
  List<Integer>a=new ArrayList<Integer>();
         sums(root);
         for(Entry<Integer, Integer> xi:b.entrySet())
         {
        	 if(xi.getValue()==hi) {a.add(xi.getKey());}
         }
          return a.stream().mapToInt(i -> i).toArray(); 
      }

private int sums(TreeNode x) {
 {if(x==null)return  0;
    
int left= sums(x.left);
    
 int right =sums(x.right);
int t=x.val+left+right;
  if(!b.containsKey(t)){b.put(t,1);}
  else {b.put(t,b.get(t)+1); 
       if(hi<(b.get(t))){hi=b.get(t);}
      }
 return x.val+left+right;
    }}  
//29
//Maximum sum of Non-adjacent nodes
//O(n) Memo
 static int getMaxSum2(Node root)
{if(root==null)return 0;
HashMap<Node,Integer>h= new HashMap<Node,Integer>();
setMax(h,root);
return h.get(root);
}
static int setMax(HashMap<Node,Integer>h,Node root)
{
    if(root==null)return 0;
    if(h.containsKey(root))return h.get(root);
    int incl=0,excl=0,i1=0,i2=0;
    if(root.left!=null)
    {i1=setMax(h,root.left.left)+setMax(h,root.left.right);}
    if(root.right!=null)
    {i2=setMax(h,root.right.left)+setMax(h,root.right.right);}
    incl=root.data+i1+i2;
    excl=setMax(h,root.left)+setMax(h,root.right);
    h.put(root,Math.max(incl,excl));
    return h.get(root);
}
//O(n)
static class pai{int f,s;pai(int f,int s){this.f=f;this.s=s;}}
static int getMaxSum3(Node root) {
pai p=findMax(root);
return Math.max(p.f, p.s);
}

private static pai findMax(Node root) {

	if(root==null) {pai sum=new pai(0,0);return sum;}
	pai sum1=findMax(root.left);
	pai sum2=findMax(root.right);
	pai sum=new pai(0,0);
	sum.f=root.data+sum1.s+sum2.s;
	sum.s=Math.max(sum1.f,sum1.s)+Math.max(sum2.f,sum2.s);
	return sum;
}

//Different  *Maximum sum from a tree with adjacent LEVELS not allowed
static int getMaxSum(Node root)
{
    int []a= new int[2];
    inorder(root,0,a);
return Math.max(a[0],a[1]-a[0]);
}
static void inorder(Node root,int i,int[] a)
{
    if(root==null)return ;
    inorder(root.left,i+1,a);
       if(i%2==0)a[0]+=root.data; a[1]+=root.data;
    inorder(root.right,i+1,a);
}
//30
int an;
public int pathSum(TreeNode root, int t) {
    Stack<TreeNode> s= new Stack<TreeNode>();
    an=0;
    preorder(s,root,t);
    return an;
}
public void preorder(Stack<TreeNode>s,TreeNode r,int t)
{
    if(r==null)return;
    s.push(r);
    preorder(s,r.left,t);
    preorder(s,r.right,t);
    int h=0;
    for(int i=s.size()-1;i>=0;i--)
    {
        h+=s.get(i).val;
        if(h==t){an++;}
    }
    s.pop();
}
//31
//LCA
//O(N) O(N)
//2 ARRAYLIST AND TWO ITERATIONS 
Deque<Node>x;Deque<Node>y;
Node lca(Node root, int n1,int n2)
{x=new LinkedList<Node>();y=new LinkedList<Node>();
  x.clear();y.clear();
  inorder(root,x,n1);inorder(root,y,n2);
Node ans=null;
while(!x.isEmpty()&&!y.isEmpty()&&x.peekFirst()==y.peekFirst())
{ans=x.removeFirst();y.removeFirst();}
  return ans;  
}
void inorder(Node root,Deque<Node>x,int n)
{
    if(root==null)return;
    x.addLast(root);
    inorder(root.left,x,n);
    if((root.data==n)&&!x.isEmpty()){return;}
    inorder(root.right,x,n);

if(x.peekLast().data==n)return ;
else  if(!x.isEmpty())  x.removeLast();
}
//better 236 LCA
public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null || root == p || root == q) return root;
    TreeNode left = lowestCommonAncestor(root.left, p, q);
    TreeNode right = lowestCommonAncestor(root.right, p, q);
    return left == null ? right : right == null ? left : root;
   }
//32
//Find Distance between 2 nodes
//Deque<Node>x;Deque<Node>y;
int findDist(Node root, int n1, int n2)
{x=new LinkedList<Node>();y=new LinkedList<Node>();
x.clear();y.clear();
inorder(root,x,n1);inorder(root,y,n2);
while(!x.isEmpty()&&!y.isEmpty()&&x.peekFirst()==y.peekFirst())
{x.removeFirst();y.removeFirst();}
return x.size()+y.size();  
}
void inorderd(Node root,Deque<Node>x,int n)
{
if(root==null)return;
x.addLast(root);
inorderd(root.left,x,n);
if((root.data==n)&&!x.isEmpty()){return;}
inorderd(root.right,x,n);

if(x.peekLast().data==n)return ;
else  if(!x.isEmpty())  x.removeLast();
}

//33
//kth ancester of nodes O(N) MY CODE
//Deque<Node>x;
int kthAncestor(Node root, int k, int n1)

{x=new LinkedList<Node>();
x.clear();
inorders(root,x,n1);
while(!x.isEmpty()&&k>0){x.removeLast();k--;}
return x.isEmpty()?-1:x.peekLast().data;  
}
void inorders(Node root,Deque<Node>x,int n)
{
 if(root==null)return;
 x.addLast(root);
 inorders(root.left,x,n);
 if((root.data==n)&&!x.isEmpty()){return;}
 inorders(root.right,x,n);

if(x.peekLast().data==n)return ;
else  if(!x.isEmpty())  x.removeLast();
}
// when all nodes are unique and between 1 to n
static void generateArray(Node root, int ancestors[])
{   ancestors[root.data] = -1;
    Queue<Node> q = new LinkedList<Node> ();q.add(root);
    while(!q.isEmpty())
    {        Node temp = q.peek();   q.remove();
        if (temp.left != null)
        { ancestors[temp.left.data] = temp.data;q.add(temp.left);}
        if (temp.right != null)
        { ancestors[temp.right.data] = temp.data;q.add(temp.right);}
    }
}
static int kthAncestor(Node root, int n, int k, int node)
{   int ancestors[] = new int[n + 1];
    generateArray(root,ancestors);
 int count = 0;
    while (node!=-1)
    {        node = ancestors[node];count++;
        if(count==k)break;
    }
    return node;
}
//34
//All Duplicate subtrees
List<TreeNode>a;
public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
   a=new ArrayList<TreeNode>();
    HashMap<String,TreeNode>h= new HashMap<String,TreeNode>();
    preorder(root,h);
    //System.out.print(h);
    return a;
}
public String preorder(TreeNode root,HashMap<String,TreeNode>h)
{    String s="";
    if(root==null)return s+'$';
    
   String l= preorder(root.left,h);
   String r= preorder(root.right,h);   
   s=s+' '+root.val+l+r;
if(s.length()>=3&&h.containsKey(s)&&h.get(s)!=null)
{a.add(h.get(s));h.put(s,null);}
 else{if(!h.containsKey(s))h.put(s,root);}
// System.out.println(h);
 return s;
}
//35
//Check if Tree is Isomorphic
public boolean flipEquiv(TreeNode root1, TreeNode root2) {
    
    if(root1==null&&root2==null)return true;
    if(root1==null||root2==null)return false;
    if(root1.val!=root2.val)return false;;

   return (flipEquiv(root1.left,root2.left)&&flipEquiv(root1.right,root2.right))
   ||(flipEquiv(root1.left,root2.right)&&flipEquiv(root1.right,root2.left));
}
}