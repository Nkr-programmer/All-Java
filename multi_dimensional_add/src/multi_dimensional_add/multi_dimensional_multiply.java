package multi_dimensional_add;

import java.util.Scanner;

public class multi_dimensional_multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]=new int[4][4];
		int b[][]=new int[4][4];
		int c[][]= new int[4][4];
		int o=a.length;
		System.out.println(o);
		Scanner sc=new Scanner (System.in);
		int n;
		System.out.println("enter first array");
		for(int i=0;i<4;i++)
		{for(int j=0;j<4;j++)
		{
		 a[i][j]=sc.nextInt();
		}
		System.out.println();
		}
		
		
		for(int i=0;i<4;i++)
		{for(int j=0;j<4;j++)
		{
			System.out.print("| "+a[i][j]+" |");
		}
		System.out.println();
		
		}
		
		System.out.println("enter second array");
		for(int i=0;i<4;i++)
		{for(int j=0;j<4;j++)
		{
		 b[i][j]=sc.nextInt();
		}
		System.out.println();
		}
		System.out.println();
		
		for(int i=0;i<4;i++)
		{for(int j=0;j<4;j++)
		{
			System.out.print("| "+b[i][j]+" |");
		}
		System.out.println();
		
			
			
		}
	
		System.out.println();
		for(int i=0;i<4;i++)
		{for(int j=0;j<4;j++)
		{
			c[i][j]=0;
			for(int k=0;k<4;k++) {
				c[i][j]=c[i][j]+a[i][k]*b[k][j];
		
		}
			System.out.print("| "+c[i][j]+" |");
		}
		System.out.println();
		
			
			
		}
			
		
		
		
		
		
		
		}

}

