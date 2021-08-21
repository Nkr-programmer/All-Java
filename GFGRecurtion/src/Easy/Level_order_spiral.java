package Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

	class Level_order_spiral {

	    static Nodes buildTree(String str){
	        
	        if(str.length()==0 || str.charAt(0)=='N'){
	            return null;
	        }
	        
	        String ip[] = str.split(" ");
	        // Create the root of the tree
	        Nodes root = new Nodes(Integer.parseInt(ip[0]));
	        // Push the root to the queue
	        
	        Queue<Nodes> queue = new LinkedList<>(); 
	        
	        queue.add(root);
	        // Starting from the second element
	        
	        int i = 1;
	        while(queue.size()>0 && i < ip.length) {
	            
	            // Get and remove the front of the queue
	            Nodes currNode = queue.peek();
	            queue.remove();
	                
	            // Get the current node's value from the string
	            String currVal = ip[i];
	                
	            // If the left child is not null
	            if(!currVal.equals("N")) {
	                    
	                // Create the left child for the current node
	                currNode.left = new Nodes(Integer.parseInt(currVal));
	                // Push it to the queue
	                queue.add(currNode.left);
	            }
	                
	            // For the right child
	            i++;
	            if(i >= ip.length)
	                break;
	                
	            currVal = ip[i];
	                
	            // If the right child is not null
	            if(!currVal.equals("N")) {
	                    
	                // Create the right child for the current node
	                currNode.right = new Nodes(Integer.parseInt(currVal));
	                    
	                // Push it to the queue
	                queue.add(currNode.right);
	            }
	            i++;
	        }
	        
	        return root;
	    }
	    void inOrder(Nodes node) {
	        if (node == null) {
	            return;
	        }
	 
	        inOrder(node.left);
	        System.out.print(node.data + " ");
	 
	        inOrder(node.right);
	    }
	    
		public static void main (String[] args) throws IOException{
		        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        
		        int t=Integer.parseInt(br.readLine());
	    
		        while(t-- > 0){
		            String s = br.readLine();
	    	    	Nodes root = buildTree(s);
	                Spiral g = new Spiral();
	                ArrayList<Integer> result = g.findSpiral(root);
	                for(int value : result)
	                System.out.print(value + " ");
				    System.out.println();
	    	        
		        }
		}
	}
 class Nodes {

		   int data;
		    Nodes left;
		    Nodes right;
		    Nodes(int data){
		        this.data = data;
		        left=null;
		        right=null;
		    }
		} 
 
	class Spiral{
	ArrayList<Integer>  findSpiral(Nodes root) {
		// TODO Auto-generated method stub

        Stack<Nodes> s1 = new Stack<Nodes>();
        Stack<Nodes> s2 = new Stack<Nodes>();
        s1.add(root);//switch s2 to s1 to change anticlockwise
        ArrayList<Integer> a=new ArrayList<Integer>();
        if(root==null)return a;
        while (!s1.isEmpty()||!s2.isEmpty()) 
        {

        	while(!s1.isEmpty()) {
                Nodes tempNode = s1.pop();
                a.add(tempNode.data);
     
                if (tempNode.right != null) {
                    s2.add(tempNode.right);
                }
     
                /*Enqueue right child */
                if (tempNode.left != null) {
                    s2.add(tempNode.left);
                }
            }
while(!s2.isEmpty()) {
            Nodes tempNode = s2.pop();
            a.add(tempNode.data);
 
            if (tempNode.left != null) {
                s1.add(tempNode.left);
            }
 
            /*Enqueue right child */
            if (tempNode.right != null) {
                s1.add(tempNode.right);
            }
        }
        }
		return a;
	}
}