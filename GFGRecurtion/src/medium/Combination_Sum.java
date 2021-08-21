package medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Combination_Sum {
	 static ArrayList<ArrayList<Integer>> res = new ArrayList<>();
	    public static void main (String[] args)throws IOException {
	        
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int t = Integer.parseInt(br.readLine());
	        
	        while(t-- >0)
	        {
	            String str[] = br.readLine().trim().split(" ");
	            int n = Integer.parseInt(str[0]);
	            ArrayList<Integer> list = new ArrayList<>();
	            str = br.readLine().trim().split(" ");
	            for(int i = 0; i <n ;i++)
	                list.add(Integer.parseInt(str[i]));
	            str = br.readLine().trim().split(" ");    
	            int sum = Integer.parseInt(str[0]);
	            
	            res = new Sum().combinationSum(list, sum);
	            if (res.size() == 0) {
	    			System.out.print("Empty");
	    		}
	 
	    		// Print all combinations stored in res.
	    		for (int i = 0; i < res.size(); i++) {
	    			if (res.size() > 0) {
	    				System.out.print("(");
	    				List<Integer> ij = res.get(i);
	    				for (int j = 0; j < ij.size(); j++) {
	    				    
	    					System.out.print(ij.get(j));
	    					if(j < ij.size()-1)
	    					 System.out.print(" ");
	    				}
	    				System.out.print(")");
	    			}
	    		}
	    		System.out.println();
	    		res.clear();
		    }
	    }
	    
	}

	// } Driver Code Ends


	class Sum
	{
	    static ArrayList<ArrayList<Integer> >
	    combinationSum(ArrayList<Integer> arr, int sum)
	    {
	        ArrayList<ArrayList<Integer> > ans
	            = new ArrayList<>();
	        ArrayList<Integer> temp = new ArrayList<>();
	 
	        // Sorting the input arrayList and removing the
	        // duplicates using HashSet
	        Collections.sort(arr);
	 
	        Set<Integer> set = new HashSet<>(arr);
	        arr.clear();
	        arr.addAll(set);
	 
	        findNumbers(ans, arr, sum, 0, temp);
	        return ans;
	    }
	 
	    static void
	    findNumbers(ArrayList<ArrayList<Integer> > ans,
	                ArrayList<Integer> arr, int sum, int index,
	                ArrayList<Integer> temp)
	    {
	 
	        if (sum == 0) {
	 
	            // Adding deep copy of list to ans
	 
	            ans.add(new ArrayList<>(temp));
	            return;
	        }
	 
	        for (int i = index; i < arr.size(); i++) {
	 
	            // checking that sum does not become negative
	 
	            if ((sum - arr.get(i)) >= 0) {
	 
	                // adding element which can contribute to
	                // sum
	 
	                temp.add(arr.get(i));
	 
	                findNumbers(ans, arr, sum - arr.get(i), i,
	                            temp);
	 
	                // removing element from list (backtracking)
	                temp.remove(arr.get(i));
	            }
	        }
	    }
}