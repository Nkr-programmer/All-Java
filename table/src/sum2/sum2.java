package sum2;

import java.util.HashSet;
import java.util.Scanner;
import java.io.*;
class Node {
     int data;
     Node left, right;

     Node(int item) {
         data = item;
         left = right = null;
     }
 }
class sum2 {
 public static Node root;
 sum2() { 
     root = null; 
 }
 void insert(int key) {
    root = insertRec(root, key);
 }
 Node insertRec(Node root, int key) {
     if (root == null) {
         root = new Node(key);
         return root;
     }
     if (key < root.data)
         root.left = insertRec(root.left, key);
     else if (key > root.data)
         root.right = insertRec(root.right, key);
     return root;
 }

 public static void inorder()  {
    inorderRec(root);
 }
 public static void inorderRec(Node root) {
     if (root != null) {
         inorderRec(root.left);
         System.out.print(root.data);
         inorderRec(root.right);
     }
 }

 // Driver Program to test above functions
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
     while(t-->0)
     {
         int n=sc.nextInt();
         int []a=new int[n];
         sum2 obj1=new sum2();
         for(int i=0;i<n;i++)
         {
             int b=sc.nextInt();
             obj1.insert(b);
         }
         //inorder();
         GFG obj=new GFG();
         boolean k=obj.isDeadEnd(root);
         if(k==true)
         System.out.println("1");
         else
         System.out.println("0");
     }       
 }
}

//} Driver Code Ends


/*class Node {
     int data;
     Node left, right;

     Node(int item) {
         data = item;
         left = right = null;
     }
 }*/

//Function should return true if a deadEnd is found in the bst otherwise return false.
class GFG
{
 static boolean flags=false;
 public static boolean isDeadEnd(Node root)
 {
 HashSet<Integer> h= new HashSet<Integer>();
 ino(root,h);return flags;
 }
 public static void ino(Node root,HashSet<Integer> h)
 {
     if(root==null)return ;
     if(!(root.left==null&&root.right==null)){h.add(root.data);}
     ino(root.left,h);
     if(root.left==null&&root.right==null)
     {
         if(root.data==1&&h.contains(2)){flags=true;return;}
         if(h.contains(root.data-1)&&h.contains(root.data+1)){System.out.print(root.data);flags=true;return ;}
     }
     ino(root.right,h);
 }
}