package linkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

import linkedList.t125to160.Node;

 class circular_LinkedList
{
    Node head, head1, head2;  // head of lisl
	//Node last = null;
	Node last = null;
  
    /* Linked list Node*/
   
                    
    /* Utility functions */
 
    /* Inserts a new Node at front of the list. */
     public void addToTheLast(Node node) 
	 {
		
		  if (head == null) 
		  {
			head = node;
			
		  } else 
		  {
			   Node temp = head;
			   while (temp.next != null)
			   temp = temp.next;

		       temp.next = node;
		  }
	 }
  /* Function to print linked list */
    void printList(Node node)
    {
        Node temp = node;
        if(node != null)
        {
			do{
           System.out.print(temp.data+" ");
           temp = temp.next;
			}while (temp != node);
        }  
        System.out.println();
    }
	
	void circular()
	{
		    last = head;
			while (last.next != null)
				last = last.next;
			last.next = head;
			//System.out.println(last);
	}
	
	 
 
     /* Drier program to test above functions */
    public static void main(String args[])
    {
       
         
        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
         {
			int n = sc.nextInt();
			circular_LinkedList llist = new circular_LinkedList();
			int a1=sc.nextInt();
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
            int a = sc.nextInt(); 
            llist.addToTheLast(new Node(a));
			
			
		     }
			 /*Node x = head;
			 while(x!=null)
			 {
				 System.out.print(x.data+" ");
				 x = x.next;
			 }*/
			llist.circular();
          //int k=sc.nextInt();
			t125to160 g = new t125to160();
         //System.out.println(g.getCount(llist));
		// g.splitList(llist);
		 g.pairsum(llist.head, 10);
		 llist.printList(llist.head1);
		 llist.printList(llist.head2);
        //llist.printList();
		//llist.head = llist.reverse(llist.head);
		//llist.printList();
		
		
        t--;
    }
}
}

public class t125to160 {
public static 	class Node{
	    int data;
	    Node next;
	    Node prev;
	    Node bottom;
	    Node right;
	    Node arb;
	    
	    Node(int x){
	        data = x;
	        next = null;
	        prev=null;
	        bottom=null;
	        right=null;
	    }
	} 
	  public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}
//1
	//Reverse the Linked List
	// O(n) O(1)
//ITERATIVE
	 public ListNode reverseList2(ListNode head) {
		   ListNode root=head,other=null,prev=null;
		        while(root!=null)
		        {
		            other=root.next;
		        if(root==head){root.next=null;}
		            else{root.next=prev;}
		            prev=root;
		            root=other;
		        }
		        return prev;
		    }
//RECURSIVE
	 public ListNode reverseList(ListNode head) {
	        ListNode root=head;
	        return reverse(root,null);}
	    public ListNode reverse(ListNode root,ListNode prev){
	   ListNode other=null;
	        if(root!=null)
	        {
	            other=root.next;
	        if(prev==null){root.next=null;}
	            else{root.next=prev;}
	            prev=root;
	            root=other;
	            prev=reverse(root,prev);
	            
	        }
	        return prev;
	    }
	    //2
	    //Reverse a Linked List in groups of given size. 
	    //O(n)
	    public static Node reverse(Node head, int k)
	    {
	    if(head==null)return head;
	    Node curr=head,prev=null,other=null;int count=0;
	    while(curr!=null&&count<k)
	    {count++;other=curr.next;if(curr==head){curr.next=null;}else{curr.next=prev;}
	        prev=curr;curr=other;
	    }
	    if(curr!=null||count>=k){Node res=reverse(curr,k);head.next=res;}
	        return prev;
	    }
