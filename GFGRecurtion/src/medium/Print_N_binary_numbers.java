package medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Print_N_binary_numbers {
	public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solutions ob = new Solutions();
            ArrayList<String> result = ob.NBitBinary(n);
            for(String value  : result){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solutions {
  		static ArrayList<String> a= new ArrayList<String>();
		static StringBuilder b= new StringBuilder();
		   static void _printParenthesis(char str[], int pos, int n, int ones, int zeros) 
		    { 
		       if(n==zeros+ones) {
		    	   b.delete(0, str.length);
		    	   for(int i=0;i<str.length;i++)
		    	   {
		    		   b.append(str[i]);
		    	   }
		    	   a.add(b.substring(0, str.length));
		       }
		       else
		       {
		    	   if(ones>zeros) {
		    		   str[pos]='0';
		    		   _printParenthesis(str,pos+1,n,ones,zeros+1);
		    	   }
		    	   if(ones<n) {
		    		   str[pos]='1';
		    		   _printParenthesis(str,pos+1,n,ones+1,zeros);
		    	   }
		       }
		    } 
		      
		    // Wrapper over _printParenthesis() 
		   public ArrayList<String> NBitBinary( int n) 
		    { if(n==0)return null;
			   a.clear();
			   char[] str = new char[n]; 
		        if(n > 0) 
		        _printParenthesis(str, 0, n, 0, 0); 
		        Collections.sort(a,Collections.reverseOrder());
		        return a; 
		    } 
		      
		 
		} 