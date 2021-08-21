   package binary_tree_3;

	 class Node{
			char data;
			Node left ,right;
			public Node(char item) {
				this.data=item;
				left=right=null;
			}}
		
public class Bt_by_2_transversal {

	static Node root;
	Bt_by_2_transversal(){
		root =null;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Bt_by_2_transversal x= new Bt_by_2_transversal();
//		x.root =new Node('A'); 
//		x.root.left =new Node('B'); 
//		x.root.right =new Node('C');
//		x.root.left.left =new Node('D');
//		x.root.left.right =new Node('E'); 
//		x.root.right.left =new Node('F');

		char  in[]= new char [] {'D','B','E','A','F','C'};
		char pre[]= new char [] {'A','B','D','E','C','F'};
		int len = in.length;
		Node roots=x.treemaking(in,pre,0,len-1);//2. possible b hashmap also or unorded map in c++
//3.hashset method
	x.inorder(roots);
	System.out.println();
	//x.preorder();
	//System.out.println();

	
		
	}

static int preindex=0;
	private static Node treemaking(char[] in, char[] pre, int i, int j) {
		// TODO Auto-generated method stub
		
		
		if(i>j) {return null ;}
		Node troot= new Node(pre[preindex++]);

		if(i==j) {return troot;}
		int  x = search(in,i,j-1,troot.data);
	
	
		troot.left=treemaking(in,pre,i,x-1);
		troot.right=treemaking(in,pre,x+1,j);
		
		return troot;
	}

	public static int search(char[] in,int it ,int j,char k) {
	int i;
	for( i=it;i<=j;i++)
		{
			if(in[i]==k)
			{
				return i;
			}
			
		}
		
		
		return i;
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









	private static void inorder(Node root2) {
		// TODO Auto-generated method stub
		if(root2==null) {return ;}
		inorder(root2.left);
		System.out.print(root2.data);	
		inorder( root2.right);
	}
}
   
