package linkedlist_2_deletion;



public class Linkedlist {
	Node head;
	
//	
	static  class  Node{
		int data;
		Node next;
		Node(int d){
			
			data=d;
			next=null;
		}
	}

	
	
	//
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
	
//
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
 
 public int counts() {
	 
Node temps=head;
	 int k=0;
if(temps.next==null)
{
	return ++k;
}
else
	while(temps.next!=null)
	{temps=temps.next;
k++;	
	}
return k;
	 
 }
 
 public void reverse() {
	 
	 Node current =head,nexter=null,prev=null;
	 
	 
	 while(current!=null)
	 {
		 nexter=current.next;
		 current.next=prev;
		 prev=current;
		 current =nexter;
		 
	 }
	 
	 
	 head =prev;
	
	 
 }
 
 
 public void reverserecurtion(Node current,Node nexter,Node prev) {

	 
	 //Node current =head,nexter=null,prev=null;
	 
	 
	 if(current!=null)
	 {
		 nexter=current.next;
		 current.next=prev;
		 prev=current;
		 current =nexter;
		
	 }else {
		 
		 return ;
	 }
	 head =prev;
	 reverserecurtion(current, nexter, prev);
	
	
	 
	 
 }
 
 
 
 public Node reverserecurtionnadvanced(Node store) {
	 
	 if(store == null||store.next==null)
	 {
		 return store;
	 }
	 
	 Node  rest = reverserecurtionnadvanced(store.next);
	 store.next.next=store;
	 store.next =null;
	 return rest;
	 
	 
 }
 public void swapping(int x,int y) {
	 
	 int t=0,x3=1,y3=1;
	 t=counts();
	 Node y1=null,y2=head;
	 Node x1=null,x2=head;
	 
	 
	 
	 
	 if(x==y)
	 {
		 return ;
	 }
	 else
	 if((x<=t)&&(x>0)&&(y<=t)&&(y>0))
	 {
	

		 
		 while(x3!=x)
		 {
			 x3++;
			 x1=x2;
			 x2=x2.next;
			
		 }
		
		
		 
		 while(y3!=y)
		 {
			 y3++;
			 y1=y2;
			 y2=y2.next;
		 }
		 
		 if(x!=1)
		 {
			 x1.next=y2;
		 }
		 else
		 {
			 head=y2;
		 }
		 
		 
		 if(y!=1)
		 {
			 y1.next=x2;
		 }
		 else
		 {
			 head=x2;
		 }
		 
		
		 
	 }
	 else
	 {
		 return ;
	 }
	 Node temp=null;
	 temp =x2.next;
	 x2.next=y2.next;
	 y2.next=temp;
	 
	 
 } 

 public void deelete(int n) {
	 int i=0;
	 Node temp = head,prev=null;
	 if((temp!=null)&&(i==n)) {
	 
	 head=temp.next ;
	 return ;
	 }
	 
	 
	 
	 while(i!=n)
	 {
		 
		 prev=temp;
		 temp=temp.next;
		 i++;
	 }
	 
	 
	 if(temp==null)
	 {
		 return ;
	 }
	 
	 prev.next=temp.next;
 }
 
 
 
 // deleting a value of given key
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Linkedlist list	= new Linkedlist(); 
		list.head =new Node(1);
		Node two= new Node(2);
		Node three= new Node(3);
		
		list.head.next=two;
		two.next=three;
		list.printed();
		

		
		list.insert(3,6);
		list.printed();
		list.insert(3,7);
		list.printed();
		
		
		list.delete(1);
		list.printed();
		list.delete(7);	
		list.printed();
		list.delete(3);	
		list.printed();
		
		list.insert(3,5);
		list.insert(3,4);
		list.insert(3,3);
	
		list.deelete(1);
		list.printed();
		list.deelete(0);
		list.printed();
		
		list.insert(1,2);
		list.insert(1,1);
		list.insert(1,0);
		list.insert(7,6);
		list.printed();
		
		int k=0,t=0;
		 Node temps = list.head;
		t=list.counts();
		System.out.println(t);
		
		int x=1,y=5;
		list.swapping(x,y);
		list.printed();
		
		list.swapping(x,y);
		list.printed();
		
		list.reverse();
		list.printed();
		
		
		list.reverserecurtion(list.head,null,null);
		list.printed();
		
	
		 
			list.head=	list.reverserecurtionnadvanced(list.head);
		//	System.out.println(tempered.data);
		list.printed();
		
		int toe=2;
	list.head=list.reverserecurtionfixed(toe,list.head);
list.printed();
	}



public Node reverserecurtionfixed(int toe,Node head) {
	int n=0; 
	 Node current =head,nexter=null,prev=null;
while(n!=toe&&current!=null)
	 {
	     n++;
	
		 nexter=current.next;
		 current.next=prev;
		 prev=current;
		 current =nexter;
        	  }


if(nexter!=null)
	head.next=reverserecurtionfixed(toe,nexter);

return prev;
}

}
