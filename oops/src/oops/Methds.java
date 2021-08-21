package oops;

import java.util.Scanner;

class whatsapp{
int d,e,f;
	String backer;
	
	public static int  king(int a,int b,int c)    {
	
		if((a>b)&&(a>c))
		{
			System.out.println(a);
		}
		
		else
		if(b>c){
			System.out.println(b);
			
		}
		else {
			System.out.println(c);
		}
		
		
	return 0;
                                  }
	
	
	
	
	public  void queen()    {
		
		if((d>e)&&(d>f))
		{
			System.out.println(d);
		}
		
		else
		if(e>f){
			System.out.println(e);
			
		}
		else {
			System.out.println(f);
		}
		
	
	
                                  }
	
	public static int  king(int a,int b,int c,int d)    {
		
		if((a>b)&&(a>c))
		{
			System.out.println(a);
		}
		
		else
		if(b>c){
			System.out.println(b);
			
		}
		else {
			System.out.println(c);
		}
		
		d=5;
		System.out.println(d);
	return 0;
                                  }
	
	
}


public class Methds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d;
		whatsapp hurry =new whatsapp();
		whatsapp hurryup =new whatsapp();
		Scanner sc = new Scanner(System.in);
	a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
		hurry.king( a,b,c);
		hurryup.d=sc.nextInt();
		hurryup.e=sc.nextInt();
		hurryup.f=sc.nextInt();
		
		hurryup.queen();
		
		a=sc.nextInt();
	    b=sc.nextInt();
	    c=sc.nextInt();
	    d=sc.nextInt();
			hurry.king( a,b,c,d);
		System.out.println(d);
		// if we have variables in a functionn then we cant use them in main in for return 
		// but in case  of void we  can use
	}

}
