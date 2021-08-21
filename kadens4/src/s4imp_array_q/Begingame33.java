package s4imp_array_q;

public class Begingame33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=Integer.MIN_VALUE;
		int sum=0;
		int m[]= {1,-3,-4,5,-6,3,-9,10};
		int l=m.length;
		for(int i=0;i<l;i++)
		{
			sum=sum+m[i];
			if(b<sum) {
				b=sum;
			}
			else
				if(sum<0) {
				sum=0;
			}
		}

		System.out.print(b);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
