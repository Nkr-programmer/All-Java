package table;

import java.util.Scanner;

public class Alltable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j,k;
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
k=1;
		for(i=1;i<=n;i++)
	{
			for(j=1;j<=n;j++)
			{
				if(i==1) {
			System.out.print(j+"  ");
				         }
				else 
					if(j==1)
				{
			System.out.print(i+"  ");
				         }
					else 
						if((j>1)||(i>1))
					{

				k=i*j;
				System.out.print(k+"  "); 
					}
		}
		
		
		System.out.println();
		
	}
		
		
		
	}

}
