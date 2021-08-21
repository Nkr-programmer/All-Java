package s3imp_array_q;

public class Gamebegin2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=Integer.MIN_VALUE;
		int sum=0;
		int m[]= {1,-3,-4,5,-6,3,-9,10};
		int l=m.length;
		int x[] =new int[l];
		x[0]=m[0];
	
	int c=0;
	for(int i=1;i<l;i++) {
	
	   x[i] =  x[i-1]+m[i];               
	
	      
	                     }
		
	for(int i=1;i<l;i++) {
		for(int j=1;j<l;j++) {
			 sum=x[j]-x[i]+m[i];
			
			
			
		}
		if(sum>b) 
		{
			  b=sum ;
		}
		
		
		
	}
		
		System.out.print(b);
		
		
		
		
		
		
		
		
		
		
		
	}

}
