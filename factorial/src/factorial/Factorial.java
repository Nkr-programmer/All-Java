package factorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b=1;
Scanner sc = new Scanner(System.in);
int x1 = sc.nextInt();
if(x1>0)
{
  for( a=1;a<=x1;a++)
  {
	  
	b=b*a;  
	System.out.print(a+"* ");
  }
  
  System.out.println(" factorial="+b);
}
else
{
System.out.println("factorial =1");	

}
  
	}

}
