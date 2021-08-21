package basic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Subsets_sum {
	  public static void main(String args[])throws IOException
	    {
	        Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	        while(t-- > 0)
	        {
	            int N=sc.nextInt();
				ArrayList<Integer> arr = new ArrayList<>();
				for(int i = 0; i < N ; i++){
				    arr.add(sc.nextInt());
				}
	            Sub ob = new Sub();
	         
	            ArrayList<Integer> ans = ob.subsetSums(arr,N);
	            for(int sum : ans){
	                System.out.print(sum+" ");
	            }
	            System.out.println();
	        }  
	    }
	}
	// } Driver Code Ends


	//User function Template for Java//User function Template for Java
	class Sub{
		ArrayList<Integer>a= new ArrayList<Integer>();
		static int g=0;
		static int h=0;
	    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
		 g=N-1;
	    	subsetUtil(arr,N-1); 
            a.add(0);
	    	Collections.sort(a);
	    return a;
	    }

		private void subsetUtil(ArrayList<Integer> arr, int n) {
			// TODO Auto-generated method stub
			if(n==-1)return;

			subsetUtil(arr,n-1);
			a.add(arr.get(n));
			h=n;
			subsetUtil2(arr,n+1);
	
		}
		private void subsetUtil2(ArrayList<Integer> arr, int n) {
			// TODO Auto-generated method stub
			if(n==g+1)return;

			subsetUtil2(arr,n+1);
			if(!a.contains(arr.get(h)))
			a.add(arr.get(h));
			totals= 0;
			for(int i=h;i>=0;i--)
		    {totals=totals+arr.get(i);
		    total=totals;
			subsetUtil3(arr,n);
		//	System.out.println(a);
			}
        
		}
		static int total=0;
		static int totals=0;
		private void subsetUtil3( ArrayList<Integer> arr,int n) {
			if(n==h)return;
			total=total+arr.get(n);
			if(!a.contains(total))
				a.add(total);
			subsetUtil3(arr,n-1);
		}
	}