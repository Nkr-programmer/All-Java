package stack_array_2;

import java.util.Stack;

public class Nge {
	static Stack<Integer> p= new Stack<Integer>();

	
	public static void reversal(int x) {
		
		
		
		if(p.isEmpty()==false) {
			
			x=p.pop();
			reversal(x);
putinbottom(x);		
	
		                        }
	
		
		
	}
	
	
	public static void putinbottom(int x) {
		
		if(p.isEmpty()==true)
		{
			p.push(x);
			
		}
		else {
			int  a = p.pop();
			putinbottom(x);
			
			p.push(a);
		}
		
		
	}

public static void sortastack(int x) {
		
		
		
		if(p.isEmpty()==false) {
			
			x=p.pop();
			sortastack(x);
			sort(x);		
	
		                        }
	
	
		
	}
	
	
	public static void sort(int x) {
		
		if(p.isEmpty()==true)
		{
			p.push(x);
			
		}
		else 
		{
			int  a = p.pop();
		if(x>=a)
			sort(x);
		else 
		if(x<a)
		{
			int temp=x;
			x=a;
			a=temp;
			sort(x);
			
		}
			p.push(a);
			
		}
		
		
	}

public static void nextgreater(int a[],int n){
	int x=0;
	for(int i=0;i<n;i++)
	{x=0;
		for(int j=i+1;j<n;j++)
		{
			if(a[i]<a[j])
			{x=1;
				System.out.println(a[j]);
                 break;
			}
			
		}	
		if(x==0) {
			System.out.println("-1");
		}
		
	}
}


public static void nextelement(int a[],int n) {
	
	Stack<Integer> s= new Stack<Integer>();
	int element,next;
	s.push(a[0]);
	
	
	
	for(int i=1;i<n;i++)
	{
		
		next=a[i];
		
		if(s.isEmpty()!=true)
		{
			element=s.pop();
		while(element<next) {
			System.out.println(element+"-->"+next);
			if(s.isEmpty()==true)
			{
				break;
			}
			element=s.pop();
		}
		
		
		if(element>next)
		{
			s.push(element);
		}
		}
		s.push(next);
		
	}
	
	while(s.isEmpty()!=true)
	{
		element=s.pop();
		next=-1;
		System.out.println(element+"-->"+next);
		
	}
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {16,2,5,15};


//		nextgreater(a,4);
//		nextelement(a,4);


int y=0;
p.push(-3);
p.push(-8);
p.push(-2);
p.push(10);
p.push(0);
p.push(4);
p.push(5);
p.push(1);
p.push(9);
p.push(3);
p.push(8);
p.push(2);
p.push(10);

      sortastack(y);
  	reversal(y);
  	while(p.isEmpty()==false)
		{
			System.out.println(p.pop());
	
		}



	}

	}
	


