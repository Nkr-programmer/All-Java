package basic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Subsets_sum2 {
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
	            Subs ob = new Subs();
	         
	            ArrayList<Integer> ans = ob.subsetSums(arr,N);
	            for(int sum : ans){
	                System.out.print(sum+" ");
	            }
	            System.out.println();
	        }  
	    }
	}
	// } Driver Code Ends
class Subs{
void subsetSumsHelper(ArrayList<Integer> arr, int l, int r,   ArrayList<Integer>v,
        int sum)
{
// Print current subset
if (l > r)
{
	System.out.println(sum);
v.add(sum);
return;
}
subsetSumsHelper(arr, l+1, r, v, sum+arr.get(l));
subsetSumsHelper(arr, l+1, r, v, sum);
}



ArrayList<Integer> subsetSums(  ArrayList<Integer> arr, int N)
{
	  ArrayList<Integer> v= new   ArrayList<Integer>();
subsetSumsHelper(arr, 0, N-1, v,0);
Collections.sort(v);
return v;
}
}

