package algo_bubble_sorting;

public class Algo_selection_sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {8,5,9,6,1,7,2,4};
		int y=0;
		

		// // two optimization one is to 7-j and second is two check
		
		// loop should be 8-1 times run
		
		for(int i=0;i<7;i++)
		{
			
		  int x=i;
		     for(int j=i;j<8;j++)
		    {
		if(a[j]<a[x])
		{
			x=j;
			
		}
		
		
	        }	
		 	y=a[i];
			a[i]=a[x];
			a[x]=y;
		}
		
		
		
//imp		
		for(int h:a)
		{
		System.out.print(h);
		}
		
	
		
		
		
		
		
	}

}
