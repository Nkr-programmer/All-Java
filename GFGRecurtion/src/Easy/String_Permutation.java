package Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class String_Permutation {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0)
		{
		    
		    Permutation obj=new Permutation();
		    
		    String S=sc.nextLine();
		    
		    ArrayList<String> arr = obj.permutation(S);
		    for(String s : arr){
		        System.out.print(s+" ");
		    }
		    System.out.println();
		}
		
	}
}
// } Driver Code Ends


//User function Template for Java


class Permutation
{
	static ArrayList<String> a= new ArrayList<String>();
    public ArrayList<String> permutation(String S)
    {
    	a.clear();
    	permute(S,0,S.length()-1);
    	Collections.sort(a);
    	return null;
    }
    private void permute(String str, int l, int r) 
    {
    	 
            if (l == r) { 
            	System.out.println(str);
                a.add(str);} 
            else
            { 
                for (int i = l; i <= r; i++) 
                { 
                    str = swap(str,l,i); 
                    permute(str, l+1, r); 
                    str = swap(str,l,i); 
                } 
            } 
        }
	   
    public String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
 
} 