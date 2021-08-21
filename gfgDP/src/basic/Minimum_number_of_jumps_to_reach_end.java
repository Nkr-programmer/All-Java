package basic;

import java.util.Arrays;

public class Minimum_number_of_jumps_to_reach_end {

	public static void main(String[] args) {
	    int arr[] = { 1, 3, 6, 1, 0, 9 };
	    	//{2,3,1,1,2,4,2};
	    // O(n2)
        System.out.println("Minimum number of jumps to reach end is : "
                           + minJumps(arr, arr.length));
 
        //O(n)
        System.out.println( minJumpsbetter(arr, arr.length));
	}

	private static int minJumpsbetter(int[] arr, int n) {
		int maxreachable=arr[0],
		    jumps=1,
		    steps=arr[0];
		for(int i=1;i<n;i++)
		{
			if(i==n-1) {return jumps;}
			
				maxreachable=Math.max(maxreachable, i+arr[i]);
				steps--;
				if(steps==0) {
					jumps++;
					if(i>=maxreachable)return -1;
					steps=maxreachable-i;
				}
			
			
		}
		return jumps;
	}

	private static int minJumps(int[] arr, int l) {
		if(arr[0]==0||l==0)return 0;
		int dpMin[]= new int[l];
		int dpAct[]= new int[l];
		Arrays.fill(dpMin,10000);
		dpMin[0]=0;
		Arrays.fill(dpAct,10000);
		dpAct[0]=-1;
		
		for(int i=1;i<l;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(j+arr[j]>=i&&arr[j]!= 10000)
				{ 
					int g=dpMin[i];
					dpMin[i]= Math.min(dpMin[i],1+dpMin[j]);
				if(dpMin[i]!=g)	dpAct[i]=j;
				}
			}
		}
		for(int h:dpMin) {System.out.print(h+" ");}
		for(int h:dpAct) {System.out.print(h+" ");}
		return dpMin[l-1];
	}

}
