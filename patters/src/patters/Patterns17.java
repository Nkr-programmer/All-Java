package patters;

import java.util.Scanner;

public class Patterns17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int i,j;
		
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		for(i=1;i<=x;i++)
		{
			for(j=1;j<=i;j++)
{
				
		
					System.out.print("*");

}
		System.out.println();	
		}
		
		for(i=1;i<=x-1;i++)
		{
			for(j=x-1;j>=i;j--)
{
				
		
					System.out.print("*");
				
}
		System.out.println();	
		}
		
		
		
		
		//7

		
		
		
		
	}


}