package queue_1_array;


public class Array {

	public final int 
	size =1000;
	int top;
	int rear;
	int a[]=new int[size];
	
	Array()
	{
		top=-1;
		rear =-1;
		
	}
	public  boolean isfull() 
	{
if(rear==size-1)
{
System.out.println("full");
return true;
}
	
	return false;

	}
	
	public  boolean isempty() 
	{
if(top==rear)
{
System.out.println("underflow");
return true;
}
	
	return false;

	}
	
	
public	void enque(int data) 
    {
	
	if(rear>=size-1)
	{
	System.out.println("overflow");	
	}
	else 
		if(rear==top&&top==-1)
	{
	a[++rear]=data;
	top++;
	}
		else {
			a[++rear]=data;
		}
	
	
	
	
	}
	

public void deque() 
{
	
int x;
x=a[top++];
if(top==rear)
{
System.out.println("empty ");	
}


rear ();
top();	
}
public void top()
{
	System.out.println(a[top]);
}
public void rear()
{
	System.out.print(a[rear]+" ");
}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
     Array s = new Array();
     
     
     
			
     
     
     
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
			if(s.isfull()==true)
			{
				System.out.println("full");
			}
			else
			{
				System.out.println("not full");
			}
			s.deque();
			s.deque();
			s.deque();
			s.deque();
			s.deque();s.deque();s.deque();s.deque();s.deque();s.deque();s.deque();s.deque();
			
		}
	
}
