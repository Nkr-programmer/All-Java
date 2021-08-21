package whiler;

import java.util.Scanner;

public class Whiler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b=10,d=0,c=0,e=0,f;
System.out.print("enter number");
Scanner sc = new Scanner(System.in);
 a = sc.nextInt();
 f=a;
 while((a%b)>0)
 {
	 c=a/b;
	
	 d=a%b;
	 a=c;
	
	 e=d+e;
 }
	 
	//log(n)+1= no of digits  where n is number	
 e=e+a;
   System.out.print("sum of digits of numbers:"+e);
   
   int g =(int)Math.log10(f)+1;
   System.out.print("\n no of digits"+g);
		
	}

}
