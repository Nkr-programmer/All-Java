package binary_tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node{
	int data;
	Node left ,right;
	public Node(int item) {
		this.data=item;
		left=right=null;
	}
}
public class Properties {
	Node root;
	Properties(){
		root =null;
		
	}

	 private void levelorder() {
		// TODO Auto-generated method stub
		
		 
		 int h= height(root);
		 int i;
		 System.out.println(h);
		 for(i=1;i<=h;i++)
		 {
			 printlevelorder(root,i);
		 }
		 

		 
	}

	int height (Node root)
	{
	if(root==null) {
		return 0;
	}
	
	int lheight=height(root.left);
	int rheight=height(root.right);
	
	if(lheight>rheight)
	{
		return lheight+1;
	}else
		return  rheight+1;
		
		
	}
	
	void printlevelorder(Node root,int i) {
		
		if(root==null) {
			return ;
		}
		if(i==1)
		{
			System.out.print(root.data);
		}

		else
		{
			printlevelorder(root.left,i-1);
			printlevelorder(root.right,i-1);
		}
	}
	
	
	
	

	private void levelorderbyqueue() {
		// TODO Auto-generated method stub
       Queue<Node> q=new LinkedList<Node>();
       
       q.add(root);
       while(!q.isEmpty())
       {
    	   Node x=q.poll();
    	   System.out.print(x.data);
    	   if(x.left!=null)
    	   {
    		   q.add(x.left);
    	   }
    	   
    	   if(x.right!=null)
    	   {
   			   q.add(x.right);
   		   }
    	   
       }
       
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Properties x= new Properties();
		x.root =new Node(1); 
		x.root.left =new Node(2); 
		x.root.right =new Node(3);
		x.root.left.left =new Node(4);
		x.root.left.right =new Node(5); 
		x.root.right.left =new Node(6);
		x.root.right.right =new Node(7); 
		x.root.right.right.left =new Node(8);
		x.root.right.right.right =new Node(9); 
	x.postorder();
	System.out.println();
	x.inorder();
	System.out.println();
	x.preorder();
	System.out.println();
	x.levelorder();
	System.out.println();
	x.levelorderbyqueue();
	System.out.println();
	x.inorderbystack();
	
	}




	void postorder() {
		// TODO Auto-generated method stub
		postorder(root);
	}
    private void postorder(Node root2) {
		// TODO Auto-generated method stub
		if(root2==null) {return ;}
		postorder(root2.left);
		postorder( root2.right);
		System.out.print(root2.data);
		
	}




	void preorder() {
		// TODO Auto-generated method stub
		preorder(root);
	}
	private void preorder(Node root2) {
		// TODO Auto-generated method stub
		if(root2==null) {return ;}
		System.out.print(root2.data);	
		preorder(root2.left);
		preorder( root2.right);

	}




	void inorder() {
		// TODO Auto-generated method stub
		inorder(root);
	}




	private void inorder(Node root2) {
		// TODO Auto-generated method stub
		if(root2==null) {return ;}
		inorder(root2.left);
		System.out.print(root2.data);	
		inorder( root2.right);
	}

	private void inorderbystack() {
		// TODO Auto-generated method stub
		if(root==null) {
			return ;
		}
		
		Stack<Node> s=new Stack<Node>();
		Node x=root;
		
		while(x!=null||!s.isEmpty())
		{
		while(x!=null)
		{
			s.push(x);
			x=x.left;
			
			
		}
x=s.pop();
			System.out.print(x.data);
		x=x.right;

		
	}
}
}



//  1. max number of nodes at level I of a binary tree is 2^(I-1)
//  2. max number of nodes in binary tree of height is 2^(h)-1
//  3. with n nodes min height or min number of levels is  log (N+1)
//                                                            2
//  4. binary tree with L leaves has atleast ?log L+1 levels
//                                               2
//  5.  L =T+1  L= leaves Node    T= nodes of remaining levels

//  Full binary tree =>if every node has 0 or 2 children satisfying 5.
//  Complete binary tree => if all levels are completely filled except last level
//                          possibly all keys as left as possible
//  Perfect binary tree => if all internal nodes has 2 children & leaves at the same level
//                          satisfying 2.
//  Degenerate tree  => when internal nodes have one child and similar to linked list 
//  Balanced binary tree => if the height of the tree is O(Log n ) the difference between heights 
//                          of left and right is atmost 1 