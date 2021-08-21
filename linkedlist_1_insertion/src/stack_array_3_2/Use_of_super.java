package stack_array_3_2;

import java.util.Stack;
public class Use_of_super extends Stack<Integer> {
	
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




Use_of_super p= new Use_of_super();

int y=0,x=0;
p.push(-3);
p.push(-8);
p.push(-2);
p.push(-10);
p.push(0);
p.push(-14);
p.push(5);
p.push(1);
p.push(9);
p.push(3);
p.push(8);
p.push(2);
p.push(10);
System.out.println(min());



p.print();
}
 void push(int x) 
{
	
		
	if(n.isEmpty()==true)
	{
	n.push(x);
	super.push(x);
		
	}else
	{
		super.push(x);
		int y= n.peek();
		if(x<y)
		{
			n.push(x);
		}

	
		
	}
	
	}  

 static int min() {
	int y=n.peek();
	return y;


}
public Integer  pop() {
	int y= super.pop();
if(n.isEmpty()==false)
	n.pop();		
	return y;
}

public void print() {
	while(super.isEmpty()==false)
	{
		System.out.println(pop());

	}
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
