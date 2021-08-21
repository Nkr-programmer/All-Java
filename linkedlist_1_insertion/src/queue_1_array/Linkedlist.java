package queue_1_array;

import java.util.Stack;


class Node {
	int data;
	Node next;
    Node(int d){
		
		this.data=d;
		this.next=null;

	}
	
	
}

class Linkedlist {

	Node front,rear;
	public Linkedlist()
	{
		this.front=this.rear=null;
	}
	
	boolean isempty() {
		
		if(this.front==null)
			return true;
		return false;
	}
	
 void enque(int data) {
		
		Node temp =new Node (data);
		
		
		if(this.rear==null)
		{
			this.rear=temp;
			this.front =temp;
		return ;
		}else {
			this.rear.next=temp;
			this.rear=temp;
		}
		
	
	}
	
	void deque() {
		
		if(this.front==null)
		{
			this.rear=null;
			System.out.println("underflow");
			return ;
		}
		Node x=this.front;
		this.front=this.front.next;
		x.next=null;
		rear();top();
		
	}
	void top() {
		if(this.front!=null)
		{
			System.out.println(this.front.data);
			
		}else
		if(this.front==null)
			System.out.println("underflow");
	}

 void rear() {
		if(this.rear!=null)
		{
			System.out.print(this.rear.data+" ");
			
		}else
		if(this.rear==null)
			System.out.println("underflow");
	}
	
 public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Linkedlist	 s	= new Linkedlist(); 


	     
		s.enque(9);s.rear();s.top();
		s.enque(8);s.rear();s.top();
		s.enque(7);s.rear();s.top();
		s.enque(6);s.rear();s.top();
		s.enque(5);s.rear();s.top();
		s.enque(4);s.rear();s.top();
		s.enque(3);s.rear();s.top();
		s.enque(2);s.rear();s.top();
		s.enque(1);s.rear();s.top();
		s.enque(0);s.rear();s.top();
		if(s.isempty()==true)
		{
			System.out.println("empty");
		}
		else
		{
			System.out.println("not empty");
		}
		
		s.deque();
		s.deque();
		s.deque();
		s.deque();
		s.deque();s.deque();s.deque();s.deque();
		System.out.println();
		System.out.println(s.front.data);
		System.out.println(s.rear.data);
	}

}


