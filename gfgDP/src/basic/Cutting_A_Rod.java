package basic;

import java.util.HashMap;

public class Cutting_A_Rod {

	public static void main(String[] args) {
		int a[]= {1, 5, 8, 9, 10, 17, 17, 20,1,1,7,8,9,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
	System.out.println(System. currentTimeMillis() );
		System.out.println(cut(a,a.length));//O(2^n)//1 recursive approch//O(n^2)// 2 dp by memo
	System.out.println(System. currentTimeMillis() );
		      // UNBOUNDED KNAPSACK PROBLEM ALGO OVERALL
	}
static HashMap<Integer,Integer>check= new HashMap<Integer,Integer>();
	private static int cut(int a[],int n) {
		
if(n<=0)return 0;
if(check.containsKey(n))return check.get(n);
		int maxi= Integer.MIN_VALUE;
for(int i=0;i<n;i++)
{
maxi=Math.max(maxi,a[i]+cut(a,n-1-i));
}
if(!check.containsKey(n))check.put(n, maxi);
return maxi;
	}

}
