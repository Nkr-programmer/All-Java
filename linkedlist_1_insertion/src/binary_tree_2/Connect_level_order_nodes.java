package binary_tree_2;

import java.util.LinkedList;
import java.util.Queue;




class Node{
	int data;
	Node left ,right,leftright;
	public Node(int item) {
		this.data=item;
		left=right=leftright=null;
	}
}
public class Connect_level_order_nodes {
	Node root,root2;
	Connect_level_order_nodes(){
		root =null;
		root2=null;
	
	}
 

void connect(Node p)
{
	if(p==null) {return ;}
	
	
	if(p.left!=null) {
		p.left.leftright=p.right;
	}
	
	if(p.right!=null) {
		
		p.right.leftright= (p.leftright!=null)? p.leftright.left:null;
	}
	connect(p.left);
	connect(p.right);
	
}

private void levelorder() 
{
	int h= height(root);
	 int i;
	 System.out.println(h);
	 int y=0;
	 for(i=1;i<=h;i++)
	 {
		int t= printlevelorder(root,i);
		System.out.println(t);
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
int x=0;
int  printlevelorder(Node root,int i) {
	
	if(root==null) {
		return 0;
	}
	if(i==1)
	{
	//	System.out.print(root.data);
		return 1;
	}

	else
	{
	return	printlevelorder(root.left,i-1)
		+printlevelorder(root.right,i-1);
		
	}
}





private void levelorderbyqueue() {
	// TODO Auto-generated method stub
  Queue<Node> q=new LinkedList<Node>();
 
  q.add(root);
int count=0,k=0;
 
  while(!q.isEmpty())
  {
	count=q.size();
	System.out.println(count);
	  while(count--!=0)
	  {
	   Node x=q.poll();
	  
	//   System.out.print(x.data);
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
  
	
}


	public static void main(String[] args) {
		

		Connect_level_order_nodes x= new Connect_level_order_nodes();
		x.root =new Node(1); 
		x.root.left =new Node(2); 
		x.root.right =new Node(3);
		x.root.left.left =new Node(4);
		x.root.left.right =new Node(5); 
		x.root.right.left =new Node(6);
		x.root.right.right =new Node(7); 
		x.root.right.right.left =new Node(8);
		x.root.right.right.right =new Node(9); 
		x.root.right.left.left =new Node(8);
		x.root.right.left.right =new Node(9); 
		x.connect(x.root);
		int a=0;
		if(x.root.leftright!=null) 
		{
		    a= x.root.leftright.data;
		System.out.println(a);
		}
		else
		{
			System.out.println("-1");
		}
		if(x.root.left.leftright!=null) 
		{
		a= x.root.left.leftright.data;
		System.out.println(a);
		}
		else
		{
			System.out.println("-1");
		}
		if(x.root.right.leftright!=null) 
		{
		 a= x.root.right.leftright.data;
		System.out.println(a);
		}
		else
		{
			System.out.println("-1");
		}
		if(x.root.left.left.leftright!=null) 
		{
		 a= x.root.left.left.leftright.data;
			System.out.println(a);
		}
		else
		{
			System.out.println("-1");
		}
		if(x.root.left.right.leftright!=null) 
		{
		 a= x.root.left.right.leftright.data;
			System.out.println(a);
		}
		else
		{
			System.out.println("-1");
		}
		if(x.root.right.left.leftright!=null) 
		{
			a= x.root.right.left.leftright.data;
				System.out.println(a);
		}
		else
		{
			System.out.println("-1");
		}
		if(x.root.right.right.leftright!=null) 
		{
				a= x.root.right.right.leftright.data;
					System.out.println(a);
		}
		else
		{
			System.out.println("-1");
		}
		if(x.root.right.right.left.leftright!=null) 
		{
					a= x.root.right.right.left.leftright.data;
						System.out.println(a);
		}
		else
		{
			System.out.println("-1");
		}
		if(x.root.right.right.right.leftright!=null) 
		{
						a= x.root.right.right.right.leftright.data;
							System.out.println(a);
		}
		else
		{
			System.out.println("-1");
		}
		Connect_level_order_nodes y= new Connect_level_order_nodes();
		y.root2 =new Node(2); 
		y.root2.left =new Node(4); 
		//y.root2.left.left= new Node(4);
		//y.root2.left.right= new Node(5);
    	y.root2.right =new Node(5);
//		y.root2.right.left =new Node(6);
		//y.root2.right.right =new Node(7);
	//	y.root2.right.right.left =new Node(8);
		//y.root2.right.right.right =new Node(9);
		if(issubtree(x.root,y.root2)==true)
		{
			System.out.println("yes");
		}
		else {System.out.println("No");}
		
		x.levelorder();
		System.out.println();
		x.levelorderbyqueue();
		System.out.println();
		

	}
	 static boolean issubtree(Node root, Node root2) 
	 {
		
		if(root2==null)	return true;
		if(root==null) return false;
		
		if(isrootsubtree(root,root2))return true;
		
		return issubtree(root.left,root2)||issubtree(root.right,root2);
	}


	private static boolean isrootsubtree(Node root, Node root2) {
	
		if(root==null&&root2==null)return true;
		if(root==null||root2==null)return false;
		
	//	if(root2==null)	return true;    when left is not null & right is not null 
	//	if(root==null) return false;
		
		return (root.data==root2.data)&&
				(isrootsubtree(root.left,root2.left))&&
						(isrootsubtree(root.right,root2.right));
	}

}
