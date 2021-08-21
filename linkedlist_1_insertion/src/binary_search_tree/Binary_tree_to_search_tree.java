package binary_search_tree;

import java.util.Arrays;

public class Binary_tree_to_search_tree {
static	class Node{
		int data;
		Node left ,right;
		public Node(int item) {
			this.data=item;
			left=right=null;
		}}
static Node root;
Binary_tree_to_search_tree(){
	root =null;
	
}
static int a[]= new int[5];
static int i=0;

public static void main(String[] args) {
	// TODO Auto-generated method stub

	
	
	Binary_tree_to_search_tree x= new Binary_tree_to_search_tree();
	x.root =new Node(10); 
	x.root.left =new Node(2); 
	x.root.right =new Node(7);
	x.root.left.left =new Node(8);
	x.root.left.right =new Node(4); 


x.inorder();
System.out.println();
Arrays.sort(a);

x.inorder(a,x.root);

x.inorder();
System.out.println();



	
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
	i=0;
	inorder(root);
}





private static void inorder(Node root2) {
	// TODO Auto-generated method stub
	if(root2==null) {return ;}
	inorder(root2.left);
	System.out.print(root2.data);
	
	
	a[i++]=root2.data;
	inorder( root2.right);
}


static int j=0; 
private static void inorder(int a[],Node root2) {
	// TODO Auto-generated method stub
	if(root2==null) {return ;}
	inorder(a,root2.left);

	root2.data=a[j];j++;


	inorder(a,root2.right);
}
}

