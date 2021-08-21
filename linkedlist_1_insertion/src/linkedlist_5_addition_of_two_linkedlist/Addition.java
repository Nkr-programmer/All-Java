package linkedlist_5_addition_of_two_linkedlist;

import linkedlist_4_further.loop_remove.Node;

public class Addition {
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




public static int change(Node a,Node b,int x) {

if(a.next!=null&&b.next!=null)
	{
x= change(a.next,b.next,x);
}
	
		 
	
if((a.data+b.data+x)%10>=0)
			{
			b.data =(a.data+b.data+x)%10;
			return (a.data+b.data+x)/10;
			}
return x;

}



public  Node rotate(int x) {
	
	
	if(x==0)
		return head;
	else
		if(x>=5) {return head;}
	
	
	int t=1;
	Node tor =head;
	while(t!=x) {tor=tor.next;t++;}
	Node uor =tor.next;
	tor.next= null;
	Node vor = head;
	head=uor;
	Node temp =head;
	while(temp.next!=null)
	{
		temp=temp.next;
		
	}
	temp.next=vor;
	
	return head;
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
		
		
	Addition list	= new Addition(); 

		list.insert(1,0);
		
		list.insert(2,2);
		
		list.insert(3,4);
		list.insert(4,6);
		list.insert(5,8);
	list.printed();
	
		System.out.println("\n");
		
		Addition list2	= new Addition(); 

	list2.insert(1,1);
	
	list2.insert(2,3);
	
	list2.insert(3,5);
	list2.insert(4,7);
	list2.insert(5,9);
list2.printed();

		
		int x=0;
		int c= change(list.head,list2.head,x);
		list2.printed();
 list2.head=list2.rotate(3);
list2.printed();
}
}