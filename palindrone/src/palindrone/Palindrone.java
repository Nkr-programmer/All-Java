package palindrone;

import java.util.Scanner;

public class Palindrone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b=10,d=0,c=0,e=0,f;
		System.out.print("enter number");
		Scanner sc = new Scanner(System.in);
		 a = sc.nextInt();
		f=a;
		
		do {
			c=a/b;
			d=a%b;
			
			a=c;
		
			System.out.print(d);
			e=d;
			// System.out.print(" "+d);
		 }while(a>0);
		
		   
	
	}

}