//   Leetcode   (25). Reverse Nodes in k-Group
	    public ListNode reverseKGroup(ListNode head, int k) {
	        if(head == null || head.next ==null || k==1)
	              return head;
	           
	           ListNode temp_head = head;
	           int count = 1;
	           while(temp_head != null && count < k)
	           {
	              temp_head = temp_head.next;
	              count++; 
	           }
	           
	           if(temp_head == null && count <= k)
	               return head;
	           
	           ListNode tail = reverseKGroup(temp_head.next,k);
	           
	           while(head != temp_head)
	           {
	               ListNode next = head.next;
	               head.next = tail;
	               tail = head;
	               head = next;
	           }
	           
	           temp_head.next = tail;
	           
	           return temp_head;
	       }
	    //3
	    //Detect cycle  in Linked List
	    //O(n) O(1)
	    public static boolean detectLoop(ListNode head){
	    if(head==null||head.next==null||head.next.next==null)return false;
        ListNode x=head,y=head;
        while(x!=null||y!=null)
        {
             if(y.next==null||y.next.next==null)return false;
            x=x.next;y=y.next.next;
            if(x==y)return true;
        }
        return false;
    }
//4
	    //GFG
	    //O(n) O(1)
	    //Remove loop in Linked List
	    public static void removeLoop(ListNode node){ 
	    	if (node == null || node.next == null)
            return;
  ListNode slow = node, fast = node;
  slow = slow.next;
        fast = fast.next.next;
  while (fast != null && fast.next != null) {
            if (slow == fast)
                {break;}
      slow = slow.next;
            fast = fast.next.next;
        }
  if (slow == fast) {
            slow = node;
            if (slow != fast) {
                while (slow.next != fast.next) {
                    slow = slow.next;
                    fast = fast.next;
                }
                fast.next = null;
            }
            else {
                while(fast.next != slow) {
                    fast = fast.next;
                }
                fast.next = null;
            }
        }
    }
	    
	    //Leetcode 
	//5
	    //node where the cycle begins
	    //O(n) O(1)
	    public ListNode detectCycle(ListNode h) {
	        if(h==null||h.next==null)return null;
	    ListNode s=h,f=h,ans=null;
	        while(f!=null&&f.next!=null)
	        {
	        s=s.next;f=f.next.next;
	            if(s==f)break;
	        }
	        if(s!=f)return null;
	        s=h;
	        while(s!=f){
	            s=s.next;f=f.next;
	        }
	    return s;
	    }
//6
	    //Remove Duplicates from Sorted List
	    //O(N)  O(1)
	    public ListNode deleteDuplicates(ListNode head) {
	        
	    	if(head==null||head.next==null)return head;
	    	ListNode curr=head,next=head.next;
	    	while(next!=null)
	    	{
	    	    if(next.val==curr.val){ if(next.next==null){curr.next=null;}
	                                   next=next.next;
	                                 }
	    	    else{if(curr.next!=next){curr.next=next;}curr=next;next=next.next;}
	    	}
	    	return head;
	        }
