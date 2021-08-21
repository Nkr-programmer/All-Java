package factorial;

import java.util.Scanner;

public class factorial2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b=1,c;
		Scanner sc = new Scanner(System.in);
		int c1 = sc.nextInt();
		if(c1>0)
		{
		  for( a=c1;a>=1;a--)
		  {
			  
			b=b*a;  
			System.out.print(a+"* ");
		  }
		  
		  System.out.println(" factorial="+b);
		}
		else
		{
			System.out.print(" factorial =1 ");
		}
	}

}
