package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Print_All_Combinations_of_Parentesis {
	public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.next());
        while(t>0)
        {
            int n = Integer.parseInt(sc.next());
            Solution T = new Solution();
            List<String> ans = T.AllParenthesis(n);
            String[] sequences = ans.toArray(new String[0]);
            Arrays.sort(sequences);
            int k = sequences.length;
            for(int i=0;i<k;i++)
            {
                System.out.println(sequences[i]);
            }
            
            t--;
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
	static List<String> a= new ArrayList<String>();
	static StringBuilder b= new StringBuilder();
	   static void _printParenthesis(char str[], int pos, int n, int open, int close) 
	    { 
	       if(n==close) {
	    	   b.delete(0, str.length);
	    	   for(int i=0;i<str.length;i++)
	    	   {
	    		   b.append(str[i]);
	    	   }
	    	   a.add(b.substring(0, str.length));
	       }
	       else
	       {
	    	   if(open>close) {
	    		   str[pos]=')';
	    		   _printParenthesis(str,pos+1,n,open,close+1);
	    	   }
	    	   if(open<n) {
	    		   str[pos]='(';
	    		   _printParenthesis(str,pos+1,n,open+1,close);
	    	   }
	       }
	    } 
	      
	    // Wrapper over _printParenthesis() 
	   public List<String> AllParenthesis( int n) 
	    { 
		   a.clear();
		   char[] str = new char[2 * n]; 
	        if(n > 0) 
	        _printParenthesis(str, 0, n, 0, 0); 
	        return a; 
	    } 
	      
	 
	} 
	  