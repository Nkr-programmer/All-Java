package basic;

public class Tiling_Problem {

	public static void main(String[] args) {
		// normal way O(n)
		System.out.println( tiling(6));
		// it s fibonnaci numbeer wich could be done in O(1)
		System.out.println(tilingMK(4,4));
//		count-number-ways-tile-floor-size-n-x-m-using-1-x-m-size-tiles O(n)
		
	}

	private static int tilingMK(int n, int k) {
int count[]= new int[n+1];
count[0]=0;
for(int i=1;i<=n;i++)
{
if(i>k) {count[i]=count[i-1]+count[i-k];}	
else if(i<k||i==1) {count[i]=1;}
else {count[i]=2;}
}
		
		
		return count[n];
	}

	private static int tiling(int n) {
		if(n==0)return 0;
		if(n==1)return 1;
		if(n==2)return 2;
		return  tiling(n-1)+tiling(n-2);
	}

}
