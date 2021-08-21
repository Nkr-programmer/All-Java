package palindrone;

import java.util.Scanner;

public class Palindrone2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b=10,d=0,c=0,e=0,f,g;
		System.out.print("enter number");
		Scanner sc = new Scanner(System.in);
		 a = sc.nextInt();
		g=a;
		
		do {
			c=a/b;
			d=a%b;
			
			a=c;
			f=d;
		    e=e*10+f*10;
			
			
		 }while(a>0);
		e=e/10;
		   System.out.println(e);
		   if(g==e)
		   {
			  System.out.println( "its apalindrone number"+g+" "+e+" ");
			   
			   
		   }
		   else
		   {
			  System.out.println( "its a not palindrone number"+g+" "+e+" ");
			   
			   
		   }
	}

}
