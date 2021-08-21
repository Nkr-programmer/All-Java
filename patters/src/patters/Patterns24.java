package patters;

import java.util.Scanner;

public class Patterns24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		int i,j,c=1,k,r;
		
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		for(i=1;i<=x;i++)
		{
			for(j=1;j<=x;j++)
{
if(j<=x-i)	
{
System.out.print(" ");
}
else
{
	  for(k=1;k<=i;k++) {
		  if(k==1||i==1)
		  {
			  c=1;
			  
		  }
		  else {
			  c=c*(i-k+2)/2;
			 
		  }
		  }
	  System.out.print(c+" ");
	       }


}
				
System.out.println();			
		//4	
			
		}
		
		
		
		
		
		
		
		
}}