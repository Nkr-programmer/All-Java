package Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Recamens_Sequence {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
		   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	        int t = Integer.parseInt(in.readLine());
	        while(t-- > 0){
	            int n = Integer.parseInt(in.readLine());
	            
	            recaman ob = new recaman();
	            List<Integer> ans = new ArrayList<Integer>();
	            ans= ob.recamanSequence(n);
	            for(int i = 0;i < n;i++)
	                System.out.print(ans.get(i)+" ");
	            System.out.println();
	        }
	    }
	}// } Driver Code Ends


	//User function Template for Java

	class recaman{
		static List<Integer> a= new ArrayList<Integer>();
	    static List<Integer> recamanSequence(int n){
	    	a.clear();
	    	a.add(0);
	    	recamanSequenceutil(n);
	    	return  a;
	    }
		private static void recamanSequenceutil(int n) {
			if(n==0)return ;
			
			recamanSequenceutil(n-1);
			int h=a.contains(a.get(n-1)-n)||(a.get(n-1)-n)<0?a.get(n-1)+n:a.get(n-1)-n;
			a.add(h);
		
		}
	}
	
