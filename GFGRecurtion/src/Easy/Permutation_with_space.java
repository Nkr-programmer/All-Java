package Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;


public class Permutation_with_space {

	  public static void main(String args[])throws IOException
	    {
	        
	        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
	        int t = Integer.parseInt(read.readLine());
	        while(t-- > 0)
	        {
	            String S = read.readLine().trim();
	            PrintStrings ob = new PrintStrings();
	            ArrayList<String> ans = new ArrayList<String>();
	            ans = ob.permutation(S);
	            
	            for(int i=0;i<ans.size();i++){
	                System.out.print("("+ans.get(i)+")");
	            }
	            System.out.println();
	        }
	    }
	} 



	// } Driver Code Ends
class PrintStrings{
void spaceStringHelper(String arr, int l, int r,   HashSet<String>v,
      String sum)
{
//Print current subset
if (l > r)
{
	if(sum.charAt(sum.length()-1)!=' ')
	{
		//System.out.println(sum);
v.add(sum);}
return;
}
spaceStringHelper(arr, l+1, r, v, sum+arr.charAt(l)+" ");
spaceStringHelper(arr, l+1, r, v, sum+arr.charAt(l));
}


ArrayList<String> permutation(String str)
{
	  HashSet<String> v1= new   HashSet<String>();
	  ArrayList<String> v= new   ArrayList<String>();
	  spaceStringHelper(str, 0, str.length()-1, v1,"");
	  v.addAll(v1);
Collections.sort(v,Collections.reverseOrder());

return v;
}
}