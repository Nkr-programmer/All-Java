package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Juggler_Throw {

	  public static void main(String args[])throws IOException
	    {
	        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	        int t = Integer.parseInt(in.readLine());
	        while(t-- > 0){
	            int N = Integer.parseInt(in.readLine());
	            
	            Solution ob = new Solution();
	            List<Integer> ans = new ArrayList<Integer>();
	            StringBuilder out = new StringBuilder();
	            ans = ob.jugglerSequence(N);
	            for(int i = 0;i < ans.size();i++)
	                out.append(ans.get(i) + " ");
	            System.out.println(out);
	        }
	    }
	}// } Driver Code Ends

	  
	//User function Template for Java

	class Solution{
	  static List <Integer> a= new LinkedList<Integer>();
	    static void printutil(int N){
	        if(N==1)return  ;
	      
	        if(N%2==0) {printutil((int) Math.sqrt(N));}
	        else {int t=(int)(N*Math.sqrt(N));
	        	printutil(t);}
	        a.add(0,N);        
	    }
	    
	    static List<Integer> jugglerSequence(int N){
	    	  a.clear();
	    	a.add(0,1);
	printutil(N);
	return a;
	    }
	}
