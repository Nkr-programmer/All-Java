package stack_array_1;

public class Arrays {

	
	public final int size =1000;
	int top;
	int a[]=new int[size];
	
	Arrays()
	{
		top=-1;
		
	}
	public  boolean isempty() 
	{
if(top<0)
{
System.out.println("underflow");
return true;
}
	
	return false;

	}
	
public	void push(int data) 
    {
	
	if(top>=size-1)
	{
	System.out.println("overflow");	
	}
	else 
	{
	a[++top]=data;
	}
	
	
	
	}
	

public void pop() 
{
	
int x;
x=a[top++];
System.out.println(x);
	
}
public void top()
{
	System.out.println(a[top]);
}
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Arrays s= new Arrays();
			s.push(9);s.top();
			s.push(8);s.top();
			s.push(7);s.top();
			s.push(6);s.top();
			s.push(5);s.top();
			s.push(4);s.top();
			s.push(3);s.top();
			s.push(2);s.top();
			s.push(1);s.top();
			s.push(0);s.top();
			if(s.isempty()==true)
			{
				System.out.println("empty");
			}
			else
			{
				System.out.println("not empty");
			}
			s.pop();
			
		}
	
}
