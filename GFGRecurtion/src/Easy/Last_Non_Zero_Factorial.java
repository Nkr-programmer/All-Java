package Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Last_Non_Zero_Factorial {

	  public static void main(String args[])throws IOException
	    {
	        
	        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
	        
	        digit ob = new digit();
	        int t = Integer.parseInt(read.readLine());
	        while(t-- > 0)
	        {
	            String input_line[] = read.readLine().trim().split("\\s+");
	            int N = Integer.parseInt(input_line[0]);
	            int ans = ob.lastNon0Digit(N);
	            System.out.println(ans);
	        }
	    }
	}


	// } Driver Code Ends


	//User function Template for Java


	class digit{
	    
	    int lastNon0Digit(int n)
	    {
	        int dig[] = {1, 1, 2, 6, 4, 2, 2, 4, 2, 8};
	         if (n < 10)
	            return dig[n];
	     
	        // Check whether tens (or second last) digit
	        // is odd or even
	        // If n = 375, So n/10 = 37 and (n/10)%10 = 7
	        // Applying formula for even and odd cases.
	        if (((n/10)%10)%2 == 0)
	            return (6*lastNon0Digit(n/5)*dig[n%10]) % 10;
	        else
	            return (4*lastNon0Digit(n/5)*dig[n%10]) % 10;
	    }
	    
	}
	
	
	
	