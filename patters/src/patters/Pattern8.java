package patters;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
int i,j;

		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		for(i=1;i<=x;i++)
		                {int k=1;	
			for(j=1;j<=2*x-1;j++)
       {
if((j<=x-i)||(j>=x+i))	
                {
System.out.print(" ");
                 }
else
                 {
	   System.out.print(k++);
	
                  }
       }
				
System.out.println();			
		//1	5
			
		                 }
		
		
		
		
		}
		

	}


