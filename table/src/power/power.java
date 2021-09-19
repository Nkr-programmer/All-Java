package power;

import java.util.Scanner;

import power.power.Node;

 class power{
static class Node
{
    int data;
    Node next;
    Node(int x){this.next=null;this.data=x;}
};
   @SuppressWarnings("resource")
public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      new Solution();
			head = Solution.mergeSort(head);
		     printList(head);
		    System.out.println();
        }
    }
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}


// } Driver Code Ends


//User function Template for Java
/*
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        this.data = key;
        next = null;
    }
} */

  class Solution
{
    static Node mergeSort(Node a)
    {if(a.next==null){return a;}
    Node mid=getMid(a);
    Node nextmid=mid.next;mid.next=null;
 //   System.out.print(a.data+" ");
    Node x1=mergeSort(a);
    Node x2=mergeSort(nextmid);
    
    Node r= merge(x1,x2);
    return r;
        
    }
    static Node merge(Node x,Node y)
    {
        // if(x==null)return y;
        // if(y==null)return x;
        Node temp= new Node(-1);Node t=temp;
        while(x!=null&&y!=null)
        {
            if(x.data<=y.data)
            {temp.next=x;x=x.next;}
            else{temp.next=y;y=y.next;}
        temp=temp.next;
        }
        while(x!=null){temp.next=x;x=x.next;temp=temp.next;}
        while(y!=null){temp.next=y;y=y.next;temp=temp.next;}
return t.next;
    }
    static Node getMid(Node h)
    {
        Node s=h,e=h;
        while(e.next!=null&&e.next.next!=null)
        {s=s.next;e=e.next.next;}
        return s;
    }
}
