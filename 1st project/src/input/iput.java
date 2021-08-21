package input;

import java.util.Scanner;

public class iput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
 
		Scanner strin = new Scanner(System.in);
		int o = strin.nextInt();
		int p = strin.nextInt();
		int k=0,n=0;
		if(p%2==0){
		int u=p/2;n++;
		
		if(o>u)
		{
		n=n+o-u;	
		}
		else
			if(u>o)
			{
				n=0;
			}
		
		}
		while(o<p)
		{
			o=o*2;
			k++;
		}
		k=k+o-p;
		
		if(n>k||n==0)
		System.out.println(k+"g");
		else
			System.out.println(n);
		
		
		
	}

}
