package binary_search_tree_2;


import java.util.Arrays;

public class Merge_to_bst {
static	class Node{
		int data;
		Node left ,right;
		public Node(int item) {
			this.data=item;
			left=right=null;
		}}
static Node root;
Merge_to_bst(){
	root =null;
	
}
static int a[]= new int[5];
static int i=0,j=0;

public static void main(String[] args) {
	// TODO Auto-generated method stub

	
	
	Merge_to_bst x= new Merge_to_bst();
	x.root =new Node(8); 
	x.root.left =new Node(4); 
	x.root.right =new Node(10);
	x.root.left.left =new Node(2);
	x.root.left.right =new Node(7); 



x.inorder();
System.out.println();
System.out.println();

x.inorder(root);


Merge_to_bst y= new Merge_to_bst();
y.root =new Node(5); 
y.root.left =new Node(2); 
y.root.right =new Node(6);
y.root.left.left =new Node(-1);
y.root.left.right =new Node(3); 



y.inorder();
System.out.println();

//-12234567810 -12234567810

for(int k=0;k<5;k++)
y.insert(root, a[k]);


for(int k=0;k<5;k++)
System.out.println(a[k]);


y.preorder();
System.out.println();
}
public Node insert(Node root ,int i) {
	
if(root==null)
{
	root= new Node(i);
	return root;
}
	
	if((root.data>i))
	{
	root.left=	insert(root.left,i);
	}else
	root.right= insert(root.right,i);
return root;
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

	inordersd(root);
}



private static void inordersd(Node root2) {
	// TODO Auto-generated method stub
	if(root2==null) {return ;}
	inordersd(root2.left);
	System.out.print(root2.data);
	inordersd( root2.right);
}


private static void inorder(Node root2) {
	// TODO Auto-generated method stub
	if(root2==null) {return ;}
	inorder(root2.left);
	//System.out.print(root2.data);
	
	
	a[i++]=root2.data;
	inorder( root2.right);
}



}

