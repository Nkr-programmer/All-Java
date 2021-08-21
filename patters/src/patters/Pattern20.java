package patters;

import java.util.Scanner;

public class Pattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int i,j;
		
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		for(i=1;i<=(x+1)/2;i++)
		                {
			for(j=1;j<=x;j++)
       {
if((j<=((x+1)/2)-i)||(j>=((x+1)/2)+i))	
                {
System.out.print(" ");
                 }
else
                 {
	   System.out.print("*");
	
                  }
       }
				
System.out.println();			
		
			
		               }

		
		for(i=1;i<=(x-1)/2;i++)
		                {
			for(j=1;j<=x;j++)
       {
if((j<=i)||(j+i>x))	
                {
System.out.print(" ");
                 }
else
                 {
	   System.out.print("*");
	
                  }
       }
				
System.out.println();			
		//8
			
		                 }
		
		
		
		
		
		
		
		
		
		
	}

}
