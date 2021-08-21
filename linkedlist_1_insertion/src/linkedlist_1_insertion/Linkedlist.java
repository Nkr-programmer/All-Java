package linkedlist_1_insertion;

public class Linkedlist {
	Node head;
	
	
	static  class  Node{
		int data;
		Node next;
		Node(int d){
			
			data=d;
			next=null;
		}
	}

	public void	insertbefore(){
		   Node p= new Node(4);
		    
		    p.next=head;
		    head= p;
   	 
    }
	
	
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
	
public void	insertafter(){
	  Node temp;
     temp= head;

    Node p= new Node(5);

     p.next=null;

    if(temp==null)
    {
        head=p;
        return ;
    }
while(temp.next !=null){
temp=temp.next;
}
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
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Linkedlist list	= new Linkedlist(); 
		list.head =new Node(1);
		Node two= new Node(2);
		Node three= new Node(3);
		
		list.head.next=two;
		two.next=three;
		list.printed();
		
		list.insertbefore();
		list.printed();
		
		list.insertafter();
		list.printed();
		
		list.insert(3,6);
		list.printed();
		list.insert(3,7);
		list.printed();
	}

}
