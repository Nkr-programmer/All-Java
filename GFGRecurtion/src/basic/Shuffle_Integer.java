package basic;

public class Shuffle_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {4,7,8,9,1,2};
//shuffleArray(arr,arr.length);
System.out.println();
shuffleArray(arr,arr.length);
	}
	 

	static void shufleArray(int a[], int f, int l) 

	{ 
	     if(l<=f){ 
	        return; 
	    }    
	  
	    // If only 2 element, return 
	    if (l - f == 1) 
	        return; 
	  
	    // finding mid to divide the array 
	    int mid = (f + l) / 2; 
	  
	    // using temp for swapping first half of second array 
	    int temp = mid + 1; 
	  
	    // mmid is use for swapping second half for first array 
	    int mmid = (f + mid) / 2; 
	  
	    // Swapping the element 
	    for (int i = mmid + 1; i <= mid; i++) 
	    { int t=a[i]; 
	    	a[i]=a[temp];
	    	a[temp++]=t;}
	  
	    // Recursively doing for first half and second half 
	    shufleArray(a, f, mid); 
	    shufleArray(a, mid + 1, l); 
	}
	static void shuffleArray(int arr[],int n)
	{
	    shufleArray(arr,0,n-1);
	}
	}