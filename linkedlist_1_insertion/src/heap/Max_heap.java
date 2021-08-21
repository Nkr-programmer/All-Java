package heap;

public class Max_heap {

	public Max_heap() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=  {0,4,3,7,1,8,5};
		
		int n=6;
		//heap sort
		heap_sort(a,n);
	
		for(int i=0;i<7;i++)
			System.out.println(a[i]);
		System.out.println();

		
		
		for(int i=6/2;i>=1;i--)
		build_array(a,i);
		
		
		
		for(int i=0;i<7;i++)
		System.out.println(a[i]);
		
		
		
	}

	private static void heap_sort(int[] a,int n) {
		// TODO Auto-generated method stub
		int size =n;
		build_array(a,n);
		if(n>=2) {
		int t= a[1];
		a[1]=a[n];
		a[n]=t;
		n--;
		heap_sort(a,n); 
		}
	}

	private static void build_array(int[] a,int n) {
		// TODO Auto-generated method stub
		for(int i=n/2;i>=1;i--)
			max_int(a,i,n);
	}

	private static void max_int(int[] a, int i, int n) {
		int left = 2*i;
		int right= 2*i+1;
		
		int larg=i;
		if(left<= n &&a[left]>a[i])
		{
			larg=left;
		}
		
		if(right<= n &&a[right]>a[larg])
		{
			larg=right;
		}
		
		
		if(larg!=i) {
		int t= a[i];
		a[i]=a[larg];
		a[larg]=t;
		
		
		max_int(a,larg,n);
		}
	}

	
	
	
	
}
