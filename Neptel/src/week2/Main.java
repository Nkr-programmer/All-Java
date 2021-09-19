package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Res
{
    int r = Integer.MIN_VALUE;
}
  class Node
{
    int key;
    Node left, right;
  
    public Node(int key)
    {
        this.key = key;
        left = right = null;
    }
}
  
class Main
{
    Node root;
    
    /* Recursive function to calculate maximum ancestor-node
       difference in  binary tree. It updates value at 'res'
       to store the result.  The returned value of this function
       is minimum value in subtree rooted with 't' */
    int maxDiffUtil(Node t, Res res)
    {
        /* Returning Maximum int value if node is not
           there (one child case)  */
        if (t == null)
            return Integer.MAX_VALUE;
          
        /* If leaf node then just return node's value  */
        if (t.left == null && t.right == null)
            return value[t.key];
  
        /* Recursively calling left and right subtree
           for minimum value  */
        int val = Math.min(maxDiffUtil(t.left, res),
                maxDiffUtil(t.right, res));
  
        /* Updating res if (node value - minimum value
           from subtree) is bigger than res  */
        res.r = Math.max(res.r, value[t.key] - val);
  
        /* Returning minimum value got so far */
        return Math.min(val, value[t.key]);
    }
  
    /* This function mainly calls maxDiffUtil() */
    int maxDiff(Node root)
    {
        // Initialising result with minimum int value
        Res res = new Res();
        maxDiffUtil(root, res);
  
        return res.r;
    }
  
  
    // Creates a node with key as 'i'.  If i is root, then it changes
    // root.  If parent of i is not created, then it creates parent first
    void createNode(int parent[], int i, Node created[])
    {
        // If this node is already created
        if (created[i] != null)
            return;
  
        // Create a new node and set created[i]
        created[i] = new Node(i);
  
        // If 'i' is root, change root pointer and return
        if (parent[i] == -1)
        {
            root = created[i];
            return;
        }
  
        // If parent is not created, then create parent first
        if (created[parent[i]] == null)
            createNode(parent, parent[i], created);
  
        // Find parent pointer
        Node p = created[parent[i]];
  
        // If this is first child of parent
        if (p.left == null)
            p.left = created[i];
        else // If second child
          
            p.right = created[i];
    }
  
    /* Creates tree from parent[0..n-1] and returns root of
       the created tree */
    Node createTree(int parent[], int n)
    {   
        // Create an array created[] to keep track
        // of created nodes, initialize all entries
        // as NULL
        Node[] created = new Node[n];
        for (int i = 0; i < n; i++)
            created[i] = null;
  
        for (int i = 0; i < n; i++)
            createNode(parent, i, created);
  
        return root;
    }
  
    //For adding new line in a program
    void newLine()
    {
        System.out.println("");
    }
  
    // Utility function to do inorder traversal
    void inorder(Node node)
    {
        if (node != null)
        {
            inorder(node.left);
            System.out.print(node.key + "<"+value[node.key]+">");
            inorder(node.right);
        }
    }
static  int value[];
    // Driver method
    public static void main(String[] args)throws NumberFormatException, IOException {
		
        Main tree = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int		n = Integer.parseInt(st.nextToken());
	    value=new int[n];
        int parent[] = new int[n];
    for(int i=0;i<n;i++)
    {
    	value[i]=Integer.parseInt(st.nextToken());
    }
    for(int i=0;i<n;i++)
    {
    	int x=Integer.parseInt(st.nextToken());parent[i]=x==-1?-1:x-1;
    }
    if(n==1){ System.out.println(0);return;}
        Node node = tree.createTree(parent, n);
//        System.out.println("Inorder traversal of constructed tree ");
//        tree.inorder(node);
      //  tree.newLine();
        int g=tree.maxDiff(tree.root);
        if(g<=0){ System.out.println(0);return;}
        System.out.println(g);
        
    }
}