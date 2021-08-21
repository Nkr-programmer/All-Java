package binary_search_tree_2;

import java.util.LinkedList;
import java.util.Queue;

import binary_search_tree_2.Merging_part_two.Node;

public class Merging_part_two {
static	class Node{
		int data;
		Node left ,right;
		public Node(int item) {
			this.data=item;
			left=right=null;
		}}




public static void main(String[] args) {
	// TODO Auto-generated method stub

	Node root1=null,root2=null;
	

	root1 =new Node(9); 
	root1.left =new Node(4); 
	root1.right =new Node(10);
	root1.left.left =new Node(1);
	root1.left.right =new Node(7); 



inordersd(root1);
System.out.println();
System.out.println();




root2 =new Node(5); 
root2.left =new Node(2); 
root2.right =new Node(6);
root2.left.left =new Node(-1);
root2.left.right =new Node(3); 



inordersd(root2);
System.out.println();

//merge(root1,root2);
System.out.println();



kthsmallest(root1);

}

static int r=4;
private static void kthsmallest(Node root2) {
	// TODO Auto-generated method stub
	if(r==0) {return ;}
	if(root2==null)return ;
	kthsmallest(root2.left);
	System.out.print(r+", "+root2.data+";");
	r--;
	kthsmallest(root2.right);
}


private static void merge(Node root1, Node root2) {

	Queue<Integer> s1=new  LinkedList<Integer>();
	Queue<Integer> s2=new  LinkedList<Integer>();
	int x=0,y=0;
	if(s1.isEmpty())
	{
		inorderforq(s1, root1) ;
	}
	if(s2.isEmpty())
	{
		inorderforq(s2, root2) ;
	}
	
	while(!s1.isEmpty()||!s2.isEmpty())
	{
		
		if(s2.isEmpty()) {
			System.out.println(s1.poll());
			//s2.remove();
			continue;
		}
		if(s1.isEmpty()) {
			System.out.println(s2.poll());
			//s2.remove();
			continue;
		}
		x=s1.peek();
		y=s2.peek();
		//System.out.println(x+" "+y);
		if(x<y)
		{
			System.out.println(x);
			s1.remove();
		}
		else
		{
			System.out.println(y);
			s2.remove();
			
		}
		
	}
}


private void preorder(Node root2) {
	// TODO Auto-generated method stub
	if(root2==null) {return ;}
	System.out.print(root2.data);	
	preorder(root2.left);
	preorder( root2.right);

}



private static void inorderforq(Queue<Integer>s1,Node root2) {
	// TODO Auto-generated method stub
	if(root2==null) {return ;}
	inorderforq(s1,root2.left);
	s1.add(root2.data);
	inorderforq(s1, root2.right);
	//return s1;
}

private static void inordersd(Node root2) {
	// TODO Auto-generated method stub
	if(root2==null) {return ;}
	inordersd(root2.left);
	System.out.print(root2.data);
	inordersd( root2.right);
}



}

