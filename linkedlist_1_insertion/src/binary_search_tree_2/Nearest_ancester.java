package binary_search_tree_2;

import java.util.ArrayList;
import java.util.Arrays;

public class Nearest_ancester {
static	class Node{
		int data;
		Node left ,right;
		public Node(int item) {
			this.data=item;
			left=right=null;
		}}
static Node root;
Nearest_ancester(){
	root =null;
	
}


public static void main(String[] args) {
	// TODO Auto-generated method stub

	
	
	Nearest_ancester x= new Nearest_ancester();
	x.root =new Node(8); 
	x.root.left =new Node(4); 
	x.root.right =new Node(10);
	x.root.left.left =new Node(2);
	x.root.left.right =new Node(7); 




x.preorder();
System.out.println();
x.inorder();
System.out.println();

System.out.println(x.ancester(x.root,7,8));

}
static int c=0;
private int ancester(Node root2, int i, int j) {
	if(i==root2.data||j==root2.data)
	{
		return root2.data;}
	if(i<root2.data&&j<root2.data)
	{
		c=ancester( root2.left,  i,  j)	;
	}
	else
		if(i>root2.data&&j >root2.data){
		c=	ancester( root2.right,  i,  j)	;	
	}else
	if(i<root2.data&&j>root2.data)
	{return root2.data	;
	}
	else
		if(i>root2.data&&j<root2.data){
			return root2.data	;	
	}
		
return c;
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









}

