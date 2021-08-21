package patters;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
int i,j;
		
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		for(i=1;i<=x;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(j==i||i==5||j==1)
				{
	   System.out.print("*");
				}
				else {
					System.out.print(" ");
					
				     }
			}
			System.out.println();
          }
				
			
		//18
		
		
		
		
	}

}
