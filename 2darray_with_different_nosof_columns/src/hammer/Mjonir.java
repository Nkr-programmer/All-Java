package hammer;
import java.util.Scanner;
public class Mjonir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		
		
		int a[][]=new int [n][n];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				
				a[i][j]=sc.nextInt();
				
			}
			
			
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				
				System.out.print(a[i][j]);
				
			}
			
			System.out.println();
		}
		
		
	}

}
