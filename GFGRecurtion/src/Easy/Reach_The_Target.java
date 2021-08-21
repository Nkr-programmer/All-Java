package Easy;

import java.util.Scanner;
import java.util.Stack;

public class Reach_The_Target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner sc=new Scanner(System.in);
	        int t=sc.nextInt();
	        
	        while(t-->0)
	        {
	            int a =sc.nextInt();
	            int b =sc.nextInt();
	            int c =sc.nextInt();
	            int d =sc.nextInt();
	          
	          int e= Math.abs(a-c);  
	            
	          if(e%b==0) {
	        	  if((e/b)==d) {System.out.println("yes");}
	        	  else
	        	  if((e/b)<d) {if((d-(e/b))%2==0)System.out.println("yes");
	        	  else System.out.println("no");}
	        	  else
	        	  if((e/b)>d) {System.out.println("no");}
	        	  
	        	  
	          }
	          else
	          {System.out.println("no");}
	            
	            System.out.println();
	   }
	        
	        
	    
	}

}
