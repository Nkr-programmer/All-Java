package gfgfasinatig;

import java.util.Scanner;

public class Print_all_the_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
		
		
		int n;
		
		n=sc.nextInt();
		
		
		int a[]=new int [n];
		
		for(int i=0;i<n;i++)
		{	
				a[i]=sc.nextInt();
	
		}
		for(int i=0;i<n;i++)
		{
			
				System.out.print(a[i]+" ");
		
		}
		System.out.println();
		
		t--;
		 }
		
		//32 54 12 52 56 8 30 44 94 44 39 65 19 51 91 1 5 89 34 25 58 20 51 38 65 30 7 20 10 51 18 43
	}

}
