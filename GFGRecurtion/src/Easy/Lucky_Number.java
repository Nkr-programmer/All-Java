package Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Lucky_Number {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
		  BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
	        int t = Integer.parseInt(read.readLine());//testcases
	        
	        while(t-- > 0)
	        {
	            int n = Integer.parseInt(read.readLine());//input n
	            
	            //printing "1" if isLucky() returns true else "0"
	            System.out.println((new Luck().isLucky(n))? "1" : "0");
	            new Luck().counter = 2;
	        }
	    }
	}
	// } Driver Code Ends


	//User function Template for Java



	class Luck
	{
   static int counter = 2;
	  public static boolean isLucky(int n)
	    {
	    
	    
	     int next_position = n; 
	        if(counter > n) 
	            return true; 
	        if(n%counter == 0) 
	            return false;       
	   
	        // calculate next position of input no 
	        next_position -= next_position/counter; 
	     System.out.println(next_position);
	        counter++; 
	        return isLucky(next_position);
		}
	    
	}
	