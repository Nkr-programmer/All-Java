package table;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   float j=0 , k=0;
		Scanner sc = new Scanner(System.in);

		float n = sc.nextInt();
		
		for(float i=1;i<=n;i++)
		{
			if(i%2==0)
			{
			 k=(-1/i);
			j=j+k ;
			System.out.print(" -1/"+i);
			}
			else
			{
				 k=(1/i);
					j=j+k ;
					System.out.print("+ 1/"+i+" ");
			}
			
		}
		System.out.print(" = "+j);
	}

}
