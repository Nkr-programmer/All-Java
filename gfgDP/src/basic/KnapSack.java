package basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class KnapSack {

	public static void main(String[] args) {
	     int val[] = new int[] { 60, 100, 120 };
	        int wt[] = new int[] { 10, 20, 30 };
	        int W = 50;
	        int n = val.length;
	        System.out.println(knapSack(W, wt, val, n));//   O/1 Knapsack O(2^n)
System.out.println(knapSackTAB(W, wt, val, n));// tabula method O(n2)



// fractional knapsack  // O(nlogn)
 wt = new int[]  { 1, 4, 2, 3 };
 val =new int[]  { 6, 4, 10, 12 };
int capacity = 50;
double maxValue = getMaxValue(wt, val, capacity);
System.out.println("Maximum value we can obtain = "+ maxValue);



//Unbounded Knapsack (Repetition of items allowed) (cut the rot similar)
System.out.println(unboundedKnapsack(W, n, val, wt));
	
	}
	static HashMap<Integer,Integer>checks= new HashMap<Integer,Integer>();
	private static int unboundedKnapsack(int w, int n, int[] val, int[] wt) {
int dp[]=new int[w+1];

for(int i=0;i<n;i++)
{
for(int j=0;j<=w;j++)
{
	if(wt[i]<=j) {dp[j]=Integer.max(dp[j], dp[j-wt[i]]+val[i]);}
}
for(int v:dp) {System.out.print(v+" ");}
System.out.println();
}
return dp[w];
	}


public static class Initial{
		double wt,val,ind;
        Double cost;
        public   Initial(int wt, int val, int ind)
        {
            this.wt = wt;
            this.val = val;
            this.ind = ind;
            cost = new Double((double)val / (double)wt);
        }}


	private static double getMaxValue(int[] wt, int[] val, int capacity) {
Initial[] x= new Initial[wt.length];
for (int i = 0; i < wt.length; i++) {
    x[i] = new Initial(wt[i], val[i], i);}

Arrays.sort(x,new Comparator<Initial>() {

	@Override
	public int compare(Initial o1, Initial o2) {
		
		return o2.cost.compareTo(o1.cost);
	}});

double totalValue = 0d;

for (Initial i : x) {

    int curWt = (int)i.wt;
    int curVal = (int)i.val;

    if (capacity - curWt >= 0) {
       capacity = capacity - curWt;
        totalValue += curVal;
    }
    else {
        double fraction
            = ((double)capacity / (double)curWt);
        totalValue += (curVal * fraction);
        capacity
            = (int)(capacity - (curWt * fraction));
        break;
    }
}

return totalValue;
	}

	private static int knapSackTAB(int w, int[] wt, int[] val, int n) {
int dp[][]= new int[n+1][w+1];

for(int i=1;i<n+1;i++)
{
for(int j=1;j<w+1;j++)
  {
	if(wt[i-1]<=j) {dp[i][j]=Integer.max(dp[i-1][j], dp[i-1][j-wt[i-1]]+val[i-1]);}
	else {dp[i][j]=dp[i-1][j];}
  }
}

		return dp[n][w];
	}

static HashMap<Integer,Integer>check= new HashMap<Integer,Integer>();
	private static int knapSack(int w, int[] wt, int[] val, int n) {
if(w<=0||n<=0)return 0;

int value=-100;
if(wt[n-1]>w) {knapSack(w,wt,val,n-1);}
else {  
	value=Math.max(value,knapSack(w,wt,val,n-1));
	value=Math.max(value,val[n-1]+knapSack(w-wt[n-1],wt,val,n-1));}
	

return value;
	}
}