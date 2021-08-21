package binary_search_tree_2;

import java.util.ArrayList;

import binary_search_tree_2.Floor_or_ceil.Node;

public class Floor_or_ceil {
static	class Node{
		int data;
		Node left ,right;
		public Node(int item) {
			this.data=item;
			left=right=null;
		}}
static Node root;
Floor_or_ceil(){
	root =null;
	
}


public static void main(String[] args) {
	// TODO Auto-generated method stub

	
	
	Floor_or_ceil x= new Floor_or_ceil();
	x.root =new Node(8); 
	x.root.left =new Node(4); 
	x.root.right =new Node(10);
	x.root.left.left =new Node(2);
	x.root.left.right =new Node(7); 




x.preorder();
System.out.println();

for(int d=0;d<11;d++)
{
System.out.println(d+" "+x.Ceil(x.root,d));	
}

}

private int Ceil(Node root2, int d) {

	if(root2==null)return -1;
	
if(root2.data==d) {return root2.data;}

if(root2.data<d) {return Ceil(root2.right,d);}
  int z= Ceil(root2.left,d);

	return (z>=d)?z:root2.data;
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

}