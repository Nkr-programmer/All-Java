package multi_dimensional_add;

import java.util.Scanner;

public class Multi_dimensional_add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]=new int[4][4];
		int b[][]=new int[4][4];
		int c[][]=new int[4][4];
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
		c[i][j]=a[i][j]+b[i][j]	;
		System.out.print("| "+c[i][j]+" |");
		}
		System.out.println();
		
			
			
		}
			
		
		
		
		
		
		
		}

}
