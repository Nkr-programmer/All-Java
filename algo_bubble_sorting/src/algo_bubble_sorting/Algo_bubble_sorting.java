package algo_bubble_sorting;

public class Algo_bubble_sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {8,5,9,6,1,7,2,4};
		int x=0;
		boolean v=true;

		// // two optimization one is to 7-j and second is two check
		
		// loop should be 8-1 times run
		
		for(int j=0;j<7;j++)
		{
			
		
		     for(int i=0;i<7-j;i++)
		    {
		
		if (a[i]>a[i+1])
		{
		x=a[i+1];
		a[i+1]=a[i];
		a[i]=x;
		 v=false;
		}
		
		
	        }	
		 if(v=false)
		 {
			 break;
		 }
		}
		
		
		
		
		
		
//imp		
		for(int h:a)
		{
		System.out.print(h);
		}
		
		
		
	}

}
