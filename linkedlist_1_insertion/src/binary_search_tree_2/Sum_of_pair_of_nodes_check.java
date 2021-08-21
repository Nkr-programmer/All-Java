package binary_search_tree_2;
import java.util.ArrayList;
import java.util.Arrays;

public class Sum_of_pair_of_nodes_check {
static	class Node{
		int data;
		Node left ,right;
		public Node(int item) {
			this.data=item;
			left=right=null;
		}}
static Node root;
Sum_of_pair_of_nodes_check(){
	root =null;
	
}


public static void main(String[] args) {
	// TODO Auto-generated method stub

	
	
	Sum_of_pair_of_nodes_check x= new Sum_of_pair_of_nodes_check();
	x.root =new Node(8); 
	x.root.left =new Node(4); 
	x.root.right =new Node(10);
	x.root.left.left =new Node(2);
	x.root.left.right =new Node(7); 



x.inorderrd();
System.out.println();
x.preorder();
System.out.println();
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


private static ArrayList<Integer> inordersd(Node root2,ArrayList<Integer> a1) {


	if(root2==null) {
		return  a1;}
	inordersd(root2.left,a1);

	 a1.add(root2.data);
	 inordersd( root2.right,a1);
	 return a1;
}


private static void inorderrd() {

	 ArrayList<Integer> a1= new ArrayList<>();
	 ArrayList<Integer> a2= inordersd(root,a1);
	 
	 int start=0,end=a2.size()-1;
	 int sum =0;
	 int i=0;
	 while(i<=5)
	 {
		start=0;
		
	 while(start<=end)
	 {
		 sum= a2.get(start)+a2.get(end);
		 start++;
		 System.out.println(sum);
	 }
	 i++;
	 end--;
	 }
		
	
	
}





}

