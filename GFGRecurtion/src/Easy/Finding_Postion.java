package Easy;

import java.util.Scanner;
import java.util.Stack;

public class Finding_Postion {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
				Postion g=new Postion();
			int a=g.setBitNumber(n);
				System.out.print(a+" ");
			System.out.println();
		
		}
	}
}// } Driver Code Ends


/*Complete the function below*/
class Postion{
	  static int setBitNumber(int n)
	    {
	        if (n == 0)
	            return 0;
	 
	        int msb = 0;
	        n = n / 2;
	 
	        while (n != 0) {
	            n = n / 2;
	            msb++;
	        }
	 
	        return (1 << msb);
	    }
	
}


