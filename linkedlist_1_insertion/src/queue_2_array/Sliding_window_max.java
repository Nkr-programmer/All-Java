package queue_2_array;

public class Sliding_window_max {
	
	static int i=0;
   static int k1;
	
	public	Sliding_window_max(int d)
	{

		
		
	}
	
	

	private static int  find(int a[],int k, int n) {
		
		int x=-100;
		if(k==n+1)
		{
			return x;
		}
		while(k!=i)
		{
			if(a[i]>x)
			{
				x=a[i];
			}
			i++;
		}
		System.out.println(x);
		k=k+1;
		i=k-k1;
return find(a,k,n);		
		
	}
	

 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int	a[]= {1,2,3,4,4,4,5,6,7,8,5,4,3,2,14,17};
		int k=4;
	k1=k;
	
	
	
	find(a,k,a.length);	
		
	}






}