//7
	    //Remove Duplicates from UnSorted List
	    //O(N)  O(n)
	    public ListNode removeDuplicates(ListNode head) 
	    {if(head==null||head.next==null)return head;
	HashSet<Integer>h=new HashSet<Integer>();
	ListNode curr=head,prev=null;
	while(curr!=null){
	    if(!h.contains(curr.val)){h.add(curr.val);prev=curr;curr=curr.next;}
	    else{prev.next=curr.next;curr.next=null;curr=prev.next;}
	}
	return head;
	    }
	    //8
	    //Move last element to front of a given LL
	    public ListNode shift(ListNode head)
	    {
	    	if(head==null||head.next==null)
	    	{return head;}
	    	ListNode curr=head;
	    	while(curr.next.next!=null)
	    	{curr=curr.next;}ListNode prev=curr.next;
	    	curr.next=null;
	    	prev.next=head;
	    	return head;
	    }
	    //9
	    //Add 1 to a number represented as linked list 
	    //O(n) O(1)
	    public static Node addOne(Node head) 
	    {
	        Node root =head,curr=root,prev=null;
	        root=reverse(root,null);
	        int carry=0;curr=root;
	        while(curr!=null)
	        {curr.data=curr==root?curr.data+1+carry:curr.data+carry;
	        carry=curr.data>9?1:0;
	        curr.data=curr.data%10;prev=curr;curr=curr.next;
	        }
	        if(carry>0){Node x= new Node(carry);prev.next=x;}
	        root=reverse(root,null);
	        return root;
	    }
	    public static  Node reverse(Node root,Node prev){
	   Node other=null;
	        if(root!=null)
	        {
	            other=root.next;
	        if(prev==null){root.next=null;}
	            else{root.next=prev;}
	            prev=root;
	            root=other;
	            prev=reverse(root,prev);
	            
	        }
	        return prev;
	    }
	    //10
	    //Add two numbers represented by linked lists
	    //O(N) O(N)
	     static Node addTwoLists(Node f, Node s){
	    Node root1=f,curr1=root1,root2=s,curr2=root2,root=null,curr=null,prev=null;
	    root1=reverse(root1,null);curr1=root1;
	    root2=reverse(root2,null);curr2=root2;
	    int carry=0;
	    while(curr1!=null||curr2!=null)
	    {int m=curr1!=null?curr1.data:0;int n=curr2!=null?curr2.data:0;
	        int ans=m+n+carry;carry=ans/10;Node t=new Node(ans%10);
	        if(root1==curr1||root2==curr2){root=t;prev=t;curr=t;}
	        else{curr.next=t;
	        prev=t;
	        curr=curr.next;}
	        // System.out.print(curr.data);
	        if(curr1!=null){curr1=curr1.next;}
	        if(curr2!=null){curr2=curr2.next;}
	    }
	    if(carry>0){Node x= new Node(carry);prev.next=x;}
	    root=reverse(root,null);
	    root1=reverse(root1,null);
	    root2=reverse(root2,null);
	    return root;
	     }
	     //11
	     //Intersection of two sorted Linked lists 
	     //O(n) O(1)
	     public static Node findIntersection(Node head1, Node head2)
	     {
	 Node curr1=head1,curr2=head2,root=null,next=null;
	 while(curr1!=null&&curr2!=null)
	 {
	     if(curr1.data<curr2.data){curr1=curr1.next;continue;}
	     else if(curr1.data>curr2.data){curr2=curr2.next;continue;}
	     else{
	     Node t=new Node(curr1.data);
	     if(root==null){root=t;next=t;}
	     else{next.next=t;next=next.next;}curr2=curr2.next;curr1=curr1.next;
	         }
	 }
	 return root;
	     }
	     //12
	     // Intersection of Two Linked Lists
	     //O(N) O(1)
	     public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
	         
	         int k1=1,k2=1;
	         ListNode c1=head1,c2=head2;
	         while(c1.next!=null){c1=c1.next;k1++;}c1=head1;
	         while(c2.next!=null){c2=c2.next;k2++;}c2=head2;
	         if(k1>k2){while(k1!=k2){c1=c1.next;k1--;}}
	         else if(k2>k1){while(k1!=k2){c2=c2.next;k2--;}}
	         while(k1>0&&c1!=c2){c1=c1.next;c2=c2.next;k1--;}
	if(c1!=null)return c2;
	else{return null;}
		}
	     //13
	     //Merge sorted with ll
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
	    
	    //15
	    //Find the middle element in Linked List
	    //O(n) O(1)
	    public ListNode middleNode(ListNode head) {
	        if(head==null||head.next==null)return head;
	           ListNode s=head.next,e=head.next.next;
	           while(e!=null&&e.next!=null)
	           {s=s.next;e=e.next.next;}
	       return s;
	       }
//16
//O(n) O(1)
	    //Check If Circular Linked List 
	    boolean isCircular(ListNode h)
	    {
	          if(h==null)return true;
	if(h.next==null)return false;
		    ListNode s=h,f=h,ans=null;
		        while(f!=null&&f.next!=null)
		        {
		        s=s.next;f=f.next.next;
		            if(s==f)break;
		        }
		        if(s!=f)return false;
		        s=h;
		        while(s!=f){
		            s=s.next;f=f.next;
		        }
		    return s==h?true:false;
		    }
	    //17
