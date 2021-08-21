package advanced_concept;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class WO_SUBSET_BITMASKING {

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
	         
	            ArrayList<ArrayList> ans = ob.subsetSums(arr,N);
	           
	            System.out.println(ans);
	        
	        
	    }
	}
	} 
class Subs{

	static ArrayList<ArrayList> v= new   ArrayList<>();
	  
ArrayList<ArrayList> subsetSums(  ArrayList<Integer> arr, int N)
{
	  int index=0;
	  ArrayList<Integer> x= new   ArrayList<>();
subsetSumsHelper(arr, x,index);

return v;
}


static int c=0;
private void subsetSumsHelper(ArrayList<Integer> arr,  ArrayList<Integer> x,
		int index) {
	System.out.println(x);
	v.add(x);
	for(int i=index;i<arr.size();i++) {
	x.add(arr.get(i));
	subsetSumsHelper(arr,  x, i+1);
	x.remove(x.size()-1);
}return;
}

}