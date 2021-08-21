package basic;

import java.util.Arrays;

public class Longest_Increasing_Subsequence {

	public static void main(String[] args) {
		 int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
         int n = arr.length;
         System.out.println("Length of lis is "
                           + lis( arr, n ) + "\n" );
         System.out.println("Sum of maximum sum "+
                 "increasing subsequence is "+
                   mis(arr, n));
	}

	private static int lis(int[] arr, int n) {
		int dp[]= new int[n];
		Arrays.fill(dp, 1);
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(arr[i]>arr[j]&&dp[i]<dp[j]+1) {dp[i]=dp[j]+1;}
			}
		}
		int max=0;
		for(int h:dp) {System.out.print(h+" ");
			if(max<h) {max=h;}}
		return max;
	}
	private static int mis(int[] arr, int n) {
		int dp[]= new int[n];
		for(int i=0;i<n;i++) {dp[i]=arr[i];}
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(arr[i]>arr[j]&&dp[i]<dp[j]+arr[i]) {dp[i]=dp[j]+arr[i];}
			}
		}
		int max=0;
		for(int h:dp) {System.out.print(h+" ");
			if(max<h) {max=h;}}
		return max;
	}
}