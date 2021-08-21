package Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Print_Pattern {

	   public static void main(String args[])throws IOException
	    {
	        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	        int t = Integer.parseInt(in.readLine());
	        while(t-- > 0){
	         String h=in.readLine().trim();
	         int N = Integer.parseInt(h);
	            
	            Pattern ob = new Pattern();
	            List<Integer> ans = new ArrayList<Integer>();
	            ans = ob.pattern(N);
	            for(int i = 0;i < ans.size();i++)
	                System.out.print(ans.get(i) + " ");
	            System.out.println();
	        }
	    }
	}// } Driver Code Ends


	//User function Template for Java

	class Pattern{
		static List<Integer>a= new ArrayList<Integer>();
	    static List<Integer> pattern(int N){
	    	a.clear();
	    	patternutil(N);
	    	return a; 
	    }

		private static void patternutil(int n) {
			// TODO Auto-generated method stub
		if(n<=0){a.add(n);return ;}
			a.add(n);
			patternutil(n-5);
			a.add(n);
			
		}
	}