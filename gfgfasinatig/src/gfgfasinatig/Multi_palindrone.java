package gfgfasinatig;

import java.util.Scanner;

public class Multi_palindrone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		  int t;
//		   boolean x=false;
//	    	Scanner sc = new Scanner(System.in);
//		    t = sc.nextInt();
//		    
//		 while(t>0){
//				 
//		
//		int n;
//		n=sc.nextInt();
//		
//		int b=10,d=0,c=0,f,g;
//		int a[]=new int[n];
//		int q[]=new int[n];
//		
//		for(int i=0;i<n;i++)
//		{
//		 a[i] = sc.nextInt();
//		}
//		
//		for(int i=0;i<n;i++)
//		{
//		 q[i] = a[i];
//		}
//		 
//		 
//		
//		for(int i=0;i<n;i++)
//		{
//		int e=0;
//		
//		while(a[i]>0) {
//			c=a[i]/b;
//			d=a[i]%b;
//			
//			a[i]=c;
//			f=d;
//		    e=e*10+f*10;
//			
//			
//		 }
//		e=e/10;
//		
//		 
//		if(q[i]==e)
//		{
//			x=true;
//	//		System.out.println(q[i]+" "+e);
//		}
//		else
//		{
//			x=false;
//		//	System.out.print(q[i]+" "+e);
//			break;
//		}
//			
//		
//		}  
//		
//		
//		if(x==true)
//		{
//			System.out.print("1");
//		}
//		else
//		{
//			System.out.print("0");
//		}
//		
//		System.out.println();
//
//			t--;
//	 }
		
		
		
 		  int t;
boolean x=false;
Scanner sc = new Scanner(System.in);
t = sc.nextInt();

while(t>0){
	 

int n;
n=sc.nextInt();

int b=10,d=0,c=0,f,g;

int q[]=new int[n];
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i] = sc.nextInt();
}

for(int i=0;i<n;i++)
{
q[i] = a[i];
}



for(int i=0;i<n;i++)
{
int e=0;

while(a[i]>0) {
c=a[i]/b;
d=a[i]%b;

a[i]=c;
f=d;
e=e*10+f*10;


}
e=e/10;


if(q[i]==e)
{
x=true;
//		System.out.println(q[i]+" "+e);
}
else
{
x=false;
//	System.out.print(q[i]+" "+e);
break;
}


}  


if(x==true)
{
System.out.print("1");
}
else
{
System.out.print("0");
}

System.out.println();

t--;
}
	}

}
