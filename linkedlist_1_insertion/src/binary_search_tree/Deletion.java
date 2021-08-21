package binary_search_tree;

import java.util.ArrayList;
import java.util.Arrays;

public class Deletion {
static	class Node{
		int data;
		Node left ,right;
		public Node(int item) {
			this.data=item;
			left=right=null;
		}}
static Node root;
Deletion(){
	root =null;
	
}


public static void main(String[] args) {
	// TODO Auto-generated method stub

	
	
	Deletion x= new Deletion();
	x.root =new Node(8); 
	x.root.left =new Node(4); 
	x.root.right =new Node(10);
	x.root.left.left =new Node(2);
	x.root.left.right =new Node(7); 




x.preorder();
System.out.println();
x.inordered(root);
System.out.println();

root=x.delete(root,2);
System.out.println();
x.preorder();
System.out.println();
x.inordered(root);
System.out.println();
}
private Node delete(Node root2, int i) {
if(root2==null)return root2;

if(i<root2.data) {
	root2.left=delete(root2.left,i);
}else
	if(i>root2.data) {
		root2.right=delete(root2.right,i);
	}else {
if(root2.left==null||root2.right==null)
{
	Node temp=null;
temp=root2.left==null?root2.right:root2.left;

	return temp;

}
else
	 root2.data=succesor(root2.right);
     root2.right=delete(root2.right,root2.data);
	
	
	}
return root2;
}


private int succesor(Node rights) {
	// TODO Auto-generated method stub
	if(rights==null)return rights.data;
  succesor(rights.left);	
	
	
	return rights.data;
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







private void inordered(Node root2) {
	// TODO Auto-generated method stub
	if(root2==null) {
		return  ;}
	inordered(root2.left);

System.out.print(root2.data);
	inordered( root2.right);
}
}
