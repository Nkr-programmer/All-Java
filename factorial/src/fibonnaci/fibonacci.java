package fibonnaci;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0,b=1,c,i;
		System.out.print(a+" "+b+" ");
			
		for(i=1;i<=5;i++)
		{
			c=a+b;
		a=c;
		b=b+c;
		System.out.print(a+" "+b+" ");
		}
        
			
	}

}
