package stack_array_3;

import java.util.Stack;

public class Q__array {
	static Stack<Integer> q= new Stack<>();
	static Stack<Integer> n= new Stack<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {16,2,5,15,8,1};
int s[]= new int[6] ;


//stockspan(a,6);
//stockspanrecurtion(a,6,s);
//
//  
//
//for(int i=0;i<6;i++)
//{
//System.out.println(s[i]);	
//}




 Q__array p= new Q__array();

int y=0,x=0;
p.push(-3);
p.push(-8);
p.push(-2);
p.push(-10);
p.push(0);
p.push(4);
p.push(5);
p.push(1);
p.push(9);
p.push(3);
p.push(8);
p.push(2);
p.push(10);
System.out.println(min());


	while(n.isEmpty()==false)
	{
		System.out.println(n.pop());

	}
	}
	private static void push(int x) 
	{
		
			
		if(n.isEmpty()==true)
		{
		n.push(x);
			q.push(x);
			
		}else
		{
			q.push(x);
			int y= n.peek();
			if(x<y)
			{
				n.push(x);
			}

		
			
		}
		
		}  
	
		
		
	private static int min() {
		int y=n.peek();
		return y;
	
	
	}
	private static int  pop() {
		int y= n.pop();
	if(n.isEmpty()==false)
		n.pop();		
		return y;
	}
	
	private static void stockspanrecurtion(int[] a, int n,int[] h) {
	
		int x=0,t=0;
		while(x<n)
		{
			if(a[x]<=a[n-1])
			{
				t++;
			}
			h[n-1]=t;
			x++;	
		}
		if(n>0)
		{
			stockspanrecurtion(a,n-1,h);	
		}	
	}
	private static void stockspan(int[] a, int n) {
		int x=0;
		for(int i=0;i<n;i++)
		{x=0;
			for(int j=0;j<=i;j++)
			{
				if(a[i]>=a[j])
				{
					x+=1;
				}
			}	
				System.out.println(x);	
		}	
	}
}
