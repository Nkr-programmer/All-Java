package binary_search_tree_2;

import java.util.ArrayList;
import java.util.Arrays;

import binary_search_tree_2.If_nodes_are_swapped.Node;

public class If_nodes_are_swapped {
static	class Node{
		int data;
		Node left ,right;
		public Node(int item) {
			this.data=item;
			left=right=null;
		}}
static Node root;
If_nodes_are_swapped(){
	root =null;
	
}


public static void main(String[] args) {
	// TODO Auto-generated method stub

	
	
	If_nodes_are_swapped x= new If_nodes_are_swapped();
	x.root =new Node(8); 
	x.root.left =new Node(4); 
	x.root.right =new Node(7);
	x.root.left.left =new Node(2);
	x.root.left.right =new Node(10); 


	int [] a1= new int[5];
x.preorder();
System.out.println();
x.inorder();
System.out.println();
x.inordx(a1,root);
System.out.println();

Arrays.sort(a1);
System.out.println(a1[4]);
i=0;
x.inordy(root,a1);
System.out.println();


for(int k=0;k<5;k++)
{
System.out.println(a1[k]);	
}

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

	inordered(root);
}



private void inordered(Node root2) {
	// TODO Auto-generated method stub
	if(root2==null) {
		return  ;}
	inordered(root2.left);
    System.out.print(root2.data);
    inordered( root2.right);
}
static int i=0;
private int[] inordx(int[] a1,Node root2) {
	// TODO Auto-generated method stub
	if(root2==null) {
		return  a1;}
	inordx(a1,root2.left);
    a1[i++]=root2.data;
 
    inordx(a1, root2.right);
	return a1;
}


private void inordy(Node root2,int[]  y) {
	// TODO Auto-generated method stub
	if(root2==null) {
		return  ;}
	inordy(root2.left,y);
   root2.data=y[i++] ;
    inordy( root2.right,y);
}


}