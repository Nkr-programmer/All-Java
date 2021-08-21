package linkedlist_3_merging;

import linkedlist_4_further.loop_remove.Node;

public class Merging {
	
	Node head;

    public void	insert(int n,int value){
 	    Node p= new Node(value);
    int i;
 	if(n==1)
   	{
   	p.next=head;
   	head=p;
   	return;
   	}
    Node temp;
   	temp= head;
   	    for(i=1;i<n-1;i++){
   	            temp=temp.next;
   	    }
   	    p.next=temp.next;
   	    temp.next=p;
 }

public void printed(){
	
Node temp =head ;
while(temp!=null)
{
  System.out.print(temp.data);
  temp=temp.next;
}
System.out.print("\n");
	
}

public void delete(int n) {
	 
	 Node temp = head,prev=null;
	 if((temp!=null)&&(temp.data==n)) {
	 
	 head=temp.next ;
	 return ;
	 }
	 
	 
	 
	 while(temp.data!=n)
	 {
		 
		 prev=temp;
		 temp=temp.next;
	 }
	 
	 
	 if(temp.next==null)
	 {
		 return ;
	 }
	 
	 prev.next=temp.next;
}
public static void main(String[] args) {
		
		
		Merging list	= new Merging(); 

		list.insert(1,0);
		
		list.insert(2,2);
		
		list.insert(3,4);
		list.insert(4,6);
		list.insert(5,8);
	list.printed();
	
		System.out.println("\n");
		
	Merging list2	= new Merging(); 

	list2.insert(1,1);
	
	list2.insert(2,7);
	
	list2.insert(3,9);
	list2.insert(4,5);
	list2.insert(5,9);
list2.printed();

		
		
		list.head= new merg().change(list.head,list2.head);
		list.printed();
//		list.head= new merged().change(list.head,list2.head);
//		list.printed();


		
		Merging list3	= new Merging(); 

		list3.insert(1,8);
		
		list3.insert(2,9);
		
		list3.insert(3,5);
		list3.insert(4,1);
		list3.insert(5,0);
	list3.printed();
	
	
list3.head=demerge(list3.head);
list3.printed();

}





private static Node demerge(Node head2) {

	
	Node head =head2;
	
	if((head==null) ||(head.next==null))
			{
		return head;
			}
	
	
	Node middle= spliter(head2);

	
//	Node middles= spliter(head2);
//	Node middle=middles.next;
//	middles.next =null;	
	
		Node left=demerge(middle);
		Node right=demerge(head);
	head=mergeorshort(left,right);
	return head;
}





private static Node mergeorshort(Node a, Node b) {
	// TODO Auto-generated method stub
	
	Node result= null;
	
	if(a==null)
	{
		return b;
	}
	else if(b==null)
	{
		return a;
	}
	
	
	if(a.data<=b.data)
	{
		result=a;
		result.next =mergeorshort(a.next,b);
	}else
		if(a.data>=b.data)
	{
		result=b;
		result.next =mergeorshort(a,b.next);
		
	}
	
	return result;	
}
private static Node spliter(Node head2) {
	
	if(head2==null)
	{return head2;}
	Node less = head2;
	 Node more = head2.next;
	while(more.next!=null)
	{
		more=more.next;
		if(more.next!=null)
		{
			less=less.next;
			more=more.next;	
		}
	}
	
	Node middle=less.next;
	less.next=null;
	return middle;
//	if(head2==null) {return head2;}
//	Node less =head2 ,more=head2;
//	while(more.next!=null&&more.next.next!=null)
//	{
//		more=more.next.next;
//		less=less.next;
//	}
//	return less;
//	
}
}
class merg {
	
Node change(Node a,Node b) {
	
	Node dumb =new Node(0);
	Node  localhead = dumb;
	
	while((a!=null)||(b!=null))
	{
		if(a==null)
		{
			localhead.next=b;
			break;
		}
		else
			if(b==null)
			{
				localhead.next=a;	
				break;
			}
			else
		
		if(a.data>=b.data)
		{
			
			localhead.next=b;
			b=b.next;
			
		}
		else
			if(a.data<=b.data)
			{
				localhead.next=a;
				a=a.next;			
			}
		
		localhead=localhead.next;
		
	}
	
	return dumb.next; 
}
	
} 
class merged {
	
public Node change(Node a,Node b) {
		if(a==null)
		{
			return b;
			
		}
		
			if(b==null)
			{
				return a;	
				
			}
			
		
		if(a.data>=b.data)
		{

          b.next=    change(a,b.next);	
          return b;
			
		}
		else
			if(a.data<=b.data)
			{
			a.next=	change(a.next,b);
			return a;
			}
		Node x= null;
	return x;
		
	}
	
	
}
	
