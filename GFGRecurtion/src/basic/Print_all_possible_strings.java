package basic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Print_all_possible_strings {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t =  sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			PrintStrings g = new PrintStrings();
			ArrayList<String> arr = g.spaceString(str);
			for(String s : arr){
			    System.out.print(s+"$");
			}
            System.out.println();
			t--;
		}
	}
}// } Driver Code Ends



	// } Driver Code Ends
class PrintStrings{
void spaceStringHelper(String arr, int l, int r,   HashSet<String>v,
      String sum)
{
//Print current subset
if (l > r)
{
	if(sum.charAt(sum.length()-1)!=' ')
	{System.out.println(sum);
v.add(sum);}
return;
}
spaceStringHelper(arr, l+1, r, v, sum+arr.charAt(l)+" ");
spaceStringHelper(arr, l+1, r, v, sum+arr.charAt(l));
}


ArrayList<String> spaceString(String str)
{
	  HashSet<String> v1= new   HashSet<String>();
	  ArrayList<String> v= new   ArrayList<String>();
	  spaceStringHelper(str, 0, str.length()-1, v1,"");
	  v.addAll(v1);
Collections.sort(v,Collections.reverseOrder());
return v;
}
}