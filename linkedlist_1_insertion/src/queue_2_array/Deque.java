package queue_2_array;

import queue_1_array.Array;

public class Deque {

	public final int 
	size =1000;
	int top;
	int rear;
	int a[]=new int[size];
	
	
	
	Deque()
	{
		top=-1;
		rear =-1;
	}

	
	
	public  boolean isfull() 
	{
if(top-rear==1)
{
System.out.println("full");
return true;
}else
	if(top==0&&size-rear==1)
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
	
	
public	void insertrear(int data) 
    {
	if(isfull()) {return ;}
	if(top==-1)
	{
	top=0;
	}
	
	if(rear<size) {
		a[++rear]=data;
	}else
		if(rear==size)
		{
			rear=-1;
		}
	
	
	
	
	}

public	void insertfront(int data) 
{
	if(isfull()) {return ;}
	
	if(top==-1)
	{
		a[++top]=data;
		rear++;
	}
	else
		if(top==0)
	{
			top=size-1;
		a[size-1]=data;
	}else
	{
		a[--top]=data;
	}
	
	
}


public void deletefront() 
{
	if(isempty()) {return ;}
	if(rear==top)
	{
		rear=-1;
		top=-1;
	}
	
	if(top==size-1)
	{
		top=0;
	}
	else 
	{
		top++;
	}
	
	rear();
	top();
}	

public void deleterear() 
{

	if(isempty()) {return ;}
	if(rear==top)
	{
		rear=-1;
		top=-1;
	}
	
		if(rear==0)
	{
		rear=size-1;
	}
	else 
	{
		rear--;
	}
	
	rear();
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
			Deque s = new Deque();
     
     
     
				
     
     
     
			s.insertrear(9);s.rear();s.top();
			s.insertrear(8);s.rear();s.top();
			s.insertrear(7);s.rear();s.top();
			s.insertrear(6);s.rear();s.top();
			s.insertrear(5);s.rear();s.top();
			s.insertrear(4);s.rear();s.top();
			s.insertrear(3);s.rear();s.top();
			s.insertrear(2);s.rear();s.top();
			s.insertrear(1);s.rear();s.top();
			s.insertfront(0);s.rear();s.top();
			s.insertfront(19);s.rear();s.top();
			s.insertfront(18);s.rear();s.top();
			s.insertfront(17);s.rear();s.top();
			s.insertfront(16);s.rear();s.top();
			s.insertfront(15);s.rear();s.top();
			s.insertfront(14);s.rear();s.top();
			s.insertfront(13);s.rear();s.top();
			s.insertfront(12);s.rear();s.top();
			s.insertfront(11);s.rear();s.top();
			s.insertfront(10);s.rear();s.top();
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
			s.deletefront();
		    s.deletefront();
			s.deletefront();
		    s.deletefront();
			s.deletefront();
		    s.deletefront();
		    s.deletefront();
		    s.deletefront();
			s.deletefront();
		    s.deletefront();
			s.deletefront();
		    s.deletefront();
		    s.deleterear();
		    s.deleterear();
		    s.deleterear();
		    s.deleterear();   
		    s.deleterear();
		    s.deleterear();
		    s.deleterear();
		    s.deleterear();   
		    s.deleterear();
		    s.deleterear();
		    s.deleterear();
		    s.deleterear();
		
		}
	
}
