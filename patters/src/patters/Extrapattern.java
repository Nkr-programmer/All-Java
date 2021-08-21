package patters;

import java.util.Scanner;

public class Extrapattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j;
		
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		
		for(i=1;i<=x;i++)
		{
			for(j=x;j>=i;j--)
{
				
		
					System.out.print("*");
				
}
		System.out.println();	
		}
		
		
		

		
		
	}

}
