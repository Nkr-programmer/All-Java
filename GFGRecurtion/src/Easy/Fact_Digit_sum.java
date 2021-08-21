package Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Fact_Digit_sum {
	 public static void main(String[] args) throws IOException
	    {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int T = Integer.parseInt(br.readLine().trim());
	        while(T-->0)
	        {
	            String s = br.readLine().trim();
	            int N = Integer.parseInt(s);
	            Fact ob = new Fact();
	            ArrayList<Integer> ans = ob.FactDigit(N);
	            for (Integer val: ans) 
	                System.out.print(val);
	            System.out.println();
	        }
	    }
	}
	// } Driver Code Ends


	//User function Template for Java

	class Fact
	{

		  static ArrayList<Integer> a= new ArrayList<Integer>();
		  static int g= 0,k=0;    
		  ArrayList<Integer> FactDigit(int N)
			    {
			  g=0;
			    	a.clear();
			    	k=N;
//			    	for(int i=9;i>=0;i--){
//				    if(factorial(i)<=N-g) {a.add(i);g=g+factorial(i);i=10;}	
//			    	if(N-g==0)break;	   
//				    }
			    	//// for loop to recurtion may be
			    Facto(9);
			    	Collections.sort(a);
			    	return a;
			    }
			    private void Facto(int i) {
				if(i==0)return;
			    	if(k-g==0)return;
			    	
			    	if(factorial(i)<=k-g) {a.add(i);g=g+factorial(i);i=10;}
			    	Facto(i-1);
					
				}
				static int factorial(int n) 
			    { 
			        if(n==0)return 1;
			        if(n==1)return 1;
			        if(n==2)return 2;
			        if(n==3)return 6;
			        if(n==4)return 24;
			        if(n==5)return 120;
			        if(n==6)return 720;
			        if(n==7)return 5040;
			        if(n==8)return 40320;
			        if(n==9)return 362880;
			        
			        
			        
			        return 1;
			    } 
			}