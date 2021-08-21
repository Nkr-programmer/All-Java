package gfgfasinatig;
import java.util.Scanner;

public class Gfgperfectnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				int a,b=10,d=0,c=0,e=0,f,g;
				System.out.print("enter number");
				
				 a = sc.nextInt();
				g=a;
				
				while(a>0) {
					
					f=a%b;
					a=a/b;
					
					
				    e=e*10+f*10;
					
					
				 }
				e=e/10;
				   System.out.println(e);
				   if(g==e)
				   {
					  System.out.println( "perfect number");
					   
					   
				   }
				   else
				   {
					  System.out.println( "non perfect number");
					   
					   
				   }
		
				   System.out.println();
		t--;
		 }
		
		
		
	}

}
