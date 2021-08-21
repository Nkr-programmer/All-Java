package fibonaci;

import java.util.Scanner;

public class Fibonachci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=0,b=1,c,d,e;
		Scanner sc = new Scanner(System.in);
		e=sc.nextInt();
		System.out.print(a+","+b);
		for(int i=0;i<e;i++)
		{
			c=a+b;
			d=b+c;
			a=c;
			b=d;
			System.out.print(","+c+","+d);

		}
		
	}
	

}
