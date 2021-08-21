package binary_search_tree;




class Node{
	int data;
	Node left ,right;
	public Node(int item) {
		this.data=item;
		left=right=null;
	}
}

public class Insertion {
static Node root;
	Insertion(){
		root =null;
		
	}
	void inorder() {
		// TODO Auto-generated method stub
		inorder(root);
	}




	public void inorder(Node root2) {
		// TODO Auto-generated method stub
		if(root2==null) {return ;}
		inorder(root2.left);
		System.out.print(root2.data);	
		inorder( root2.right);
	}

	public static void main(String[] args) {
		Insertion x= new Insertion();
		root=x.insert(root,50);
		root=x.insert(root,30);
		root=x.insert(root,20);
		root=x.insert(root,40);
		root=x.insert(root,70);
		root=x.insert(root,60);
		root=x.insert(root,80);
		int z=x.search(root,40);
		if(z==1)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		Node c=x.searched(root,80);
		if(c==null)
		{
			System.out.println("false");
		}
		else
			System.out.println(c.data);
		
         x.inorder();

	}


int x=0;
	public int search(Node root,int i) {
		if(root==null)
		{
			
			return 0;
		}
		
		if(root.data==i)
		{
			
			return 1;
		}
	
		
			if((root.data>i))
			{
			x=search(root.left,i);
			}else
			x= search(root.right,i);
		
		return x;

		
	}
Node h;
	public Node searched(Node root,int i) {
		if(root==null)
		{
			
			return root;
		}
		
		if(root.data==i)
		{
			
			return root;
		}
	
		
			if((root.data>i))
			{
		h	=searched(root.left,i);
			}else
			h= searched(root.right,i);
		
		return h;

		
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



}
