package Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_Of_Paths {
	public static void main (String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int m = Integer.parseInt(inputLine[0]);
		    int n = Integer.parseInt(inputLine[1]);
		    Solution ob = new Solution();
		    System.out.println(ob.numberOfPaths(m, n));
		}
	}
}



// } Driver Code Ends


class Solution{
    
    long numberOfPaths(int m, int n) {
      
    if(m == 1 || n == 1)return 1;
    return  numberOfPaths(m-1, n) + numberOfPaths(m, n-1);
}
    }
    