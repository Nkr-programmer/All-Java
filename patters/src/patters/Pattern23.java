package patters;

import java.util.Scanner;

public class Pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j;
		
		
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
	   System.out.print("* ");
	
      }
}
				
System.out.println();			
		//12
			
		}
		
		

		
	}

}