//Split a Circular Linked List into two halves 
	     void splitList(circular_LinkedList head)
	        {
	           if(head.head==null||head.head.next==null)return;
		       if(head.head.next.next==head.head)
		       {Node f=head.head.next;f.next=f;head.head.next=head.head;head.head1=head.head;head.head2=f;return;}
		          
			           Node s=head.head.next,e=head.head.next.next,prev=null,prev2=null;
			 
			           while(e!=head.head&&e.next!=head.head)
			           {prev=s;prev2=e.next;s=s.next;e=e.next.next;}
			           if(e!=head.head)
			           {prev=s;prev2=e;}
		Node head2=prev.next,root=null; prev.next=null;
		prev.next=head.head;prev2.next=head2;
		head.head1=head.head;head.head2=head2;
	//System.out.print(head.head.data+" "+prev.data+" "+head2.data+" "+prev2.data);
		 }

	    //18
	    //Check if Linked List is Palindrome
	    //O(n) O(1)
	    boolean isPalindrome(Node head) 
	    {
	          if(head==null||head.next==null)return true;
	          if(head.next.next==null){if(head.data==head.next.data)return true;else return false;}
	          
		           Node s=head.next,e=head.next.next,prev=null;
		           while(e!=null&&e.next!=null)
		           {prev=s;s=s.next;e=e.next.next;}
		           if(e!=null)
		           prev=s;

	Node head2=prev.next,root=null; prev.next=null;
	head2=reverse(head2,null);root=head2;s=head;

	while(root!=null){if(s.data!=root.data){return false;}s=s.next;root=root.next;}
	if(s==null||s==prev){return true;}
		   return false;
		   
		  }
	    //19
	    //Deletion from a Circular Linked List
	    static Node deleteNode(Node head, int key)
	    {
	        if (head == null)
	            return null;
	 
	        // Find the required node
	        Node curr = head, prev = null;
	        while (curr.data != key) {
	            if (curr.next == head) {
	                System.out.printf("\nGiven node is not found"
	                                  + " in the list!!!");
	                break;
	            }
	 
	            prev = curr;
	            curr = curr.next;
	        }
	 
	        // Check if node is only node
	        if (curr == head && curr.next == head) {
	            head = null;
	            return head;
	        }
	 
	        // If more than one node, check if
	        // it is first node
	        if (curr == head) {
	            prev = head;
	            while (prev.next != head)
	                prev = prev.next;
	            head = curr.next;
	            prev.next = head;
	        }
	 
	        // check if node is last node
	        else if (curr.next == head) {
	            prev.next = head;
	        }
	        else {
	            prev.next = curr.next;
	        }
	        return head;
	    }
	    //20
	    //Reverse a Doubly Linked List
	    //O(n) O(1)
	    public static Node reverseDLL(Node  head)
	    {
	     Node temp = null;
	            Node current = head;
	            while (current != null) {
	                temp = current.prev;
	                current.prev = current.next;
	                current.next = temp;
	                current = current.prev;
	            }
	     
	            if (temp != null) {
	                head = temp.prev;
	            }   
	    return head;
	    }
	//21
	 //   Find pairs with given sum in dl
	   //O(n) O(1) 
	    public static void pairsum(Node head,int x)
	    {
	    	Node s= head,e=head;int i=0;
	    	while(e.next!=null) { e=e.next;}
	    	while(s!=e&&e.next!=s)
	    	{int t=s.data+e.data;
	    	if(t>x) {e=e.prev;}
	    	else if(t<x) {s=s.next;}
	    	else {System.out.println(s.data+" "+e.data);
	    	s=s.next;e=e.prev;i++;
	    	}}
	    	if(i==0) {System.out.println("Not found");}
	    	
	    }
		//22
		 //   Find pairs with given sum in dl
		   //O(n2) O(1) 
		    public static void threesum(Node head,int x)
		    {
		    	Node s= head,e=head,m=head;int i=0;
		    	while(e.next!=null) { e=e.next;}Node temp=e;m=s.next;
	if(head==null||head.next==null||head.next.next==null||head.next.next.next==null)
		return;
	while(s.next.next!=null) {
		    	while(m!=e&&e.next!=m)
		    	{int t=s.data+e.data+m.data;
		    	if(t>x) {e=e.prev;}
		    	else if(t<x) {m=m.next;}
		    	else {System.out.println(s.data+" "+m.data+" "+e.data);
		    	m=m.next;e=e.prev;i++;
		    	}}
	s=s.next;m=s.next;e=temp;	    	
	}
		    	if(i==0) {System.out.println("Not found");}
		    	
		    }
		    
		    //23
		    //Insertion sort algo
		    //o(nk)
		    Node sortAKSortedDLL2( Node head, int k) {
		        if(head == null || head.next == null)
		          return head;
		      for(Node i = head.next; i != null; i = i.next) {
		          Node j = i;
		          while(j.prev != null && j.data < j.prev.data) {
		                // swap j and j.prev node
		              Node temp = j.prev.prev;
		              Node temp2 = j.prev;
		              Node temp3 = j.next;
		              j.prev.next = temp3;
		              j.prev.prev = j;
		              j.prev = temp;
		              j.next = temp2;
		              if(temp != null)
		                  temp.next = j;
		              if(temp3 != null)
		                  temp3.prev = temp2;
		          }
		          if(j.prev == null)
		              head = j;
		      }
		      return head;
		  }
		    //heap method
		    //o(nlogk)
		    class compareNode implements Comparator<Node>
		    {
		      public int compare(Node n1, Node n2){
		        return n1.data-n2.data;
		      }
		    }
		    Node sortAKSortedDLL( Node head, int k)
		    {
		      if (head == null)
		        return head;
		      PriorityQueue<Node> pq = new PriorityQueue<Node>(new compareNode());
		      Node newHead = null, last = null;
		   for (int i = 0; head != null && i <= k; i++)
		      {pq.add(head);
		        head = head.next;
		      }
		      while (!pq.isEmpty())
		      {
		        if (newHead == null)
		        {
		          newHead = pq.peek();
		          newHead.prev = null;
		          last = newHead;
		        }
		        else
		        {
		          last.next = pq.peek();
		          pq.peek().prev = last;
		          last = pq.peek();
		        }
		        pq.poll();
		        if (head != null)
		        {
		          pq.add(head);
		          head = head.next;
		        }
		      }
		      last.next = null;
		    return newHead;
		    }
		  //24
			  //Rotate Doubly linked list by N nodes ****NOT DONE DONE HARDER ONE
			    //61. Rotate List
			    public ListNode rotateRight(ListNode head, int k) {
			        if(k==0)return head;
			        if(head==null||head.next==null)return head;
			        ListNode root=head,fin=head;
			        if(head==null)return head;
			        ListNode helper=head;
			        int i=1;
			        while(helper.next!=null){helper=helper.next;i++;}
			       // System.out.print(i+" "+k);
			        if(k>=i){k=k%i;if(k==0){return head;}}
			        int t=k;
			        
			        while(t>1&&root!=null){t--;root=root.next;}
			        ListNode temp=head,prev=null;
			        while(root.next!=null){prev=temp;temp=temp.next;root=root.next;}
			        prev.next=null;
			        root.next=fin;
			        head=temp;
			        return head;
			    }
		    //25
			    //Reverse a doubly linked list in groups of given size
			    //O(n)
			   static Node reversebyN(Node head, int k) {
				   if(head==null)return head;
				   Node curr = head,newn=null,prev=null;
						   int count=0;
						   while(curr!=null&&count<k)
						   {count++;newn=curr;prev=curr.prev;
						   curr.prev=curr.next;
						   curr.next=prev;curr=curr.prev;}
			   if(count>=k)
			   {head.next=reversebyN(curr,k);
			   head.next.prev=head;
			   }
			   return newn;
			   }
	 //28
		    //flattening thr linked Lists
		    //O(mn) O(1)
		    Node flatten(Node root)
		    {
		    	if(root==null||root.next==null)return root;
			
		    return merges(root,flatten(root.next));
		    }
		    static Node merges(Node x,Node y)
	         {
	              if(x==null)return y;
	              if(y==null)return x;
	             Node temp= new Node(-1);Node t=temp;
	             while(x!=null&&y!=null)
	             {
	                 if(x.data<=y.data)
	                 {temp.bottom=x;x=x.bottom;}
	                 else{temp.bottom=y;y=y.bottom;}
	             temp=temp.bottom;
	             }
	             while(x!=null){temp.bottom=x;x=x.bottom;temp=temp.bottom;}
	             while(y!=null){temp.bottom=y;y=y.bottom;temp=temp.bottom;}
	     return t.bottom;
	         }
	    
	    //29
	    //Sort 0s,1s,2s
	    //O(n) O(1)
	    static Node segregate(Node head)
	    {
	        Node z1=null,z2=null,o1=null,o2=null,t1=null,t2=null,curr=head;
	        while(curr!=null)
	        {int t=curr.data;
	            if(t==0){if(z1==null){z1=curr;z2=z1;}else {z2.next=curr;z2=z2.next;}}
	    else    if(t==1){if(o1==null){o1=curr;o2=o1;}else {o2.next=curr;o2=o2.next;}}
	    else    if(t==2){if(t1==null){t1=curr;t2=t1;}else {t2.next=curr;t2=t2.next;}}
	        curr=curr.next;
	        }
	    z2.next=o1;
	if(o2==o1&&o1==null){z2.next=t1;}else{ o2.next=t1;}
	if(t1==t2&&t1==null){if(o1==null){z2.next=null;}else{o2.next=null;}}else{t2.next=null;}
	    return z1;
	    }
	    //30
	    //Clone a linked list with next and random pointer 
	 //O(n) O(1)
	    Node copyList(Node head) {
	    	if(head==null)return null;
	    	Node f=head,temp=head,head2=head;
	        while(f!=null)
	        {Node g=new Node(f.data);g.next=f.next;f.next=g;f=g.next;}
	        f=head;
	     while(f!=null)
	     {if(f.arb==null){f.next.arb=null;}else{f.next.arb=f.arb.next;}   f=f.next.next;}
	     head2=head2.next;Node root=head2;f=head;
	        while(head2.next!=null){ f.next=head2.next;f=f.next;  head2.next=head2.next.next;head2=head2.next;}
	        f.next=null;
	        
	        
	      head2=root; f=head; 
	      return head2;
	      }
	    //31
	    //O(knlogn) O(1)
	    //Merge k sorted ll

	    Node mergeKList(Node[]arr,int k)
	     {
	         if(k==1)return arr[0];
	         Node root=null;
	         root=merged(arr[0],arr[k-1]);
	         if(k==2)return root;
	         for(int i=k-2;i>=1;i--)
	         {root=merged(root,arr[i]);}
	     return root;
	     }
	 static Node merged(Node x,Node y)
	 	         {
	 	              if(x==null)return y;
	 	              if(y==null)return x;
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
	 	             Node root=t.next;
	 	             t.next=null;
	 	     return root;
	 	         }
	    //32
	    //Multiply two linked lists
	    public long multiplyTwoLists(Node l1,Node l2){
	        long c=1000000007,num1=0,num2=0;
	        while(l1!=null||l2!=null)
	        {
	            while(l1!=null)
	            {num1=(num1*10)+l1.data;l1=l1.next;num1=num1%c;}
	            while(l2!=null)
	            {num2=(num2*10)+l2.data;l2=l2.next;num2=num2%c;}
	        }
	        long ans=0;
	        ans=((num1%c)*(num2%c))%c;
	        return ans;
	       }
	    //33
	    //Delete nodes having greater value on right
	    Node compute(Node head)
	    {
	        Node root=head,curr=root,prev=null;
	        root=reverse(root,null);
	        curr=root;
	        while(curr.next!=null)
	        {if(curr.data>curr.next.data)
	            {prev=curr.next;curr.next=curr.next.next;prev.next=null;}
	         else{curr=curr.next;}
	        }
	        root=reverse(root,null);
	        return root;
	    }

	    //34
	    //Segregate even and odd nodes in a Link List
	    //O(n) O(n)
	    Node divide(int N, Node head){
            Node odd1=null,odd2=null,even1=null,even2=null,curr=head;
     
       while(curr!=null)
       {
       if(curr.data%2==0){
           if(even1==null){even1=curr;even2=even1;curr=curr.next;even1.next=null;}
           else{even2.next=curr;curr=curr.next;even2=even2.next;}
       }else
       {
           if(odd1==null){odd1=curr;odd2=odd1;curr=curr.next;odd1.next=null;}
           else{odd2.next=curr;curr=curr.next;odd2=odd2.next;}
       }
       
           
       }
        if(odd1 == null || even1 == null) {
           return head;
       }
       even2.next=odd1;
       odd2.next=null;
   return even1;
   }
	    //35
	    //O(n) O(1)
	    //Nth node from end of linked list 
	    // SINGLE ITERATION
	    int getNthFromLast(Node head, int n)
	    {
	        int i=1;Node a=head,b=head;
	        while(i!=n){i++;b=b.next;if(b==null){return -1;}}
	        while(b.next!=null){a=a.next;b=b.next;}
	        return a.data;
	    }
	    //Leetcode
	    // Remove Nth node from end of linked list 
	    // SINGLE ITERATION
	    public ListNode removeNthFromEnd(ListNode head, int n) {
	        if(head.next==null)return null;
	       int i=1;ListNode a=head,b=head,prev=null;
		        while(i!=n){i++;b=b.next;if(b==null){return head;}}
	        if(b.next==null){return head.next;}
		        while(b.next!=null){prev=a;a=a.next;b=b.next;}
	        
	        prev.next=prev.next.next;a.next=null;
		        return head;
		    }
