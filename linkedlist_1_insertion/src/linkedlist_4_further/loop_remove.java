package linkedlist_4_further;

import java.util.HashSet;

import linkedlist_4_further.loop_remove.Node;

public class loop_remove {
	Node head;
	
	
	public static  class  Node{
		public int data;
		public Node next;
		public Node(int d){
			
			data=d;
			next=null;
		}
	}
	
	
	public void looping()
	{
		boolean xtra=false;
		Node repeat= head;
				Node x=null;
		while(repeat.next!=null) {
			x=repeat.next;
			while(x.data==repeat.data||x.next!=null) 
		{
				if(x.data==repeat.data&&x.next.data==repeat.next.data)
				{
				xtra=true;
				break;
				}
				x=x.next;
			
		}
			
			repeat=repeat.next;
		}
		
		
		
		if(xtra==true)
		{
			System.out.println("wow");
	
		}
		else 
			if(xtra==false)
		{
				System.out.println("hey");
		}
		
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
	
    
    


public void printed(){
	
Node temp =head ;
while(temp!=null)
{
  System.out.print(temp.data);
  temp=temp.next;
}
System.out.print("\n");
	
}

public boolean loopings (Node h) {
	HashSet<Node> s= new HashSet<Node>(); 	
	Node x=null;
	while(h!=null) {
		if(s.contains(h)){
			x.next=null;
return true;

		}
		else {
			s.add(h);
			x=h;
			h=h.next;
		}
	}
	return false;
		
}


public static void main(String[] args) {
		
		
	loop_remove list	= new loop_remove(); 

		list.insert(1,0);
		
		list.insert(2,1);
		
		list.insert(3,2);
		list.insert(4,3);
		list.insert(5,4);
		list.insert(6,5);
		list.insert(7,6);
		list.insert(8,7);
		list.insert(9,8);
		
		list.printed();
Node temp=list.head;
while(temp.next!=null)
{
temp=temp.next;	
}

		
		temp.next=list.head.next.next;
	//	list.printed();
			System.out.println("\n");
		if(list.loopings(list.head))
		{
			System.out.println("yes");
			list.printed();
		}
		else{
			System.out.println("no");
			list.printed();
		}
	//	list.printed();


}

}

