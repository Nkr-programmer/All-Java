package fibonaci;

import java.util.Scanner;

public class Fibonnacci1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		

		int a=0,b=1,c,d,e,n;
		Scanner sc = new Scanner(System.in);
		
		
		e=sc.nextInt();
		int z[]=new int [e*e];
		z[0]=a;
		z[1]=b;
		for(int i=2;i<e*e;i=i+2)
		{
			if(b<e) {
			c=a+b;
			d=b+c;
			a=c;
			b=d;
			z[i]=c;
			z[i+1]=d;
			}
			

		}
		
		for(int i=0;i<e*e;i++)
		{
			
			if((z[i]!=0))
			System.out.print(z[i]+" ");
			
		}
		
		
		
		
	}

}
