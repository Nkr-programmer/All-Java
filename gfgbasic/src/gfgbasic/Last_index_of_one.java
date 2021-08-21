package gfgbasic;

import java.util.Scanner;

public class Last_index_of_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		   int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
		
		char b;
			String a;
			a=sc.next();
	b=		a.charAt(a.length()-1);
	//	System.out.print(a.indexOf('1')); 
	if(a.indexOf('1')!=-1)
	{
			
				 System.out.print(a.lastIndexOf('1'));
			
	}
	else
	{
		System.out.print("-1");
	}
		System.out.println();
				t--;
		 }
		   
	    
	}

}