//36
	//First non-repeating character in a stream 
	    public static String FirstNonRepeating(String A)
	    {
	        int b[]= new int[26];
	        StringBuilder ans=new StringBuilder();
	        Arrays.fill(b,-1);
	        List<Character>a= new LinkedList<Character>();
	        for(int i=0;i<A.length();i++)
	        {   char g=A.charAt(i);
	        	int t=(int)(g-'a');
	        	
	        	if(b[t]==-1) {a.add(g);b[t]=0;ans.append(a.get(0));}
	        	else {
	        		if(b[t]==0) {b[t]=1;a.remove(new Character(g));}
	        		if(a.isEmpty())ans.append('#');else ans.append(a.get(0));
	        	}
	   	        }
	        return ans.toString();
	    }
	    
	    }

//O(m+n)
//public static Node Merging(Node head1, Node head2)
//{
//Node curr1=head1,curr2=head2,root=null,next=null;
//while(curr1!=null||curr2!=null)
//{
//int m=curr1!=null?curr1.data:1000000;
//int n=curr2!=null?curr2.data:1000000;
//int ans=Math.min(m,n);
//Node t=new Node(ans);
//if(root==null){root=t;next=t;}
//else{next.next=t;next=next.next;}
//if(curr1!=null&&curr1.data==ans){curr1=curr1.next;}
//else{if(curr2!=null){curr2=curr2.next;}}
//}
//return root;
//}
